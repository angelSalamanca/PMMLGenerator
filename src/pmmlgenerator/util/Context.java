/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import pmmlgenerator.util.FieldUniverse.FieldType;
import pmmlgenerator.*;
import java.util.*;
import pmmlgenerator.PMML42.*;        

/**
 *
 * @author Angel Salamanca
 */
public class Context {
    
   private ModelContext rootContext;
   private ModelContext currentContext;
   public NameGenerator generator;
   private List<BuiltinFunction> builtInFunctions;
   private List<BuiltinFunction> safeFunctions;
   private List<BuiltinFunction> stringBuiltInFunctions;
   public FieldUniverse fieldUniverse;
   private Map<String, Boolean> tdAffectedFields;
   private Integer selected;
   private ContentUtil cu;
   private List<FieldDescriptor> fds;
   
   
   public Context() throws Exception
   {     
       this.generator = new NameGenerator();
       this.builtInFunctions = populateBuiltInFunctions();
       this.safeFunctions = new ArrayList<BuiltinFunction>();
       this.stringBuiltInFunctions = populateStringBuiltinFunctions();
       this.rootContext = new ModelContext(this, "PMML");
       this.setCurrentContext(this.rootContext);    
       this.tdAffectedFields = new HashMap<String, Boolean>();
       this.cu = new ContentUtil();
   }
   
   public Map<String, ModelContext> getFieldNamesForMiningSchema() throws Exception
   {
       Map<String, ModelContext>names;
       PMML pmml = PMMLGenerator.pmml;
       
        // First Data Dictionary
        names = this.getDataFieldNames();
        // Then local Transformation of parent model
        if (currentContext.isSecondOrMore())
        {
                for (DerivedField derF : currentContext.getParent().readLocalDerivedFields())
                      names.put(derF.getName(), this.currentContext);    
            }       
       return names;
   }  
  
   public Map<String, ModelContext> getDataFieldNames() throws Exception
   {
       Map<String, ModelContext> names = new HashMap<String, ModelContext>();
       List<FieldDescriptor> fds = this.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.DataField);
         
            for (FieldDescriptor fd : fds)
            {
                names.put(fd.fieldName, this.currentContext);         
            }      
                  
         return names;
   }
   
   
   
   public List<FieldDescriptor> getFieldDescriptorsForTransformation() throws Exception
   {
       // DD or MiningSchema
       List<FieldDescriptor> fdl;
       if (this.currentContext.isRoot())
       {
           fdl =this.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.DataField);
       }
       else
       {
       if (this.currentContext.isDefineFunction())
       {
           fdl= this.fieldUniverse.getFieldDescriptors(FieldType.ParameterField);
       }
      else
       {
            fdl= this.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.MiningField, currentContext);
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
        fds = this.fieldUniverse.getFieldDescriptors(FieldType.MiningField, currentContext);
        fds.addAll(this.fieldUniverse.getFieldDescriptors(FieldType.DerivedField, currentContext));
       // Dubious
        fds.addAll(this.fieldUniverse.getFieldDescriptors(FieldType.DerivedField, this.rootContext));
       
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
   
    public ModelContext getRootContext()
   {
       return this.rootContext;       
   }

   
   public ModelContext getCurrentContext()
   {
       return this.currentContext;       
   }

   public void setCurrentContext(ModelContext cContext) throws Exception
   {
       if (this.currentContext != null) {
           this.currentContext.addChild(cContext);
           cContext.setParent(this.currentContext);
       }
       
       this.currentContext= cContext;       
       this.createFieldUniverse();       
   }
   
   public void backToParent() throws Exception
   {
       this.currentContext = this.currentContext.getParent();
       this.createFieldUniverse();
   }
   
   public void createFieldUniverse() throws Exception
   {
       this.fieldUniverse = new FieldUniverse(this);
       // create MSMAp
       
   }
   
   public FieldDescriptor randomField(DATATYPE datatype, Boolean forModel, Boolean allValid, Boolean valuesCompulsory, Boolean intervalsCompulsory) throws Exception
   {
       FieldDescriptor fd = null;
       Integer tries = 0;
       while (fd==null)
       {
           fd = internalRandomField(datatype, forModel, allValid, valuesCompulsory, intervalsCompulsory);          
           if (tries>9)
           {
               throw new Exception("Unable to generate random field");
           }
            tries +=1;
       }
       return fd;
   }
   
   private FieldDescriptor internalRandomField(DATATYPE datatype, Boolean forModel, Boolean allValid, Boolean valuesCompulsory, Boolean intervalsCompulsory) throws Exception
           
   {
      
       if (forModel)
       {
           fds  = this.getFieldDescriptorsForTransformation();
       }
           else
       {
           fds = this.currentContext.getFieldDescriptorsForMiningSchema();
       }
       Integer totalNumOfFields = fds.size();
       // retain matching datatype only. Needed?
       Iterator<FieldDescriptor> it = fds.iterator();
       
       while (it.hasNext()) {             
           FieldDescriptor fd = it.next(); 
           FieldHelper fieldhelper = new FieldHelper(fd.fieldName, fd.modelContext);
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
                if (intervalsCompulsory )
                // remove DataFields without Values
                {
                    if (fieldhelper.getInterVals().size()==0) {
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
       // General.witness("  selected: " + String.valueOf(selected));
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
       
       public List<FieldDescriptor> getFieldDescriptorsForMiningSchema() throws Exception
       {
           return this.currentContext.getFieldDescriptorsForMiningSchema();
       }
       
       public FieldDescriptor getFieldDescriptor(String fieldName, Object container, List<FieldDescriptor> fds) throws  Exception
       {
           for (FieldDescriptor fd : fds)
           {
               if (fd.fieldName.equals(fieldName) || container.equals(fd.modelContext.getModel()))
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
          Object field = currentContext.getFieldFromMF(mf);
          if (field.getClass().getSimpleName().equals("DataField"))
          {
              return ((DataField)field).getDataType();
          }
              return ((DerivedField)field).getDataType();
          
      }

      public OPTYPE getOpTypeOfMF(MiningField mf) throws Exception
      {
          Object field = currentContext.getFieldFromMF(mf);
          if (field.getClass().getSimpleName().equals("DataField"))
          {
              return ((DataField)field).getOptype();
          }
              return ((DerivedField)field).getOptype();
          
      }     
      
      public Object getFieldFromMF(MiningField mf) throws Exception
      {
          return this.currentContext.getFieldFromMF(mf);
      }
 
}