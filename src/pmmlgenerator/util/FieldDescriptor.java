/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;
/**
 *
 * @author Angel Salamanca
 */
public class FieldDescriptor {
    public String fieldName;
    public FieldUniverse.FieldType fieldType;
    public Integer fieldLevel;    
    public Scope scope;
    public OPTYPE optype;
    public DATATYPE datatype;
    
    public FieldDescriptor(String name, FieldUniverse.FieldType ftype, Integer level, Scope fieldScope, OPTYPE fieldoptype, DATATYPE fielddatatype)
    {
        this.fieldName = name;
        this.fieldType = ftype;
        this.fieldLevel = level;
        this.scope = fieldScope;
        this.optype = fieldoptype;
        this.datatype = fielddatatype;
    }
    
}
