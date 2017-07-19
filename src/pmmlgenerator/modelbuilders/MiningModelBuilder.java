/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.modelbuilders;

/**
 *
 * @author Angel Salamanca
 */

import java.util.*;
import pmmlgenerator.*;
import pmmlgenerator.util.*;
import pmmlgenerator.PMML42.*;    
import pmmlgenerator.TransformationDictionaryBuilder;

public class MiningModelBuilder extends BaseModelBuilder {

    
    
    public MiningModelBuilder(ModelContext thismc)
    {
        super(thismc);
        this.modelContext.miningModel = new MiningModel();
    }
    
    public void build(Boolean isRegression) throws Exception
    {
        MiningModel miningModel = this.modelContext.miningModel;
        if (generator.booleanValue()) {miningModel.setModelName(this.modelContext.getName()); }
        if (generator.booleanValue()) {miningModel.setAlgorithmName(this.generator.getSentence(4)); }        
          
         this.context.setCurrentContext(modelContext);
         
          miningModel.setFunctionName(MININGFUNCTION.valueOf(generator.pickOne(General.GRMFunctions)));
           if (isRegression != null && isRegression) { 
               miningModel.setFunctionName(MININGFUNCTION.REGRESSION);
           }
               General.witness("  Function Name: " + miningModel.getFunctionName().toString());
         
           // MiningSchema
           MiningSchemaBuilder msb = new MiningSchemaBuilder(true, this.modelContext);
           MiningSchema ms = msb.build(miningModel.getFunctionName());
           miningModel.getContent().add(ms);
           this.context.createFieldUniverse(); // update
          
           if (this.generator.doubleValue()<0.7) {           
                OutputBuilder ob = new OutputBuilder();
               miningModel.getContent().add(ob.build(this.modelContext));
           }
            
           // Targets
             if (this.generator.doubleValue()<0.7) {
                 TargetBuilder tb = new TargetBuilder();
                 miningModel.getContent().add(tb.build(this.modelContext));                 
             }
           
         // Local Transformations
           if (this.generator.doubleValue()<0.7) {
              TransformationDictionaryBuilder tdb = new TransformationDictionaryBuilder(this.context);
              miningModel.getContent().add(tdb.buildLocal());
              this.context.createFieldUniverse(); // update
           }
           
          SegmentationBuilder sb = new SegmentationBuilder(this.modelContext);
          miningModel.getContent().add(sb.build());
}
           
}

