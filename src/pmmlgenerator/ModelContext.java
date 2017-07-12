/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.util.*;
import pmmlgenerator.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;    
import static pmmlgenerator.PMMLGenerator.sentence;
import pmmlgenerator.util.Scope;


/**
 *
 * @author Angel Salamanca
 */
public class ModelContext {
    
    Object PMMLModel;
    private GeneralRegressionModel grm;
    private TreeModel treeModel;
    private MiningField targetField;
    private List<String> categories;
    public NameGenerator generator;
    public Context context;
    private String[] available;
    public static Sentence sentence;
    
    public  MiningField getTargetField()
    {
        return this.targetField;
    }
    
    public void setTargetField(MiningField field)
    {
        this.targetField = field;
    }
    
    public Integer numTargetCategories()
    {
        return this.categories.size();
    }
    
    public ModelContext(Object thisPMMLModel, Context thiscontext) throws Exception
    {
        this.PMMLModel = thisPMMLModel;
        this.castModel();
        this.generator = new NameGenerator();
        this.context = thiscontext;
        sentence = new Sentence();
    }
    
    private void castModel() throws Exception
    {
        String theClass = this.PMMLModel.getClass().getSimpleName();
        switch(theClass)
        {
            case "GeneralRegressionModel":
                grm = (GeneralRegressionModel)PMMLModel;
                break;
                
            case "TreeModel":
                this.treeModel = (TreeModel)PMMLModel;
                break;
                
            default:
                throw new Exception("Unexpected class");
        }
    }
    
    public Boolean hasPredictedValue() throws Exception
    {
        String theClass = this.PMMLModel.getClass().getSimpleName();
        switch(theClass)
        {
            case "GeneralRegressionModel":
            case "TreeModel":
                return true;
            default:
                throw new Exception("Unexpected class");
        }
    }
    
      public Boolean hasprobability() throws Exception
    {
        String theClass = this.PMMLModel.getClass().getSimpleName();
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
            
            default:
                throw new Exception("Unexpected class");
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
           String theClass = this.PMMLModel.getClass().getSimpleName();
           switch(theClass)
        {
               case "GeneralRegressionModel":
                   return grm.getFunctionName() == MININGFUNCTION.REGRESSION;
                   
               case "TreeModel":
                   return treeModel.getFunctionName() == MININGFUNCTION.REGRESSION;
                   
                default:
                    throw new Exception("Unexpected class");     
                   
        }
      }
      
      public TreeModel buildTreeModel() throws Exception
      {
            this.treeModel.setModelName(generator.getModelName("Tree")); 
            Scope treeScope = new Scope(treeModel.getModelName(), treeModel, treeModel.getClass().getSimpleName(), this.context);
            this.context.setCurrentScope(treeScope);         
            treeScope.setModelContext(this);
            
            // Constraint on functionName
            
            this.treeModel.setFunctionName(MININGFUNCTION.valueOf(generator.pickOne(General.GRMFunctions)));
            System.out.println(" Function Name: " + treeModel.getFunctionName().toString());
            this.treeModel.setAlgorithmName(sentence.getSentence(2));
            this.treeModel.setNoTrueChildStrategy(NOTRUECHILDSTRATEGY.valueOf(generator.pickOne(General.treeNoTrueChildStrategies)));
            
            // MiningSchema
             MiningSchemaBuilder msb = new MiningSchemaBuilder(true, this);
             MiningSchema ms = msb.build(treeModel.getFunctionName());
             treeModel.addToContent(ms);
             this.context.createFieldUniverse(); // update
      
                OutputBuilder ob = new OutputBuilder();
               treeModel.addToContent(ob.build(this));
                
             // Local Transformations
              TransformationDictionaryBuilder tdb = new TransformationDictionaryBuilder(this.context);
              treeModel.addToContent(tdb.buildLocal());
              this.context.createFieldUniverse(); // update
              
              NodeBuilder nb = new NodeBuilder(this);              
              treeModel.addToContent(nb.build(null, generator.intValue(1000,10000)).get(0));
             
            
            return this.treeModel;
      }
      
      public String getTargetReferenceCategory(Scope scope) throws Exception
      {
          FieldHelper  fh = new FieldHelper(this.targetField.getName(), scope);
          List<Value> values = fh.getValues();
          Value lastValue = values.get(values.size()-1);
          
          return lastValue.getValue();
          
          
      }
      
      
}
