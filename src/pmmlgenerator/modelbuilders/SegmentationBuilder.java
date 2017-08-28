/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.modelbuilders;

import pmmlgenerator.ModelContext;
import pmmlgenerator.util.Context;
import pmmlgenerator.util.NameGenerator;

import pmmlgenerator.PMML42.*;    
import pmmlgenerator.util.General;

/**
 *
 * @author Angel Salamanca
 */
public class SegmentationBuilder {
    
    protected Context context;
    protected ModelContext modelContext;
    protected NameGenerator generator;
    private String[] available;
    private Integer numSegments;
    
    public SegmentationBuilder(ModelContext thismc)
    {
        this.modelContext = thismc;
        this.context = this.modelContext.context;
        this.generator = this.modelContext.generator;
    }
    
    public Segmentation build() throws Exception
    {
        
        Segmentation segmentation = new Segmentation();
        MININGFUNCTION miningFunction = this.modelContext.miningModel.getFunctionName();
         
        switch (miningFunction)
        {
            case REGRESSION:
                 
                break;
            case CLASSIFICATION:
                
                break;
            default:
                throw new Exception("Unexpected Mining Function");
                
        }
        
        available = General.attributeConstraintUniverse.getAvailableValues("MiningModel", "multipleModelMethod", "functionName", miningFunction.toString(), General.multipleModelMethods);        
        segmentation.setMultipleModelMethod(MULTIPLEMODELMETHOD.valueOf(this.generator.pickOne(available)));
        if (segmentation.getMultipleModelMethod().equals(MULTIPLEMODELMETHOD.MODEL_CHAIN))
        {
            this.numSegments = this.generator.intValue(2, 5);
        }
        else
        {
            // Temporary
            this.numSegments = this.generator.intValue(4, 10);
            // Temporary
        }
                
        for(int i=0; i<this.numSegments; i++)
        {
            SegmentBuilder sb = new SegmentBuilder();
            Boolean needsWeight = General.methodsWithWeight.contains(segmentation.getMultipleModelMethod().toString());
            Segment newSegment = sb.build(this.modelContext, needsWeight);
            segmentation.getSegment().add(newSegment);
            General.witness("  Segment " + String.valueOf(i) + " built class " + sb.getSegmentType());
        }
        
        return segmentation;
    }
    
}
