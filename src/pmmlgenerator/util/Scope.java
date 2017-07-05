/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*; 

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
    NameGenerator generator;

    public Scope(String scopeName, Object PMMLObject, String thisClass)
    {
        children = new ArrayList<Scope>();
        name = scopeName;
        PMMLScope = PMMLObject;
        scopeClass = thisClass;
        generator = new NameGenerator();
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
    
    public Boolean isSecondOrMore()
    {
      if (this.isRoot()) { return false;}
      if (this.parent.isRoot()) { return false;}
      return true;
    }
    
    public List<DerivedField> readLocalDerivedFields() throws Exception
    {
        switch (this.PMMLScope.getClass().getSimpleName())
        {
            case "GeneralRegressionModel":
                GeneralRegressionModel grm = (GeneralRegressionModel)PMMLScope;
                LocalTransformations lt = (LocalTransformations)grm.getFromContent("LocalTransformations");
                if (lt!=null)
                {
                  return lt.getDerivedField();
                }
            else
                {
                    return null;
                }
                
            default:
               return null;
        }
    }
    
    
    public List<MiningField> readMiningFields() throws Exception
    {
        switch (this.PMMLScope.getClass().getSimpleName())
        {
            case "GeneralRegressionModel":
                GeneralRegressionModel grm = (GeneralRegressionModel)PMMLScope;
                MiningSchema ms = (MiningSchema)grm.getFromContent("MiningSchema");
                return ms.getMiningField();               
                
            default:
               return new ArrayList<MiningField>();
        }
    }
    
}
