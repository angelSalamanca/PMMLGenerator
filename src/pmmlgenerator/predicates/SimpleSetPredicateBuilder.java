/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.predicates;

import java.util.*;
import pmmlgenerator.*;
import pmmlgenerator.PMML42.*;    
import pmmlgenerator.util.*;
/**
 *
 * @author Angel Salamanca
 */
public class SimpleSetPredicateBuilder extends PredicateBuilder{
    
     public Object build(ModelContext modelContext) throws Exception
     {
         SimpleSetPredicate predicate = new SimpleSetPredicate();
       
          List<FieldDescriptor> fds = modelContext.context.getFieldDescriptorsForModel(); // all kind of fields: MS, TD and LT
          modelContext.context.keepContinuousFDS(fds);
          FieldDescriptor fd = fds.get(modelContext.generator.intValue(0, fds.size()-1));
          FieldHelper fh = new FieldHelper(fd.fieldName, fd.modelContext);

          predicate.setArray(modelContext.generator.getArray(fd));
          predicate.setField(fd.fieldName);
          predicate.setBooleanOperator(modelContext.generator.pickOne(General.SSPBoolean));
          
          
         return predicate;
     }
    
}
