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
    
    public void build(Integer numModel) throws Exception
    {
        General.addToModelLevel(1);
        String modelFamily = pickModelFamily();// nameGenerator.pickOne(General.models);
       //  modelFamily = "MiningModel";
         //  modelFamily = "GeneralRegressionModel";
      // modelFamily = "TreeModel";
        // modelFamily = "RegressionModel";
     // modelFamily = "SupportVectorMachineModel";
        // modelFamily = "NeuralNetwork";
        
        
         numTargetCategories = 2; // binomial by default
        
         General.witness("--- Building model # " + numModel.toString() + ": " + modelFamily);
         
        switch(modelFamily)
        {
            case "GeneralRegressionModel":
               
                GeneralRegressionModel grm = new GeneralRegressionModel();
                modelContext = new ModelContext(this.context, grm, modelFamily);
                modelContext.build(null);                
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.grm);
                break;
                
            case "TreeModel":
                TreeModel treeModel = new TreeModel();                 
                modelContext = new ModelContext(this.context, treeModel, modelFamily);
                modelContext.build(null);
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.treeModel);
                
                break;
                
             case "RegressionModel":
                RegressionModel rm = new RegressionModel();
                modelContext = new ModelContext(this.context, rm, modelFamily);
                modelContext.build(null);                
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.rm);
                break;
                
            case "MiningModel":
                MiningModel miningModel = new MiningModel();                 
                modelContext = new ModelContext(this.context, miningModel, modelFamily);
                modelContext.build(null);
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.miningModel);
                break;
                
             case "SupportVectorMachineModel":
                SupportVectorMachineModel svmModel = new SupportVectorMachineModel();                 
                modelContext = new ModelContext(this.context, svmModel, modelFamily);
                modelContext.build(null);
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.svmModel);
                
                break;
                 
              case "NeuralNetwork":
                NeuralNetwork nnModel = new NeuralNetwork();                 
                modelContext = new ModelContext(this.context, nnModel, modelFamily);
                modelContext.build(null);
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.nnModel);
                
                break;
                  
             case "Scorecard":
                Scorecard scorecard = new Scorecard();                 
                modelContext = new ModelContext(this.context, scorecard, modelFamily);
                modelContext.build(null);
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.scorecard);
                
                break;
                 
              case "RuleSet":
                RuleSet  ruleset = new RuleSet();                 
                modelContext = new ModelContext(this.context, ruleset, modelFamily);
                modelContext.build(null);
                pmml.getAssociationModelOrBaselineModelOrClusteringModel().add(modelContext.ruleset);
                
                break;    
                
                
            default:
                throw new Exception("Not implemented");
        }
        General.addToModelLevel(-1);
    }
    
    private String pickModelFamily()
    {
        switch(this.context.getWhichModel())
        {
            case "grm":
                return "GeneralRegressionModel";
                
            case "tree":
                return  "TreeModel";
            
            case "reg":
                return "RegressionModel";
              
            case "mm":
                return "MiningModel";
            
             case "SupportVectorMachineModel":
                return "svm";     
               
               case "score":
                  return "Scorecard";     
               
               case "nnet":
                   return "NeuralNetwork";
               
               case "rset":
                   return "RuleSetModel";               
                
            default: 
                return nameGenerator.pickOne(General.models);
        }
    }
            
 
    }
