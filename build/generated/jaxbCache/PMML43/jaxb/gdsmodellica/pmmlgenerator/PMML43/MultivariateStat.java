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
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exponent" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" default="1" />
 *       &lt;attribute name="isIntercept" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="importance" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
 *       &lt;attribute name="stdError" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="tValue" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="chiSquareValue" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="fStatistic" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="dF" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="pValueAlpha" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
 *       &lt;attribute name="pValueInitial" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
 *       &lt;attribute name="pValueFinal" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
 *       &lt;attribute name="confidenceLevel" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" default="0.95" />
 *       &lt;attribute name="confidenceLowerBound" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="confidenceUpperBound" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
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
@XmlRootElement(name = "MultivariateStat")
public class MultivariateStat {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "exponent")
    protected BigInteger exponent;
    @XmlAttribute(name = "isIntercept")
    protected Boolean isIntercept;
    @XmlAttribute(name = "importance")
    protected Double importance;
    @XmlAttribute(name = "stdError")
    protected Double stdError;
    @XmlAttribute(name = "tValue")
    protected Double tValue;
    @XmlAttribute(name = "chiSquareValue")
    protected Double chiSquareValue;
    @XmlAttribute(name = "fStatistic")
    protected Double fStatistic;
    @XmlAttribute(name = "dF")
    protected Double df;
    @XmlAttribute(name = "pValueAlpha")
    protected Double pValueAlpha;
    @XmlAttribute(name = "pValueInitial")
    protected Double pValueInitial;
    @XmlAttribute(name = "pValueFinal")
    protected Double pValueFinal;
    @XmlAttribute(name = "confidenceLevel")
    protected Double confidenceLevel;
    @XmlAttribute(name = "confidenceLowerBound")
    protected Double confidenceLowerBound;
    @XmlAttribute(name = "confidenceUpperBound")
    protected Double confidenceUpperBound;

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
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad exponent.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExponent() {
        if (exponent == null) {
            return new BigInteger("1");
        } else {
            return exponent;
        }
    }

    /**
     * Define el valor de la propiedad exponent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExponent(BigInteger value) {
        this.exponent = value;
    }

    /**
     * Obtiene el valor de la propiedad isIntercept.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsIntercept() {
        if (isIntercept == null) {
            return false;
        } else {
            return isIntercept;
        }
    }

    /**
     * Define el valor de la propiedad isIntercept.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntercept(Boolean value) {
        this.isIntercept = value;
    }

    /**
     * Obtiene el valor de la propiedad importance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImportance() {
        return importance;
    }

    /**
     * Define el valor de la propiedad importance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImportance(Double value) {
        this.importance = value;
    }

    /**
     * Obtiene el valor de la propiedad stdError.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStdError() {
        return stdError;
    }

    /**
     * Define el valor de la propiedad stdError.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStdError(Double value) {
        this.stdError = value;
    }

    /**
     * Obtiene el valor de la propiedad tValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTValue() {
        return tValue;
    }

    /**
     * Define el valor de la propiedad tValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTValue(Double value) {
        this.tValue = value;
    }

    /**
     * Obtiene el valor de la propiedad chiSquareValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChiSquareValue() {
        return chiSquareValue;
    }

    /**
     * Define el valor de la propiedad chiSquareValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChiSquareValue(Double value) {
        this.chiSquareValue = value;
    }

    /**
     * Obtiene el valor de la propiedad fStatistic.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFStatistic() {
        return fStatistic;
    }

    /**
     * Define el valor de la propiedad fStatistic.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFStatistic(Double value) {
        this.fStatistic = value;
    }

    /**
     * Obtiene el valor de la propiedad df.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDF() {
        return df;
    }

    /**
     * Define el valor de la propiedad df.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDF(Double value) {
        this.df = value;
    }

    /**
     * Obtiene el valor de la propiedad pValueAlpha.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPValueAlpha() {
        return pValueAlpha;
    }

    /**
     * Define el valor de la propiedad pValueAlpha.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPValueAlpha(Double value) {
        this.pValueAlpha = value;
    }

    /**
     * Obtiene el valor de la propiedad pValueInitial.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPValueInitial() {
        return pValueInitial;
    }

    /**
     * Define el valor de la propiedad pValueInitial.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPValueInitial(Double value) {
        this.pValueInitial = value;
    }

    /**
     * Obtiene el valor de la propiedad pValueFinal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPValueFinal() {
        return pValueFinal;
    }

    /**
     * Define el valor de la propiedad pValueFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPValueFinal(Double value) {
        this.pValueFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad confidenceLevel.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getConfidenceLevel() {
        if (confidenceLevel == null) {
            return  0.95D;
        } else {
            return confidenceLevel;
        }
    }

    /**
     * Define el valor de la propiedad confidenceLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConfidenceLevel(Double value) {
        this.confidenceLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad confidenceLowerBound.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConfidenceLowerBound() {
        return confidenceLowerBound;
    }

    /**
     * Define el valor de la propiedad confidenceLowerBound.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConfidenceLowerBound(Double value) {
        this.confidenceLowerBound = value;
    }

    /**
     * Obtiene el valor de la propiedad confidenceUpperBound.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConfidenceUpperBound() {
        return confidenceUpperBound;
    }

    /**
     * Define el valor de la propiedad confidenceUpperBound.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConfidenceUpperBound(Double value) {
        this.confidenceUpperBound = value;
    }

}
