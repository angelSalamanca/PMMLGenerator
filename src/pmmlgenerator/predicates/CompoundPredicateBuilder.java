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
public class CompoundPredicateBuilder {

    private Integer generation;
    
    public CompoundPredicateBuilder(Integer gen)
    {
       this.generation = gen;
    }
    public Object build(ModelContext modelContext) throws Exception
      {
          CompoundPredicate cp = new CompoundPredicate();
          cp.setBooleanOperator(modelContext.generator.pickOne(General.booleanOperators));
          
          int numPredicates = modelContext.generator.intValue(2, 4);
          
          for (int i = 0; i<numPredicates; i++)
          {
              RandomPredicate rb = new RandomPredicate();
              cp.getSimplePredicateOrCompoundPredicateOrSimpleSetPredicate().add(rb.getPredicate(modelContext, this.generation));
          }
          
          return cp;
      }
    
}
