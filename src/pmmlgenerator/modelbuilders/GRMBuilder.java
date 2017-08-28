/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.modelbuilders;

/**
 *
 * @author Angel Salamanca
 */

import java.math.BigInteger;
import java.util.*;
import pmmlgenerator.*;
import pmmlgenerator.util.*;
import pmmlgenerator.PMML42.*;    
import pmmlgenerator.TransformationDictionaryBuilder;


public class GRMBuilder extends BaseModelBuilder {
        
    private Object activeField ;
    private MiningField targetField;
    private FieldHelper fieldHelper;
    private Integer numTargetCategories;
    private List<String> fullList;
    private List<String> categories;
    private GeneralRegressionModel grm;
    private Integer paramNum;
    
    
    public GRMBuilder(ModelContext thismc)
    {
        super(thismc);
        this.cu = this.modelContext.cu;
        this.numTargetCategories = 2; // binomial by defau
        this.modelContext.grm = new GeneralRegressionModel();
    }
    
    public void build(Boolean isRegression) throws Exception
    {
           this.grm = this.modelContext.grm;
          
          grm.setModelName(this.modelContext.getName());                
                
           this.context.setCurrentContext(modelContext);           
           grm.setFunctionName(MININGFUNCTION.valueOf(generator.pickOne(General.GRMFunctions)));
            
           // Constraint on functionName
          available = General.attributeConstraintUniverse.getAvailableValues("GeneralRegressionModel", "modelType", "functionName", grm.getFunctionName().name(), General.GRMModelTypes);
          grm.setModelType(generator.pickOne(available));             
            
            General.witness(" Function Name: " + grm.getFunctionName().toString());    
                
             if (grm.getModelType().equals("ordinalMultinomial"))
              {
                    grm.setCumulativeLink(CUMULATIVELINKFUNCTION.values()[generator.pickOne(General.GRMcumLinkFunctions)]);
               }
                
                LINKFUNCTION lf = LINKFUNCTION.values()[generator.pickOne(General.GRMLinkFunctions)];
                grm.setLinkFunction(lf);
                if (lf == LINKFUNCTION.ODDSPOWER || lf == LINKFUNCTION.POWER)
                {
                    grm.setLinkParameter(generator.doubleValue());
                }
                // only 1 of these variables is present
                if (generator.booleanValue())
                {
                    Integer iValue = generator.intValue(1, 10);
                    grm.setTrialsValue(BigInteger.valueOf(iValue.intValue()));
                }
                else
                {
                    // TODO: grm.setTrialsVariable(modelFamily);
                }
                grm.setDistribution(generator.pickOne(General.GRMDistributions));
                grm.setDistParameter(generator.doubleValue()); // only used in binomial
                
                // TODO offset variable
                grm.setModelDF(generator.doubleValue());
                
                // TODO endTimeVariable, startTimeVariable
                
                // MiningSchema
                 MiningSchemaBuilder msb = new MiningSchemaBuilder(true, this.modelContext);
                 MiningSchema ms = msb.build(grm.getFunctionName());
                 this.numTargetCategories = msb.numTargetCategories;
                 this.categories = msb.categories;
                grm.getContent().add(ms);
                this.context.createFieldUniverse(); // update
                
                 OutputBuilder ob = new OutputBuilder();
                 Output o = ob.build(this.modelContext);
                 this.cu.addToContent(grm.getContent(), o);
                                                  
                // Local Transformations
               TransformationDictionaryBuilder tdb = new TransformationDictionaryBuilder(this.context);
               LocalTransformations lt = tdb.buildLocal();
               this.cu.addToContent(grm.getContent(), lt);
               this.context.createFieldUniverse(); // update
                               
                FactorList fl = buildFactorList(ms);
                CovariateList cl = buildCovariateList(ms);
                
                PPMatrix ppm = buildPPMatrix(fl, cl);
                
                // Parameters after PPMatrix
                ParameterList pl = buildParameterList();
                cu.addToContent(grm.getContent(), pl);  // Order of addition is important!
                cu.addToContent(grm.getContent(), fl);
                cu.addToContent(grm.getContent(), cl);
                cu.addToContent(grm.getContent(), ppm);
                 
                ParamMatrix pm = buildParamMatrix();
                cu.addToContent(grm.getContent(), pm);
                  
                // Get # of categories from target field
                  if (grm.getFunctionName() ==MININGFUNCTION.CLASSIFICATION ){
                        grm.setTargetReferenceCategory(this.categories.get(categories.size()-1));
                  }
                 
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
                pl.getParameter().add(p);
            }
             General.witness(" Parameter List built");
            return pl;
        }

    
         private FactorList buildFactorList(MiningSchema ms) throws Exception
            {
                FactorList fl = new FactorList();
                
               // retrieve all candidate fields for modelling
            List<FieldDescriptor> fds = this.context.getFieldDescriptorsForModel(); // all kind of fields: MS, TD and LT
            Iterator <FieldDescriptor> it = fds.iterator();
            
             while (it.hasNext()) 
            {
                FieldDescriptor fd = it.next();
                // retrieve the field               
                FieldHelper fieldhelper = new FieldHelper(fd.fieldName, fd.modelContext); // value is container
                
                if (fieldhelper.getOptype()!=OPTYPE.CONTINUOUS & !fieldhelper.isTarget())
                {
                if (this.generator.doubleValue() < 0.5)
                {
                    Predictor p = new Predictor();
                    p.setName(fieldhelper.getName());
                    fl.getPredictor().add(p);
                }
                }
            }
                General.witness(" Factor List built");
                return fl;
            }
              
        private CovariateList buildCovariateList(MiningSchema ms) throws Exception
        {
            CovariateList cl = new CovariateList();
            
            // retrieve all mining fields
             List<FieldDescriptor> fds = this.context.getFieldDescriptorsForModel(); // all kind of fields: MS, TD and LT
            Iterator <FieldDescriptor> it = fds.iterator();
            
             while (it.hasNext()) 
            {
                 // retrieve the field
                 FieldDescriptor fd = it.next();
                FieldHelper fieldhelper = new FieldHelper(fd.fieldName, fd.modelContext); // value is container
          
                if (fieldhelper.getOptype()==OPTYPE.CONTINUOUS & !fieldhelper.isTarget())
                {
                if (this.generator.doubleValue() < 0.5)
                {
                    Predictor p = new Predictor();
                    p.setName(fieldhelper.getName());
                    cl.getPredictor().add(p);
                }
                }
            }
            General.witness(" CovariateList built");                
            return cl;
        }
                
        private PPMatrix buildPPMatrix(FactorList fl, CovariateList cl) throws Exception
        {
            PPMatrix ppm = new PPMatrix();
            
             List<FieldDescriptor> fds = this.context.getFieldDescriptorsForModel(); 
             paramNum = 1;
            // all factors first
            
            List<Predictor> predictors = fl.getPredictor();
            
            for (int i = 0 ; i< predictors.size() ;i++)
            {
                if (this.generator.doubleValue()<0.8)
                {
                    Predictor p = predictors.get(i);
                    String fieldName = p.getName();
                   
                    // go over all values, omg!
                    this.fieldHelper = new FieldHelper(fieldName, this.context.getFieldDescriptor(fieldName, grm , fds).modelContext);
                    for (Value v : this.fieldHelper.getValues())
                    {
                        // No interactions first
                        PPCell cell = new PPCell();
                        cell.setPredictorName(fieldName);
                        cell.setValue(v.getValue());
                        cell.setParameterName("p" + String.valueOf(paramNum));
                        ppm.getPPCell().add(cell);
                        paramNum +=1;
                        // 2 interactions now
                         for (int j = i+1; j<  predictors.size() ;j++) 
                         {
                             Predictor q = predictors.get(j);
                             String fieldName2 = q.getName();
                            // get  Field
                            FieldHelper fh2 = new FieldHelper(fieldName2, this.context.getFieldDescriptor(fieldName2, grm , fds).modelContext);
                          
                             for (Value w : fh2.getValues())
                            {
                                 if (this.generator.doubleValue()<0.4) // only some interactions
                                {
                                    PPCell cell1 = new PPCell();
                                    PPCell cell2 = new PPCell();
                                    cell1.setPredictorName(fieldName);
                                    cell2.setPredictorName(fieldName2);
                                    cell1.setValue(v.getValue());
                                    cell2.setValue(w.getValue());
                                    cell1.setParameterName("p" + String.valueOf(paramNum));
                                    cell2.setParameterName("p" + String.valueOf(paramNum));
                                    ppm.getPPCell().add(cell1);
                                    ppm.getPPCell().add(cell2);
                                    paramNum +=1;
                             }
                            }                             
                         }
                    }
                }
            }            
            
            // and covariates now           
            
            predictors = cl.getPredictor();
            
            for (int i = 0 ; i< predictors.size() ;i++)
            {
                if (this.generator.doubleValue()<0.8)
                {
                    Predictor p = predictors.get(i);               
                    String fieldName = p.getName();
                   
                    // go over all values, omg!
                    this.fieldHelper = new FieldHelper(fieldName, this.context.getFieldDescriptor(fieldName, grm , fds).modelContext);
                        // No interactions always
                        PPCell cell = new PPCell();
                        cell.setPredictorName(fieldName);
                        cell.setParameterName("p" + String.valueOf(paramNum));
                        cell.setValue("1");
                        ppm.getPPCell().add(cell);
                        paramNum +=1;                       
                }
            }    
            // One to many
            paramNum -=1;
            General.witness(" PPMatrix built");
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
                    if (this.generator.doubleValue()<0.6)
                    {
                        cell.setBeta(this.generator.doubleValue());
                    }
                    pm.getPCell().add(cell);
                }  
                    break;
                case CLASSIFICATION:
                        Boolean isOrdMult = grm.getModelType().equals("ordinalMultinomial");
         
                       // Categories loop - exclude reference cat
                        for (int iCat = 0; iCat<this.numTargetCategories-1; iCat++)
                        {
                       // Parameter loop
                        for (int iPar =0; iPar<paramNum; iPar++)
                        {
                        PCell cell = new PCell();
                        if (!isOrdMult || iPar==0)
                        {
                            cell.setTargetCategory(this.categories.get(iCat)); // no target cat for p1 etc in OrdMult
                        }
                        cell.setParameterName("p"+String.valueOf(iPar));
                        if (this.generator.doubleValue()<0.8)
                        {
                            cell.setBeta(this.generator.doubleValue());
                        }
                        pm.getPCell().add(cell);
                        if (isOrdMult && iCat==1)
                        {
                            break; // for
                        }
                }                 
            }
           
                    
            }
            
            General.witness(" ParamMatrix built");
            return pm;
        }
        
    
}
