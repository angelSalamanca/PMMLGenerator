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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}SetReference"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{http://www.dmg.org/PMML-4_3}FOLLOW-SET"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Time" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.dmg.org/PMML-4_3}ELEMENT-ID" />
 *       &lt;attribute name="numberOfSets" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="occurrence" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="support" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
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
    "setReference",
    "extensionAndDelimiterAndTime",
    "time"
})
@XmlRootElement(name = "Sequence")
public class Sequence {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "SetReference", required = true)
    protected SetReference setReference;
    @XmlElements({
        @XmlElement(name = "Extension", type = Extension.class),
        @XmlElement(name = "Delimiter", type = Delimiter.class),
        @XmlElement(name = "Time", type = Time.class),
        @XmlElement(name = "SetReference", type = SetReference.class)
    })
    protected List<Object> extensionAndDelimiterAndTime;
    @XmlElement(name = "Time")
    protected Time time;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "numberOfSets")
    protected BigInteger numberOfSets;
    @XmlAttribute(name = "occurrence")
    protected BigInteger occurrence;
    @XmlAttribute(name = "support")
    protected Double support;

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
     * Obtiene el valor de la propiedad setReference.
     * 
     * @return
     *     possible object is
     *     {@link SetReference }
     *     
     */
    public SetReference getSetReference() {
        return setReference;
    }

    /**
     * Define el valor de la propiedad setReference.
     * 
     * @param value
     *     allowed object is
     *     {@link SetReference }
     *     
     */
    public void setSetReference(SetReference value) {
        this.setReference = value;
    }

    /**
     * Gets the value of the extensionAndDelimiterAndTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionAndDelimiterAndTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionAndDelimiterAndTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * {@link Delimiter }
     * {@link Time }
     * {@link SetReference }
     * 
     * 
     */
    public List<Object> getExtensionAndDelimiterAndTime() {
        if (extensionAndDelimiterAndTime == null) {
            extensionAndDelimiterAndTime = new ArrayList<Object>();
        }
        return this.extensionAndDelimiterAndTime;
    }

    /**
     * Obtiene el valor de la propiedad time.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfSets.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSets() {
        return numberOfSets;
    }

    /**
     * Define el valor de la propiedad numberOfSets.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSets(BigInteger value) {
        this.numberOfSets = value;
    }

    /**
     * Obtiene el valor de la propiedad occurrence.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccurrence() {
        return occurrence;
    }

    /**
     * Define el valor de la propiedad occurrence.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOccurrence(BigInteger value) {
        this.occurrence = value;
    }

    /**
     * Obtiene el valor de la propiedad support.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSupport() {
        return support;
    }

    /**
     * Define el valor de la propiedad support.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSupport(Double value) {
        this.support = value;
    }

}
