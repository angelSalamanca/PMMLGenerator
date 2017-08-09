/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import pmmlgenerator.util.*;
import pmmlgenerator.PMML42.*;   
/**
 *
 * @author Angel Salamanca
 */
public class ConstraintGenerator {
    
    
    public AttributeConstraintUniverse LoadAttributeConstraints()
    {
            AttributeConstraintUniverse myUniverse = new AttributeConstraintUniverse();
            
            AttributeConstraint constraint;
        
            constraint = new AttributeConstraint("GeneralRegressionModel",  "modelType", "functionName");
            constraint.addForbidden(General.GRMModelTypes[0],"CLASSIFICATION");
            constraint.addForbidden(General.GRMModelTypes[1], "CLASSIFICATION");
            constraint.addForbidden(General.GRMModelTypes[2],"REGRESSION");
            constraint.addForbidden( General.GRMModelTypes[3],"REGRESSION");
            constraint.addForbidden( General.GRMModelTypes[4], "REGRESSION");
            // COX not implemented constraint.addForbidden("REGRESSION", General.GRMModelTypes[5]);;
                    
            myUniverse.addConstraint(constraint);
            
            constraint = new AttributeConstraint("TreeModel", "functionName", "modelType");
            constraint.addForbidden("CLASSIFICATION", General.GRMModelTypes[0]);
            constraint.addForbidden("CLASSIFICATION", General.GRMModelTypes[1]);
            constraint.addForbidden("REGRESSION", General.GRMModelTypes[2]);
            constraint.addForbidden("REGRESSION", General.GRMModelTypes[3]);
            constraint.addForbidden("REGRESSION", General.GRMModelTypes[4]);
            // COX not implemented constraint.addForbidden("REGRESSION", General.GRMModelTypes[5]);;
                    
            myUniverse.addConstraint(constraint);
            
            constraint = new AttributeConstraint("MiningModel", "multipleModelMethod", "functionName");
            constraint.addForbidden("MAJORITY_VOTE","REGRESSION");
            constraint.addForbidden("WEIGHTED_MAJORITY_VOTE","REGRESSION");
            constraint.addForbidden("MODEL_CHAIN","REGRESSION");
            constraint.addForbidden("MAX", "REGRESSION");            
            constraint.addForbidden( "SUM", "CLASSIFICATION");
            
            myUniverse.addConstraint(constraint);
            
            
            
            
            
            return myUniverse;
    }
}
