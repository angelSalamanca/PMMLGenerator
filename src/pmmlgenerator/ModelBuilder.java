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
        this.context = thisContext;
        this.nameGenerator = new NameGenerator(this.context);      
        this.cu = new ContentUtil();
    }
    
    public void build() throws Exception
    {
        General.addToModelLevel(1);
        String modelFamily = nameGenerator.pickOne(General.models);
        // modelFamily = "MiningModel";
         //  modelFamily = "GeneralRegressionModel";
      // modelFamily = "TreeModel";
       //  modelFamily = "RegressionModel";
       modelFamily = "SupportVectorMachineModel";
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
                
             case "RegressionModel":
                General.witness("RegressionModel:");
                RegressionModel rm = new RegressionModel();
                modelContext = new ModelContext(this.context, rm, modelFamily);
                modelContext.build(null);                
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.rm);
                break;
                
            case "MiningModel":
                General.witness("MiningModel:");
                MiningModel miningModel = new MiningModel();                 
                modelContext = new ModelContext(this.context, miningModel, modelFamily);
                modelContext.build(null);
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.miningModel);
                break;
                
                case "SupportVectorMachineModel":
                General.witness("SupportVectorMachineModel:");
                SupportVectorMachineModel svmModel = new SupportVectorMachineModel();                 
                modelContext = new ModelContext(this.context, svmModel, modelFamily);
                modelContext.build(null);
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.svmModel);
                
                break;
                
            default:
                throw new Exception("Not implemented");
        }
        General.addToModelLevel(-1);
    }
            
 
    }
