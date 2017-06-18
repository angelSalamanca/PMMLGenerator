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
 *       &lt;attribute name="name" use="required" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="usageType" type="{http://www.dmg.org/PMML-4_2}FIELD-USAGE-TYPE" default="active" />
 *       &lt;attribute name="optype" type="{http://www.dmg.org/PMML-4_2}OPTYPE" />
 *       &lt;attribute name="importance" type="{http://www.dmg.org/PMML-4_2}PROB-NUMBER" />
 *       &lt;attribute name="outliers" type="{http://www.dmg.org/PMML-4_2}OUTLIER-TREATMENT-METHOD" default="asIs" />
 *       &lt;attribute name="lowValue" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="highValue" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="missingValueReplacement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="missingValueTreatment" type="{http://www.dmg.org/PMML-4_2}MISSING-VALUE-TREATMENT-METHOD" />
 *       &lt;attribute name="invalidValueTreatment" type="{http://www.dmg.org/PMML-4_2}INVALID-VALUE-TREATMENT-METHOD" default="returnInvalid" />
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
@XmlRootElement(name = "MiningField")
public class MiningField {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "usageType")
    protected FIELDUSAGETYPE usageType;
    @XmlAttribute(name = "optype")
    protected OPTYPE optype;
    @XmlAttribute(name = "importance")
    protected BigDecimal importance;
    @XmlAttribute(name = "outliers")
    protected OUTLIERTREATMENTMETHOD outliers;
    @XmlAttribute(name = "lowValue")
    protected Double lowValue;
    @XmlAttribute(name = "highValue")
    protected Double highValue;
    @XmlAttribute(name = "missingValueReplacement")
    protected String missingValueReplacement;
    @XmlAttribute(name = "missingValueTreatment")
    protected MISSINGVALUETREATMENTMETHOD missingValueTreatment;
    @XmlAttribute(name = "invalidValueTreatment")
    protected INVALIDVALUETREATMENTMETHOD invalidValueTreatment;

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
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad usageType.
     * 
     * @return
     *     possible object is
     *     {@link FIELDUSAGETYPE }
     *     
     */
    public FIELDUSAGETYPE getUsageType() {
        if (usageType == null) {
            return FIELDUSAGETYPE.ACTIVE;
        } else {
            return usageType;
        }
    }

    /**
     * Define el valor de la propiedad usageType.
     * 
     * @param value
     *     allowed object is
     *     {@link FIELDUSAGETYPE }
     *     
     */
    public void setUsageType(FIELDUSAGETYPE value) {
        this.usageType = value;
    }

    /**
     * Obtiene el valor de la propiedad optype.
     * 
     * @return
     *     possible object is
     *     {@link OPTYPE }
     *     
     */
    public OPTYPE getOptype() {
        return optype;
    }

    /**
     * Define el valor de la propiedad optype.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTYPE }
     *     
     */
    public void setOptype(OPTYPE value) {
        this.optype = value;
    }

    /**
     * Obtiene el valor de la propiedad importance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportance() {
        return importance;
    }

    /**
     * Define el valor de la propiedad importance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportance(BigDecimal value) {
        this.importance = value;
    }

    /**
     * Obtiene el valor de la propiedad outliers.
     * 
     * @return
     *     possible object is
     *     {@link OUTLIERTREATMENTMETHOD }
     *     
     */
    public OUTLIERTREATMENTMETHOD getOutliers() {
        if (outliers == null) {
            return OUTLIERTREATMENTMETHOD.AS_IS;
        } else {
            return outliers;
        }
    }

    /**
     * Define el valor de la propiedad outliers.
     * 
     * @param value
     *     allowed object is
     *     {@link OUTLIERTREATMENTMETHOD }
     *     
     */
    public void setOutliers(OUTLIERTREATMENTMETHOD value) {
        this.outliers = value;
    }

    /**
     * Obtiene el valor de la propiedad lowValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLowValue() {
        return lowValue;
    }

    /**
     * Define el valor de la propiedad lowValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLowValue(Double value) {
        this.lowValue = value;
    }

    /**
     * Obtiene el valor de la propiedad highValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHighValue() {
        return highValue;
    }

    /**
     * Define el valor de la propiedad highValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHighValue(Double value) {
        this.highValue = value;
    }

    /**
     * Obtiene el valor de la propiedad missingValueReplacement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissingValueReplacement() {
        return missingValueReplacement;
    }

    /**
     * Define el valor de la propiedad missingValueReplacement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissingValueReplacement(String value) {
        this.missingValueReplacement = value;
    }

    /**
     * Obtiene el valor de la propiedad missingValueTreatment.
     * 
     * @return
     *     possible object is
     *     {@link MISSINGVALUETREATMENTMETHOD }
     *     
     */
    public MISSINGVALUETREATMENTMETHOD getMissingValueTreatment() {
        return missingValueTreatment;
    }

    /**
     * Define el valor de la propiedad missingValueTreatment.
     * 
     * @param value
     *     allowed object is
     *     {@link MISSINGVALUETREATMENTMETHOD }
     *     
     */
    public void setMissingValueTreatment(MISSINGVALUETREATMENTMETHOD value) {
        this.missingValueTreatment = value;
    }

    /**
     * Obtiene el valor de la propiedad invalidValueTreatment.
     * 
     * @return
     *     possible object is
     *     {@link INVALIDVALUETREATMENTMETHOD }
     *     
     */
    public INVALIDVALUETREATMENTMETHOD getInvalidValueTreatment() {
        if (invalidValueTreatment == null) {
            return INVALIDVALUETREATMENTMETHOD.RETURN_INVALID;
        } else {
            return invalidValueTreatment;
        }
    }

    /**
     * Define el valor de la propiedad invalidValueTreatment.
     * 
     * @param value
     *     allowed object is
     *     {@link INVALIDVALUETREATMENTMETHOD }
     *     
     */
    public void setInvalidValueTreatment(INVALIDVALUETREATMENTMETHOD value) {
        this.invalidValueTreatment = value;
    }

}
