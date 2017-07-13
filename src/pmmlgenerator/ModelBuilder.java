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
    private ModelContext modelContext;
    private ContentUtil cu;
   
    
    public ModelBuilder(PMML aPMML, Context thisContext)
    {
        pmml = aPMML;
        nameGenerator = new NameGenerator();      
        this.context = thisContext;
        this.cu = new ContentUtil();
    }
    
    public void build() throws Exception
    {
        String modelFamily = nameGenerator.pickOne(General.models);
        // modelFamily = "TreeModel";
        
         numTargetCategories = 2; // binomial by default
        
        switch(modelFamily)
        {
            case "GeneralRegressionModel":
                System.out.println("GeneralRegressionModel:");
                this.grm = new GeneralRegressionModel();
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(grm);               
                modelContext = new ModelContext(grm, this.context);
                
                grm.setModelType(nameGenerator.pickOne(General.GRMModelTypes));              
                grm.setModelName(nameGenerator.getModelName("GRM"));                
                
                Scope grmScope = new Scope(grm.getModelName(), grm, grm.getClass().getSimpleName(), this.context);
                this.context.setCurrentScope(grmScope);       
                grmScope.setModelContext(modelContext);
                
                // Constraint on functionName
                available = General.attributeConstraintUniverse.getAvailableValues(modelFamily, "functionName", "modelType", grm.getModelType(), General.GRMFunctions);
                grm.setFunctionName(MININGFUNCTION.valueOf(nameGenerator.pickOne(available)));
                 System.out.println(" Function Name: " + grm.getFunctionName().toString());    
                
                if (grm.getModelType().equals("ordinalMultinomial"))
                {
                    grm.setCumulativeLink(CUMULATIVELINKFUNCTION.values()[nameGenerator.pickOne(General.GRMcumLinkFunctions)]);
                }
                
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
                cu.addToContent(grm.getContent(), ms);
                this.context.createFieldUniverse(); // update
                
                 OutputBuilder ob = new OutputBuilder();
                 Output o = ob.build(this.modelContext);
                 cu.addToContent(grm.getContent(), o);
                                                  
                // Local Transformations
               TransformationDictionaryBuilder tdb = new TransformationDictionaryBuilder(this.context);
               LocalTransformations lt = tdb.buildLocal();
               cu.addToContent(grm.getContent(), lt);
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
                
                 
                break;
                
            case "TreeModel":
                System.out.println("TreeModel:");
                TreeModel treeModel = new TreeModel();                 
                modelContext = new ModelContext(treeModel, this.context);
                modelContext.buildTreeModel();
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(treeModel);
                
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
            List<FieldDescriptor> fieldCatalog = context.getFieldDescriptorsForMiningSchema();
            
            
           for (FieldDescriptor fd : fieldCatalog)
           {
                // random pick                
                double d = this.nameGenerator.doubleValue();
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
                            this.targetField = mField;
                            modelContext.setTargetField(this.targetField);
                            List<Value> values  = this.fieldHelper.getValues();
                            numTargetCategories = values.size();
                            categories = new ArrayList<String>();
                            for (int j=0; j< numTargetCategories; j++)
                            {
                                categories.add(values.get(j).getValue());
                            }
                            this.modelContext.setCategories(categories);
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
            System.out.println(" Mining Schema built");
            return ms;
        }
        
             private LocalTransformations  buildLocalTransformations()
        {
            LocalTransformations lt = new LocalTransformations();
            
            System.out.println(" Local Transformations built");
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
                pl.getParameter().add(p);
            }
             System.out.println(" Parameter List built");
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
                FieldHelper fieldhelper = new FieldHelper(fd.fieldName, fd.scope); // value is container
                
                if (fieldhelper.getOptype()!=OPTYPE.CONTINUOUS & !fieldhelper.isTarget())
                {
                if (this.nameGenerator.doubleValue() < 0.5)
                {
                    Predictor p = new Predictor();
                    p.setName(fieldhelper.getName());
                    fl.getPredictor().add(p);
                }
                }
            }
                System.out.println(" Factor List built");
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
                FieldHelper fieldhelper = new FieldHelper(fd.fieldName, fd.scope); // value is container
          
                if (fieldhelper.getOptype()==OPTYPE.CONTINUOUS & !fieldhelper.isTarget())
                {
                if (this.nameGenerator.doubleValue() < 0.5)
                {
                    Predictor p = new Predictor();
                    p.setName(fieldhelper.getName());
                    cl.getPredictor().add(p);
                }
                }
            }
            System.out.println(" CovariateList built");                
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
                if (nameGenerator.doubleValue()<0.8)
                {
                    Predictor p = predictors.get(i);
                    String fieldName = p.getName();
                   
                    // go over all values, omg!
                    this.fieldHelper = new FieldHelper(fieldName, this.context.getFieldDescriptor(fieldName, grm , fds).scope);
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
                            FieldHelper fh2 = new FieldHelper(fieldName2, this.context.getFieldDescriptor(fieldName2, grm , fds).scope);
                          
                             for (Value w : fh2.getValues())
                            {
                                 if (nameGenerator.doubleValue()<0.4) // only some interactions
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
                if (nameGenerator.doubleValue()<0.8)
                {
                    Predictor p = predictors.get(i);               
                    String fieldName = p.getName();
                   
                    // go over all values, omg!
                    this.fieldHelper = new FieldHelper(fieldName, this.context.getFieldDescriptor(fieldName, grm , fds).scope);
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
            System.out.println(" PPMatrix built");
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
                    if (this.nameGenerator.doubleValue()<0.6)
                    {
                        cell.setBeta(this.nameGenerator.doubleValue());
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
                        if (this.nameGenerator.doubleValue()<0.8)
                        {
                            cell.setBeta(this.nameGenerator.doubleValue());
                        }
                        pm.getPCell().add(cell);
                        if (isOrdMult && iCat==1)
                        {
                            break; // for
                        }
                }                 
            }
           
                    
            }
            
            System.out.println(" ParamMatrix built");
            return pm;
        }
        
    }
