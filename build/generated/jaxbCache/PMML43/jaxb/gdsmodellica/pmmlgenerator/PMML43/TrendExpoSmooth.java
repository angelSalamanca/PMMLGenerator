//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.06 a las 10:07:22 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}REAL-ARRAY" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="trend" default="additive">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="additive"/>
 *             &lt;enumeration value="damped_additive"/>
 *             &lt;enumeration value="multiplicative"/>
 *             &lt;enumeration value="damped_multiplicative"/>
 *             &lt;enumeration value="polynomial_exponential"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="gamma" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="phi" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" default="1" />
 *       &lt;attribute name="smoothedValue" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "array"
})
@XmlRootElement(name = "Trend_ExpoSmooth")
public class TrendExpoSmooth {

    @XmlElement(name = "Array")
    protected ArrayType array;
    @XmlAttribute(name = "trend")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trend;
    @XmlAttribute(name = "gamma")
    protected Double gamma;
    @XmlAttribute(name = "phi")
    protected Double phi;
    @XmlAttribute(name = "smoothedValue")
    protected Double smoothedValue;

    /**
     * Obtiene el valor de la propiedad array.
     * 
     * @return
     *     possible object is
     *     {@link ArrayType }
     *     
     */
    public ArrayType getArray() {
        return array;
    }

    /**
     * Define el valor de la propiedad array.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayType }
     *     
     */
    public void setArray(ArrayType value) {
        this.array = value;
    }

    /**
     * Obtiene el valor de la propiedad trend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrend() {
        if (trend == null) {
            return "additive";
        } else {
            return trend;
        }
    }

    /**
     * Define el valor de la propiedad trend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrend(String value) {
        this.trend = value;
    }

    /**
     * Obtiene el valor de la propiedad gamma.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGamma() {
        return gamma;
    }

    /**
     * Define el valor de la propiedad gamma.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGamma(Double value) {
        this.gamma = value;
    }

    /**
     * Obtiene el valor de la propiedad phi.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getPhi() {
        if (phi == null) {
            return  1.0D;
        } else {
            return phi;
        }
    }

    /**
     * Define el valor de la propiedad phi.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPhi(Double value) {
        this.phi = value;
    }

    /**
     * Obtiene el valor de la propiedad smoothedValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSmoothedValue() {
        return smoothedValue;
    }

    /**
     * Define el valor de la propiedad smoothedValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSmoothedValue(Double value) {
        this.smoothedValue = value;
    }

}
