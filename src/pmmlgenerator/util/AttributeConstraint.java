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
public class AttributeConstraint {
    private String nodeName;
    private  String targetAttribute;
    private  String constrainter;
    public List<String> forbidders;
    public List<String> forbidden;
    
    public AttributeConstraint(String node, String targetAtt, String constAtt)
    {
        this.nodeName = node;
        this.targetAttribute = targetAtt;
        this.constrainter = constAtt;
        this.forbidders = new ArrayList<String>();
        this.forbidden = new ArrayList<String>();
    }
    
    public String getNodeName()
    {
        return this.nodeName;
    }

    public String getTargetAttribute()
    {
        return this.targetAttribute;
    }
    
    public String getConstrainter()
    {
        return this.constrainter;
    }
    
    public void addForbidden(String forbid, String forbidder)
    {
        this.forbidden.add(forbid);
        this.forbidders.add(forbidder);
    }
            
}
