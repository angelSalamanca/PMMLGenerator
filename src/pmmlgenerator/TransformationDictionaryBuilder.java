/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import pmmlgenerator.util.DerivedFieldBuilder;
import java.util.*;
import pmmlgenerator.PMML42.*;
import pmmlgenerator.util.*;

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
        pmml = PMMLGenerator.pmml;
        generator = new NameGenerator();      
        this.context = thisContext;
        if(this.context.getCurrentContext().isRoot())
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
        
        addSafeDefinedFunctions(td.getDefineFunction());
        addDefinedFunctions(td.getDefineFunction());      
        addDerivedFields(td.getDerivedField());        
        
        return td;
    }
    
    public LocalTransformations buildLocal() throws Exception
    {
        LocalTransformations lts = new LocalTransformations();
        
         if (generator.doubleValue()<0.7)
        {
            addDerivedFields(lts.getDerivedField());
        }          
        
        General.witness("  Local Transformations built");
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
       
       Boolean success;
       for (DerivedField derF : fields)
       {
           DerivedFieldBuilder dfb = new DerivedFieldBuilder(derF, this.generator, this.context, false);
           // several attempts
           success = false;
           attempts:
           for (int  tries = 0; tries<9; tries++)
           {
               try
               {
                   derF = dfb.build();
                   success = true;
                   break attempts;
               }
               catch (Exception e)
               {} // one more attempt           
           }
           if (!success)
            {throw new Exception("unable to build Derived Field");}
           
           
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
            
            ModelContext dfContext = new ModelContext(this.context, df, df.getName());
            this.context.setCurrentContext(dfContext);
            
           DerivedField derF = new DerivedField();
           derF.setName("Instrumental");
           derF.setDataType(df.getDataType());
           derF.setOptype(df.getOptype());
           DerivedFieldBuilder dfb = new DerivedFieldBuilder(derF, this.generator, this.context, true);
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
    
      private void addSafeDefinedFunctions(List<DefineFunction> functions) throws Exception
      {
          // Safe ln
          DefineFunction df = new DefineFunction();
          df.setName("safeln");
          df.setDataType(DATATYPE.DOUBLE);
          df.setOptype(OPTYPE.CONTINUOUS);
          List<ParameterField> pfl = df.getParameterField();
          ParameterField pf = new ParameterField();
          pf.setName("safe1");
          pf.setDataType(DATATYPE.DOUBLE);
          pf.setOptype(OPTYPE.CONTINUOUS);
          pfl.add(pf);
          Apply apply = new Apply();
          apply.setFunction("ln");
          Apply apply2 = new Apply();
          apply2.setFunction("abs");          
          FieldRef fr = new FieldRef();
          fr.setField("safe1");
          apply2.getEXPRESSION().add(fr);
          apply.getEXPRESSION().add(apply2);
          df.setApply(apply);
          functions.add(df);
          
          // Safe log10
          df = new DefineFunction();
          df.setName("safelog10");
          df.setDataType(DATATYPE.DOUBLE);
          df.setOptype(OPTYPE.CONTINUOUS);
          pfl = df.getParameterField();
          pf = new ParameterField();
          pf.setName("safe1");
          pf.setDataType(DATATYPE.DOUBLE);
          pf.setOptype(OPTYPE.CONTINUOUS);
          pfl.add(pf);
          apply = new Apply();
          apply.setFunction("log10");
          apply2 = new Apply();
          apply2.setFunction("abs");          
          fr = new FieldRef();
          fr.setField("safe1");
          apply2.getEXPRESSION().add(fr);
          apply.getEXPRESSION().add(apply2);
          df.setApply(apply);
          functions.add(df);
          
          BuiltinFunction sf = new BuiltinFunction();
          sf.setName(df.getName());
          String[] args = {"c"}; 
          sf.setArgumentTypes(args);
          sf.setIsNumeric(true);         
          
          this.context.addSafeFunction(sf);
          
          this.context.mergeFunctionLists();
      }
}
