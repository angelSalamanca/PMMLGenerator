/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;
import pmmlgenerator.util.Context;
import pmmlgenerator.util.Scope;
import pmmlgenerator.util.FieldHelper;
import pmmlgenerator.util.General;
import pmmlgenerator.util.NameGenerator;

/**
 *
 * @author Angel Salamanca
 */
public class TransformationDictionaryBuilder {
    
    private PMML pmml;
    private NameGenerator generator; 
    private Context context;
    
    public TransformationDictionaryBuilder(Context thisContext)
    {
        pmml = (PMML)thisContext.getRootScope().getPMMLScope();
        generator = new NameGenerator();      
        this.context = thisContext;
        if(this.context.getCurrentScope().isRoot())
        {
            this.generator.setDerivedPreffix("Global");
        }
        else
        {
            this.generator.setDerivedPreffix("Local");
        }
        
    }
    
    public TransformationDictionary build() throws Exception
    {
        TransformationDictionary td = new TransformationDictionary();
        
        addDerivedFields(td.getDerivedField());        
        addDefinedFunctions(td.getDefineFunction());        
        return td;
    }
    
    public LocalTransformations buildLocal() throws Exception
    {
        LocalTransformations lts = new LocalTransformations();
        
         if (generator.doubleValue()<0.7)
        {
            addDerivedFields(lts.getDerivedField());
        }          
        
        return lts;
    } 
    
    private void addDerivedFields(List<DerivedField> fields) throws Exception
    {
        // Derived fields -  strings
       for (int numDer = 0; numDer<this.generator.intValue(0, 10); numDer ++)
       {
           String fieldName = this.generator.getDerivedFieldName("String");
           DerivedField derF = new DerivedField();
           derF.setName(fieldName);
           derF.setDataType(DATATYPE.STRING);
           derF.setOptype(OPTYPE.CATEGORICAL);
           fields.add(derF);
       }
        
       // Derived fields -  integer
       if (1==2) {  // TODO manage integer fields with double functions such as ln or log10
       for (int numDer = 0; numDer<this.generator.intValue(0, 10); numDer ++)
       {
           String fieldName = this.generator.getDerivedFieldName("Integer");
           DerivedField derF = new DerivedField();
           derF.setName(fieldName);
           derF.setDataType(DATATYPE.INTEGER);
           derF.setOptype(OPTYPE.CONTINUOUS);
           fields.add(derF);
       }
       }
       // Derived fields -  float
       for (int numDer = 0; numDer<this.generator.intValue(0, 10); numDer ++)
       {
           String fieldName = this.generator.getDerivedFieldName("Float");
           DerivedField derF = new DerivedField();
           derF.setName(fieldName);
           derF.setDataType(DATATYPE.FLOAT);
           derF.setOptype(OPTYPE.CONTINUOUS);
           fields.add(derF);
       }
        
       // Derived fields -  Double
       for (int numDer = 0; numDer<this.generator.intValue(0, 10); numDer ++)
       {
           String fieldName = this.generator.getDerivedFieldName("Double");
           DerivedField derF = new DerivedField();
           derF.setName(fieldName);
           derF.setDataType(DATATYPE.DOUBLE);
           derF.setOptype(OPTYPE.CONTINUOUS);
           fields.add(derF);
       }
       
       
       for (DerivedField derF : fields)
       {
           DerivedFieldBuilder dfb = new DerivedFieldBuilder(derF, this.generator, this.context);
           derF = dfb.build();
       }
       
    }
    
    private void addDefinedFunctions(List<DefineFunction> functions) throws Exception
    {
        Integer numdf = this.generator.intValue(0, 7);
        for (int i=0; i<numdf; i++)
        {
            DefineFunction df = new DefineFunction();
            df.setName(this.generator.getDefineFunctionName());
            df.setDataType(DATATYPE.valueOf(this.generator.pickOne(General.dfDataTypes)));
            if (df.getDataType()==DATATYPE.STRING)
            {
                df.setOptype(OPTYPE.CATEGORICAL);
            }
            else
            {
                df.setOptype(OPTYPE.CONTINUOUS);
            }
            
            List<ParameterField> pfl = df.getParameterField();
            for (int j=0; j<this.generator.intValue(2, 5); j++)
            {
                ParameterField pf = new ParameterField();
                pf.setName("P"+this.generator.stringValue(2)+"-"+String.valueOf(this.generator.intValue(100, 999)));
                pf.setDataType(df.getDataType());
                pf.setOptype(df.getOptype());
                pfl.add(pf);
            }
            
            Scope scope = new Scope(df.getName(), df, df.getClass().getSimpleName(), this.context);
            this.context.setCurrentScope(scope);
            
           DerivedField derF = new DerivedField();
           derF.setName("Instrumental");
           derF.setDataType(df.getDataType());
           derF.setOptype(df.getOptype());
           DerivedFieldBuilder dfb = new DerivedFieldBuilder(derF, this.generator, this.context);
           derF = dfb.build();
           
           if (derF.getConstant()!= null) {df.setConstant(derF.getConstant());  }           
           if (derF.getFieldRef() != null) 
                {df.setFieldRef(derF.getFieldRef());  }
           if (derF.getApply() != null) 
                {df.setApply(derF.getApply()) ; }
           if (derF.getDiscretize() != null)
                {df.setDiscretize(derF.getDiscretize());}
           if (derF.getMapValues() != null)
                {df.setMapValues(derF.getMapValues());}
           if (derF.getNormContinuous() !=null)
                 {df.setNormContinuous(derF.getNormContinuous());}
           if (derF.getNormDiscrete() !=null)
                 {df.setNormDiscrete(derF.getNormDiscrete());}
            
            functions.add(df);
            this.context.backToParent();
        }
        
    }
}
