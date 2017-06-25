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
                GeneralRegressionModel grm = new GeneralRegressionModel();
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
                
                // Parameters
                ParameterList pl = buildParameterList();
                grm.addToContent(pl);
                
                FactorList fl = buildFactorList();
                grm.addToContent(fl);
                
                CovariateList cl = buildCovariateList();
                grm.addToContent(cl);
                
                 
                PPMatrix ppm = buildPPMatrix();
                grm.addToContent(ppm);
                
                 
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
            
            return pl;
        }
        
            private FactorList buildFactorList()
        {
            FactorList fl = new FactorList();
            
            return fl;
        }
            
                private CovariateList buildCovariateList()
        {
            CovariateList cl = new CovariateList();
            
            return cl;
        }
                
                private PPMatrix buildPPMatrix()
        {
            PPMatrix ppm = new PPMatrix();
            
            return ppm;
        }
                
          private ParamMatrix buildParamMatrix()
        {
            ParamMatrix pm = new ParamMatrix();
            
            return pm;
        }
        
    }
