/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;
import pmmlgenerator.util.Context;
import pmmlgenerator.util.FieldHelper;
import pmmlgenerator.util.NameGenerator;

/**
 *
 * @author Angel Salamanca
 */
public class TransformationDictionaryBuilder {
    
     private PMML pmml;
    private NameGenerator generator; 
    private Context context;
    private TransformationDictionary td;
   
    
    public TransformationDictionaryBuilder(PMML aPMML, Context thisContext)
    {
        pmml = aPMML;
        generator = new NameGenerator();      
        this.context = thisContext;
        td = new TransformationDictionary();
        
    }
    
    public TransformationDictionary build() throws Exception
    {
        List<DerivedField> fields = new ArrayList<DerivedField>();
        
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
       for (int numDer = 0; numDer<this.generator.intValue(0, 10); numDer ++)
       {
           String fieldName = this.generator.getDerivedFieldName("Integer");
           DerivedField derF = new DerivedField();
           derF.setName(fieldName);
           derF.setDataType(DATATYPE.INTEGER);
           derF.setOptype(OPTYPE.CONTINUOUS);
           fields.add(derF);
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
       
       td.setDerivedField(fields);
        
        // Defined functions
        
        return td;
    }
    
}
