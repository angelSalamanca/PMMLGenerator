/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;

/**
 *
 * @author Angel Salamanca
 */
public class BuiltinFunction {
    
    private String name;
    private String[] argumentTypes;
    private Boolean isNumeric;
    
            public BuiltinFunction()
            {
                this.isNumeric = true;
            }
            
    public String getName()
    {
        return name;
    }
    
    public Boolean getIsNumeric()
    {
        return this.isNumeric;
    }
    
    public void setName(String thisname)
    {
        this.name = thisname;
    }
    
    public void setIsNumeric(Boolean isNumericResult)
    {
        this.isNumeric = isNumericResult;
    }
    public String[] getArgumentTypes()
    {
            return this.argumentTypes;
    }
    
    public void setArgumentTypes(String[] thistypes)
    {
        this.argumentTypes = thistypes;
    }
    
}
