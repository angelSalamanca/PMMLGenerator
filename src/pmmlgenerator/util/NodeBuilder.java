/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;
import pmmlgenerator.*;
import pmmlgenerator.predicates.*;
import pmmlgenerator.PMML42.*;    


/**
 *
 * @author Angel Salamanca
 */
public class NodeBuilder {
    
    private ModelContext modelContext;
    private ContentUtil contentUtil;
    
    public NodeBuilder(ModelContext thismc)
    {
        this.modelContext = thismc;
        this.contentUtil = new ContentUtil();
    }
    
    public List<Node> build(Node parent, Integer numObservations) throws Exception 
    {
        
        List<Node> nl = new ArrayList<Node>();
        Node node = new Node();
        node.setId(this.modelContext.generator.stringValue(3));
        String winner1 = null;
        String winner2 = null;
        Double maxCount = -1.0;
        Boolean isRoot = parent == null;
        
        if (this.modelContext.isRegression())
        {
            node.setScore(String.valueOf(this.modelContext.generator.doubleValue(-5,5)));
        }
        else // classification
        {
           List<ScoreDistribution> sds = this.buildScoreDistribution(numObservations);
           node.setScore(this.getWinnerCat(sds));
           node.setScoreDistributions(sds);           
           node.setRecordCount(numObservations.doubleValue());
        }
        nl.add(node);
        
        Node node2 = null;
        // Predicate 
        try
        {
        if (isRoot)
        {
            TruePredicateBuilder tpb = new TruePredicateBuilder();
            True tp = (True)tpb.build(this.modelContext);
            node.setPredicate(tp);            
        }
        else
        {
            node2 = new Node();
                    node2.setId(this.modelContext.generator.stringValue(3));
                     if (this.modelContext.isRegression())
                    {
                        node2.setScore(String.valueOf(this.modelContext.generator.doubleValue(-5,5)));
                    }
                     else
                     {
                        List<ScoreDistribution> sds = this.buildScoreDistribution(numObservations);
                        node2.setScore(getWinnerCat(sds));
                        node2.setScoreDistributions(sds);                        
                     }
                    nl.add(node2);
                    
            switch(this.modelContext.generator.intValue(1, 3))
            {
                case 1: 
                    // Compound predicate
                    CompoundPredicateBuilder cpb = new CompoundPredicateBuilder(0);
                    CompoundPredicate cp = (CompoundPredicate)cpb.build(this.modelContext);
                    node.setPredicate(cp);
                    
                     cpb = new CompoundPredicateBuilder(0);
                     cp = (CompoundPredicate)cpb.build(this.modelContext);
                     node2.setPredicate(cp);
                    
                    break;
 
                case 2:
                case 3:
                    SimplePredicateBuilder spb = new SimplePredicateBuilder();
                    SimplePredicate sp = (SimplePredicate)spb.build(this.modelContext);
                    node.setPredicate(sp);
                    
                    SimplePredicate sp2 = (SimplePredicate)spb.complementaryPredicate();                    
                    node2.setPredicate(sp2);
                    break;
                default:
                    throw new Exception();
                    
            }
        }
        double d = modelContext.generator.doubleValue();
        Integer numObsChild =  this.modelContext.generator.intValue(0, numObservations);
        // and Nodes
        if (d<0.44 || isRoot)
        {
            // grow deeper left    
            List<Node> nl2 = build(node, numObsChild);
            for (Node node3 : nl2)
            {
                node.getNodes().add(node3);
            }
        }        

        d = modelContext.generator.doubleValue();
        if (node2!=null && d<0.44)
        {
            // grow deeper right
            List<Node> nl3 = build(node2, numObservations - numObsChild);
            for (Node node3 : nl3)
            {
                node2.getNodes().add(node3);
            }
        }
         }
        catch (Exception e)
                {
                    General.witness("*** NodeBuilder.Build  "+e.getMessage());
                    throw new Exception("NodeBuilder", e);
                }
 
        if (!isRoot)
        {
            Integer dn = this.modelContext.generator.intValue(0, nl.size()-1);
            parent.setDefaultChild(nl.get(dn).getId());
        } 
        
        return nl;      
    }
    
    private List<ScoreDistribution> buildScoreDistribution(Integer numObservations) throws Exception
    {
        List<ScoreDistribution> sds = new ArrayList<ScoreDistribution>();   
        
        List<Integer> cutoffs = this.modelContext.generator.intCutoffs(numObservations, this.modelContext.numTargetCategories());
               for (Integer i =0 ; i<cutoffs.size(); i++)
               {
                   ScoreDistribution sd = new ScoreDistribution();
                   sd.setRecordCount(cutoffs.get(i));
                   sd.setValue(this.modelContext.getCategories().get(i));
                   sds.add(sd);
               }
               return sds; 
    }
    
    private String getWinnerCat(List<ScoreDistribution>sds)
    {
        String winner = null;
        Double maxCount = -1.0;
        
        for (int i=0; i<sds.size(); i++)
        {
            ScoreDistribution sd = sds.get(i);
            Double recordCount =  sd.getRecordCount();
            if (recordCount > maxCount)
            {
                maxCount = recordCount;
                winner = sd.getValue();
            }
        }
        
        
        return winner;
    }
}

