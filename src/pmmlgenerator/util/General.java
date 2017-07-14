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
    
    public static String[] models = {"GeneralRegressionModel", "TreeModel"};
    public static  String[] relationalOperators = {"equal", "notEqual", "lessThan", "lessOrEqual", "greaterThan", "greaterOrEqual", "isMissing", "isNotMissing"};
    public static  String[] stringRelationalOperators = {"equal", "notEqual", "isMissing", "isNotMissing"};
    public static String[] booleanOperators = {"or", "and", "xor"};  // TODO surrogate  
    public static String[] GRMModelTypes = {"regression", "generalLinear","multinomialLogistic","ordinalMultinomial","generalizedLinear"}; // TODO ,"CoxRegression"};
    public static  String[] GRMFunctions = {"CLASSIFICATION","REGRESSION"}; // classification and regression
    public static int[] GRMcumLinkFunctions = {0,1,2,3,4}; // all available
    public static int[] GRMLinkFunctions = {0,1,2,3,4,5,6,7,8,9}; // all available
    public static String[] GRMDistributions = {"binomial", "gamma", "igauss", "negbin", "normal", "poisson", "tweedie"};   
    public static String[] dfDataTypes = {"STRING", "FLOAT", "DOUBLE"};

    public static String[] treeNoTrueChildStrategies = {"RETURN_NULL_PREDICTION", "RETURN_LAST_PREDICTION"}; // all
    public static String[] SSPBoolean = {"isIn", "isNotIn"};
    
    public static AttributeConstraintUniverse attributeConstraintUniverse;
    
    
}
