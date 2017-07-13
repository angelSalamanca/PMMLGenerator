//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:29 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="totalFreq" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="missingFreq" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="invalidFreq" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="cardinality" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension"
})
@XmlRootElement(name = "Counts")
public class Counts {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "totalFreq", required = true)
    protected double totalFreq;
    @XmlAttribute(name = "missingFreq")
    protected Double missingFreq;
    @XmlAttribute(name = "invalidFreq")
    protected Double invalidFreq;
    @XmlAttribute(name = "cardinality")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cardinality;

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Obtiene el valor de la propiedad totalFreq.
     * 
     */
    public double getTotalFreq() {
        return totalFreq;
    }

    /**
     * Define el valor de la propiedad totalFreq.
     * 
     */
    public void setTotalFreq(double value) {
        this.totalFreq = value;
    }

    /**
     * Obtiene el valor de la propiedad missingFreq.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMissingFreq() {
        return missingFreq;
    }

    /**
     * Define el valor de la propiedad missingFreq.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMissingFreq(Double value) {
        this.missingFreq = value;
    }

    /**
     * Obtiene el valor de la propiedad invalidFreq.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInvalidFreq() {
        return invalidFreq;
    }

    /**
     * Define el valor de la propiedad invalidFreq.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInvalidFreq(Double value) {
        this.invalidFreq = value;
    }

    /**
     * Obtiene el valor de la propiedad cardinality.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardinality() {
        return cardinality;
    }

    /**
     * Define el valor de la propiedad cardinality.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardinality(BigInteger value) {
        this.cardinality = value;
    }

}
