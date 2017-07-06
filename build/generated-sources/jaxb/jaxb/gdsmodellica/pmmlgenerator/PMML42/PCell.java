//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.06 a las 10:07:19 PM CEST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parameterName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="beta" use="required" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="df" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
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
@XmlRootElement(name = "PCell")
public class PCell {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "targetCategory")
    protected String targetCategory;
    @XmlAttribute(name = "parameterName", required = true)
    protected String parameterName;
    @XmlAttribute(name = "beta", required = true)
    protected double beta;
    @XmlAttribute(name = "df")
    protected BigInteger df;

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
     * Obtiene el valor de la propiedad targetCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCategory() {
        return targetCategory;
    }

    /**
     * Define el valor de la propiedad targetCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCategory(String value) {
        this.targetCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad parameterName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * Define el valor de la propiedad parameterName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterName(String value) {
        this.parameterName = value;
    }

    /**
     * Obtiene el valor de la propiedad beta.
     * 
     */
    public double getBeta() {
        return beta;
    }

    /**
     * Define el valor de la propiedad beta.
     * 
     */
    public void setBeta(double value) {
        this.beta = value;
    }

    /**
     * Obtiene el valor de la propiedad df.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDf() {
        return df;
    }

    /**
     * Define el valor de la propiedad df.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDf(BigInteger value) {
        this.df = value;
    }

}
