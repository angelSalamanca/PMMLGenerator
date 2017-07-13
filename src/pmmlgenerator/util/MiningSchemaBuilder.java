/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;
import pmmlgenerator.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;

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
            Boolean firstField = isSupervised;
            
            // Generation of fields based on context
            List<FieldDescriptor> fieldCatalog = this.modelContext.context.getFieldDescriptorsForMiningSchema();
            for (FieldDescriptor fd : fieldCatalog)
           {
                // random pick                
                double d = this.generator.doubleValue();
                if (d<0.75 || this.context.isTDAffected(fd.fieldName))
                {
                    MiningField mField = new MiningField();
                    String fieldName = fd.fieldName;
                    mField.setName(fieldName);
                    this.fieldHelper  = new FieldHelper(fieldName, fd.scope);  // value is containerj
                    this.context.setDataTypeOfMF(mField, this.fieldHelper.getDataType());
                    // UsageType
                    if (firstField)
                    {                        
                        if (this.fieldHelper.isGRMTargetCompatible(modelFunction))
                        {
                            firstField = false;
                            mField.setUsageType(FIELDUSAGETYPE.TARGET);                          
                            modelContext.setTargetField(mField);
                            List<Value> values  = this.fieldHelper.getValues();
                            Integer numTargetCategories = values.size();
                            List<String>categories = new ArrayList<String>();
                            for (int j=0; j< numTargetCategories; j++)
                            {
                                categories.add(values.get(j).getValue());
                            }
                            this.modelContext.setCategories(categories);
                        }                        
                    }
                    else
                    {
                        if (this.generator.doubleValue()<0.5)
                        {
                             mField.setUsageType(FIELDUSAGETYPE.ACTIVE);
                        }
                    }
                    
                   if(mField.getUsageType() == FIELDUSAGETYPE.TARGET | this.fieldHelper.isGRMActiveCompatible(modelFunction))
                   {
                              mField.setOptype(this.fieldHelper.getOptype());
                   }       
                  
                   // missing value replacement, only sometimes
                   if (this.generator.doubleValue()<0.5)
                   {
                       mField.setMissingValueReplacement(this.fieldHelper.randomValue());
                   }                   
                   
                    miningFields.add(mField);
                }  
          }           
            System.out.println(" Mining Schema built");
            return ms;
    }
    
}
