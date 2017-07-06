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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}NumericPredictor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}CategoricalPredictor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}PredictorTerm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="intercept" use="required" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="targetCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "numericPredictor",
    "categoricalPredictor",
    "predictorTerm"
})
@XmlRootElement(name = "RegressionTable")
public class RegressionTable {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "NumericPredictor")
    protected List<NumericPredictor> numericPredictor;
    @XmlElement(name = "CategoricalPredictor")
    protected List<CategoricalPredictor> categoricalPredictor;
    @XmlElement(name = "PredictorTerm")
    protected List<PredictorTerm> predictorTerm;
    @XmlAttribute(name = "intercept", required = true)
    protected double intercept;
    @XmlAttribute(name = "targetCategory")
    protected String targetCategory;

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
     * Gets the value of the numericPredictor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numericPredictor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumericPredictor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumericPredictor }
     * 
     * 
     */
    public List<NumericPredictor> getNumericPredictor() {
        if (numericPredictor == null) {
            numericPredictor = new ArrayList<NumericPredictor>();
        }
        return this.numericPredictor;
    }

    /**
     * Gets the value of the categoricalPredictor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoricalPredictor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoricalPredictor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoricalPredictor }
     * 
     * 
     */
    public List<CategoricalPredictor> getCategoricalPredictor() {
        if (categoricalPredictor == null) {
            categoricalPredictor = new ArrayList<CategoricalPredictor>();
        }
        return this.categoricalPredictor;
    }

    /**
     * Gets the value of the predictorTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictorTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictorTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredictorTerm }
     * 
     * 
     */
    public List<PredictorTerm> getPredictorTerm() {
        if (predictorTerm == null) {
            predictorTerm = new ArrayList<PredictorTerm>();
        }
        return this.predictorTerm;
    }

    /**
     * Obtiene el valor de la propiedad intercept.
     * 
     */
    public double getIntercept() {
        return intercept;
    }

    /**
     * Define el valor de la propiedad intercept.
     * 
     */
    public void setIntercept(double value) {
        this.intercept = value;
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

}
