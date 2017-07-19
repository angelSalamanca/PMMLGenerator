/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import pmmlgenerator.*;
import java.util.*;
import pmmlgenerator.PMML42.*;    

/**
 *
 * @author Angel Salamanca
 */
public class FieldUniverse {

    public enum FieldType {DataField, DerivedField, MiningField, OutputField, AnyField, ParameterField}
    
    private Map<String, FieldDescriptor> fields;
    
    private Context context;
    private PMML pmml;
    
    public FieldUniverse(Context thiscontext) throws Exception
    {
        this.context = thiscontext;
        fields = new HashMap<String, FieldDescriptor>();
        this.pmml = PMMLGenerator.pmml;
        
        try {
            if (this.context.getCurrentContext().isDefineFunction())
            {
                addParameterFields();
            }
            else
            {        
                addDataAndTransformationDictionary();
        
                 ModelContext slidingContext = this.context.getCurrentContext();
                while (!slidingContext.isRoot())
                {
                    addLocalFields(slidingContext);            
                    slidingContext = slidingContext.getParent();
                } 
            }
        }
        catch (Exception e)
        {
            General.witness("FieldUniverse "+ e.getMessage());
            throw new Exception("FieldUniverse",e);
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
        
        String ns = this.context.getRootContext().getName() + ".";
        
        if (pmml.getDataDictionary() != null)
                {
                        for (DataField df : pmml.getDataDictionary().getDataField())
                        {                            
                            fields.put(ns+df.getName(), new FieldDescriptor(df.getName(), FieldType.DataField, 0, this.context.getRootContext(), df.getOptype(), df.getDataType(), df));       
                        }     
                }        
        
           if (pmml.getTransformationDictionary() != null)
           {
            for (DerivedField derf : pmml.getTransformationDictionary().getDerivedField())
            {
                fields.put(ns+derf.getName(), new FieldDescriptor(derf.getName(), FieldType.DerivedField, 0, this.context.getRootContext(), derf.getOptype(), derf.getDataType(), derf));       
            }     
        }
    }
    
    private void addLocalFields(ModelContext localContext) throws Exception
    {
        
        Integer level = localContext.getLevel();
        String ns = localContext.getName() + ".";
       
        if (localContext.getMiningSchema()!=null)
        {
            for (MiningField mf : localContext.readMiningFields())
            {
                DATATYPE datatype = this.context.getDataTypeOfMF(mf);
               OPTYPE optype = this.context.getOpTypeOfMF(mf);
                
                fields.put(ns+mf.getName(), new FieldDescriptor(mf.getName(), FieldType.MiningField, level, localContext, optype, datatype, mf));       
            }     
        }
           if (localContext.getLocalTransformations()!=null)
           {
        for (DerivedField derf : localContext.readLocalDerivedFields())
            {
                fields.put(ns+derf.getName(), new FieldDescriptor(derf.getName(), FieldType.DerivedField, level, localContext, derf.getOptype(), derf.getDataType(), derf));       
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
     
     public List<FieldDescriptor> getFieldDescriptors(FieldType thisType, ModelContext modelContext) throws Exception
       {
            List<FieldDescriptor> fds = this.getFieldDescriptors(thisType);
            
            // Remove if not in container
            Iterator<FieldDescriptor> it = fds.iterator();
            while (it.hasNext())
            {
                FieldDescriptor fd  = it.next();
                if (fd.modelContext != modelContext)
                {
                    it.remove();
                }
            }            
            return fds;
       }
     
     private void addParameterFields() throws Exception
     {
         DefineFunction df = (DefineFunction)this.context.getCurrentContext().getModel();
         for (ParameterField pf : df.getParameterField())
         {
                fields.put(pf.getName(), new FieldDescriptor(pf.getName(), FieldType.ParameterField, 0, this.context.getCurrentContext(), null, null, pf));       
         }
     }
    
    
}
