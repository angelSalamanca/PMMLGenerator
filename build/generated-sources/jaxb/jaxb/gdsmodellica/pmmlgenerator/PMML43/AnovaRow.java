//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:24 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

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
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Model"/>
 *             &lt;enumeration value="Error"/>
 *             &lt;enumeration value="Total"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sumOfSquares" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="degreesOfFreedom" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="meanOfSquares" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="fValue" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="pValue" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
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
@XmlRootElement(name = "AnovaRow")
public class AnovaRow {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "sumOfSquares", required = true)
    protected double sumOfSquares;
    @XmlAttribute(name = "degreesOfFreedom", required = true)
    protected double degreesOfFreedom;
    @XmlAttribute(name = "meanOfSquares")
    protected Double meanOfSquares;
    @XmlAttribute(name = "fValue")
    protected Double fValue;
    @XmlAttribute(name = "pValue")
    protected Double pValue;

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
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad sumOfSquares.
     * 
     */
    public double getSumOfSquares() {
        return sumOfSquares;
    }

    /**
     * Define el valor de la propiedad sumOfSquares.
     * 
     */
    public void setSumOfSquares(double value) {
        this.sumOfSquares = value;
    }

    /**
     * Obtiene el valor de la propiedad degreesOfFreedom.
     * 
     */
    public double getDegreesOfFreedom() {
        return degreesOfFreedom;
    }

    /**
     * Define el valor de la propiedad degreesOfFreedom.
     * 
     */
    public void setDegreesOfFreedom(double value) {
        this.degreesOfFreedom = value;
    }

    /**
     * Obtiene el valor de la propiedad meanOfSquares.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanOfSquares() {
        return meanOfSquares;
    }

    /**
     * Define el valor de la propiedad meanOfSquares.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanOfSquares(Double value) {
        this.meanOfSquares = value;
    }

    /**
     * Obtiene el valor de la propiedad fValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFValue() {
        return fValue;
    }

    /**
     * Define el valor de la propiedad fValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFValue(Double value) {
        this.fValue = value;
    }

    /**
     * Obtiene el valor de la propiedad pValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPValue() {
        return pValue;
    }

    /**
     * Define el valor de la propiedad pValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPValue(Double value) {
        this.pValue = value;
    }

}
