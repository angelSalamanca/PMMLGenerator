//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package pmmlgenerator.PMML42;

import java.math.BigDecimal;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordCount" use="required" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="confidence" type="{http://www.dmg.org/PMML-4_2}PROB-NUMBER" />
 *       &lt;attribute name="probability" type="{http://www.dmg.org/PMML-4_2}PROB-NUMBER" />
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
@XmlRootElement(name = "ScoreDistribution")
public class ScoreDistribution {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "value", required = true)
    protected String value;
    @XmlAttribute(name = "recordCount", required = true)
    protected double recordCount;
    @XmlAttribute(name = "confidence")
    protected BigDecimal confidence;
    @XmlAttribute(name = "probability")
    protected BigDecimal probability;

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
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad recordCount.
     * 
     */
    public double getRecordCount() {
        return recordCount;
    }

    /**
     * Define el valor de la propiedad recordCount.
     * 
     */
    public void setRecordCount(double value) {
        this.recordCount = value;
    }

    /**
     * Obtiene el valor de la propiedad confidence.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfidence() {
        return confidence;
    }

    /**
     * Define el valor de la propiedad confidence.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfidence(BigDecimal value) {
        this.confidence = value;
    }

    /**
     * Obtiene el valor de la propiedad probability.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProbability() {
        return probability;
    }

    /**
     * Define el valor de la propiedad probability.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProbability(BigDecimal value) {
        this.probability = value;
    }

}
