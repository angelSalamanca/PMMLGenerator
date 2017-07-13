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
   private List<BuiltinFunction> safeFunctions;
   private List<BuiltinFunction> stringBuiltInFunctions;
   private FieldUniverse fieldUniverse;
   private Map<String, Boolean> tdAffectedFields;
   private List<FieldDescriptor> fds;
   private Integer selected;
   private ContentUtil cu;
   
   
   public Context(Scope scope) throws Exception
   {
       this.rootScope = scope;      
       this.generator = new NameGenerator();
       this.builtInFunctions = populateBuiltInFunctions();
       this.safeFunctions = new ArrayList<BuiltinFunction>();
       this.stringBuiltInFunctions = populateStringBuiltinFunctions();
       this.setCurrentScope(scope);
       this.tdAffectedFields = new HashMap<String, Boolean>();
       this.cu = new ContentUtil();
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
       // DD or MiningSchema
       List<FieldDescriptor> fdl;
       if (this.currentScope.isRoot())
       {
           fdl =this.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.DataField);
       }
       else
       {
       if (this.currentScope.isDefineFunction())
       {
           fdl= this.fieldUniverse.getFieldDescriptors(FieldType.ParameterField);
       }
      else
       {
            fdl= this.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.MiningField, currentScope);
       }
       }
       if (fdl.size()==0)
       {
           int a =1+1;
       }
       return fdl;
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
  
  public List<FieldDescriptor> keepContinuousFDS(List<FieldDescriptor> fds)
  {
      List<FieldDescriptor> fdsc = new ArrayList<FieldDescriptor>();
      
      for (FieldDescriptor fd : fds)
      {
          if (fd.optype==OPTYPE.CONTINUOUS)
          { fdsc.add(fd);}
      }
      return fdsc;
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
           cScope.setParent(this.currentScope);
       }
       
       this.currentScope = cScope;       
       this.createFieldUniverse();       
   }
   
   public void backToParent() throws Exception
   {
       this.currentScope = this.currentScope.getParent();
       this.createFieldUniverse();
   }
   
   public void createFieldUniverse() throws Exception
   {
       this.fieldUniverse = new FieldUniverse(this);
       // create MSMAp
       
   }
   
   public FieldDescriptor randomField(DATATYPE datatype, Boolean forModel, Boolean allValid,Boolean valuesCompulsory) throws Exception
   {
       FieldDescriptor fd = null;
       Integer tries = 0;
       while (fd==null)
       {
           fd = internalRandomField(datatype, forModel, allValid, valuesCompulsory);
           tries +=1;
           if (tries>9)
           {
               throw new Exception("Unable to generate random field");
           }
       }
       return fd;
   }
   
   private FieldDescriptor internalRandomField(DATATYPE datatype, Boolean forModel, Boolean allValid, Boolean valuesCompulsory) throws Exception
           
   {
      
       if (forModel)
       {
           fds  = this.getFieldDescriptorsForTransformation();
       }
           else
       {
           fds = this.getFieldDescriptorsForMiningSchema();
       }
       Integer totalNumOfFields = fds.size();
       // retain matching datatype only. Needed?
       Iterator<FieldDescriptor> it = fds.iterator();
       
       while (it.hasNext()) {             
           FieldDescriptor fd = it.next(); 
           FieldHelper fieldhelper = new FieldHelper(fd.fieldName, fd.scope);
            if (!fieldhelper.getDataType().equals(datatype))
                {
                    it.remove();
                }
           else
 
            {
                if (fieldhelper.getTheClass().equals("DataField"))
                {
                if (allValid )
                // remove DataFields with Intervals or Values
                {
                    if (fieldhelper.getInterVals().size()>0 || fieldhelper.getValues().size()>0) {
                    it.remove();
                        }     
                 }
                if (valuesCompulsory )
                // remove DataFields without Values
                {
                    if (fieldhelper.getValues().size()==0) {
                    it.remove();
                        }     
                 }
                }
            }
       }
                           
       Integer numFields = fds.size();
       if (numFields==0)
       {
           return null;
       }
       // System.out.println("  selected: " + String.valueOf(selected));
       selected = this.generator.intValue(0, numFields-1);            
                     
       return fds.get(selected);
 }
        
  
   
   /**
     * Returns whether the DataField is involved in any DerivedField in TransformationDictionary.
     */   
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
       
       // TODO Implement max min sqrt
              
       return functions;
   }
   
   public void mergeFunctionLists()
   {
       for (BuiltinFunction bf: this.safeFunctions)
       {
           this.builtInFunctions.add(bf);
       }
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
    
    public void addSafeFunction(BuiltinFunction sf)
    {
        this.safeFunctions.add(sf);
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
               throw new Exception("Unexpected DATATYPE in getRandomFunction");
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
       
       public void affectField(String name)
       {
           if (!this.tdAffectedFields.containsKey(name))
           {
               this.tdAffectedFields.put(name, Boolean.TRUE);
           }
       }
       
       public Boolean isTDAffected(String name)
       {
           return this.tdAffectedFields.containsKey(name);
       }
       
      public DATATYPE getDataTypeOfMF(MiningField mf) throws Exception
      {
          Object field = getFieldFromMF(mf);
          if (field.getClass().getSimpleName().equals("DataField"))
          {
              return ((DataField)field).getDataType();
          }
              return ((DerivedField)field).getDataType();
          
      }

      public OPTYPE getOpTypeOfMF(MiningField mf) throws Exception
      {
          Object field = getFieldFromMF(mf);
          if (field.getClass().getSimpleName().equals("DataField"))
          {
              return ((DataField)field).getOptype();
          }
              return ((DerivedField)field).getOptype();
          
      }
      
      public void setDataTypeOfMF(MiningField mf, DATATYPE datatype) throws Exception
      {
          Object field = getFieldFromMF(mf);
          if (field.getClass().getSimpleName().equals("DataField"))
          {
              DataField df = (DataField)field;
              df.setDataType(datatype);
              return;
          }
              DerivedField derf = (DerivedField)field;
              derf.setDataType(datatype);
          
      }
      
      public Object getFieldFromMF(MiningField mf) throws Exception
      {
          List<FieldDescriptor> fdl = this.getFieldDescriptorsForMiningSchema();
          FieldDescriptor sourcefd = null;
          for (FieldDescriptor fd : fdl)
          {
              if(fd.fieldName.equals(mf.getName()))
                      {
                          sourcefd = fd;
                          break;
                      }
          }
          
          if (sourcefd.fieldType == FieldType.DataField)
          {
           List<DataField> dfl =   ((PMML)this.getRootScope().PMMLScope).getDataDictionary().getDataField();
           for (DataField df : dfl)
           {
               if (df.getName().equals(sourcefd.fieldName))
               {
                   return df;
               }
           }
          }
          
           if (sourcefd.fieldType == FieldType.DerivedField)
          {
           List<DerivedField> ltf =   this.currentScope.readLocalDerivedFields();
           for (DerivedField df : ltf)
           {
               if (df.getName().equals(sourcefd.fieldName))
               {
                   return df;
               }
           }
          }
          
          throw new Exception("mining field data type");
          
      }
      

}