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
    private ParameterField pField;
    private String theClass;
    private NameGenerator generator;
        
    public FieldHelper(Object genericField) throws Exception
    {
        this.theField = genericField;        
        this.castField();
        this.generator = new NameGenerator();
    }    
    
    public FieldHelper(String fieldName, Scope scope) throws Exception
    {
        Object container = scope.PMMLScope;
        PMML pmml = scope.getRootContainer();
        
        String containerClass = container.getClass().getSimpleName();
        Object content = null;
        LocalTransformations lt = null;
        Boolean addTransfDict = false;
        Boolean isModel = false;
        
        containerswitch:
        switch(containerClass)
        {
            case "PMML":
                  addTransfDict = true;
                 // DataField ?
                List<DataField> dataFields = pmml.getDataDictionary().getDataField();
                for (DataField df : dataFields) {
                if (df.getName().equals(fieldName))
                {
                    this.theField = df;
                    break;
                }
            }
           
            break;   
              
          case "GeneralRegressionModel":
               GeneralRegressionModel grm = (GeneralRegressionModel)container;
               content = grm.getFromContent("MiningSchema");
               lt = (LocalTransformations)grm.getFromContent("LocalTransformations");
               isModel = true;
               addTransfDict = true;
               break;
          case "TreeModel":
               TreeModel treeModel = (TreeModel)container;
               content = treeModel.getFromContent("MiningSchema");
               lt = (LocalTransformations)treeModel.getFromContent("LocalTransformations");
               isModel = true;
               addTransfDict = true;
               break; 
          case "DefineFunction":
                DefineFunction df  = (DefineFunction)container;
                for (ParameterField pf : df.getParameterField()) {
                    if (pf.getName() == fieldName)
                    {
                        this.theField = pf;
                        break  containerswitch;
                    }
                }
                throw new Exception ("Field not found" + containerClass);
          
              
            default:    //MODEL            
                throw new Exception ("Unexpected model " + containerClass);
            }            
        
         if (isModel)
        {
            // MiningFields
            for (MiningField mf : ((MiningSchema)content).getMiningField()) {
            if (mf.getName() == fieldName)
            {
                this.theField = mf;                       
             }
         }
            // DerivedField in LT?      
            if (lt != null){
                for (DerivedField derf : lt.getDerivedField()) {
                if (derf.getName() == fieldName)
                {
                    this.theField = derf;
                }
                }
            }             
        }
                               
            if (addTransfDict && this.theField==null)
            {       
            pmml = scope.getRootContainer();
             for (DerivedField derf : pmml.getTransformationDictionary().getDerivedField()) {
                if (derf.getName().equals(fieldName))
                {
                    this.theField = derf;                
                }
            }
        }
        
        if (this.theField == null)
        {
                throw new Exception("field not found in context");
        }
       
        this.castField();
        this.generator = new NameGenerator();
    }
       
    public String getTheClass()
    {
        return this.theClass;
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
            case "ParameterField":
                pField = (ParameterField)theField;
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
            case "ParameterField":
                return pField.getOptype();
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
            case "ParameterField":
                return pField.getDataType();
            default:
                throw new Exception("Unexpected class");
        }
    }
    
    public String  getName() throws Exception
    {
         switch(theClass)
        {
            case "DataField":
                return dField.getName();
            case "MiningField":
                return mField.getName();
            case "DerivedField":
                return derField.getName();
            default:
                throw new Exception("Unexpected class");
        }
    }
    
    public Boolean  isTarget() throws Exception
    {
         switch(theClass)
        {
            case "MiningField":
                return mField.getUsageType() == FIELDUSAGETYPE.TARGET;
            default:
                return false;
        }
    }
    
    public Boolean isGRMTargetCompatible(MININGFUNCTION modelFunction) throws Exception
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
        if (this.dField != null)
        {
            return this.generator.getValue(dField);
        }
        
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

    public List<Double> getIntervals(Integer numIntervals)
    {
        // get absolute limits
        Double absoluteLeft;
        Double absoluteRight;
       
        
        if (this.theClass.equals("DataField"))
        {
            List<Interval> intervals = this.dField.getInterval();
            absoluteLeft = intervals.get(0).getLeftMargin(); //-this.generator.doubleValue(1, 2);
            if (absoluteLeft == null)
            {
                  absoluteLeft = this.generator.doubleValue(-100, 100);
            }
            else
            {
                  absoluteLeft = absoluteLeft - this.generator.doubleValue(1, 2);  
            }
            
            absoluteRight = intervals.get(intervals.size()-1).getRightMargin();
             if (absoluteRight== null)
            {
                  absoluteRight = absoluteLeft +this.generator.doubleValue(10, 100);
            }
            else
            {
                  absoluteRight = absoluteRight + this.generator.doubleValue(1, 2);  
            }
        }
        else
        {
            absoluteLeft = this.generator.doubleValue(-100, 100);
            absoluteRight = absoluteLeft + this.generator.doubleValue(10, 100);
        }
        
        // Now split the absolute interval in numInterval pieces
        return this.generator.double01Values(numIntervals,  absoluteLeft, absoluteRight);
        
    }

    public List<Interval> getInterVals()
     {
         if (this.theClass.equals("DataField"))
         {
             return this.dField.getInterval();
         }
         else
         {
             return new ArrayList<Interval>();
         }
     }
    
   
}
