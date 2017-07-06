/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import pmmlgenerator.util.FieldUniverse.FieldType;
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
   private FieldUniverse fieldUniverse;
   
   
   public Context(Scope scope) throws Exception
   {
       this.rootScope = scope;      
       this.generator = new NameGenerator();
       this.builtInFunctions = populateBuiltInFunctions();
       this.stringBuiltInFunctions = populateStringBuiltinFunctions();
       this.setCurrentScope(scope);
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
                for (DerivedField derF : currentScope.getParent().readLocalDerivedFields())
                      names.put(derF.getName(), this.currentScope);    
            }       
       return names;
   }  
  
   public Map<String, Object> getDataFieldNames() throws Exception
   {
       Map<String, Object> names = new HashMap<String, Object>();
       List<FieldDescriptor> fds = this.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.DataField);
         
            for (FieldDescriptor fd : fds)
            {
                names.put(fd.fieldName, this.currentScope.PMMLScope);         
            }      
                  
         return names;
   }
   
   public List<FieldDescriptor> getFieldDescriptorsForMiningSchema() throws Exception
   {
       // Data Dictionary
       List<FieldDescriptor> fds = this.fieldUniverse.getFieldDescriptors(FieldType.DataField);
       
       // And local transformation of parent
           if (currentScope.isSecondOrMore())
           {
               // Add local transformation of parent
               fds.addAll(this.fieldUniverse.getFieldDescriptors(FieldType.DerivedField, currentScope.getParent()));
           }
         return fds;
           
   }
   
   public List<FieldDescriptor> getFieldDescriptorsForTransformation() throws Exception
   {
        List<FieldDescriptor> fds;
       
       // DD or MiningSchema
       if (this.currentScope.isRoot())
       {
           fds = this.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.DataField);
       }
       else
       {
          // names = this.getMiningFieldNames();
            fds=this.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.MiningField, currentScope);
       }
       //
       
       return fds;
   }
   
  public List<FieldDescriptor> getFieldDescriptorsForModel() throws Exception
   {
       // Mining fields
        List<FieldDescriptor> fds;
        fds = this.fieldUniverse.getFieldDescriptors(FieldType.MiningField, currentScope);
        fds.addAll(this.fieldUniverse.getFieldDescriptors(FieldType.DerivedField, currentScope));
       // Dubious
        fds.addAll(this.fieldUniverse.getFieldDescriptors(FieldType.DerivedField, this.rootScope));
       
       return fds;
            
   }   
   
    public Scope getRootScope()
   {
       return this.rootScope;       
   }

   
   public Scope getCurrentScope()
   {
       return this.currentScope;       
   }

   public void setCurrentScope(Scope cScope) throws Exception
   {
       if (this.currentScope != null) {
           this.currentScope.addChild(cScope);
       }
       
       this.currentScope = cScope;       
       this.createFieldUniverse();       
   }
   
   public void createFieldUniverse() throws Exception
   {
       this.fieldUniverse = new FieldUniverse(this);
   }
   
   public FieldDescriptor randomField(DATATYPE datatype, Boolean forModel, Boolean allValid) throws Exception
           
   {
       List<FieldDescriptor> fds;
       if (forModel)
       {
           fds  = this.getFieldDescriptorsForTransformation();
       }
           else
       {
           fds = this.getFieldDescriptorsForMiningSchema();
       }
       
       // retain matching datatype only. Needed?
       Iterator<FieldDescriptor> it = fds.iterator();
       
       while (it.hasNext()) {             
           FieldDescriptor fd = it.next(); 
           FieldHelper fieldhelper = new FieldHelper(fd.fieldName, fd.scope.PMMLScope);
            if (!fieldhelper.getDataType().equals(datatype))
                {
                    it.remove();
                }
           else
 
            {
                if (allValid && fieldhelper.getTheClass().equals("DataField"))
                // remove DataFields with Intervals or Values
                {
                    if (fieldhelper.getInterVals().size()>0 || fieldhelper.getValues().size()>0) {
                    it.remove();
                        }     
                 }
            }
       }
                           
       Integer numFields = fds.size();
       Integer selected = this.generator.intValue(0, numFields-1);            
                     
       return fds.get(selected);
      
   }      
   
   /**
     * Returns whether the DataField is involved in any DerivedField in TransformationDictionary.
     */
   public Boolean inTransformationDictionary(String dataFieldName) throws Exception
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
       
       public FieldUniverse getFieldUniverse()
       {
           return this.fieldUniverse;
       }
       
       public FieldDescriptor getFieldDescriptor(String fieldName, Object container, List<FieldDescriptor> fds) throws  Exception
       {
           for (FieldDescriptor fd : fds)
           {
               if (fd.fieldName.equals(fieldName) || container.equals(fd.scope.getPMMLScope()))
               { return fd;}
           }
           throw new Exception("field not found");
           
       }
   }
    

