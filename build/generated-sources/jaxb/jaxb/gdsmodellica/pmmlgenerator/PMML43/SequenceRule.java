//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.07.19 a las 09:57:14 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}AntecedentSequence"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Delimiter"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Time" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ConsequentSequence"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Time" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.dmg.org/PMML-4_3}ELEMENT-ID" />
 *       &lt;attribute name="numberOfSets" use="required" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="occurrence" use="required" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="support" use="required" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="confidence" use="required" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="lift" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "SequenceRule")
public class SequenceRule {

    @XmlElementRefs({
        @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_3", type = Extension.class, required = false),
        @XmlElementRef(name = "ConsequentSequence", namespace = "http://www.dmg.org/PMML-4_3", type = ConsequentSequence.class, required = false),
        @XmlElementRef(name = "Delimiter", namespace = "http://www.dmg.org/PMML-4_3", type = Delimiter.class, required = false),
        @XmlElementRef(name = "AntecedentSequence", namespace = "http://www.dmg.org/PMML-4_3", type = AntecedentSequence.class, required = false),
        @XmlElementRef(name = "Time", namespace = "http://www.dmg.org/PMML-4_3", type = Time.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "numberOfSets", required = true)
    protected BigInteger numberOfSets;
    @XmlAttribute(name = "occurrence", required = true)
    protected BigInteger occurrence;
    @XmlAttribute(name = "support", required = true)
    protected double support;
    @XmlAttribute(name = "confidence", required = true)
    protected double confidence;
    @XmlAttribute(name = "lift")
    protected Double lift;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "Time" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 2674 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML43/pmml-4-3.mod.xsd
     * línea 2672 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML43/pmml-4-3.mod.xsd
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * {@link ConsequentSequence }
     * {@link AntecedentSequence }
     * {@link Delimiter }
     * {@link Time }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     */
    public double getSupport() {
        return support;
    }

    /**
     * Define el valor de la propiedad support.
     * 
     */
    public void setSupport(double value) {
        this.support = value;
    }

    /**
     * Obtiene el valor de la propiedad confidence.
     * 
     */
    public double getConfidence() {
        return confidence;
    }

    /**
     * Define el valor de la propiedad confidence.
     * 
     */
    public void setConfidence(double value) {
        this.confidence = value;
    }

    /**
     * Obtiene el valor de la propiedad lift.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLift() {
        return lift;
    }

    /**
     * Define el valor de la propiedad lift.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLift(Double value) {
        this.lift = value;
    }

}
