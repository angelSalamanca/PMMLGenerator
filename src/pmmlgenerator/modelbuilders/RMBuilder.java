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


public class RMBuilder extends BaseModelBuilder {
    
    private Object activeField ;
    private MiningField targetField;
    private FieldHelper fieldHelper;
    private Integer numTargetCategories;
    private List<String> fullList;
    private List<String> categories;
    private RegressionModel rm;
    private Integer paramNum;
    private ContentUtil cu;
    
    public RMBuilder(ModelContext thismc)
    {
        super(thismc);
        this.cu = this.modelContext.cu;
        this.numTargetCategories = 2; // binomial by default
        this.modelContext.rm = new RegressionModel();
    }
    
    public void build(Boolean isRegression) throws Exception
    {
          this.rm = this.modelContext.rm;
          
          rm.setModelName(this.modelContext.getName());                
                
           this.context.setCurrentContext(modelContext);           
           rm.setFunctionName(MININGFUNCTION.valueOf(generator.pickOne(General.RMFunctions)));
            
          // modelType is now optional and deprecated. Trash it
          // available = General.attributeConstraintUniverse.getAvailableValues("RegressionModel", "modelType", "functionName", rm.getFunctionName().name(), General.RMModelTypes);
          // rm.setModelType(generator.pickOne(available));             
            
            General.witness(" Function Name: " + rm.getFunctionName().toString());    
            
            rm.setNormalizationMethod(REGRESSIONNORMALIZATIONMETHOD.valueOf(generator.pickOne(General.RMNormalizationMethods)));
            General.witness(" Normalization method: " + rm.getNormalizationMethod().toString());    
           
              // MiningSchema
                 MiningSchemaBuilder msb = new MiningSchemaBuilder(true, this.modelContext);
                 MiningSchema ms = msb.build(rm.getFunctionName());
                 this.numTargetCategories = msb.numTargetCategories;
                 this.categories = msb.categories;
                rm.getContent().add(ms);
                this.context.createFieldUniverse(); // update
                
                 OutputBuilder ob = new OutputBuilder();
                 Output o = ob.build(this.modelContext);
                 this.cu.addToContent(rm.getContent(), o);
                                                  
                // Local Transformations
               TransformationDictionaryBuilder tdb = new TransformationDictionaryBuilder(this.context);
               LocalTransformations lt = tdb.buildLocal();
               this.cu.addToContent(rm.getContent(), lt);
               this.context.createFieldUniverse(); // update
 
                
                // Create Regression Tables 
                
                if (rm.getFunctionName().equals(MININGFUNCTION.CLASSIFICATION))
                { 
                    for (int rTable =0; rTable<numTargetCategories; rTable++)
                   {
                       RegressionTable rt = buildRegressionTable(this.categories.get(rTable));
                      cu.addToContent(rm.getContent(), rt);
                    }
               }
                else
                {
                     RegressionTable rt = buildRegressionTable(null);
                      cu.addToContent(rm.getContent(), rt);
                            
                  }
                
    }
    
    private RegressionTable buildRegressionTable(String categoryName) throws Exception
    {
        RegressionTable rt = new RegressionTable();
        
        if (categoryName!=null)
        {
            rt.setTargetCategory(categoryName);
        }
        
        rt.setIntercept(this.generator.doubleValue(-0.2, 0.2));
        
        // Numeric
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
                    NumericPredictor p = new NumericPredictor();
                    p.setName(fieldhelper.getName());
                    if (this.generator.doubleValue()<0.1)
                    {
                        p.setExponent(BigInteger.valueOf(this.generator.intValue(1, 5)));
                    }
                    p.setCoefficient(this.generator.doubleValue(-.1, .1));
                    rt.getNumericPredictor().add(p);                    
                }
                }
            }
             
            General.witness(" Numeric predictors added");     
        
            // Categorical
            it = fds.iterator();
            
             while (it.hasNext()) 
            {
                FieldDescriptor fd = it.next();
                // retrieve the field               
                FieldHelper fieldhelper = new FieldHelper(fd.fieldName, fd.modelContext); // value is container
                
                if (fieldhelper.getOptype()!=OPTYPE.CONTINUOUS & !fieldhelper.isTarget())
                {
                if (this.generator.doubleValue() < 0.5)
                {
                    List<Value> fieldCategories = fieldhelper.getValues();
                    for (Value value : fieldCategories)
                    {
                        CategoricalPredictor p = new CategoricalPredictor();
                        p.setName(fieldhelper.getName());
                        p.setValue(value.getValue());
                        p.setCoefficient(this.generator.doubleValue(-.1, .1));
                        rt.getCategoricalPredictor().add(p);
                    }                    
                    }
                }
            }
             
            General.witness(" Categorical predictors added");
            
            // Predictor Terms
            fds = this.context.keepContinuousFDS(fds);
            fds = this.context.removeTarget(fds);
            
            while(fds.size() >1) // we need 2 or more fields
            {
                PredictorTerm pt = new PredictorTerm();
                int numFields = this.generator.intValue(2, 3);
                if (fds.size()<3) 
                {
                    numFields = 2;
                }
                for (int nf=0; nf<numFields; nf++)
                {
                    FieldRef fr = new FieldRef();
                    fr.setField(fds.get(nf).fieldName);
                    pt.getFieldRef().add(fr);
                }
                pt.setName("PT-" + this.generator.stringValue(6));
                pt.setCoefficient(this.generator.doubleValue(-.1, .1));
                rt.getPredictorTerm().add(pt);
                // drop fields from list
                for (int i=0; i<numFields; i++)
                {
                    fds.remove(0);
                }
            }
            
        return rt;
    }
    
}
