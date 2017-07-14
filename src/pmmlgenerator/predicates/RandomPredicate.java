/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.predicates;

import java.util.*;
import pmmlgenerator.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;    
import pmmlgenerator.util.*;


/**
 *
 * @author Angel Salamanca
 */
public class RandomPredicate {
    
    public Object getPredicate(ModelContext modelContext, Integer generation) throws Exception
    {
        Integer topPredicate = 3;
        if (generation>1)
        {
            topPredicate = 2;
        }
        
        switch(modelContext.generator.intValue(1, topPredicate))  // TODO SimpleSet
        {
            case 1:
                 SimpleSetPredicateBuilder sspb = new SimpleSetPredicateBuilder();
                SimpleSetPredicate ssp = (SimpleSetPredicate)sspb.build(modelContext);
                return ssp;
            
            // case 1:
            case 2:
                SimplePredicateBuilder spb = new SimplePredicateBuilder();
                SimplePredicate sp = (SimplePredicate)spb.build(modelContext);
                return sp;
                
            case 3:
            default:
                CompoundPredicateBuilder cpb = new CompoundPredicateBuilder(generation+1);
                CompoundPredicate cp = (CompoundPredicate)cpb.build(modelContext);
                return cp;
                    }   
        
    }
    
}
