//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.06 a las 10:07:19 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

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
 *       &lt;attribute name="field" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}double" default="1E-6" />
 *       &lt;attribute name="zeroThreshold" type="{http://www.w3.org/2001/XMLSchema}double" default="1E-16" />
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
@XmlRootElement(name = "VerificationField")
public class VerificationField {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "field", required = true)
    protected String field;
    @XmlAttribute(name = "column")
    protected String column;
    @XmlAttribute(name = "precision")
    protected Double precision;
    @XmlAttribute(name = "zeroThreshold")
    protected Double zeroThreshold;

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
     * Obtiene el valor de la propiedad column.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn() {
        return column;
    }

    /**
     * Define el valor de la propiedad column.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn(String value) {
        this.column = value;
    }

    /**
     * Obtiene el valor de la propiedad precision.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getPrecision() {
        if (precision == null) {
            return  1.0E-6D;
        } else {
            return precision;
        }
    }

    /**
     * Define el valor de la propiedad precision.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrecision(Double value) {
        this.precision = value;
    }

    /**
     * Obtiene el valor de la propiedad zeroThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getZeroThreshold() {
        if (zeroThreshold == null) {
            return  1.0E-16D;
        } else {
            return zeroThreshold;
        }
    }

    /**
     * Define el valor de la propiedad zeroThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZeroThreshold(Double value) {
        this.zeroThreshold = value;
    }

}
