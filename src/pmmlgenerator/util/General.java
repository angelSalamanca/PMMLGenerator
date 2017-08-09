/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

/**
 *
 * @author Angel Salamanca
 */
public class General {
    
    public static String[] models = {"GeneralRegressionModel", "TreeModel", "RegressionModel", "MiningModel"};
    public static  String[] relationalOperators = {"equal", "notEqual", "lessThan", "lessOrEqual", "greaterThan", "greaterOrEqual", "isMissing", "isNotMissing"};
    public static  String[] stringRelationalOperators = {"equal", "notEqual", "isMissing", "isNotMissing"};
    public static String[] booleanOperators = {"or", "and", "xor"};  // TODO surrogate  
    public static String[] GRMModelTypes = {"regression", "generalLinear","multinomialLogistic","ordinalMultinomial","generalizedLinear"}; // TODO ,"CoxRegression"};
    public static  String[] GRMFunctions = {"CLASSIFICATION","REGRESSION"}; // classification and regression
    public static int[] GRMcumLinkFunctions = {0,1,2,3,4}; // all available
    public static int[] GRMLinkFunctions = {0,1,2,3,4,5,6,7,8,9}; // all available
    public static String[] GRMDistributions = {"binomial", "gamma", "igauss", "negbin", "normal", "poisson", "tweedie"};   
    public static String[] dfDataTypes = {"STRING", "FLOAT", "DOUBLE"};
    public static String[] genDataTypes = {"STRING", "INTEGER", "FLOAT", "DOUBLE"};
    public static Long seed;
    public static String[] treeNoTrueChildStrategies = {"RETURN_NULL_PREDICTION", "RETURN_LAST_PREDICTION"}; // all
    public static String[] SSPBoolean = {"isIn", "isNotIn"};
    
    public static  String[] RMFunctions = {"CLASSIFICATION","REGRESSION"}; // classification and regression
    public static String[] RMModelTypes = {"linearRegression", "stepwisePolynomialRegression", "logisticRegression"}; 
    //public static String[] RMNormalizationMethods = {"none", "simplemax", "softmax", "logit", "probit", "cloglog", "exp", "loglog", "cauchit"};
    public static String[] RMNormalizationMethods = {"NONE", "SIMPLEMAX", "SOFTMAX", "LOGIT", "PROBIT", "CLOGLOG", "EXP", "LOGLOG", "CAUCHIT"};
    
    public static String[] castIntegerOptions = {"round", "ceiling","floor"};
    public static String[] multipleModelMethods ={ "MAJORITY_VOTE", "WEIGHTED_MAJORITY_VOTE", "AVERAGE", "WEIGHTED_AVERAGE", "MEDIAN", "MAX", "SUM", "SELECT_FIRST", "SELECT_ALL", "MODEL_CHAIN"};
   
    public static AttributeConstraintUniverse attributeConstraintUniverse;
    
    public static Integer modelLevel;
    
    public static void witness(String line)
    {
        String indenter = new String(new char[2*modelLevel]).replace('\0', ' ');
       System.out.println(indenter + line);
    }
    
    public static void addToModelLevel(Integer step)
    {
        modelLevel = java.lang.Math.max(0, modelLevel + step);
    }
}
