//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package pmmlgenerator.PMML42;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Quantile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="minimum" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="maximum" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="mean" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="standardDeviation" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="median" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="interQuartileRange" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
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
    "quantile"
})
@XmlRootElement(name = "NumericInfo")
public class NumericInfo {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "Quantile")
    protected List<Quantile> quantile;
    @XmlAttribute(name = "minimum")
    protected Double minimum;
    @XmlAttribute(name = "maximum")
    protected Double maximum;
    @XmlAttribute(name = "mean")
    protected Double mean;
    @XmlAttribute(name = "standardDeviation")
    protected Double standardDeviation;
    @XmlAttribute(name = "median")
    protected Double median;
    @XmlAttribute(name = "interQuartileRange")
    protected Double interQuartileRange;

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
     * Gets the value of the quantile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quantile }
     * 
     * 
     */
    public List<Quantile> getQuantile() {
        if (quantile == null) {
            quantile = new ArrayList<Quantile>();
        }
        return this.quantile;
    }

    /**
     * Obtiene el valor de la propiedad minimum.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * Define el valor de la propiedad minimum.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimum(Double value) {
        this.minimum = value;
    }

    /**
     * Obtiene el valor de la propiedad maximum.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximum() {
        return maximum;
    }

    /**
     * Define el valor de la propiedad maximum.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximum(Double value) {
        this.maximum = value;
    }

    /**
     * Obtiene el valor de la propiedad mean.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMean() {
        return mean;
    }

    /**
     * Define el valor de la propiedad mean.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMean(Double value) {
        this.mean = value;
    }

    /**
     * Obtiene el valor de la propiedad standardDeviation.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Define el valor de la propiedad standardDeviation.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStandardDeviation(Double value) {
        this.standardDeviation = value;
    }

    /**
     * Obtiene el valor de la propiedad median.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMedian() {
        return median;
    }

    /**
     * Define el valor de la propiedad median.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMedian(Double value) {
        this.median = value;
    }

    /**
     * Obtiene el valor de la propiedad interQuartileRange.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInterQuartileRange() {
        return interQuartileRange;
    }

    /**
     * Define el valor de la propiedad interQuartileRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInterQuartileRange(Double value) {
        this.interQuartileRange = value;
    }

}
