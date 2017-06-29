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

/**
 *
 * @author Angel Salamanca
 */
public class PMMLwriter {
    
    
    public void write(PMML pmml) throws Exception
    {
        
         try {
        File file = new File("D:\\generated.pmml");
        JAXBContext jaxbContext = JAXBContext.newInstance(PMML.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

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
             File dataFile = new File("D:\\generated.data.txt");
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
