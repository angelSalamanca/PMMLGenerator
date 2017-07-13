/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*; 
import pmmlgenerator.ModelContext;

/**
 *
 * @author Angel Salamanca
 */
public class Scope {
    
    private Scope parent;
    List<Scope> children;
    private String name;
    Object PMMLScope;
    String scopeClass;
    NameGenerator generator;
    Context context;
    ModelContext modelContext;
    ContentUtil cu;

    public Scope(String scopeName, Object PMMLObject, String thisClass, Context thisContext)
    {
        children = new ArrayList<Scope>();
        name = scopeName;
        PMMLScope = PMMLObject;
        scopeClass = thisClass;
        context = thisContext;
        generator = new NameGenerator();       
        cu = new ContentUtil();
    }
    
    public Scope getParent()
    {
        return this.parent;
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
    
    public String getName()
    {
        return this.name;
    }
    
    public Boolean isSecondOrMore()
    {
      if (this.isRoot()) { return false;}
      if (this.parent.isRoot()) { return false;}
      return true;
    }
    
    public List<DerivedField> readLocalDerivedFields() throws Exception
    {
        LocalTransformations lt;
      
        switch (this.PMMLScope.getClass().getSimpleName())
        {
            case "GeneralRegressionModel":
                GeneralRegressionModel grm = (GeneralRegressionModel)PMMLScope;
                lt = (LocalTransformations)cu.getFromContent(grm.getContent(),"LocalTransformations");
                break;
               
            case "TreeModel":
                TreeModel treemodel = (TreeModel)PMMLScope;
                lt = (LocalTransformations)cu.getFromContent(treemodel.getContent(),"LocalTransformations");
                break;
                
             case "RegressionModel":
                RegressionModel rm = (RegressionModel)PMMLScope;
                lt = (LocalTransformations)cu.getFromContent(rm.getContent(),"LocalTransformations");
                break;    
            
            default:
               return null;
        }

         if (lt!=null)
                {
                  return lt.getDerivedField();
                }
                 else
                {
                    return null;
                }
    }    
    
    public List<MiningField> readMiningFields() throws Exception
    {
        return getMiningSchema().getMiningField();
    }
    
    public MiningSchema getMiningSchema()
    {
        // refactor with abstract class Model
         switch (this.PMMLScope.getClass().getSimpleName())
         {
             case "GeneralRegressionModel":
                GeneralRegressionModel grm = (GeneralRegressionModel)PMMLScope;
                Object ms =  this.cu.getFromContent(grm.getContent(), "MiningSchema");      
                if (ms == null) { 
                    return null;}
                return (MiningSchema)ms;   
            
                 case "TreeModel":
                TreeModel treeModel = (TreeModel)PMMLScope;
                ms = this.cu.getFromContent(treeModel.getContent(), "MiningSchema");   
                if (ms == null) { 
                    return null;}
                return (MiningSchema)ms;   
            
             
             default:
               return null;
         }
    }
    
    public LocalTransformations getLocalTransformations()
    {
        LocalTransformations lt;
         // refactor with abstract class Model
         switch (this.PMMLScope.getClass().getSimpleName())
         {
             case "GeneralRegressionModel":
                GeneralRegressionModel grm = (GeneralRegressionModel)PMMLScope;
                lt = (LocalTransformations)cu.getFromContent(grm.getContent(),"LocalTransformations");
                break;
             case "TreeModel":
                TreeModel treemodel = (TreeModel)PMMLScope;
                lt = (LocalTransformations)cu.getFromContent(treemodel.getContent(),"LocalTransformations");
                break;    
             default:
               return null;
         }
                return lt;
    }
    
    public Object getPMMLScope()
    {
        return this.PMMLScope;
    }
    
    public Integer getLevel()
    {
        Integer level = 0;
        Scope slidingScope = this;
        while(!slidingScope.isRoot())
        {
            level +=1;
            slidingScope = slidingScope.getParent();
        }                
        return level;
    }
    
    public PMML getRootContainer()
    {
        return (PMML)this.context.getRootScope().PMMLScope;
    }

    public void setContext(Context thisContext)
    {
        this.context = thisContext;
    }
    
      public void setModelContext(ModelContext thisContext)
    {
        this.modelContext = thisContext;
    }

 public Boolean isDefineFunction()
       {
           return this.scopeClass.equals("DefineFunction");
       }

}
