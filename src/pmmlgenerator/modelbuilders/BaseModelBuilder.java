/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.modelbuilders;

import java.util.List;
import pmmlgenerator.ModelContext;
import pmmlgenerator.util.ContentUtil;
import pmmlgenerator.util.Context;
import pmmlgenerator.util.NameGenerator;
import pmmlgenerator.PMML42.*;   

/**
 *
 * @author Angel Salamanca
 */
abstract public class BaseModelBuilder {
    
    protected Context context;
    protected ModelContext modelContext;
    protected NameGenerator generator;
    protected String[] available;
    protected ContentUtil cu;
    protected Integer numTargetCategories;   
    protected List<String> categories;
    protected MiningSchema ms;
    
    
    public BaseModelBuilder(ModelContext thismc)
    {
        this.modelContext = thismc;
        this.context = this.modelContext.context;
        this.generator = this.modelContext.generator;
    }
    
    abstract public void build(Boolean isRegression) throws Exception;
    
}
