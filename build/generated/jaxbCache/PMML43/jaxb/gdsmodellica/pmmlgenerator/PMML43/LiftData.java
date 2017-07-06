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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelLiftGraph"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}OptimumLiftGraph" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}RandomLiftGraph" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetFieldDisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rankingQuality" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
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
    "modelLiftGraph",
    "optimumLiftGraph",
    "randomLiftGraph"
})
@XmlRootElement(name = "LiftData")
public class LiftData {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "ModelLiftGraph", required = true)
    protected ModelLiftGraph modelLiftGraph;
    @XmlElement(name = "OptimumLiftGraph")
    protected OptimumLiftGraph optimumLiftGraph;
    @XmlElement(name = "RandomLiftGraph")
    protected RandomLiftGraph randomLiftGraph;
    @XmlAttribute(name = "targetFieldValue")
    protected String targetFieldValue;
    @XmlAttribute(name = "targetFieldDisplayValue")
    protected String targetFieldDisplayValue;
    @XmlAttribute(name = "rankingQuality")
    protected Double rankingQuality;

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
     * Obtiene el valor de la propiedad modelLiftGraph.
     * 
     * @return
     *     possible object is
     *     {@link ModelLiftGraph }
     *     
     */
    public ModelLiftGraph getModelLiftGraph() {
        return modelLiftGraph;
    }

    /**
     * Define el valor de la propiedad modelLiftGraph.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelLiftGraph }
     *     
     */
    public void setModelLiftGraph(ModelLiftGraph value) {
        this.modelLiftGraph = value;
    }

    /**
     * Obtiene el valor de la propiedad optimumLiftGraph.
     * 
     * @return
     *     possible object is
     *     {@link OptimumLiftGraph }
     *     
     */
    public OptimumLiftGraph getOptimumLiftGraph() {
        return optimumLiftGraph;
    }

    /**
     * Define el valor de la propiedad optimumLiftGraph.
     * 
     * @param value
     *     allowed object is
     *     {@link OptimumLiftGraph }
     *     
     */
    public void setOptimumLiftGraph(OptimumLiftGraph value) {
        this.optimumLiftGraph = value;
    }

    /**
     * Obtiene el valor de la propiedad randomLiftGraph.
     * 
     * @return
     *     possible object is
     *     {@link RandomLiftGraph }
     *     
     */
    public RandomLiftGraph getRandomLiftGraph() {
        return randomLiftGraph;
    }

    /**
     * Define el valor de la propiedad randomLiftGraph.
     * 
     * @param value
     *     allowed object is
     *     {@link RandomLiftGraph }
     *     
     */
    public void setRandomLiftGraph(RandomLiftGraph value) {
        this.randomLiftGraph = value;
    }

    /**
     * Obtiene el valor de la propiedad targetFieldValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFieldValue() {
        return targetFieldValue;
    }

    /**
     * Define el valor de la propiedad targetFieldValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFieldValue(String value) {
        this.targetFieldValue = value;
    }

    /**
     * Obtiene el valor de la propiedad targetFieldDisplayValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFieldDisplayValue() {
        return targetFieldDisplayValue;
    }

    /**
     * Define el valor de la propiedad targetFieldDisplayValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFieldDisplayValue(String value) {
        this.targetFieldDisplayValue = value;
    }

    /**
     * Obtiene el valor de la propiedad rankingQuality.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRankingQuality() {
        return rankingQuality;
    }

    /**
     * Define el valor de la propiedad rankingQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRankingQuality(Double value) {
        this.rankingQuality = value;
    }

}
