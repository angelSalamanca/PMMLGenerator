/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.predicates;

import pmmlgenerator.*;
import pmmlgenerator.PMML42.*;    
import pmmlgenerator.util.*;

/**
 *
 * @author Angel Salamanca
 */
public class TruePredicateBuilder extends PredicateBuilder
{
    
   public Object build(ModelContext modelContext) throws Exception
    {
        True tp = new True();
        return tp;
    }
}
