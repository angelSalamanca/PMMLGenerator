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
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gamma" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="1" />
 *       &lt;attribute name="coef0" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="1" />
 *       &lt;attribute name="degree" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="1" />
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
@XmlRootElement(name = "PolynomialKernelType")
public class PolynomialKernelType {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "gamma")
    protected Double gamma;
    @XmlAttribute(name = "coef0")
    protected Double coef0;
    @XmlAttribute(name = "degree")
    protected Double degree;

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
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad gamma.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getGamma() {
        if (gamma == null) {
            return  1.0D;
        } else {
            return gamma;
        }
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
     * Obtiene el valor de la propiedad coef0.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getCoef0() {
        if (coef0 == null) {
            return  1.0D;
        } else {
            return coef0;
        }
    }

    /**
     * Define el valor de la propiedad coef0.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoef0(Double value) {
        this.coef0 = value;
    }

    /**
     * Obtiene el valor de la propiedad degree.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDegree() {
        if (degree == null) {
            return  1.0D;
        } else {
            return degree;
        }
    }

    /**
     * Define el valor de la propiedad degree.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDegree(Double value) {
        this.degree = value;
    }

}
