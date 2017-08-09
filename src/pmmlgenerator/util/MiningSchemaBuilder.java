/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;
import pmmlgenerator.*;
import pmmlgenerator.PMML42.*;

/**
 *
 * @author Angel Salamanca
 */
public class MiningSchemaBuilder {
    
    private ModelContext modelContext;
    private Boolean isSupervised;
    private NameGenerator generator;
    private Context context;
    private FieldHelper fieldHelper;
    private FieldDescriptor fieldDescriptor, targetDescriptor;
    private  List<FieldDescriptor> fieldCatalog ;
    
    public Integer numTargetCategories;
    public  List<String>categories;
    
    public MiningSchemaBuilder(Boolean issupervised, ModelContext thisMContext)
    {
        this.modelContext = thisMContext;
        this.isSupervised = issupervised;
        this.context = this.modelContext.context;
        this.generator = this.modelContext.generator;
    }
    
    public MiningSchema build(MININGFUNCTION modelFunction) throws Exception
    {
            MiningSchema ms = new MiningSchema();
            List<MiningField> miningFields = ms.getMiningField();            
            
            // Generation of fields based on context
            this.fieldCatalog = this.modelContext.context.getFieldDescriptorsForMiningSchema();
            
            miningFields.add(setTarget(modelFunction));
            
            for (FieldDescriptor fd : fieldCatalog)
           {
               if (fd.fieldName.equals(this.targetDescriptor.fieldName))  // skip target
               {
                   continue;
               }
                // random pick                
                double d = this.generator.doubleValue();
                if (d<0.75 || this.context.getCurrentContext().isDerivedAffectedAnywhere(fd.fieldName) )  // to force a target 
                {
                    MiningField mField = new MiningField();
                    String fieldName = fd.fieldName;
                    mField.setName(fieldName);
                    this.fieldDescriptor =this.modelContext.getFDFromMF(mField);
                               
                  //  this.context.setDataTypeOfMF(mField, this.fieldHelper.getDataType());
                    // UsageType
                   
                        if (this.generator.doubleValue()<0.5)
                        {
                             mField.setUsageType(FIELDUSAGETYPE.ACTIVE);
                        }                   
                    
                   if(this.generator.doubleValue()<0.5)
                   {
                              mField.setOptype(this.fieldDescriptor.getOpType());
                   }       
                  
                   // missing value replacement, only sometimes
                   if (this.generator.doubleValue()<0.5)
                   {
                       mField.setMissingValueReplacement(this.fieldDescriptor.randomValue());
                   }                   
                   
                    miningFields.add(mField);
                }  
          }           
            General.witness("  Mining Schema built");
            return ms;
    }
    
    private MiningField setTarget(MININGFUNCTION modelFunction) throws Exception
    {
        
          Boolean firstField = isSupervised;
          MiningField mField = new MiningField();
           
            // Two options. Drag along from parent model or pick one randomly
            
            if (this.modelContext.context.getCurrentContext().isSecondOrMore()) // ??
            {
                // From parent
                ModelContext parentContext = this.modelContext.getParent();
                this.targetDescriptor =  parentContext.targetFieldDescriptor;                
            }
            else  // random compatible field
            {
                   for (FieldDescriptor fd : fieldCatalog)
                   {
                     if (fd.isGRMTargetCompatible(modelFunction))
                        {                           
                            this.targetDescriptor = fd;                            
                            break;
                        }                        
                    }
                
            }

            mField.setUsageType(FIELDUSAGETYPE.TARGET);        
            mField.setName(this.targetDescriptor.fieldName);
            
            modelContext.setTargetField(mField);
            modelContext.setTargetFieldDescriptor(this.targetDescriptor);
            List<Value> values  = this.targetDescriptor.getValues();
            this.numTargetCategories = values.size();
            this.categories = new ArrayList<String>();
            for (int j=0; j< numTargetCategories; j++)
            {
                this.categories.add(values.get(j).getValue());
            }
            this.modelContext.setCategories(categories);
                          
            return mField;
          
    
    }
}
