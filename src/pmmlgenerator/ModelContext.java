/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.util.*;
import pmmlgenerator.util.*;
import pmmlgenerator.modelbuilders.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;    
import static pmmlgenerator.PMMLGenerator.sentence;
import pmmlgenerator.util.Scope;


/**
 *
 * @author Angel Salamanca
 */
public class ModelContext {
    
    Object PMMLModel;
    public GeneralRegressionModel grm;
    public  TreeModel treeModel;
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
                this.grm = (GeneralRegressionModel)PMMLModel;
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
          TreeModelBuilder tmb = new TreeModelBuilder(this);
          return tmb.build();
      }
      
      public String getTargetReferenceCategory(Scope scope) throws Exception
      {
          FieldHelper  fh = new FieldHelper(this.targetField.getName(), scope);
          List<Value> values = fh.getValues();
          Value lastValue = values.get(values.size()-1);
          
          return lastValue.getValue();
          
          
      }
      
      
}
