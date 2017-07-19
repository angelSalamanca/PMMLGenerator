//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package pmmlgenerator.PMML42;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Timestamp" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="index" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="time" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="value" use="required" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="standardError" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "timestamp"
})
@XmlRootElement(name = "TimeValue")
public class TimeValue {

    @XmlElement(name = "Timestamp")
    protected Timestamp timestamp;
    @XmlAttribute(name = "index")
    protected BigInteger index;
    @XmlAttribute(name = "time")
    protected Double time;
    @XmlAttribute(name = "value", required = true)
    protected double value;
    @XmlAttribute(name = "standardError")
    protected Double standardError;

    /**
     * Obtiene el valor de la propiedad timestamp.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * Define el valor de la propiedad timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setTimestamp(Timestamp value) {
        this.timestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad index.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Define el valor de la propiedad index.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Obtiene el valor de la propiedad time.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTime(Double value) {
        this.time = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad standardError.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStandardError() {
        return standardError;
    }

    /**
     * Define el valor de la propiedad standardError.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStandardError(Double value) {
        this.standardError = value;
    }

}
