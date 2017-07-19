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

public class TargetBuilder {
  

    
public Targets build(ModelContext modelContext)
{
    Targets targets = new Targets();
    Target target = new Target();
    target.setField(modelContext.targetFieldDescriptor.fieldName);
    target.setOptype(modelContext.targetFieldDescriptor.optype);
    targets.getTarget().add((target));  // TODO investigate multiple targets
    
    FieldDescriptor fd = modelContext.targetFieldDescriptor;
    switch (fd.optype)
    {
        case CONTINUOUS:
            if (modelContext.generator.doubleValue()<0.5)
            {
                target.setMin(modelContext.generator.doubleValue(-10,10));
                target.setMax(modelContext.generator.doubleValue(-10,10) + target.getMin());
            }
            
            if (modelContext.generator.doubleValue()<0.5)
            {
                   target.setRescaleConstant(modelContext.generator.doubleValue(-10,10));
                   target.setRescaleFactor(modelContext.generator.doubleValue(-10,10));
            }
        
            if (fd.datatype==DATATYPE.INTEGER)
            {
                target.setCastInteger(modelContext.generator.pickOne(General.castIntegerOptions));
            }
            break;
            
        default:
            for (String category : modelContext.categories)
            {
                TargetValue value = new TargetValue();
                value.setValue(category);
                target.getTargetValue().add(value);
            }
            
    }

    return targets;
}

}