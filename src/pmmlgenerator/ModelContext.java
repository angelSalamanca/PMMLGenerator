/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.util.*;
import pmmlgenerator.util.*;
import pmmlgenerator.modelbuilders.*;
import pmmlgenerator.PMML42.*;    


/**
 *
 * @author Angel Salamanca
 */
public class ModelContext {
    
    Object PMMLModel;
    private ModelContext parent;
    private List<ModelContext> children;
    
    public GeneralRegressionModel grm;
    public RegressionModel rm;
    public TreeModel treeModel;
    public MiningModel miningModel;
    public SupportVectorMachineModel svmModel;
    public NeuralNetwork nnModel;
    public Scorecard scorecard;
    public RuleSetModel ruleset;
    
    private MiningField targetField;
    public List<String> categories;
    public NameGenerator generator;
    public Context context;
    private String[] available;
    private String theClass;
    public ContentUtil cu;
    public  FieldDescriptor targetFieldDescriptor;
    private List<FieldDescriptor> fds;
    private String name;
    private Map<String, Boolean> tdAffectedFields;

    
    public  MiningField getTargetField()
    {
        return this.targetField;
    }
    
    public void setTargetField(MiningField field)
    {
        this.targetField = field;
    }
    
    public void setTargetFieldDescriptor(FieldDescriptor tfd)
    {
        this.targetFieldDescriptor = tfd;
    }
    
    public Integer numTargetCategories()
    {
        return this.categories.size();
    }
    
    public List<ModelContext> getChildren()
    {
        return this.children;
    }
    
    public ModelContext(Context thiscontext, String modelFamily) throws Exception
    {
        this.context = thiscontext; 
        this.generator = this.context.generator;             
         
        this.name = modelFamily; 
       
        this.theClass = modelFamily;
        this.cu = new ContentUtil();
        this.tdAffectedFields = new HashMap<String, Boolean>();
          
        General.witness("Setting up " + modelFamily);
    }
    
    public ModelContext(Context thiscontext,  Object  model, String mcName) throws Exception
    {        
          this.context = thiscontext;      
          this.theClass = model.getClass().getSimpleName();
         
         this.generator = this.context.generator;
      
        this.cu = new ContentUtil();
        this.name = mcName; // Will be updated when we know model name
        this.PMMLModel = model;
         this.tdAffectedFields = new HashMap<String, Boolean>();
    }
    
     public Boolean isSecondOrMore()
    {
        if (this.isRoot()) { return false;}
         if (this.parent.isRoot()) { return false;}
        return true;
    }
     
      public Boolean isRoot()
    {
        return parent == null;
    }
    
     public ModelContext getParent()
    {
        return this.parent;
    }
    
    public void setParent(ModelContext thisParent)
    {
        this.parent = thisParent;
    }
    
    public void addChild(ModelContext child)
    {
        if (this.children == null)
        {
            children = new ArrayList<ModelContext>();
        }
        this.children.add(child);
        child.parent = this;        
    }
    
    public Boolean isDefineFunction()
       {
           return this.theClass.equals("DefineFunction");
       }

        public String getName()
    {
        return this.name;
    }
   

    
    public Object getModel() throws Exception
        {
        switch(theClass)
        {
            case "GeneralRegressionModel":
                return this.grm ;
            case "TreeModel":
                return this.treeModel;
            case "RegressionModel":
                return this.rm ;
            case "MiningModel":
                return this.miningModel;
            case "SupportVectorMachineModel":
                return this.svmModel;    
            case "NeuralNetwork":
                return this.nnModel;
            case "Scorecard":
                return this.scorecard;
            case "RuleSetModel":
                return this.ruleset;
            case "DefineFunction":
                return this.PMMLModel;
            case "PMML":
                return this.getPMML();
            default:
                throw new Exception("Unexpected model family");
        }
    }
    
    public PMML getPMML()
    {
        return PMMLGenerator.pmml;
    }
    
    public  void castModel() throws Exception
    {
        this.theClass = this.PMMLModel.getClass().getSimpleName();
        switch(theClass)
        {
            case "GeneralRegressionModel":
                this.grm = (GeneralRegressionModel)PMMLModel;
                break;
                
            case "TreeModel":
                this.treeModel = (TreeModel)PMMLModel;
                break;
                
           case "RegressionModel":
                this.rm = (RegressionModel)PMMLModel;
                break;                     
                
            case "MiningModel":
                this.miningModel = (MiningModel)PMMLModel;
                break;
             
            case "SupportVectorMachineModel":
                this.svmModel = (SupportVectorMachineModel)PMMLModel;
                break; 
                
            case "NeuralNetwork":
                this.nnModel = (NeuralNetwork)PMMLModel;
                break; 
                
            case "Scorecard":
                 this.scorecard = (Scorecard)PMMLModel;
                break; 
                
            case "RuleSet":
                this.ruleset = (RuleSetModel)PMMLModel;
                break; 
                
            default:
                throw new Exception("Unexpected class in castModel: " + theClass);
        }
    }
    
     public Integer getLevel()
    {
        Integer level = 0;
        ModelContext slidingContext = this;
        while(!slidingContext.isRoot())
        {
            level +=1;
            slidingContext = slidingContext.getParent();
        }                
        return level;
    }
    
    public List<DerivedField> readLocalDerivedFields() throws Exception
    {
        LocalTransformations lt;
        Object model = this.getModel();
      
        switch (this.theClass)
        {
            case "GeneralRegressionModel":
                GeneralRegressionModel grm = (GeneralRegressionModel)model;
                lt = (LocalTransformations)cu.getFromContent(grm.getContent(),"LocalTransformations");
                break;
               
            case "TreeModel":
                TreeModel treemodel = (TreeModel)model;
                lt = (LocalTransformations)cu.getFromContent(treemodel.getContent(),"LocalTransformations");
                break;
                
             case "MiningModel":
                MiningModel mm = (MiningModel)model;
                lt = (LocalTransformations)cu.getFromContent(mm.getContent(),"LocalTransformations");
                break;    
                
                
             case "RegressionModel":
                RegressionModel rm = (RegressionModel)model;
                lt = (LocalTransformations)cu.getFromContent(rm.getContent(),"LocalTransformations");
                break;    
                 
             case "SupportVectorMachineModel":
                SupportVectorMachineModel svm = (SupportVectorMachineModel)model;
                lt = (LocalTransformations)cu.getFromContent(svm.getContent(),"LocalTransformations");
                break;    
                 
             case "NeuralNetwork":                
                lt = (LocalTransformations)cu.getFromContent(this.nnModel.getContent(),"LocalTransformations");
                break;    
            
             case "Scorecard":                
                lt = (LocalTransformations)cu.getFromContent(this.scorecard.getContent(),"LocalTransformations");
                break;    
                 
               case "RuleSetModel":                
                lt = (LocalTransformations)cu.getFromContent(this.ruleset.getContent(),"LocalTransformations");
                break;      
            
                 
                 
            default:
               return null;
        }

         if (lt!=null)
                {
                  return lt.getDerivedField();
                }
                 else
                {
                    return null;
                }
    }    
    
    public Boolean hasPredictedValue() throws Exception
    {
 
        switch(theClass)
        {
            case "GeneralRegressionModel":
            case "TreeModel":
            case "MiningModel":    
            case "RegressionModel":    
            case "SupportVectorMachineModel":  
            case "NeuralNetwork":
            case "Scorecard":
            case "RuleSetModel":    
                return true;
            default:
                throw new Exception("Unexpected class");
        }
    }
    
      public Boolean hasprobability() throws Exception
    {
     
        switch(theClass)
        {
            case "GeneralRegressionModel":
                if (grm.getFunctionName().equals(MININGFUNCTION.CLASSIFICATION))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            
            case "TreeModel":    
                if (treeModel.getFunctionName().equals(MININGFUNCTION.CLASSIFICATION))
                {
                    return true;
                }
                else
                {
                    return false;
                }
           
             case "RegressionModel":
                if (rm.getFunctionName().equals(MININGFUNCTION.CLASSIFICATION))
                {
                    return true;
                }
                else
                {
                    return false;
                }
           
             case "SupportVectorMachineModel":
                
                    return false;
         
            
            case "MiningModel":
                return false;  //TODO in modelChain look at last model characteristics
                
              case "NeuralNetwork":
                 if (this.nnModel.getFunctionName().equals(MININGFUNCTION.CLASSIFICATION))
                {
                    return true;
                }
                else
                {
                    return false;
                }    
                
              case "Scorecard":
                  return false;
                  
            default:
                throw new Exception("Unexpected class");
        }
    }
      
      public Boolean hasReasonCodes() {
          if (theClass.equals("Scorecard")) {
              return true;
          } else {
              return false;
          }
      }
    
      public List<String> getCategories()
      {
          return this.categories;
      }
      
      public void setCategories(List<String>cats)
      {
          this.categories = cats;
      }
      
      public Boolean isRegression() throws Exception
      {
         
           switch(theClass)
        {
               case "GeneralRegressionModel":
                   return grm.getFunctionName() == MININGFUNCTION.REGRESSION;
                   
               case "TreeModel":
                   return treeModel.getFunctionName() == MININGFUNCTION.REGRESSION;
                   
               case "MiningModel":
                     return miningModel.getFunctionName() == MININGFUNCTION.REGRESSION;
                   
                 case "RegressionModel":
                   return rm.getFunctionName() == MININGFUNCTION.REGRESSION;    
                     
                 case "SupportVectorMachineModel":
                   return this.svmModel.getFunctionName() == MININGFUNCTION.REGRESSION;         
               
                 case "NeuralNetwork":
                   return this.nnModel.getFunctionName() == MININGFUNCTION.REGRESSION;         
               
                     case "Scorecard":
                   return this.scorecard.getFunctionName() == MININGFUNCTION.REGRESSION;         
               
                case "RuleSetModel":
                   return this.ruleset.getFunctionName() == MININGFUNCTION.REGRESSION;         
               
                     
                default:
                    throw new Exception("Unexpected class");     
                   
        }
      }
      
      private void buildGRM(Boolean isRegression) throws Exception
      {
          GRMBuilder grmb = new GRMBuilder(this);
          grmb.build(isRegression);
      }
      
      private void buildTreeModel(Boolean isRegression) throws Exception
      {
          TreeModelBuilder tmb = new TreeModelBuilder(this);
          tmb.build(isRegression);
      }
      
       private void buildRM(Boolean isRegression) throws Exception
      {
          RMBuilder rmb = new RMBuilder(this);
          rmb.build(isRegression);
      }
      
      
       private void buildMiningModel(Boolean isRegression) throws Exception
      {
          MiningModelBuilder mmb = new MiningModelBuilder(this);
          mmb.build(isRegression);
      }
       
         private void buildSVMModel(Boolean isRegression) throws Exception
      {
          SVMModelBuilder svmb = new SVMModelBuilder(this);
          svmb.build(isRegression);
      }
         
         private void buildNN(Boolean isRegression) throws Exception
      {
          NNBuilder nnb = new NNBuilder(this);
          nnb.build(isRegression);
      }
         
         private void buildScorecard()   throws Exception {
             ScorecardBuilder scb = new ScorecardBuilder(this);
             scb.build(true);
         }
      
      public String getTargetReferenceCategory(ModelContext mContext) throws Exception
      {
          FieldHelper  fh = new FieldHelper(this.targetField.getName(), mContext);
          List<Value> values = fh.getValues();
          Value lastValue = values.get(values.size()-1);
          
          return lastValue.getValue();     
          
      }
      
      public void build(Boolean isRegression) throws Exception
      {
          this.name = this.generator.getModelName(theClass);
          
          switch(this.theClass)
          {
               case "GeneralRegressionModel":
                this.buildGRM(isRegression);
                break;
                
            case "TreeModel":
                this.buildTreeModel(isRegression);
                break;
                
           case "RegressionModel":
                this.buildRM(isRegression);
                break;
                
            case "MiningModel":
                this.buildMiningModel(isRegression);
                break;
                
            case "SupportVectorMachineModel":
                this.buildSVMModel(isRegression);
                break;
                
            case "NeuralNetwork":
                this.buildNN(isRegression);
                break;
                
            case "Scorecard":
                this.buildScorecard();
                break;
                
            default:
               throw new Exception("Unexpected class");
          }
          
         this.PMMLModel = getModel();
         this.castModel();        
         this.context.backToParent();
         
      }
      
      public MiningSchema getMiningSchema() throws Exception
      {
        switch(theClass)
        {
            case "GeneralRegressionModel":
                return (MiningSchema)this.cu.getFromContent(this.grm.getContent(), "MiningSchema");
                
            case "TreeModel":
                return (MiningSchema)this.cu.getFromContent(this.treeModel.getContent(), "MiningSchema");
                
            case "RegressionModel":
                return (MiningSchema)this.cu.getFromContent(this.rm.getContent(), "MiningSchema");
                
            case "MiningModel":
                return (MiningSchema)this.cu.getFromContent(this.miningModel.getContent(), "MiningSchema");
                
            case "SupportVectorMachineModel":
                return (MiningSchema)this.cu.getFromContent(this.svmModel.getContent(), "MiningSchema");    
                
             case "NeuralNetwork":
                return (MiningSchema)this.cu.getFromContent(this.nnModel.getContent(), "MiningSchema");    
                 
             case "Scorecard":
                return (MiningSchema)this.cu.getFromContent(this.scorecard.getContent(), "MiningSchema");    
                      
            case "RuleSetModel":
                return (MiningSchema)this.cu.getFromContent(this.ruleset.getContent(), "MiningSchema");    
                
            default:
                throw new Exception("Unexpected class in getMiningSchema");
        }   
      }
      
       public List<FieldDescriptor> getFieldDescriptorsForMiningSchema() throws Exception
   {
       // And local transformation of parent
           if (this.isSecondOrMore())
           {
               fds = this.context.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.MiningField, this.getParent());
               // Add local transformation of parent
               fds.addAll(this.context.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.DerivedField, this.getParent()));
           }
           else // Regular models
           {
               // Data Dictionary
               fds = this.context.fieldUniverse.getFieldDescriptors(FieldUniverse.FieldType.DataField);
           }      
           
         return fds;
           
   }
       
       public FieldDescriptor getFDFromMF(MiningField mf) throws Exception
       {
          List<FieldDescriptor> fdl = this.getFieldDescriptorsForMiningSchema();
          FieldDescriptor sourcefd = null;
          for (FieldDescriptor fd : fdl)
          {
              if(fd.fieldName.equals(mf.getName()))
                      {
                          return fd;                          
                      }
          }
          return null;
       }
       
       
       public Object getFieldFromMF(MiningField mf) throws Exception
      {
          try {
          
         FieldDescriptor sourcefd = this.getFDFromMF(mf);
          
          if (sourcefd.fieldType == FieldUniverse.FieldType.DataField)
          {
           List<DataField> dfl =   PMMLGenerator.pmml.getDataDictionary().getDataField();
           for (DataField df : dfl)
           {
               if (df.getName().equals(sourcefd.fieldName))
               {
                   return df;
               }
           }
          }
          
           if (sourcefd.fieldType == FieldUniverse.FieldType.DerivedField)
          {
           List<DerivedField> ltf =   sourcefd.modelContext.readLocalDerivedFields();
           for (DerivedField df : ltf)
           {
               if (df.getName().equals(sourcefd.fieldName))
               {
                   return df;
               }
           }
          }
           
           // A MiningField can refer to a parent MiningField!
            if (sourcefd.fieldType == FieldUniverse.FieldType.MiningField)
            {
                if (!this.parent.isRoot())
                {
                    MiningField parentMf;
                    List<MiningField> mfl =   this.parent.readMiningFields();
                    for (MiningField minf : mfl)
                    {
                        if (minf.getName().equals(sourcefd.fieldName))
                        {                            
                            return this.parent.getFieldFromMF(minf);
                         }
                     }
                }
            }
               throw new Exception("mining field data type");
          }
          
         catch (Exception e) {   
             {
                General.witness(e.getMessage());
                 throw new Exception("FromMF",e);
             } 
       
          
      }
      }
       
         public void affectField(String name)
       {
           if (!this.tdAffectedFields.containsKey(name))
           {
               this.tdAffectedFields.put(name, Boolean.TRUE);
           }
       }
       
       public Boolean isDerivedAffected(String name)
       {
           return this.tdAffectedFields.containsKey(name);
       }
       
       public Boolean isDerivedAffectedAnywhere(String name)
       {
           ModelContext modelContext = this;
           while (modelContext!=null)
           {
               if (modelContext.isDerivedAffected(name))
               {
                   return true;
               }
               modelContext = modelContext.getParent();
           }
           return false;
       }
           
    public List<MiningField> readMiningFields() throws Exception
    {
        return getMiningSchema().getMiningField();
    }
    
    public List<String> getTargetMiningFields() throws Exception
    {
        List<String> tmf = new ArrayList<String>();
        List<MiningField> amf = readMiningFields();
        for (MiningField mf : amf)
        {
            if (mf.getUsageType().equals(FIELDUSAGETYPE.TARGET) || mf.getUsageType().equals(FIELDUSAGETYPE.PREDICTED))
            {
                tmf.add(mf.getName());
            }
        }
        
        
        return tmf;
    }
    
     public LocalTransformations getLocalTransformations()
    {
        LocalTransformations lt;
         // refactor with abstract class Model
         switch (theClass)
         {
             case "GeneralRegressionModel":
                lt = (LocalTransformations)cu.getFromContent(grm.getContent(),"LocalTransformations");
                break;
             case "TreeModel":
                lt = (LocalTransformations)cu.getFromContent(treeModel.getContent(),"LocalTransformations");
                break;    
             case "MiningModel":
                lt = (LocalTransformations)cu.getFromContent(miningModel.getContent(),"LocalTransformations");
                break;    
             
             default:
               return null;
         }
                return lt;
    }
     
     public String getTheClass()
     {
         return this.theClass;
     }
     
     public String getModelStem()
     {
           switch (this.children.get(this.children.size()-1).getTheClass())
         {
             case "GeneralRegressionModel":
               return "grm";
              
             case "TreeModel":
                return "tree";
                 
             case "RegressionModel":
               return "reg";
                              
              case "MiningModel":
                return "mm";
              
               case "SupportVectorMachineModel":
                return "svm";     
               
               case "Scorecard":
                  return "score";     
               
               case "NeuralNetwork":
                   return "nnet";
               
               case "RuleSetModel":
                   return "rset";                   
                   
             default:
               return "unknown";
         }
                
     }
 
}
