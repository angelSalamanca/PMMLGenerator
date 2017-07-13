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
public class FieldUniverse {

    public enum FieldType {DataField, DerivedField, MiningField, OutputField, AnyField, ParameterField}
    
    private Map<String, FieldDescriptor> fields;
    
    private Context context;
    
    public FieldUniverse(Context thiscontext) throws Exception
    {
        this.context = thiscontext;
        fields = new HashMap<String, FieldDescriptor>();
        
        if (this.context.getCurrentScope().isDefineFunction())
        {
            addParameterFields();
        }
        else
        {        
        addDataAndTransformationDictionary();
        
        Scope slidingScope = this.context.getCurrentScope();
        while (!slidingScope.isRoot())
        {
            addLocalFields(slidingScope);            
            slidingScope = slidingScope.getParent();
        } 
        }
    }
    
    public Integer numFields()
    {
        return this.fields.size();
    }
    
    public FieldDescriptor get(String key)
    {
        return this.fields.get(key);
    }
    
    private void addDataAndTransformationDictionary()
    {        
        PMML pmml = (PMML)this.context.getRootScope().getPMMLScope();
        String ns = this.context.getRootScope().getName() + ".";
        
        if (pmml.getDataDictionary() != null)
                {
                        for (DataField df : pmml.getDataDictionary().getDataField())
                        {
                            fields.put(ns+df.getName(), new FieldDescriptor(df.getName(), FieldType.DataField, 0, this.context.getRootScope(), df.getOptype(), df.getDataType()));       
                        }     
                }        
        
           if (pmml.getTransformationDictionary() != null)
           {
            for (DerivedField derf : pmml.getTransformationDictionary().getDerivedField())
            {
                fields.put(ns+derf.getName(), new FieldDescriptor(derf.getName(), FieldType.DerivedField, 0, this.context.getRootScope(), derf.getOptype(), derf.getDataType()));       
            }     
        }
    }
    
    private void addLocalFields(Scope localScope) throws Exception
    {
        
        Integer level = localScope.getLevel();
          String ns = localScope.getName() + ".";
       
        if (localScope.getMiningSchema()!=null)
        {
            for (MiningField mf : localScope.readMiningFields())
            {
                DATATYPE datatype = this.context.getDataTypeOfMF(mf);
               OPTYPE optype = this.context.getOpTypeOfMF(mf);
                
                fields.put(ns+mf.getName(), new FieldDescriptor(mf.getName(), FieldType.MiningField, level, localScope, optype, datatype));       
            }     
        }
           if (localScope.getLocalTransformations()!=null)
           {
        for (DerivedField derf : localScope.readLocalDerivedFields())
            {
                fields.put(ns+derf.getName(), new FieldDescriptor(derf.getName(), FieldType.DerivedField, level, localScope, derf.getOptype(), derf.getDataType()));       
            }
           }
    }
    
     public List<FieldDescriptor> getFieldDescriptors(FieldType thisType) throws Exception
   {
        List<FieldDescriptor> fds = new ArrayList<FieldDescriptor>();
        
        Iterator it = this.fields.entrySet().iterator();
        while (it.hasNext())
        {
                Map.Entry pair = (Map.Entry)it.next();
                FieldDescriptor fd = (FieldDescriptor)pair.getValue();
                if (fd.fieldType==thisType || thisType == FieldType.AnyField)    
                    {
                        fds.add((FieldDescriptor)pair.getValue());
                    }
            }
        return fds;
   }
     
     public List<FieldDescriptor> getFieldDescriptors(FieldType thisType, Scope scope) throws Exception
       {
            List<FieldDescriptor> fds = this.getFieldDescriptors(thisType);
            
            // Remove if not in container
            Iterator<FieldDescriptor> it = fds.iterator();
            while (it.hasNext())
            {
                FieldDescriptor fd  = it.next();
                if (fd.scope.getPMMLScope() != scope.PMMLScope)
                {
                    it.remove();
                }
            }            
            return fds;
       }
     
     private void addParameterFields()
     {
         DefineFunction df = (DefineFunction)this.context.getCurrentScope().PMMLScope;
         for (ParameterField pf : df.getParameterField())
         {
                fields.put(pf.getName(), new FieldDescriptor(pf.getName(), FieldType.ParameterField, 0, this.context.getCurrentScope(), null, null));       
         }
     }
    
    
}
