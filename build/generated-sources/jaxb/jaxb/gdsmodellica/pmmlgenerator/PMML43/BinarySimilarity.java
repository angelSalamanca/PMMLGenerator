//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:29 PM CEST 
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
 *       &lt;attribute name="c00-parameter" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="c01-parameter" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="c10-parameter" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="c11-parameter" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="d00-parameter" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="d01-parameter" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="d10-parameter" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="d11-parameter" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
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
@XmlRootElement(name = "binarySimilarity")
public class BinarySimilarity {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "c00-parameter", required = true)
    protected double c00Parameter;
    @XmlAttribute(name = "c01-parameter", required = true)
    protected double c01Parameter;
    @XmlAttribute(name = "c10-parameter", required = true)
    protected double c10Parameter;
    @XmlAttribute(name = "c11-parameter", required = true)
    protected double c11Parameter;
    @XmlAttribute(name = "d00-parameter", required = true)
    protected double d00Parameter;
    @XmlAttribute(name = "d01-parameter", required = true)
    protected double d01Parameter;
    @XmlAttribute(name = "d10-parameter", required = true)
    protected double d10Parameter;
    @XmlAttribute(name = "d11-parameter", required = true)
    protected double d11Parameter;

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
     * Obtiene el valor de la propiedad c00Parameter.
     * 
     */
    public double getC00Parameter() {
        return c00Parameter;
    }

    /**
     * Define el valor de la propiedad c00Parameter.
     * 
     */
    public void setC00Parameter(double value) {
        this.c00Parameter = value;
    }

    /**
     * Obtiene el valor de la propiedad c01Parameter.
     * 
     */
    public double getC01Parameter() {
        return c01Parameter;
    }

    /**
     * Define el valor de la propiedad c01Parameter.
     * 
     */
    public void setC01Parameter(double value) {
        this.c01Parameter = value;
    }

    /**
     * Obtiene el valor de la propiedad c10Parameter.
     * 
     */
    public double getC10Parameter() {
        return c10Parameter;
    }

    /**
     * Define el valor de la propiedad c10Parameter.
     * 
     */
    public void setC10Parameter(double value) {
        this.c10Parameter = value;
    }

    /**
     * Obtiene el valor de la propiedad c11Parameter.
     * 
     */
    public double getC11Parameter() {
        return c11Parameter;
    }

    /**
     * Define el valor de la propiedad c11Parameter.
     * 
     */
    public void setC11Parameter(double value) {
        this.c11Parameter = value;
    }

    /**
     * Obtiene el valor de la propiedad d00Parameter.
     * 
     */
    public double getD00Parameter() {
        return d00Parameter;
    }

    /**
     * Define el valor de la propiedad d00Parameter.
     * 
     */
    public void setD00Parameter(double value) {
        this.d00Parameter = value;
    }

    /**
     * Obtiene el valor de la propiedad d01Parameter.
     * 
     */
    public double getD01Parameter() {
        return d01Parameter;
    }

    /**
     * Define el valor de la propiedad d01Parameter.
     * 
     */
    public void setD01Parameter(double value) {
        this.d01Parameter = value;
    }

    /**
     * Obtiene el valor de la propiedad d10Parameter.
     * 
     */
    public double getD10Parameter() {
        return d10Parameter;
    }

    /**
     * Define el valor de la propiedad d10Parameter.
     * 
     */
    public void setD10Parameter(double value) {
        this.d10Parameter = value;
    }

    /**
     * Obtiene el valor de la propiedad d11Parameter.
     * 
     */
    public double getD11Parameter() {
        return d11Parameter;
    }

    /**
     * Define el valor de la propiedad d11Parameter.
     * 
     */
    public void setD11Parameter(double value) {
        this.d11Parameter = value;
    }

}
