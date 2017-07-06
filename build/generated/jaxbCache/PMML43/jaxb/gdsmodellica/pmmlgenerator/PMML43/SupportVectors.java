//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.06 a las 10:07:22 PM CEST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}SupportVector" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numberOfSupportVectors" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="numberOfAttributes" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "supportVector"
})
@XmlRootElement(name = "SupportVectors")
public class SupportVectors {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "SupportVector", required = true)
    protected List<SupportVector> supportVector;
    @XmlAttribute(name = "numberOfSupportVectors")
    protected BigInteger numberOfSupportVectors;
    @XmlAttribute(name = "numberOfAttributes")
    protected BigInteger numberOfAttributes;

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
     * Gets the value of the supportVector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportVector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportVector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportVector }
     * 
     * 
     */
    public List<SupportVector> getSupportVector() {
        if (supportVector == null) {
            supportVector = new ArrayList<SupportVector>();
        }
        return this.supportVector;
    }

    /**
     * Obtiene el valor de la propiedad numberOfSupportVectors.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSupportVectors() {
        return numberOfSupportVectors;
    }

    /**
     * Define el valor de la propiedad numberOfSupportVectors.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSupportVectors(BigInteger value) {
        this.numberOfSupportVectors = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfAttributes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfAttributes() {
        return numberOfAttributes;
    }

    /**
     * Define el valor de la propiedad numberOfAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfAttributes(BigInteger value) {
        this.numberOfAttributes = value;
    }

}
