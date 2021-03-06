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
import pmmlgenerator.ModelContext;
import pmmlgenerator.util.Context;
import pmmlgenerator.util.NameGenerator;

import pmmlgenerator.PMML42.*;    
import pmmlgenerator.util.*;
import pmmlgenerator.predicates.*;

public class SegmentBuilder {
    
    private Segment segment;
    private Context context;
    
    
    
    public Segment build(ModelContext modelContext, Boolean needsWeight) throws Exception
    {
        this.context = modelContext.context;
        this.segment = new Segment();
        RandomPredicate rp = new RandomPredicate();
        Object predicate = rp.getPredicate(modelContext);
        if (predicate instanceof True)
        {
            segment.setTrue((True)predicate);
        }
        if (predicate instanceof SimplePredicate)
        {
            segment.setSimplePredicate((SimplePredicate)predicate);       
        }
        
        String modelFamily = this.context.generator.pickOne(General.segmentModelTypes);
        
        ModelContext segmentContext = new ModelContext(modelContext.context, modelFamily);
        segmentContext.build(modelContext.isRegression());
        // Only 1 is not null
        segment.setGeneralRegressionModel(segmentContext.grm);
        segment.setMiningModel(segmentContext.miningModel);
        segment.setTreeModel(segmentContext.treeModel);
       
        if (needsWeight)
        {
            segment.setWeight(modelContext.generator.doubleValue());
        }
        
        return segment;
    }
    
    public String getSegmentType()
    {
        if (this.segment.getGeneralRegressionModel() != null)
        {
            return segment.getGeneralRegressionModel().getClass().getSimpleName();
        }
        
        if (this.segment.getTreeModel() != null)
        {
            return segment.getTreeModel().getClass().getSimpleName();
        }
        
        if (this.segment.getMiningModel()!= null)
        {
            return segment.getMiningModel().getClass().getSimpleName();
        }
        
        return "Unknown model";
        
    }
}
