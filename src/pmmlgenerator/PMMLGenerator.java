/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

import pmmlgenerator.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;        
// import jaxb.gdsmodellica.pmmlgenerator.PMML43.*;

/**
 *
 * @author Angel Salamanca
 */
public class PMMLGenerator {
    
    public static PMML pmml;
    public static DDDriver dddriver;
    public static Sentence sentence;
    public static Context context;
    // public static AttributeConstraintUniverse attributeConstraintUniverse;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        pmml = new PMML();
        sentence = new Sentence();
        Scope pmmlScope = new Scope("", pmml, "PMML");
        context = new Context(pmmlScope);
        General.attributeConstraintUniverse = (new ConstraintGenerator()).LoadAttributeConstraints();
        
        // Meaningless header
        buildHeader();
        // Data Dictionary
        
        buildDDDriver();
        buildDataDictionary();
        buildTransformationDictionary();
        buildModel();
        
        
        // serialize PMML
        PMMLwriter writer = new PMMLwriter();
        try
        {
        writer.write(pmml);
        }
        catch (Exception e)
        {
            throw new Exception();
        }
         System.out.println("PMML file written");
        // generate data
        writer.writeData(pmml, 10, new NameGenerator());
        
        System.out.println("Data file written");
        
        
        
    }
    
    public static void buildDDDriver()
    {
        dddriver = new DDDriver();
        
        dddriver.categoricalString = new IntDuple(0,20);
       
        
        dddriver.categoricalInteger = new IntDuple(1,10);
        dddriver.categoricalIntegerValues = new IntDuple(0,5);
        
        dddriver.ordinalString = new IntDuple(1,5);
         dddriver.ordinalStringValues = new IntDuple(2,10);
          
        dddriver.ordinalInteger = new IntDuple(1,5);
        dddriver.ordinalIntegerValues = new IntDuple(0,5);
        
        dddriver.continuousInteger = new IntDuple(1,20);
        dddriver.continuousIntegerValues = new IntDuple(0,1);
        dddriver.continuousIntegerIntervals = new IntDuple(0,3);
        
        dddriver.continuousFloat = new IntDuple(1,20);
        dddriver.continuousFloatValues = new IntDuple(0,1);
        dddriver.continuousFloatIntervals = new IntDuple(0,3);
        
        dddriver.continuousDouble = new IntDuple(1,20);
        dddriver.continuousDoubleValues = new IntDuple(0,1);
        dddriver.continuousDoubleIntervals = new IntDuple(0,5);
                
    }
    
    public static void buildHeader()
    {
        Header header = new Header();
        header.setCopyright(sentence.getSentence(4));
        header.setDescription(sentence.getSentence(10));
        
        pmml.setHeader(header);
    }
    
    public static void buildDataDictionary() throws Exception
    {
        DataDictionary dd = new DataDictionary();
        List<DataField> dataFields = dddriver.getDataFields();
        
        dd.setDataField(dataFields);
        
        BigInteger numOfFields = BigInteger.valueOf(dataFields.size());
        dd.setNumberOfFields(numOfFields);
        
        pmml.setDataDictionary(dd);
    }
    
    public static void buildTransformationDictionary() throws Exception
    {
        TransformationDictionaryBuilder tdb = new TransformationDictionaryBuilder(pmml, context);
        pmml.setTransformationDictionary(tdb.build());
        int a =1; 
    }
    
    public static void buildModel() throws Exception
    {
        ModelBuilder modelBuilder = new ModelBuilder(pmml, context);
        modelBuilder.build();
        
       
    }
}
