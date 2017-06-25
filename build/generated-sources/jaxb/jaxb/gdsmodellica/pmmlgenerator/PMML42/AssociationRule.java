//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:21 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

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
 *       &lt;attribute name="antecedent" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consequent" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="support" use="required" type="{http://www.dmg.org/PMML-4_2}PROB-NUMBER" />
 *       &lt;attribute name="confidence" use="required" type="{http://www.dmg.org/PMML-4_2}PROB-NUMBER" />
 *       &lt;attribute name="lift" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="leverage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="affinity" type="{http://www.dmg.org/PMML-4_2}PROB-NUMBER" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "AssociationRule")
public class AssociationRule {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "antecedent", required = true)
    protected String antecedent;
    @XmlAttribute(name = "consequent", required = true)
    protected String consequent;
    @XmlAttribute(name = "support", required = true)
    protected BigDecimal support;
    @XmlAttribute(name = "confidence", required = true)
    protected BigDecimal confidence;
    @XmlAttribute(name = "lift")
    protected Float lift;
    @XmlAttribute(name = "leverage")
    protected Float leverage;
    @XmlAttribute(name = "affinity")
    protected BigDecimal affinity;
    @XmlAttribute(name = "id")
    protected String id;

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
     * Obtiene el valor de la propiedad antecedent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntecedent() {
        return antecedent;
    }

    /**
     * Define el valor de la propiedad antecedent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntecedent(String value) {
        this.antecedent = value;
    }

    /**
     * Obtiene el valor de la propiedad consequent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsequent() {
        return consequent;
    }

    /**
     * Define el valor de la propiedad consequent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsequent(String value) {
        this.consequent = value;
    }

    /**
     * Obtiene el valor de la propiedad support.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSupport() {
        return support;
    }

    /**
     * Define el valor de la propiedad support.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSupport(BigDecimal value) {
        this.support = value;
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
     * Obtiene el valor de la propiedad lift.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLift() {
        return lift;
    }

    /**
     * Define el valor de la propiedad lift.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLift(Float value) {
        this.lift = value;
    }

    /**
     * Obtiene el valor de la propiedad leverage.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLeverage() {
        return leverage;
    }

    /**
     * Define el valor de la propiedad leverage.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLeverage(Float value) {
        this.leverage = value;
    }

    /**
     * Obtiene el valor de la propiedad affinity.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAffinity() {
        return affinity;
    }

    /**
     * Define el valor de la propiedad affinity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAffinity(BigDecimal value) {
        this.affinity = value;
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

}
