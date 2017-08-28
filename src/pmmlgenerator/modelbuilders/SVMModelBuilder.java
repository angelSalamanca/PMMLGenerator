/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.modelbuilders;

import java.math.BigInteger;
import pmmlgenerator.ModelContext;
import java.util.*;
import pmmlgenerator.*;
import pmmlgenerator.util.*;
import pmmlgenerator.PMML42.*;    
import pmmlgenerator.TransformationDictionaryBuilder;

/**
 *
 * @author Angel Salamanca
 */
public class SVMModelBuilder extends BaseModelBuilder {
    
     SupportVectorMachineModel svmModel;
    
     public SVMModelBuilder(ModelContext thismc)
    {
        super(thismc);
        this.cu = this.modelContext.cu;
        
        this.modelContext.svmModel = new SupportVectorMachineModel();
    }
     
     public void build(Boolean isRegression) throws Exception
    {
           this.svmModel = this.modelContext.svmModel;
          
          svmModel.setModelName(this.modelContext.getName());                
                
           this.context.setCurrentContext(modelContext);           
           svmModel.setFunctionName(MININGFUNCTION.valueOf(generator.pickOne(General.GRMFunctions)));
            
                // TODO endTimeVariable, startTimeVariable
                
                // MiningSchema
                 MiningSchemaBuilder msb = new MiningSchemaBuilder(true, this.modelContext);
                 MiningSchema ms = msb.build(this.svmModel.getFunctionName());
                 this.svmModel.getContent().add(ms);
                 this.context.createFieldUniverse(); // update
                
                 OutputBuilder ob = new OutputBuilder();
                 Output o = ob.build(this.modelContext);
                 this.cu.addToContent(this.svmModel.getContent(), o);
                                                  
                // Local Transformations
               TransformationDictionaryBuilder tdb = new TransformationDictionaryBuilder(this.context);
               LocalTransformations lt = tdb.buildLocal();
               this.cu.addToContent(this.svmModel.getContent(), lt);
               this.context.createFieldUniverse(); // update
                              
               this.addKernel();
               
               this.addVectorDictionary();
               
               this.addSupportVectorMachine();
                               
                // cu.addToContent(grm.getContent(), pl);  // Order of addition is important!
                // Get # of categories from target field
                //  if (this.svmModel.getFunctionName() ==MININGFUNCTION.CLASSIFICATION ){
                //        this.svmModel.setTargetReferenceCategory(this.categories.get(categories.size()-1));
                 // }
                 
    }
     
     private void addKernel() throws Exception {
    
         switch(this.generator.intValue(1, 4))
         {
             case 1:
               LinearKernelType lkt = new LinearKernelType();
               lkt.setDescription(this.generator.getSentence(4));
               this.cu.addToContent(this.svmModel.getContent(), lkt);
               break;
                 
             case 2:
                 PolynomialKernelType pkt = new PolynomialKernelType();
                 pkt.setDescription(this.generator.getSentence(4));
                 pkt.setGamma(Double.NaN);
                 pkt.setCoef0(this.generator.doubleValue(0.5, 1));
                 pkt.setDegree((double)this.generator.intValue(2, 5));
                 this.cu.addToContent(this.svmModel.getContent(), pkt);
                 break;
             case 3:
             case 4:        //reserved for 4.3 
                 RadialBasisKernelType rbkt = new RadialBasisKernelType();
                 rbkt.setDescription(this.generator.getSentence(4));
                 rbkt.setGamma(this.generator.doubleValue(0.5, 4));
                 break;
             default:
                 throw new RuntimeException("Unexpected kernel num");
         }
         return;
            }

     private void addVectorDictionary() throws Exception
     {
         VectorDictionary vd = new VectorDictionary();
         
         // Vector Fields
         VectorFields vfs = new VectorFields();
         
         vd.setVectorFields(vfs);
         List<FieldDescriptor> fds = this.context.getFieldDescriptorsForModel(); // all kind of fields: MS, TD and LT
         Iterator <FieldDescriptor> it = fds.iterator();
         
         while (it.hasNext())
         {
             FieldDescriptor fd  = it.next();
             FieldHelper fieldhelper = new FieldHelper(fd.fieldName, fd.modelContext); // value is container
          
                if (fieldhelper.getOptype()==OPTYPE.CONTINUOUS & !fieldhelper.isTarget())
                {
                    if (this.generator.doubleValue() < 0.5)
                    {
                        FieldRef fr = new FieldRef();
                        fr.setField(fd.fieldName);
                        vfs.getFieldRef().add(fr);
                    }
                }    
         }
         
         // Vector Instances
         
         Integer numVectors = this.generator.intValue(3, 50);
         List<VectorInstance> lvi = vd.getVectorInstance();
         
         for (Integer i = 1; i<=numVectors; i++)
         {             
             VectorInstance vi = this.createVectorInstance();
             vi.setId("Vector "+ i.toString());
             lvi.add(vi);        
         }
         
         if (this.generator.booleanValue())
         {
             vd.setNumberOfVectors(BigInteger.valueOf(numVectors));
         }         
         
         this.cu.addToContent(this.svmModel.getContent(), vd);
     }
     
     private void addSupportVectorMachine()
     {
         SupportVectorMachine svm = new SupportVectorMachine();
         
         this.cu.addToContent(this.svmModel.getContent(), svm);
     }
             
     private VectorInstance createVectorInstance() throws Exception
             {
                 VectorInstance vi = new VectorInstance();
                
                 
                 if (this.generator.booleanValue())
                 {
                     // REAL-Sparse 
                     vi.setREALSparseArray(ArrayUtil.buildRealSparseArray(this.context.getCurrentContext()));                     
                 }
                 else
                 {
                      vi.setArray(ArrayUtil.buildRealArray(this.context.getCurrentContext())); 
                 }               
                 
                 
                 return vi;
             }

}
