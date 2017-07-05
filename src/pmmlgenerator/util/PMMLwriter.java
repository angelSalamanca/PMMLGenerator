/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.io.*;
import java.util.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;        
import static pmmlgenerator.PMMLGenerator.pmml;

/**
 *
 * @author Angel Salamanca
 */
public class PMMLwriter {
    
    private String pmmlPath;
    private String id;
    
    public PMMLwriter(String thispath, String thisid)
    {
        this.pmmlPath = thispath;
        this.id = thisid;
    }
    
    public void write(PMML pmml) throws Exception
    {
        
         try {
        File file = new File(pmmlPath + "generated." + id + ".pmml");
        JAXBContext jaxbContext = JAXBContext.newInstance(PMML.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        // Add namespaces
        
        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.dmg.org/PMML-4_2 http://www.dmg.org/v4-2/pmml-4-2.xsd");
        
        jaxbMarshaller.marshal(pmml, file);
         }
         catch (JAXBException  e)
         {
             throw new Exception("JAXB excepion");
         }
    }
    
    public void writeData(PMML pmml, Integer numRecords, NameGenerator generator) throws Exception
    {
        DataField df0;
        
         try {
             File dataFile = new File(pmmlPath + "generated." + id + ".data.txt");
             Writer writer = new BufferedWriter(new FileWriter(dataFile));
             List<DataField> fields = pmml.getDataDictionary().getDataField();
             
// write Header
             for (DataField df : fields)
             {
                 writer.write(df.getName());
                 writer.write("\t");
             }
             writer.write("\n");

             // write lines
             for (int nl=0; nl<numRecords; nl++)
             {
                    for (DataField df : fields)
                    {
                        df0 = df;
                        writer.write(generator.getValue(df));
                        writer.write("\t");
                     }
             writer.write("\n");
             }
             writer.close();
             
         }
         catch (Exception e)
         {
             throw new Exception("writeData exception: " + e.getMessage());
         }
    }
    
}
