/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import pmmlgenerator.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;   
/**
 *
 * @author Angel Salamanca
 */
public class ConstraintGenerator {
    
    
    public AttributeConstraintUniverse LoadAttributeConstraints()
    {
            AttributeConstraintUniverse myUniverse = new AttributeConstraintUniverse();
            
            AttributeConstraint constraint;
        
            constraint = new AttributeConstraint("GeneralRegressionModel", "functionName", "modelType");
            constraint.addForbidden("CLASSIFICATION", General.GRMModelTypes[0]);
            constraint.addForbidden("CLASSIFICATION", General.GRMModelTypes[1]);
            constraint.addForbidden("REGRESSION", General.GRMModelTypes[2]);
            constraint.addForbidden("REGRESSION", General.GRMModelTypes[3]);
            constraint.addForbidden("REGRESSION", General.GRMModelTypes[4]);
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
            
            
            
            return myUniverse;
    }
}
