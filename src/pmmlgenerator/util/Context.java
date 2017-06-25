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
public class Context {
    
   private Scope rootScope;
   private Scope currentScope;
   
   public Context(Scope scope)
   {
       this.rootScope = scope;
       setCurrentScope(scope);
   }
   
   public Map<String, Object> getFieldNames()
   {
       Map<String, Object>names = new HashMap<String, Object>();
       
       Scope walkerScope = currentScope;
       
       while (walkerScope != null)
       {
           switch(walkerScope.scopeClass)
           {
               case "PMML":
                    // Start with rootScope = PMML
                    PMML pmml = (PMML)rootScope.PMMLScope;
                    for (DataField df : pmml.getDataDictionary().getDataField())
                    {
                        names.put(df.getName(), pmml);         
                    }
      
                    if (pmml.getTransformationDictionary() != null)
                    {
                            for (DerivedField df : pmml.getTransformationDictionary().getDerivedField())
                            {
                                names.put(df.getName(), pmml);
                            }
                    }
           
           break;
                   
               default:
                                   
           } // switch
            walkerScope = walkerScope.parent;  
       } //while
       
                    
           
       return names;
   }
   
   public Scope getCurrentScope()
   {
       return this.currentScope;       
   }

   public void setCurrentScope(Scope cScope)
   {
       if (this.currentScope != null) {
           this.currentScope.addChild(cScope);
       }
       
       this.currentScope = cScope;       
   }

    
}
