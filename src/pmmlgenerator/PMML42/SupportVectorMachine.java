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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}SupportVectors" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Coefficients"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="alternateTargetCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="threshold" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
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
    "supportVectors",
    "coefficients"
})
@XmlRootElement(name = "SupportVectorMachine")
public class SupportVectorMachine {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "SupportVectors")
    protected SupportVectors supportVectors;
    @XmlElement(name = "Coefficients", required = true)
    protected Coefficients coefficients;
    @XmlAttribute(name = "targetCategory")
    protected String targetCategory;
    @XmlAttribute(name = "alternateTargetCategory")
    protected String alternateTargetCategory;
    @XmlAttribute(name = "threshold")
    protected Double threshold;

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
     * Obtiene el valor de la propiedad supportVectors.
     * 
     * @return
     *     possible object is
     *     {@link SupportVectors }
     *     
     */
    public SupportVectors getSupportVectors() {
        if (this.supportVectors == null)
        {
            this.supportVectors = new SupportVectors();
        }
        return supportVectors;
    }

    /**
     * Define el valor de la propiedad supportVectors.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportVectors }
     *     
     */
    public void setSupportVectors(SupportVectors value) {
        this.supportVectors = value;
    }

    /**
     * Obtiene el valor de la propiedad coefficients.
     * 
     * @return
     *     possible object is
     *     {@link Coefficients }
     *     
     */
    public Coefficients getCoefficients() {
          if (this.coefficients == null)
        {
            this.coefficients = new Coefficients();
        }
        return coefficients;
    }

    /**
     * Define el valor de la propiedad coefficients.
     * 
     * @param value
     *     allowed object is
     *     {@link Coefficients }
     *     
     */
    public void setCoefficients(Coefficients value) {
        this.coefficients = value;
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
     * Obtiene el valor de la propiedad alternateTargetCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTargetCategory() {
        return alternateTargetCategory;
    }

    /**
     * Define el valor de la propiedad alternateTargetCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTargetCategory(String value) {
        this.alternateTargetCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad threshold.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * Define el valor de la propiedad threshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreshold(Double value) {
        this.threshold = value;
    }

}
