/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;
import java.lang.*;
import java.lang.reflect.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;    


/**
 *
 * @author Angel Salamanca
 */
public class FieldHelper {
    
    private Object theField;
    private DataField dField;
    private MiningField mField;
    private DerivedField derField;
    private String theClass;
    private NameGenerator generator;
        
    public FieldHelper(Object genericField) throws Exception
    {
        this.theField = genericField;        
        this.castField();
        this.generator = new NameGenerator();
    }    
    
    public FieldHelper(String fieldName, Object container) throws Exception
    {
        String containerClass = container.getClass().getSimpleName();
        
        containerswitch:
        switch(containerClass)
        {
            case "PMML":
                PMML pmml = (PMML)container;
             // DataField ?
            List<DataField> dataFields = pmml.getDataDictionary().getDataField();
            for (DataField df : dataFields) {
                if (df.getName() == fieldName)
                {
                    this.theField = df;
                    break containerswitch;
                }
            }
            
            // DerivedField ?
            List<DerivedField> derivedFields = pmml.getTransformationDictionary().getDerivedField();
            for (DerivedField derf : derivedFields) {
                if (derf.getName() == fieldName)
                {
                    this.theField = derf;
                    break  containerswitch;
                }
            }
            break;   
            default: //MODEL
             // MiningField ?
                containerClass = container.getClass().getName();
               Class modelClass = Class.forName(containerClass);
                Field contentField = modelClass.getDeclaredField("content");
               Object content = contentField.get(container);
              
                // TO COMPLETE
                
                // DerivedField ?
                // TO DO
                
        }
       
        if (this.theField == null)
        {
                throw new Exception("field not found in context");
        }
        
        this.castField();
        this.generator = new NameGenerator();
    }
       
    private void castField() throws Exception
    {
         theClass = this.theField.getClass().getSimpleName();
        switch(theClass)
        {
            case "DataField":
                dField = (DataField)theField;         
                break;
            case "MiningField":
                mField = (MiningField)theField;                
                break;
            case "DerivedField":
                derField = (DerivedField)theField;      
                break;
            default:
                throw new Exception("Unexpected class");
        }
    }
    
    
    public OPTYPE getOptype() throws Exception
    {
         switch(theClass)
        {
            case "DataField":
                return dField.getOptype();
            case "MiningField":
                return mField.getOptype();
            case "DerivedField":
                return derField.getOptype();
            default:
                throw new Exception("Unexpected class");
        }
    }
    
    public DATATYPE  getDataType() throws Exception
    {
         switch(theClass)
        {
            case "DataField":
                return dField.getDataType();
            case "MiningField":
                return mField.readDataType();
            case "DerivedField":
                return derField.getDataType();
            default:
                throw new Exception("Unexpected class");
        }
    }
    
    public Boolean isGRMTargetCompatible(MININGFUNCTION modelFunction)    throws Exception
    {
        OPTYPE optype = getOptype();
        DATATYPE datatype = getDataType();
        
        switch(modelFunction)
        {
            case CLASSIFICATION:
                    return optype == OPTYPE.CATEGORICAL && this.theClass.equals("DataField") && this.dField.getValue().size()>1;
            case REGRESSION:    
                    return optype == OPTYPE.CONTINUOUS && (datatype == DATATYPE.DOUBLE || datatype == DATATYPE.FLOAT);
            default:
                throw new Exception("Unexpected model function");
                
         }
        
    }
    
    public Boolean isGRMActiveCompatible(MININGFUNCTION modelFunction)   throws Exception
    {
        OPTYPE optype = getOptype();
        return optype == OPTYPE.CONTINUOUS;
        
    }
    
    public List<Value> getValues() throws Exception
    {
         switch(this.theClass)
        {
            case "DataField":
                return dField.getValue();
            case "MiningField":
                return new ArrayList<Value>();
            case "DerivedField":
                return derField.getValue();
            default:
                throw new Exception("Unexpected class");
        }
    }
    
    public String retrieveClass()
    {
        return this.theClass;
    }
    
    public String randomValue() throws Exception
    {
         switch(this.getDataType())
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
