/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.math.BigInteger;
import java.util.*;

import pmmlgenerator.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*; 


/**
 *
 * @author Angel Salamanca
 */
public class ModelBuilder {
    
    private PMML pmml;
    private NameGenerator nameGenerator; 
    private Context context;
    private Object activeField ;
    private MiningField targetField;
    private FieldHelper fieldHelper;
    private Integer numTargetCategories;
    private String[] available;
    private List<String> fullList;
    private List<String> categories;
    private GeneralRegressionModel grm;
    private Integer paramNum;
   
    
    public ModelBuilder(PMML aPMML, Context thisContext)
    {
        pmml = aPMML;
        nameGenerator = new NameGenerator();      
        this.context = thisContext;
        
    }
    
    public void build() throws Exception
    {
        String modelFamily = nameGenerator.pickOne(General.models);
        
        
         numTargetCategories = 2; // binomial by default
        
        switch(modelFamily)
        {
            case "GeneralRegressionModel":
                this.grm = new GeneralRegressionModel();
                pmml.setOneModel(grm);                
                
                grm.setModelType(nameGenerator.pickOne(General.GRMModelTypes));              
                grm.setModelName(nameGenerator.getModelName("GRM"));                
                
                Scope grmScope = new Scope(grm.getModelName(), grm, grm.getClass().getSimpleName());
                this.context.setCurrentScope(grmScope);               
                
                // Constraint on functionName
                available = General.attributeConstraintUniverse.getAvailableValues(modelFamily, "functionName", "modelType", grm.getModelType(), General.GRMFunctions);
                grm.setFunctionName(MININGFUNCTION.valueOf(nameGenerator.pickOne(available)));
                
                grm.setCumulativeLink(CUMULATIVELINKFUNCTION.values()[nameGenerator.pickOne(General.GRMcumLinkFunctions)]);
                LINKFUNCTION lf = LINKFUNCTION.values()[nameGenerator.pickOne(General.GRMLinkFunctions)];
                grm.setLinkFunction(lf);
                if (lf == LINKFUNCTION.ODDSPOWER || lf == LINKFUNCTION.POWER)
                {
                    grm.setLinkParameter(nameGenerator.doubleValue());
                }
                // only 1 of these variables is present
                if (nameGenerator.booleanValue())
                {
                    Integer iValue = nameGenerator.intValue(1, 10);
                    grm.setTrialsValue(BigInteger.valueOf(iValue.intValue()));
                }
                else
                {
                    // TODO: grm.setTrialsVariable(modelFamily);
                }
                grm.setDistribution(nameGenerator.pickOne(General.GRMDistributions));
                grm.setDistParameter(nameGenerator.doubleValue()); // only used in binomial
                
                // TODO offset variable
                grm.setModelDF(nameGenerator.doubleValue());
                
                // TODO endTimeVariable, startTimeVariable
                
                // Mining Schema
                
                MiningSchema ms = buildMiningSchema(true, grm.getFunctionName());
                grm.addToContent(ms);
                                 
                LocalTransformations lt = buildLocalTransformations();
                grm.addToContent(lt);
                               
                FactorList fl = buildFactorList(ms);
                grm.addToContent(fl);
                
                CovariateList cl = buildCovariateList(ms);
                grm.addToContent(cl);                               
                 
                PPMatrix ppm = buildPPMatrix();
                grm.addToContent(ppm);
                
                // Parameters after PPMatrix
                ParameterList pl = buildParameterList();
                grm.addToContent(pl);
                
                
                 
                ParamMatrix pm = buildParamMatrix();
                grm.addToContent(pm);
                
                  
                // Get # of categories from target field
                  if (grm.getFunctionName() ==MININGFUNCTION.CLASSIFICATION ){
                        grm.setTargetReferenceCategory(String.valueOf(this.numTargetCategories));
                  }
                
                break;
                
            default:
                throw new Exception("Not implemented");
        }
    }
    
        
        private MiningSchema buildMiningSchema(Boolean isSupervised, MININGFUNCTION modelFunction) throws Exception
        {
            MiningSchema ms = new MiningSchema();
            List<MiningField> miningFields = ms.getMiningField();
            Boolean firstField = isSupervised;
            
            // Generation of fields based on context
            Map<String, Object> fieldCatalog = context.getFieldNames();
            
            Iterator it = fieldCatalog.entrySet().iterator();
            
            while (it.hasNext()) {
                // random pick
                 Map.Entry pair = (Map.Entry)it.next();
                double d = this.nameGenerator.doubleValue();
                if (d<0.75)
                {
                    MiningField mField = new MiningField();
                    String fieldName = (String)pair.getKey();
                    mField.setName(fieldName);
                    this.fieldHelper  = new FieldHelper(fieldName, pair.getValue());  // value is containerj
                    mField.saveDataType(this.fieldHelper.getDataType());
                    // UsageType
                    if (firstField)
                    {                        
                        if (this.fieldHelper.isGRMTargetCompatible(modelFunction))
                        {
                            firstField = false;
                            mField.setUsageType(FIELDUSAGETYPE.TARGET);
                            this.targetField = mField;
                            List<Value> values  = this.fieldHelper.getValues();
                            numTargetCategories = values.size();
                            categories = new ArrayList<String>();
                            for (int j=0; j< numTargetCategories; j++)
                            {
                                categories.add(values.get(j).getValue());
                            }
                        }                        
                    }
                    else
                    {
                        if (this.nameGenerator.doubleValue()<0.5)
                        {
                             mField.setUsageType(FIELDUSAGETYPE.ACTIVE);
                        }
                    }
                    
                   if(mField.getUsageType() == FIELDUSAGETYPE.TARGET | this.fieldHelper.isGRMActiveCompatible(modelFunction))
                   {
                   mField.setOptype(this.fieldHelper.getOptype());
                   }       
                  
                   // missing value replacement, only sometimes
                   if (this.nameGenerator.doubleValue()<0.5)
                   {
                       mField.setMissingValueReplacement(this.fieldHelper.randomValue());
                   }
                   
                   
                    miningFields.add(mField);
                }  
          }           
            
            return ms;
        }
        
             private LocalTransformations  buildLocalTransformations()
        {
            LocalTransformations lt = new LocalTransformations();
            
            return lt;
        }
        
        private ParameterList buildParameterList()
        {
            ParameterList pl = new ParameterList();
            
             for (int np = 0; np<=paramNum; np++)
            {
                Parameter p = new Parameter();
                p.setName("p"+String.valueOf(np));
                if (np==0)
                {
                    p.setLabel("Intercept");
                }
                pl.saveParameter(p);
            }
             
            return pl;
        }
        
            private FactorList buildFactorList(MiningSchema ms)
            {
                FactorList fl = new FactorList();
                
               // retrieve all mining fields
            List<MiningField> mFields = ms.getMiningField();
            for (MiningField mf : mFields)
            {
                if (mf.getOptype()!=OPTYPE.CONTINUOUS & mf.getUsageType()!=FIELDUSAGETYPE.TARGET)
                {
                if (this.nameGenerator.doubleValue() < 0.5)
                {
                    Predictor p = new Predictor();
                    p.setName(mf.getName());
                    fl.addPredictor(p);
                }
                }
            }
            
                
                return fl;
            }
  
            
                private CovariateList buildCovariateList(MiningSchema ms)
        {
            CovariateList cl = new CovariateList();
            
            // retrieve all mining fields
            List<MiningField> mFields = ms.getMiningField();
            for (MiningField mf : mFields)
            {
                if (mf.getOptype()==OPTYPE.CONTINUOUS & mf.getUsageType()!=FIELDUSAGETYPE.TARGET)
                {
                if (this.nameGenerator.doubleValue() < 0.5)
                {
                    Predictor p = new Predictor();
                    p.setName(mf.getName());
                    cl.addPredictor(p);
                }
                }
            }
            
            return cl;
        }
                
                private PPMatrix buildPPMatrix() throws Exception
        {
            PPMatrix ppm = new PPMatrix();
            
            // This is the cain of Spain
            MiningSchema ms = (MiningSchema)grm.getFromContent("MiningSchema");
             paramNum = 1;
            // all factors first
            FactorList fl = (FactorList)grm.getFromContent("FactorList");
            
            List<Predictor> predictors = fl.getPredictor();
            
            for (int i = 0 ; i< predictors.size() ;i++)
            {
                if (nameGenerator.doubleValue()<0.8)
                {
                    Predictor p = predictors.get(i);
                    // get Mining Field
                    MiningField mf = ms.readMiningField(p.getName());
                    // go over all values, omg!
                    this.fieldHelper = new FieldHelper(mf.getName(), pmml);
                    for (Value v : this.fieldHelper.getValues())
                    {
                        // No interactions first
                        PPCell cell = new PPCell();
                        cell.setPredictorName(mf.getName());
                        cell.setValue(v.getValue());
                        cell.setParameterName("p" + String.valueOf(paramNum));
                        ppm.savePPCell(cell);
                        paramNum +=1;
                        // 2 interactions now
                         for (int j = i+1; j<  predictors.size() ;j++) 
                         {
                             Predictor q = predictors.get(j);
                            // get Mining Field
                           MiningField mf2 = ms.readMiningField(q.getName());
                            // go over all values of predictor 2, omg!
                           FieldHelper fh2 = new FieldHelper(mf2.getName(), pmml);      
                             for (Value w : fh2.getValues())
                            {
                                 if (nameGenerator.doubleValue()<0.4) // only some interactions
                                {
                                    PPCell cell1 = new PPCell();
                                    PPCell cell2 = new PPCell();
                                    cell1.setPredictorName(mf.getName());
                                    cell2.setPredictorName(mf2.getName());
                                    cell1.setValue(v.getValue());
                                    cell2.setValue(w.getValue());
                                    cell1.setParameterName("p" + String.valueOf(paramNum));
                                    cell2.setParameterName("p" + String.valueOf(paramNum));
                                    ppm.savePPCell(cell1);
                                    ppm.savePPCell(cell2);
                                    paramNum +=1;
                             }
                            }                             
                         }
                    }
                }
            }            
            
            // and covariates now
            CovariateList cl = (CovariateList)grm.getFromContent("CovariateList");
            
            predictors = cl.getPredictor();
            
            for (int i = 0 ; i< predictors.size() ;i++)
            {
                if (nameGenerator.doubleValue()<0.8)
                {
                    Predictor p = predictors.get(i);
                    // get Mining Field
                    MiningField mf = ms.readMiningField(p.getName());
                    // go over all values, omg!
                    this.fieldHelper = new FieldHelper(mf.getName(), pmml);
                        // No interactions always
                        PPCell cell = new PPCell();
                        cell.setPredictorName(mf.getName());
                        cell.setParameterName("p" + String.valueOf(paramNum));
                        cell.setValue("1");
                        ppm.savePPCell(cell);
                        paramNum +=1;
                       
                }
            }    
            
            // One to many
            paramNum -=1;
            return ppm;
        }
                
          private ParamMatrix buildParamMatrix()
        {
            ParamMatrix pm = new ParamMatrix();
            
            switch(grm.getFunctionName())
                    {
                case REGRESSION:
                  for (int iPar =0; iPar<paramNum; iPar++)
                {
                    PCell cell = new PCell();
                    cell.setParameterName("p"+String.valueOf(iPar));
                    if (this.nameGenerator.doubleValue()>0.8)
                    {
                        cell.setBeta(this.nameGenerator.doubleValue());
                    }
                    pm.savePCell(cell);
                }  
                    break;
                case CLASSIFICATION:
            // Categories loop - exclude reference cat
            for (int iCat = 0; iCat<this.numTargetCategories-1; iCat++)
            {
                // Parameter loop
                for (int iPar =0; iPar<paramNum; iPar++)
                {
                    PCell cell = new PCell();
                    cell.setTargetCategory(this.categories.get(iCat));
                    cell.setParameterName("p"+String.valueOf(iPar));
                    if (this.nameGenerator.doubleValue()>0.8)
                    {
                        cell.setBeta(this.nameGenerator.doubleValue());
                    }
                    pm.savePCell(cell);
                }                 
            }
           
                    
            }
            
            
            return pm;
        }
        
    }
