/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import pmmlgenerator.PMML42.*;        
import static pmmlgenerator.PMMLGenerator.pmml;

/**
 *
 * @author Angel Salamanca
 */
public class PMMLwriter {
    
    private String pmmlPath;
    private String id;
    private String modelStem;
    private String myStyleSheet = "<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">" +
"<xsl:template match=\"@*|node()\"><xsl:copy><xsl:apply-templates select=\"@*|node()\" /></xsl:copy></xsl:template>" +
"<xsl:template match=\"//PMML/NeuralNetwork/NeuralLayer/Neuron/Cons\"><Con><xsl:apply-templates select=\"@*|node()\" /></Con><status>what</status></xsl:template>" +
"</xsl:stylesheet>";
    private String xsltFile ="post.xslt";
    
    public PMMLwriter(String thispath, String thisid, String thismodelStem)
    {
        this.pmmlPath = thispath;
        this.id = thisid;
        this.modelStem = thismodelStem;
    }
    
    public void write(PMML pmml) throws Exception
    {
        File file;
        String fullPath;
         try {
       
             if (this.modelStem.equals(""))
             {
                fullPath  = this.pmmlPath + "generated." + id + ".pmml";
             }
             else
             {
                 fullPath = this.pmmlPath + "generated." + this.modelStem + "." + id + ".pmml"; 
                 
             }
             
             file = new File(fullPath);
          
        JAXBContext jaxbContext = JAXBContext.newInstance(PMML.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        // Add namespaces
        
        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.dmg.org/PMML-4_2 http://www.dmg.org/v4-2/pmml-4-2.xsd");
        
        jaxbMarshaller.marshal(pmml, file);
        if (pmml.getAssociationModelOrBaselineModelOrClusteringModel().get(0) instanceof NeuralNetwork) 
        {
            // replace cons with con via xslt
            postProcessPMMLfile(pmml, fullPath);
        }
        
        
         }
         catch (JAXBException  e)
         {
             throw new Exception("JAXB excepion", e);
         }
    }
    
    private void postProcessPMMLfile(PMML pmml, String filename) throws Exception
    {
        // I tried xslt and failed miserably. This is pretty wild
       
        String pmmlAsString =  new Scanner(new File(filename)).useDelimiter("\\Z").next();
        pmmlAsString = pmmlAsString.replaceAll("<Cons ", "<Con ");
        pmmlAsString = pmmlAsString.replaceAll("</Cons>","</Con>");
            
      FileWriter writer = new FileWriter(new File(filename));
      writer.write(pmmlAsString);
      writer.close();
      
        
    }
    
    public void writeData(PMML pmml, Integer numRecords, Context context) throws Exception
    {
       NameGenerator generator = context.generator;
       File dataFile;
       
         try {
              if (this.modelStem.equals(""))
             {
                 dataFile = new File(this.pmmlPath + id + ".data.txt");
                 
             }
             else
             {
                 dataFile = new File(this.pmmlPath + "generated." + this.modelStem + "." + id + ".data.txt");
             }
             
             Writer writer = new BufferedWriter(new FileWriter(dataFile));
             List<DataField> fields = pmml.getDataDictionary().getDataField();
             
             List<String> mfs = context.getTopModelContext().getTargetMiningFields();
             
            // write Header
             for (DataField df : fields)
             {
                 // Target is not input
                 if (!mfs.contains(df.getName()))
                 {
                     writer.write(df.getName());
                     writer.write("\t");
                 }
             }
             writer.write("\n");

             // write lines
             for (int nl=0; nl<numRecords; nl++)
             {
                    for (DataField df : fields)
                    {
                         if (! mfs.contains(df.getName()))
                        {
                            writer.write(generator.getValue(df));
                            writer.write("\t");
                        }
                     }
             writer.write("\n");
             }
             writer.close();
             
         }
         catch (Exception e)
         {
             throw new Exception("writeData exception: " + e.getMessage(), e);
         }
    }
    
}
