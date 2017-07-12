/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;
/**
 *
 * @author Angel Salamanca
 */
public class AttributeConstraintUniverse {

    private Map<String, AttributeConstraint> constraints;
    
    public AttributeConstraintUniverse()
    {
        this.constraints = new HashMap<String, AttributeConstraint>();        
   }
    
    public void addConstraint(AttributeConstraint ac)
    {
        constraints.put(ac.getNodeName() + "." + ac.getTargetAttribute(), ac);
    }
    
    public String[] getAvailableValues(String node, String targetAtt, String constAtt, String constValue, String[] fullList)
    {
     ArrayList<String> available = new ArrayList<String>(Arrays.asList(fullList));
     AttributeConstraint ac = constraints.get(node + "." + targetAtt);
     if (ac!=null) // constraint found
     {
         if (node.equals(ac.getNodeName()) & constAtt.equals(ac.getConstrainter()))
         {
         for (int i=0; i<ac.forbidden.size(); i++)
         {
             if (constValue.equals(ac.forbidders.get(i)))
             {
                 available.remove(ac.forbidden.get(i));
             }
         }
         }        
     }
         
     String[] availableArr = new String[available.size()];
     return  available.toArray(availableArr);

    }
}
