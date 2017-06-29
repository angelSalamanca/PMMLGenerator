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
   private NameGenerator generator;
   
   public Context(Scope scope)
   {
       this.rootScope = scope;
       setCurrentScope(scope);
       this.generator = new NameGenerator();
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
   
   public Object[] randomFieldName(DATATYPE datatype, Boolean dataFieldOnly) throws Exception
   {
       Map<String, Object> fieldNames = this.getFieldNames();
       
       // retain matching datatype only
       Iterator<Map.Entry<String,Object>> iter = fieldNames.entrySet().iterator();      
       while (iter.hasNext()) {
             Map.Entry<String,Object> entry = iter.next();
             FieldHelper fieldhelper = new FieldHelper(entry.getKey(), entry.getValue());
            if (!fieldhelper.getDataType().equals(datatype)) {
                    iter.remove();
                }
        }
       
       if (dataFieldOnly)
       {
           // retain data fields only
           Iterator<Map.Entry<String,Object>> iter2 = fieldNames.entrySet().iterator();      
             while (iter2.hasNext()) {
             Map.Entry<String,Object> entry = iter2.next();
             FieldHelper fieldhelper = new FieldHelper(entry.getKey(), entry.getValue());
             if (!fieldhelper.retrieveClass().equals("DataField")) {
                    iter2.remove();
                }
            else
            {
                if (fieldhelper.getValues().size() < 2)
                {
                    iter2.remove();
                }
                
             }
         }
       }
       Integer numFields = fieldNames.size();
       Integer selected = this.generator.intValue(0, numFields-1);
       
       Object[] names = fieldNames.keySet().toArray();
       String fieldName = (String)names[selected];
       Object container = fieldNames.get(fieldName);
      
               
       return new Object[]{fieldName, container};      
       
   }

    
}
