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
public class FieldDescriptor {
    public String fieldName;
    public Object field;
    public FieldUniverse.FieldType fieldType;
    public Integer fieldLevel;    
    public ModelContext modelContext;
    public OPTYPE optype;
    public DATATYPE datatype;
    private NameGenerator generator;
    
    
    public FieldDescriptor(String name, FieldUniverse.FieldType ftype, Integer level, ModelContext fieldScope, OPTYPE fieldoptype, DATATYPE fielddatatype, Object thefield)
    {
        this.fieldName = name;
        this.field = thefield;
        this.fieldType = ftype;
        this.fieldLevel = level;
        this.modelContext = fieldScope;
        this.optype = fieldoptype;
        this.datatype = fielddatatype;
        this.generator = this.modelContext.generator;
    }
    
    public OPTYPE getOpType()
    {
        return this.optype;        
    }
    
      public Boolean isGRMTargetCompatible(MININGFUNCTION modelFunction) throws Exception
    {
        // It can not be affected in TD
        if (this.modelContext.isDerivedAffectedAnywhere(this.fieldName))
                {
                    return false;
                }
        
        
        switch(modelFunction) 
        {
            case CLASSIFICATION:
                    Integer valueSize = this.getValues().size();
                    return optype == OPTYPE.CATEGORICAL && this.fieldType.equals(FieldUniverse.FieldType.DataField) && valueSize>1;
            case REGRESSION:    
                    return optype == OPTYPE.CONTINUOUS && (datatype == DATATYPE.DOUBLE || datatype == DATATYPE.FLOAT);
            default:
                throw new Exception("Unexpected model function");
                
         }
    }
      
      public Boolean isGRMActiveCompatible(MININGFUNCTION modelFunction)   throws Exception
    {
        return this.optype == OPTYPE.CONTINUOUS;
        
    }
        
        public List<Value> getValues() throws Exception
        {
            FieldHelper fh = new FieldHelper(this.fieldName, this.modelContext);
            return fh.getValues();
        }
        
         public String randomValue() throws Exception
    {
        if (this.field instanceof DataField)
        {
            return this.generator.getValue((DataField)this.field);
        }
        
         switch(this.datatype)
        {
            case STRING:
                return generator.stringValue(3);
            case INTEGER:
                int n = generator.intValue(-1000,1000);
                return String.valueOf(n);
            case FLOAT:
                return String.valueOf((float)generator.doubleValue());
            case DOUBLE:    
                return String.valueOf(generator.doubleValue());
            default:
                throw new Exception("Unexpected class");
        }
    }
        
        
    }
    

