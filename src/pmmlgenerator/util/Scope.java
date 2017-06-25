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
public class Scope {
    
    Scope parent;
    List<Scope> children;
    String name;
    Object PMMLScope;
    String scopeClass;

    public Scope(String scopeName, Object PMMLObject, String thisClass)
    {
        children = new ArrayList<Scope>();
        name = scopeName;
        PMMLScope = PMMLObject;
        scopeClass = thisClass;
    }
    
    public void setParent(Scope thisParent)
    {
        this.parent = thisParent;
    }
    
    public void addChild(Scope child)
    {
        this.children.add(child);
        child.parent = this;        
    }
    
    public Boolean isRoot()
    {
        return parent == null;
    }
    
}
