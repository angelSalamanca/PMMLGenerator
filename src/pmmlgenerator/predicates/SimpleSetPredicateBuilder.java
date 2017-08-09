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
       
          DATATYPE fddatatype = modelContext.generator.pickDataType();
          
          FieldDescriptor fd = modelContext.context.randomField(fddatatype, true, false, false, false); // 
          FieldHelper fh = new FieldHelper(fd.fieldName, fd.modelContext);

          predicate.setArray(modelContext.generator.getArray(fd));
          predicate.setField(fd.fieldName);
          predicate.setBooleanOperator(modelContext.generator.pickOne(General.SSPBoolean));
          
          
         return predicate;
     }
    
}
