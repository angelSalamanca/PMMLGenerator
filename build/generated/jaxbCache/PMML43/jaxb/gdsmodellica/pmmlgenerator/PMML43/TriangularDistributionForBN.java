//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.07.19 a las 09:57:14 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Mean"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Lower"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Upper"/>
 *       &lt;/sequence>
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
    "mean",
    "lower",
    "upper"
})
@XmlRootElement(name = "TriangularDistributionForBN")
public class TriangularDistributionForBN {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "Mean", required = true)
    protected Mean mean;
    @XmlElement(name = "Lower", required = true)
    protected Lower lower;
    @XmlElement(name = "Upper", required = true)
    protected Upper upper;

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
     * Obtiene el valor de la propiedad mean.
     * 
     * @return
     *     possible object is
     *     {@link Mean }
     *     
     */
    public Mean getMean() {
        return mean;
    }

    /**
     * Define el valor de la propiedad mean.
     * 
     * @param value
     *     allowed object is
     *     {@link Mean }
     *     
     */
    public void setMean(Mean value) {
        this.mean = value;
    }

    /**
     * Obtiene el valor de la propiedad lower.
     * 
     * @return
     *     possible object is
     *     {@link Lower }
     *     
     */
    public Lower getLower() {
        return lower;
    }

    /**
     * Define el valor de la propiedad lower.
     * 
     * @param value
     *     allowed object is
     *     {@link Lower }
     *     
     */
    public void setLower(Lower value) {
        this.lower = value;
    }

    /**
     * Obtiene el valor de la propiedad upper.
     * 
     * @return
     *     possible object is
     *     {@link Upper }
     *     
     */
    public Upper getUpper() {
        return upper;
    }

    /**
     * Define el valor de la propiedad upper.
     * 
     * @param value
     *     allowed object is
     *     {@link Upper }
     *     
     */
    public void setUpper(Upper value) {
        this.upper = value;
    }

}
