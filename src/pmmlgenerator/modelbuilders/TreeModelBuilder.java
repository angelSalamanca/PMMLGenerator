/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.modelbuilders;

import java.util.*;
import pmmlgenerator.*;
import pmmlgenerator.util.*;
import pmmlgenerator.PMML42.*;    
import pmmlgenerator.TransformationDictionaryBuilder;

/**
 *
 * @author Angel Salamanca
 */
public class TreeModelBuilder  extends BaseModelBuilder{

    
    public TreeModelBuilder(ModelContext thismc)
    {
        super(thismc);
        this.modelContext.treeModel = new TreeModel();
    }
    
    public void build(Boolean isRegression) throws Exception
    {
        TreeModel treeModel = this.modelContext.treeModel;
        treeModel.setModelName(this.modelContext.getName()); 
         
         this.context.setCurrentContext(modelContext);
            // Constraint on functionName
            
            treeModel.setFunctionName(MININGFUNCTION.valueOf(generator.pickOne(General.GRMFunctions)));
            if (isRegression != null)
            {
                if (isRegression)
                {
                    treeModel.setFunctionName(MININGFUNCTION.REGRESSION);
                }
                else
                {
                    treeModel.setFunctionName(MININGFUNCTION.CLASSIFICATION);
                }
            }
            
            General.witness("  Function Name: " + treeModel.getFunctionName().toString());
            treeModel.setAlgorithmName(this.generator.getSentence(2));
            treeModel.setNoTrueChildStrategy(NOTRUECHILDSTRATEGY.valueOf(generator.pickOne(General.treeNoTrueChildStrategies)));
    
            // MiningSchema
             MiningSchemaBuilder msb = new MiningSchemaBuilder(true, this.modelContext);
             MiningSchema ms = msb.build(treeModel.getFunctionName());
             treeModel.getContent().add(ms);
             this.context.createFieldUniverse(); // update
      
               OutputBuilder ob = new OutputBuilder();
               treeModel.getContent().add(ob.build(this.modelContext));
                
             // Local Transformations
              TransformationDictionaryBuilder tdb = new TransformationDictionaryBuilder(this.context);
              treeModel.getContent().add(tdb.buildLocal());
              this.context.createFieldUniverse(); // update
              
              NodeBuilder nb = new NodeBuilder(this.modelContext);              
              treeModel.getContent().add(nb.build(null, generator.intValue(1000,10000)).get(0));
            }     
        }
        
        
    

