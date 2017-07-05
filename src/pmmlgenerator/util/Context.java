/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;        

/**
 *
 * @author Angel Salamanca
 */
public class Context {
    
   private Scope rootScope;
   private Scope currentScope;
   private NameGenerator generator;
   private List<BuiltinFunction> builtInFunctions;
   private List<BuiltinFunction> stringBuiltInFunctions;
   
   
   public Context(Scope scope)
   {
       this.rootScope = scope;
       setCurrentScope(scope);
       this.generator = new NameGenerator();
       this.builtInFunctions = populateBuiltInFunctions();
       this.stringBuiltInFunctions = populateStringBuiltinFunctions();
   }
   
   public Map<String, Object> getFieldNamesForMiningSchema() throws Exception
   {
       Map<String, Object>names = new HashMap<String, Object>();      
       
       PMML pmml = (PMML)rootScope.PMMLScope;       
       
            // First Data Dictionary
           names = this.getDataFieldNames();
            // Then local Transformation of parent model
            if (currentScope.isSecondOrMore())
            {
                for (DerivedField derF : currentScope.parent.readLocalDerivedFields())
                      names.put(derF.getName(), this.currentScope);    
            }       
       return names;
   }
   
   private Map<String, Object> getDataFieldNames() throws Exception
   {
       Map<String, Object>names = new HashMap<String, Object>();
       PMML pmml = (PMML)this.rootScope.PMMLScope;
        for (DataField df : pmml.getDataDictionary().getDataField())
            {
                names.put(df.getName(), pmml);         
            }     
        return names;
   }
   
   public Map<String, Object> getMiningFieldNames() throws Exception
   {
         Map<String, Object>names = new HashMap<String, Object>();   
         List <MiningField> fields = this.currentScope.readMiningFields();
         
            for (MiningField mf : fields)
            {
                names.put(mf.getName(), this.currentScope.PMMLScope);         
            }      
         
         
         return names;
   }
   
   public Map<String, Object> getFieldNamesForTransformation() throws Exception
   {
       Map<String, Object>names = new HashMap<String, Object>();   
       
       // DD or MiningSchema
       if (this.currentScope.isRoot())
       {
           names = this.getDataFieldNames();
       }
       else
       {
           names = this.getMiningFieldNames();
       }
       //
       
       return names;
   }
   
   public Map<String, Object> getFieldNamesForModel() throws Exception
   {
        Map<String, Object>names = this.getMiningFieldNames();
        
         PMML pmml = (PMML)rootScope.PMMLScope;       
       
         // First Transformation Dictionary
         TransformationDictionary td = pmml.getTransformationDictionary();
         if (td != null)
         {
            for (DerivedField derF : td.getDerivedField())
            {
                names.put(derF.getName(), pmml);         
            } 
         }                        
         
        // Then local Transformation of own model
          List<DerivedField> ltfields = currentScope.readLocalDerivedFields();
          if (ltfields != null)
          {
                for (DerivedField derF : ltfields)
                {
                      names.put(derF.getName(), this.currentScope);    
                }       
          }
       return names;
            
   }   
   
   
   
   public Scope getCurrentScope()
   {
       return this.currentScope;       
   }

   public void setCurrentScope(Scope cScope)
   {
       if (this.currentScope != null) {
           this.currentScope.addChild(cScope);
       }
       
       this.currentScope = cScope;       
   }
   
   public Object[] randomFieldName(DATATYPE datatype, Boolean forModel, Boolean allValid) throws Exception
   {
       Map<String, Object> fieldNames;
       if (forModel)
       {
           fieldNames = this.getFieldNamesForTransformation();
       }
           else
       {
           fieldNames = this.getFieldNamesForMiningSchema();
       }
       
       // retain matching datatype only. Needed?
       Iterator<Map.Entry<String,Object>> iter = fieldNames.entrySet().iterator();      
       while (iter.hasNext()) {
             Map.Entry<String,Object> entry = iter.next();
             FieldHelper fieldhelper = new FieldHelper(entry.getKey(), entry.getValue());
            if (!fieldhelper.getDataType().equals(datatype)) {
                    iter.remove();
                }
        }            
       
       // remove DataFields with Intervals or Values
       if (allValid)
       {
       Iterator<Map.Entry<String,Object>> iter2 = fieldNames.entrySet().iterator();      
       while (iter2.hasNext()) {
             Map.Entry<String,Object> entry = iter2.next();
             FieldHelper fieldhelper = new FieldHelper(entry.getKey(), entry.getValue());
             if (fieldhelper.getTheClass().equals("DataType"))
             {
              if (fieldhelper.getInterVals().size()>0 || fieldhelper.getValues().size()>0) {
                    iter2.remove();
                }     
             }
            
        }                
       }      
       
       Integer numFields = fieldNames.size();
       Integer selected = this.generator.intValue(0, numFields-1);
       
       Object[] names = fieldNames.keySet().toArray();
       String fieldName = (String)names[selected];
       Object container = fieldNames.get(fieldName);
                     
       return new Object[]{fieldName, container};      
      
   }

   public FieldHelper getFieldHelperForTransformation(String fieldName) throws Exception
   {
         Map<String, Object>fieldCatalog = this.getFieldNamesForTransformation();
        return new FieldHelper(fieldName, fieldCatalog.get(fieldName)); // value is container
   }
   
   /**
     * Returns whether the DataField is involved in any DerivedField in TransformationDictionary.
     */
   public Boolean inTransformationDictionary(String dataFieldName)
   {
      PMML pmml = (PMML)rootScope.PMMLScope;    
       TransformationDictionary td = pmml.getTransformationDictionary();
       
       for (DerivedField derF : td.getDerivedField())
       {
           if (derF.getFieldRef() !=null)
           {
               if (dataFieldName.equals(derF.getFieldRef().getField()))
               { 
                   return true;
               }
           }
             if (derF.getDiscretize()!=null)
           {
               if (dataFieldName.equals(derF.getDiscretize().getField()))
               { 
                   return true;
               }
           }
       }
       
       return false;
   }
   
   private List<BuiltinFunction> populateBuiltInFunctions()
   {
       List<BuiltinFunction> functions = new ArrayList<BuiltinFunction>();       
       BuiltinFunction f = new BuiltinFunction();
       f.setName("+");
       f.setArgumentTypes(new String[]{"c","c"});
       functions.add(f);
       
       f = new BuiltinFunction();
       f.setName("-");
       f.setArgumentTypes(new String[]{"c","c"});
       functions.add(f);
       
       f = new BuiltinFunction();
       f.setName("*");
       f.setArgumentTypes(new String[]{"c","c"});
       functions.add(f);
       
       f = new BuiltinFunction();
       f.setName("/");
       f.setArgumentTypes(new String[]{"c","c"});
       functions.add(f);
       
       // TODO Implement max min
       
       f = new BuiltinFunction();
       f.setName("log10");
       f.setArgumentTypes(new String[]{"c"});
       functions.add(f);
       
       f = new BuiltinFunction();
       f.setName("ln");
       f.setArgumentTypes(new String[]{"c"});
       functions.add(f);
       
       return functions;
   }
   
    private List<BuiltinFunction> populateStringBuiltinFunctions()
   {
       List<BuiltinFunction> functions = new ArrayList<BuiltinFunction>();   
       
       BuiltinFunction f = new BuiltinFunction();
       f.setName("uppercase");
       f.setArgumentTypes(new String[]{"s"});
       functions.add(f);
       
       f = new BuiltinFunction();
       f.setName("lowercase");
       f.setArgumentTypes(new String[]{"s"});
       functions.add(f);
       
       f = new BuiltinFunction();
       f.setName("trimBlanks");
       f.setArgumentTypes(new String[]{"s"});
       functions.add(f);
   
       return functions;
   }
    
   public BuiltinFunction getRandomFunction(DATATYPE datatype) throws Exception
   {
       switch (datatype)
       {
           case STRING:
               return this.builtInFunctions.get(generator.intValue(0, this.stringBuiltInFunctions.size()-1));
               
           case DOUBLE:
           case FLOAT:
           case INTEGER:
               return this.builtInFunctions.get(generator.intValue(0, this.builtInFunctions.size()-1));
               
           default:
               throw new Exception("Unexpected DATATYPE in getRandomFanction");
       }
       
           
       }
       
       
   }
    

