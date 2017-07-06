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
 *       &lt;attribute name="closure" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="openClosed"/>
 *             &lt;enumeration value="openOpen"/>
 *             &lt;enumeration value="closedOpen"/>
 *             &lt;enumeration value="closedClosed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="leftMargin" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="rightMargin" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
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
@XmlRootElement(name = "Interval")
public class Interval {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "closure", required = true)
    protected String closure;
    @XmlAttribute(name = "leftMargin")
    protected Double leftMargin;
    @XmlAttribute(name = "rightMargin")
    protected Double rightMargin;

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
     * Obtiene el valor de la propiedad closure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosure() {
        return closure;
    }

    /**
     * Define el valor de la propiedad closure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosure(String value) {
        this.closure = value;
    }

    /**
     * Obtiene el valor de la propiedad leftMargin.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLeftMargin() {
        return leftMargin;
    }

    /**
     * Define el valor de la propiedad leftMargin.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLeftMargin(Double value) {
        this.leftMargin = value;
    }

    /**
     * Obtiene el valor de la propiedad rightMargin.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRightMargin() {
        return rightMargin;
    }

    /**
     * Define el valor de la propiedad rightMargin.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRightMargin(Double value) {
        this.rightMargin = value;
    }

}
