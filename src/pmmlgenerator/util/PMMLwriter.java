/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.io.File;
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
    
}
