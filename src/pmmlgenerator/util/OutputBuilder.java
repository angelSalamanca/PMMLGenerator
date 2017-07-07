/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;    
import pmmlgenerator.ModelContext;

/**
 *
 * @author Angel Salamanca
 */
public class OutputBuilder {
    
    private NameGenerator generator;

    public OutputBuilder()
{
    this.generator = new NameGenerator();
}

    public Output build(ModelContext modelContext) throws Exception
    {
        Output output = new Output();
        OutputField of;
        MiningField targetField = modelContext.getTargetField();
        
        if (modelContext.hasPredictedValue())
        {
            of = new OutputField();
            of.setName(this.generator.getOutputFieldName());
            of.setFeature(RESULTFEATURE.PREDICTED_VALUE);
            of.setOptype(targetField.getOptype());
            of.setDataType(targetField.readDataType());
            output.getOutputField().add(of);
        }
        
        if (modelContext.hasprobability())
        {
            List<String> categories = modelContext.getCategories();
            for (int i = 0; i< categories.size(); i++)
            {
            of = new OutputField();
            of.setName(this.generator.getOutputFieldName());
            of.setFeature(RESULTFEATURE.PROBABILITY);
            of.setValue(categories.get(i));
            output.getOutputField().add(of);
            }
        }
        
        System.out.println(" Output built");
        return output;
    }
}



