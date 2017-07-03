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
   
   public Map<String, Object> getFieldNamesForMiningSchema() throws Exception
   {
       Map<String, Object>names = new HashMap<String, Object>();      
       
       PMML pmml = (PMML)rootScope.PMMLScope;       
       
            // First Data Dictionary
            for (DataField df : pmml.getDataDictionary().getDataField())
            {
                names.put(df.getName(), pmml);         
            }                    
            // Then local Transformation of parent model
            if (currentScope.isSecondOrMore())
            {
                for (DerivedField derF : currentScope.parent.readLocalDerivedFields())
                      names.put(derF.getName(), this.currentScope);    
            }       
       return names;
   }
   
   public Map<String, Object> getFieldNamesForModel() throws Exception
   {
        Map<String, Object>names = this.getFieldNamesForMiningSchema();
        
         PMML pmml = (PMML)rootScope.PMMLScope;       
       
         // First Transformation Dictionary
         TransformationDictionary td = pmml.getTransformationDictionary();
         if (td != null)
         {
            for (DerivedField derF : td.getDerivedField())
            {
                names.put(derF.getName(), pmml);         
            } 
         }                        
         
        // Then local Transformation of own model
          List<DerivedField> ltfields = currentScope.readLocalDerivedFields();
          if (ltfields != null)
          {
                for (DerivedField derF : ltfields)
                {
                      names.put(derF.getName(), this.currentScope);    
                }       
          }
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
   
   public Object[] randomFieldName(DATATYPE datatype, Boolean forModel) throws Exception
   {
       Map<String, Object> fieldNames;
       if (forModel)
       {
           fieldNames = this.getFieldNamesForModel();
       }
           else
       {
           fieldNames = this.getFieldNamesForMiningSchema();
       }
       
       // retain matching datatype only. Needed?
       Iterator<Map.Entry<String,Object>> iter = fieldNames.entrySet().iterator();      
       while (iter.hasNext()) {
             Map.Entry<String,Object> entry = iter.next();
             FieldHelper fieldhelper = new FieldHelper(entry.getKey(), entry.getValue());
            if (!fieldhelper.getDataType().equals(datatype)) {
                    iter.remove();
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
