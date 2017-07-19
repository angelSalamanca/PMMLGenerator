/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.math.BigInteger;
import java.util.*;

import pmmlgenerator.util.*;
import pmmlgenerator.modelbuilders.*;
import pmmlgenerator.PMML42.*; 


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
      General.addToModelLevel(1);
        String modelFamily = nameGenerator.pickOne(General.models);
        // modelFamily = "MiningModel";
        modelFamily = "GeneralRegressionModel";
         numTargetCategories = 2; // binomial by default
        
        switch(modelFamily)
        {
            case "GeneralRegressionModel":
                General.witness("GeneralRegressionModel:");
                GeneralRegressionModel grm = new GeneralRegressionModel();
                modelContext = new ModelContext(this.context, grm, modelFamily);
                modelContext.build(null);                
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.grm);
                break;
                
            case "TreeModel":
                General.witness("TreeModel:");
                TreeModel treeModel = new TreeModel();                 
                modelContext = new ModelContext(this.context, treeModel, modelFamily);
                modelContext.build(null);
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.treeModel);
                
                break;
                
            case "MiningModel":
                General.witness("MiningModel:");
                MiningModel miningModel = new MiningModel();                 
                modelContext = new ModelContext(this.context, miningModel, modelFamily);
                modelContext.build(null);
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.miningModel);
                break;
                
            default:
                throw new Exception("Not implemented");
        }
        General.addToModelLevel(-1);
    }
            
             private LocalTransformations  buildLocalTransformations()
        {
            LocalTransformations lt = new LocalTransformations();
            
            General.witness("  Local Transformations built");
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
             General.witness("  Parameter List built");
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
                if (this.nameGenerator.doubleValue() < 0.5)
                {
                    Predictor p = new Predictor();
                    p.setName(fieldhelper.getName());
                    fl.getPredictor().add(p);
                }
                }
            }
                General.witness("  Factor List built");
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
                if (this.nameGenerator.doubleValue() < 0.5)
                {
                    Predictor p = new Predictor();
                    p.setName(fieldhelper.getName());
                    cl.getPredictor().add(p);
                }
                }
            }
            General.witness("  CovariateList built");                
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
            
            General.witness(" ParamMatrix built");
            return pm;
        }
        
    }
