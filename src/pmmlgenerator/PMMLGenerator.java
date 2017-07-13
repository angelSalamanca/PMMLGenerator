/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import javax.xml.bind.*;

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
    public static Integer numPmmlFiles;
    public static Integer numRecords;
    public static String pmmlPath;
    // public static AttributeConstraintUniverse attributeConstraintUniverse;
    
    /**
     * @param args the command line arguments
     * arg0: # pmml files
     * arg1: # records in *.data.txt
     * arg2: Folder for both files
     */
    
    public static void main(String[] args) throws Exception {
      
        Boolean success = false;
        numPmmlFiles = 1;
        numRecords = 10;
        pmmlPath = "D:\\";
        
       try
        {
            if (args.length==3)
            {
                numPmmlFiles = Integer.parseInt(args[0]);
                numRecords = Integer.parseInt(args[1]);
                pmmlPath = args[2];
            }
        }
        catch (Exception e)
            { throw new Exception("Wrong argument list");
        }        
        
        Integer successes = 0;
        Integer tries = 0;
        Integer maxTries = 5*numPmmlFiles;
        while(successes < numPmmlFiles && tries < maxTries)
        {
            tries +=1;
            success = generate();            
            if(!success) {
                   System.out.println("Generation failed. Retrying.");
            }
            else
            {
                successes +=1;
            }
        }        
         System.out.println("Generation completed with " + String.valueOf(successes) + " PMML files");        
    }
    
    private static Boolean generate() throws Exception
    {
            try
           {
                  pmml = new PMML();
                  sentence = new Sentence();
                  Scope pmmlScope = new Scope("", pmml, "PMML", null);
                  context = new Context(pmmlScope);
                  pmmlScope.setContext(context);
                  General.attributeConstraintUniverse = (new ConstraintGenerator()).LoadAttributeConstraints();               
        
                pmml.setVersion("4.2");
                // Meaningless header
                buildHeader();
                // Data Dictionary
        
                buildDDDriver();
                buildDataDictionary();
                context.createFieldUniverse(); // to create FieldUniverse
                buildTransformationDictionary();
                context.createFieldUniverse(); // to update FieldUniverse
                buildModel();
                
        // serialize PMML
                NameGenerator generator = new NameGenerator();
                Integer pmmlId = 999;
                if (numPmmlFiles > 1)
                {
                    pmmlId = generator.intValue(10000,99999);
                }
                PMMLwriter writer = new PMMLwriter(pmmlPath, String.valueOf(pmmlId));
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
                writer.writeData(pmml, numRecords, generator);
        
                System.out.println("Data file written");
      
                return true;
           }    
           catch (Exception e)
           {
               System.out.println(e.getMessage());
               return false;
            }
    }
    
    public static void buildDDDriver()
    {
        dddriver = new DDDriver();
        
        dddriver.categoricalString = new IntDuple(2,20);
       
        
        dddriver.categoricalInteger = new IntDuple(1,10);
        dddriver.categoricalIntegerValues = new IntDuple(0,5);
        
        dddriver.ordinalString = new IntDuple(0,5);
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
        
        for (DataField df : dataFields)
        {
            dd.getDataField().add(df);
        }
        
        BigInteger numOfFields = BigInteger.valueOf(dataFields.size());
        dd.setNumberOfFields(numOfFields);
        
        pmml.setDataDictionary(dd);
        System.out.println("Data Dictionary built");
    }
    
    public static void buildTransformationDictionary() throws Exception
    {
        TransformationDictionaryBuilder tdb = new TransformationDictionaryBuilder(context);
        pmml.setTransformationDictionary(tdb.build());
        System.out.println("Transformation Dictionary built");
    }
    
    public static void buildModel() throws Exception
    {
        ModelBuilder modelBuilder = new ModelBuilder(pmml, context);
        modelBuilder.build();
        
       
    }
}
