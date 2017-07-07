/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.predicates;

import pmmlgenerator.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;    
import pmmlgenerator.util.*;

/**
 *
 * @author Angel Salamanca
 */
public abstract class PredicateBuilder {

    abstract Object build(ModelContext modelContext) throws Exception;
    
            
}
