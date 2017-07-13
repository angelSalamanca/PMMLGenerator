//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Counts" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}NumericInfo" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_2}FrequenciesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="weighted" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "counts",
    "numericInfo",
    "numarray"
})
@XmlRootElement(name = "PartitionFieldStats")
public class PartitionFieldStats {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "Counts")
    protected Counts counts;
    @XmlElement(name = "NumericInfo")
    protected NumericInfo numericInfo;
    @XmlElement(name = "Array")
    protected List<ArrayType> numarray;
    @XmlAttribute(name = "field", required = true)
    protected String field;
    @XmlAttribute(name = "weighted")
    protected String weighted;

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
     * Obtiene el valor de la propiedad counts.
     * 
     * @return
     *     possible object is
     *     {@link Counts }
     *     
     */
    public Counts getCounts() {
        return counts;
    }

    /**
     * Define el valor de la propiedad counts.
     * 
     * @param value
     *     allowed object is
     *     {@link Counts }
     *     
     */
    public void setCounts(Counts value) {
        this.counts = value;
    }

    /**
     * Obtiene el valor de la propiedad numericInfo.
     * 
     * @return
     *     possible object is
     *     {@link NumericInfo }
     *     
     */
    public NumericInfo getNumericInfo() {
        return numericInfo;
    }

    /**
     * Define el valor de la propiedad numericInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericInfo }
     *     
     */
    public void setNumericInfo(NumericInfo value) {
        this.numericInfo = value;
    }

    /**
     * Gets the value of the numarray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numarray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNUMARRAY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNUMARRAY() {
        if (numarray == null) {
            numarray = new ArrayList<ArrayType>();
        }
        return this.numarray;
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
     * Obtiene el valor de la propiedad weighted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeighted() {
        if (weighted == null) {
            return "0";
        } else {
            return weighted;
        }
    }

    /**
     * Define el valor de la propiedad weighted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeighted(String value) {
        this.weighted = value;
    }

}
