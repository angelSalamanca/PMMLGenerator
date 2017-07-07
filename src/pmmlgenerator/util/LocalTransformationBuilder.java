/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;
import pmmlgenerator.*;
import java.util.*;

/**
 *
 * @author Angel Salamanca
 */
public class LocalTransformationBuilder {
    
    private ModelContext modelContext;
    private NameGenerator generator;
    private Context context;
    private FieldHelper fieldHelper;
    
    public LocalTransformationBuilder(ModelContext thisMContext)
    {
        this.modelContext = thisMContext;        
        this.context = this.modelContext.context;
        this.generator = this.modelContext.generator;
    }
    
    public LocalTransformations build() throws Exception
    {
            LocalTransformations lt = new LocalTransformations();
            
            return lt;
    }
}
