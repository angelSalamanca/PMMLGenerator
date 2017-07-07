/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import pmmlgenerator.*;
import pmmlgenerator.predicates.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;    


/**
 *
 * @author Angel Salamanca
 */
public class NodeBuilder {
    
    private ModelContext modelContext;
    
    public NodeBuilder(ModelContext thismc)
    {
        this.modelContext = thismc;
    }
    
    public Node build(Boolean isRoot) throws Exception
    {
        Node node = new Node();
        node.setId(this.modelContext.generator.stringValue(3));
        
        // Predicate 
        
        if (isRoot)
        {
            TruePredicateBuilder tpb = new TruePredicateBuilder();
            True tp = (True)tpb.build(this.modelContext);
            node.getContent().add(tp);            
        }
        else
        {
            switch(this.modelContext.generator.intValue(1, 3))
            {
                case 1:
                case 2:
                case 3:
                    SimplePredicateBuilder spb = new SimplePredicateBuilder();
                    SimplePredicate sp = (SimplePredicate)spb.build(this.modelContext);
                    node.getContent().add(sp);
                    
                    SimplePredicate sp2 = (SimplePredicate)spb.complementaryPredicate();                    
                    node.getContent().add(sp2);
                    break;
                default:
                    throw new Exception();
                    
            }
        }
        
        // and Node
        if (modelContext.generator.doubleValue()<0.8)
        {
            node.getContent().add(build(false));
        }    
        
        return node;
               
    }
}

