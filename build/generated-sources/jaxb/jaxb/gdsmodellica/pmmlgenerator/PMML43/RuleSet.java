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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}RuleSelectionMethod" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ScoreDistribution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}Rule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="recordCount" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="nbCorrect" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="defaultScore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultConfidence" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
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
    "ruleSelectionMethod",
    "scoreDistribution",
    "rule"
})
@XmlRootElement(name = "RuleSet")
public class RuleSet {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "RuleSelectionMethod", required = true)
    protected List<RuleSelectionMethod> ruleSelectionMethod;
    @XmlElement(name = "ScoreDistribution")
    protected List<ScoreDistribution> scoreDistribution;
    @XmlElements({
        @XmlElement(name = "SimpleRule", type = SimpleRule.class),
        @XmlElement(name = "CompoundRule", type = CompoundRule.class)
    })
    protected List<Object> rule;
    @XmlAttribute(name = "recordCount")
    protected Double recordCount;
    @XmlAttribute(name = "nbCorrect")
    protected Double nbCorrect;
    @XmlAttribute(name = "defaultScore")
    protected String defaultScore;
    @XmlAttribute(name = "defaultConfidence")
    protected Double defaultConfidence;

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
     * Gets the value of the ruleSelectionMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleSelectionMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleSelectionMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleSelectionMethod }
     * 
     * 
     */
    public List<RuleSelectionMethod> getRuleSelectionMethod() {
        if (ruleSelectionMethod == null) {
            ruleSelectionMethod = new ArrayList<RuleSelectionMethod>();
        }
        return this.ruleSelectionMethod;
    }

    /**
     * Gets the value of the scoreDistribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreDistribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreDistribution }
     * 
     * 
     */
    public List<ScoreDistribution> getScoreDistribution() {
        if (scoreDistribution == null) {
            scoreDistribution = new ArrayList<ScoreDistribution>();
        }
        return this.scoreDistribution;
    }

    /**
     * Gets the value of the rule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleRule }
     * {@link CompoundRule }
     * 
     * 
     */
    public List<Object> getRule() {
        if (rule == null) {
            rule = new ArrayList<Object>();
        }
        return this.rule;
    }

    /**
     * Obtiene el valor de la propiedad recordCount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecordCount() {
        return recordCount;
    }

    /**
     * Define el valor de la propiedad recordCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecordCount(Double value) {
        this.recordCount = value;
    }

    /**
     * Obtiene el valor de la propiedad nbCorrect.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNbCorrect() {
        return nbCorrect;
    }

    /**
     * Define el valor de la propiedad nbCorrect.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNbCorrect(Double value) {
        this.nbCorrect = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultScore() {
        return defaultScore;
    }

    /**
     * Define el valor de la propiedad defaultScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultScore(String value) {
        this.defaultScore = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultConfidence.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultConfidence() {
        return defaultConfidence;
    }

    /**
     * Define el valor de la propiedad defaultConfidence.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultConfidence(Double value) {
        this.defaultConfidence = value;
    }

}
