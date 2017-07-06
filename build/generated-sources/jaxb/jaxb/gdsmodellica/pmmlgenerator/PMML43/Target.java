//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.06 a las 10:07:22 PM CEST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TargetValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="field" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="optype" type="{http://www.dmg.org/PMML-4_3}OPTYPE" />
 *       &lt;attribute name="castInteger">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="round"/>
 *             &lt;enumeration value="ceiling"/>
 *             &lt;enumeration value="floor"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="rescaleConstant" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="rescaleFactor" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "targetValue"
})
@XmlRootElement(name = "Target")
public class Target {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "TargetValue")
    protected List<TargetValue> targetValue;
    @XmlAttribute(name = "field")
    protected String field;
    @XmlAttribute(name = "optype")
    protected OPTYPE optype;
    @XmlAttribute(name = "castInteger")
    protected String castInteger;
    @XmlAttribute(name = "min")
    protected Double min;
    @XmlAttribute(name = "max")
    protected Double max;
    @XmlAttribute(name = "rescaleConstant")
    protected Double rescaleConstant;
    @XmlAttribute(name = "rescaleFactor")
    protected Double rescaleFactor;

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
     * Gets the value of the targetValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetValue }
     * 
     * 
     */
    public List<TargetValue> getTargetValue() {
        if (targetValue == null) {
            targetValue = new ArrayList<TargetValue>();
        }
        return this.targetValue;
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
     * Obtiene el valor de la propiedad castInteger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCastInteger() {
        return castInteger;
    }

    /**
     * Define el valor de la propiedad castInteger.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCastInteger(String value) {
        this.castInteger = value;
    }

    /**
     * Obtiene el valor de la propiedad min.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMin() {
        return min;
    }

    /**
     * Define el valor de la propiedad min.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMin(Double value) {
        this.min = value;
    }

    /**
     * Obtiene el valor de la propiedad max.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMax() {
        return max;
    }

    /**
     * Define el valor de la propiedad max.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMax(Double value) {
        this.max = value;
    }

    /**
     * Obtiene el valor de la propiedad rescaleConstant.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getRescaleConstant() {
        if (rescaleConstant == null) {
            return  0.0D;
        } else {
            return rescaleConstant;
        }
    }

    /**
     * Define el valor de la propiedad rescaleConstant.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRescaleConstant(Double value) {
        this.rescaleConstant = value;
    }

    /**
     * Obtiene el valor de la propiedad rescaleFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getRescaleFactor() {
        if (rescaleFactor == null) {
            return  1.0D;
        } else {
            return rescaleFactor;
        }
    }

    /**
     * Define el valor de la propiedad rescaleFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRescaleFactor(Double value) {
        this.rescaleFactor = value;
    }

}
