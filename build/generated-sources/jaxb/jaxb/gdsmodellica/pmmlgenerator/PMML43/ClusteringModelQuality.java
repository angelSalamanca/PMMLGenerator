//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:29 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="dataName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SSE" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="SSB" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ClusteringModelQuality")
public class ClusteringModelQuality {

    @XmlAttribute(name = "dataName")
    protected String dataName;
    @XmlAttribute(name = "SSE")
    protected Double sse;
    @XmlAttribute(name = "SSB")
    protected Double ssb;

    /**
     * Obtiene el valor de la propiedad dataName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * Define el valor de la propiedad dataName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataName(String value) {
        this.dataName = value;
    }

    /**
     * Obtiene el valor de la propiedad sse.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSSE() {
        return sse;
    }

    /**
     * Define el valor de la propiedad sse.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSSE(Double value) {
        this.sse = value;
    }

    /**
     * Obtiene el valor de la propiedad ssb.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSSB() {
        return ssb;
    }

    /**
     * Define el valor de la propiedad ssb.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSSB(Double value) {
        this.ssb = value;
    }

}
