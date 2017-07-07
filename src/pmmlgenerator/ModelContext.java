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
    GeneralRegressionModel grm;
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
      
      public TreeModel buildTreeModel() throws Exception
      {
            this.treeModel.setModelName(generator.getModelName("Tree")); 
            Scope treeScope = new Scope(treeModel.getModelName(), treeModel, treeModel.getClass().getSimpleName(), this.context);
            this.context.setCurrentScope(treeScope);         
            treeScope.setModelContext(this);
            
            // Constraint on functionName
            
            this.treeModel.setFunctionName(MININGFUNCTION.valueOf(generator.pickOne(General.GRMFunctions)));
            this.treeModel.setAlgorithmName(sentence.getSentence(2));
            
            // MiningSchema
             MiningSchemaBuilder msb = new MiningSchemaBuilder(true, this);
             MiningSchema ms = msb.build(treeModel.getFunctionName());
             treeModel.addToContent(ms);
             this.context.createFieldUniverse(); // update
             // Local Transformations
              LocalTransformationBuilder ltb = new LocalTransformationBuilder(this);
              LocalTransformations lt = ltb.build();
              treeModel.addToContent(lt);
              this.context.createFieldUniverse(); // update
              
              NodeBuilder nb = new NodeBuilder(this);              
              treeModel.addToContent(nb.build(true));
             
            return this.treeModel;
      }
}
