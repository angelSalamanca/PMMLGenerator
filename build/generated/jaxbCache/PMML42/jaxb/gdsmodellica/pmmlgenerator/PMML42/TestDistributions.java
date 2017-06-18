//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:21 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Baseline"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Alternate" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="testStatistic" use="required" type="{http://www.dmg.org/PMML-4_2}BASELINE-TEST-STATISTIC" />
 *       &lt;attribute name="resetValue" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="0.0" />
 *       &lt;attribute name="windowSize" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" default="0" />
 *       &lt;attribute name="weightField" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="normalizationScheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baseline",
    "alternate",
    "extension"
})
@XmlRootElement(name = "TestDistributions")
public class TestDistributions {

    @XmlElement(name = "Baseline", required = true)
    protected Baseline baseline;
    @XmlElement(name = "Alternate")
    protected Alternate alternate;
    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "field", required = true)
    protected String field;
    @XmlAttribute(name = "testStatistic", required = true)
    protected BASELINETESTSTATISTIC testStatistic;
    @XmlAttribute(name = "resetValue")
    protected Double resetValue;
    @XmlAttribute(name = "windowSize")
    protected BigInteger windowSize;
    @XmlAttribute(name = "weightField")
    protected String weightField;
    @XmlAttribute(name = "normalizationScheme")
    protected String normalizationScheme;

    /**
     * Obtiene el valor de la propiedad baseline.
     * 
     * @return
     *     possible object is
     *     {@link Baseline }
     *     
     */
    public Baseline getBaseline() {
        return baseline;
    }

    /**
     * Define el valor de la propiedad baseline.
     * 
     * @param value
     *     allowed object is
     *     {@link Baseline }
     *     
     */
    public void setBaseline(Baseline value) {
        this.baseline = value;
    }

    /**
     * Obtiene el valor de la propiedad alternate.
     * 
     * @return
     *     possible object is
     *     {@link Alternate }
     *     
     */
    public Alternate getAlternate() {
        return alternate;
    }

    /**
     * Define el valor de la propiedad alternate.
     * 
     * @param value
     *     allowed object is
     *     {@link Alternate }
     *     
     */
    public void setAlternate(Alternate value) {
        this.alternate = value;
    }

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
     * Obtiene el valor de la propiedad field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Define el valor de la propiedad field.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Obtiene el valor de la propiedad testStatistic.
     * 
     * @return
     *     possible object is
     *     {@link BASELINETESTSTATISTIC }
     *     
     */
    public BASELINETESTSTATISTIC getTestStatistic() {
        return testStatistic;
    }

    /**
     * Define el valor de la propiedad testStatistic.
     * 
     * @param value
     *     allowed object is
     *     {@link BASELINETESTSTATISTIC }
     *     
     */
    public void setTestStatistic(BASELINETESTSTATISTIC value) {
        this.testStatistic = value;
    }

    /**
     * Obtiene el valor de la propiedad resetValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getResetValue() {
        if (resetValue == null) {
            return  0.0D;
        } else {
            return resetValue;
        }
    }

    /**
     * Define el valor de la propiedad resetValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResetValue(Double value) {
        this.resetValue = value;
    }

    /**
     * Obtiene el valor de la propiedad windowSize.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindowSize() {
        if (windowSize == null) {
            return new BigInteger("0");
        } else {
            return windowSize;
        }
    }

    /**
     * Define el valor de la propiedad windowSize.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindowSize(BigInteger value) {
        this.windowSize = value;
    }

    /**
     * Obtiene el valor de la propiedad weightField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightField() {
        return weightField;
    }

    /**
     * Define el valor de la propiedad weightField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightField(String value) {
        this.weightField = value;
    }

    /**
     * Obtiene el valor de la propiedad normalizationScheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizationScheme() {
        return normalizationScheme;
    }

    /**
     * Define el valor de la propiedad normalizationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizationScheme(String value) {
        this.normalizationScheme = value;
    }

}
