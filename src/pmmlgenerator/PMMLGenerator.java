/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.math.BigInteger;
import java.util.Iterator;
import javax.xml.bind.*;

import pmmlgenerator.util.*;
import pmmlgenerator.PMML42.*;        
// import jaxb.gdsmodellica.pmmlgenerator.PMML43.*;

/**
 *
 * @author Angel Salamanca
 */
public class PMMLGenerator {
    
    public static PMML pmml;
    public static DDDriver dddriver;
    public static Context context;
    public static Integer numPmmlFiles;
    public static Integer numRecords;
    public static String pmmlPath;
    public static NameGenerator generator;
    private static  Integer pmmlId = 999;
    private static String inputPmmlFileName; 
    private static Boolean isGeneration;
    private static String whichModel;
    // public static AttributeConstraintUniverse attributeConstraintUniverse;
    
    /**
     * @param args the command line arguments
     * arg0: # pmml files or exsisting pmml file name to generate data only
     * arg1: # records in *.data.txt
     * arg2: Folder for both files
     */
    
    public static void main(String[] args) throws Exception {
      
        Boolean success = false;
        numPmmlFiles = 1;
        numRecords = 10;
        pmmlPath = "D:\\";
        General.modelLevel = 0;
        
        General.seed = System.currentTimeMillis();                    
        General.witness("Random seed :" + String.valueOf(General.seed));
        
        generator = new NameGenerator(null);
        isGeneration = true;
        whichModel = "all";
        
       try
        {
            if (args.length>=3)
            {
                if (isNumeric(args[0]))
                {
                    numPmmlFiles = Integer.parseInt(args[0]);                        
                    General.witness("Generating "+ numPmmlFiles + " pmml files");
                } else {
                    inputPmmlFileName = args[0];
                    numPmmlFiles = 1;
                    isGeneration = false;
                    General.witness("Reading existing file "+ inputPmmlFileName);
                }
                
                numRecords = Integer.parseInt(args[1]);
                pmmlPath = args[2];
                
                if (args.length>3)
                {
                    whichModel = args[3];
                }               
                }
        }
        catch (Exception e)
            { throw new Exception("Wrong argument list", e);
        }        
              
        General.witness("With  "+ numRecords + " in each file");
        General.witness("In folder "+ pmmlPath);
        General.witness("Family "+ whichModel);           
       
        Integer successes = 0;
        Integer tries = 0;
        Integer maxTries = 5*numPmmlFiles;
        while(successes < numPmmlFiles && tries < maxTries)
        {
            tries +=1;
            
            if (isGeneration) {
                success = generate(successes + 1);    
                success = success & writeFile(String.valueOf(pmmlId), context.getRootContext().getModelStem());
            } else {
                success = readPMML();
                String preffix = inputPmmlFileName.replace(".pmml","");
                success = success & writeFile(preffix, "");
            }
            
            if(!success) {
                   General.addToModelLevel(-1);
                   General.witness("Generation failed. Retrying.");
            }
            else
            {
                successes +=1;
            }
        }        
         General.witness("Generation completed with " + String.valueOf(successes) + " PMML files");        
    }
    
    private static Boolean generate(Integer numModel) throws Exception
    {
            try
           {
                pmml = new PMML();                  
                context = new Context();         
                context.setWhichModel(whichModel);
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
                buildModel(numModel);
                
        // serialize PMML
               
                 PMMLwriter writer;
                if (numPmmlFiles > 1)
                {
                    pmmlId = generator.intValue(10000, 99999);
                    writer = new PMMLwriter(pmmlPath, String.valueOf(pmmlId), context.getRootContext().getModelStem());
                }
                else
                {
                    writer = new PMMLwriter(pmmlPath, String.valueOf(pmmlId), "");
                }
                
                try
                {
                    writer.write(pmml);
                }
                catch (Exception e)
                {
                    throw new Exception("PMMLGenerator", e);
                }
                General.witness("PMML file written");
                
                return true;
           }    
           catch (Exception e)
           {
               General.witness("*** " + e.getMessage());
               e.printStackTrace();
               return false;
            }
    }
    
    public static void buildDDDriver()
    {
        dddriver = new DDDriver();
        
        dddriver.categoricalString = new IntDuple(10, 20);
       
        
        dddriver.categoricalInteger = new IntDuple(1,10);
        dddriver.categoricalIntegerValues = new IntDuple(0, 5);
        
        dddriver.ordinalString = new IntDuple(0,5);
         dddriver.ordinalStringValues = new IntDuple(2,10);
          
        dddriver.ordinalInteger = new IntDuple(1,5);
        dddriver.ordinalIntegerValues = new IntDuple(0,5);
        
        dddriver.continuousInteger = new IntDuple(0,20);
        dddriver.continuousIntegerValues = new IntDuple(0,1);
        dddriver.continuousIntegerIntervals = new IntDuple(0,3);
        
        dddriver.continuousFloat = new IntDuple(0,20);
        dddriver.continuousFloatValues = new IntDuple(0,1);
        dddriver.continuousFloatIntervals = new IntDuple(0,3);
        
        dddriver.continuousDouble = new IntDuple(0,20);
        dddriver.continuousDoubleValues = new IntDuple(0,1);
        dddriver.continuousDoubleIntervals = new IntDuple(0,5);
                
    }
    
    public static void buildHeader()
    {
        Header header = new Header();
        header.setCopyright(generator.getSentence(4));
        header.setDescription(generator.getSentence(10));
        
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
        General.witness("Data Dictionary built");
    }
    
    public static void buildTransformationDictionary() throws Exception
    {
        TransformationDictionaryBuilder tdb = new TransformationDictionaryBuilder(context);
        pmml.setTransformationDictionary(tdb.build());
        General.witness("Transformation Dictionary built");
    }
    
    public static void buildModel(Integer numModel) throws Exception
    {
        ModelBuilder modelBuilder = new ModelBuilder(pmml, context);
        modelBuilder.build(numModel);        
    }
    
    private static Boolean writeFile(String id, String stem) throws Exception
    {
        try {
          PMMLwriter writer = new PMMLwriter(pmmlPath, id, stem);
        // generate data
          writer.writeData(pmml, numRecords, context);
        
          General.witness("Data file written");
          return true;
        } catch (Exception e) {
            return false;
        }
            
    }
    
    private  static Boolean isNumeric(String str)  
        {  
            try  
            {  
                double d = Double.parseDouble(str);  
            }  
            catch(NumberFormatException nfe)  
            {  
                return false;  
            }  
            return true;  
        }
    
    private static Boolean readPMML() throws Exception
    {
        // deserialize PMML file
        
        try{        
           
            String fullName = pmmlPath + inputPmmlFileName;
            
            String pmmlAsString =  new Scanner(new File(fullName)).useDelimiter("\\Z").next();
     
            JAXBContext jContext = JAXBContext.newInstance(PMML.class);
            Unmarshaller m = jContext.createUnmarshaller();
            pmml = (PMML)m.unmarshal(new StringReader(pmmlAsString));
            context = new Context();   
           
            String modelFamily = identifyFamily();
            Object thisModel = pmml.getAssociationModelOrBaselineModelOrClusteringModel().get(0);
           ModelContext modelContext = new ModelContext(context, thisModel, modelFamily);
           modelContext.castModel();
           context.setCurrentContext(modelContext);
           return true;  
        }
        catch (Exception ex){
            throw new RuntimeException(ex.getMessage());
              
        }
        
    }
    
    private static String identifyFamily() throws Exception
    {
         return pmml.getAssociationModelOrBaselineModelOrClusteringModel().get(0).getClass().getSimpleName();
    }
        
        
    }

