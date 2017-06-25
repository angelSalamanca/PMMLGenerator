//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:24 AM CEST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ConfusionMatrix" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}LiftData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ROC" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetField" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataUsage" default="training">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="training"/>
 *             &lt;enumeration value="test"/>
 *             &lt;enumeration value="validation"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="meanError" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="meanAbsoluteError" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="meanSquaredError" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="rootMeanSquaredError" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="r-squared" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="adj-r-squared" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="sumSquaredError" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="sumSquaredRegression" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="numOfRecords" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="numOfRecordsWeighted" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="numOfPredictors" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="degreesOfFreedom" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="fStatistic" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="AIC" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="BIC" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="AICc" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
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
    "confusionMatrix",
    "liftData",
    "roc"
})
@XmlRootElement(name = "PredictiveModelQuality")
public class PredictiveModelQuality {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "ConfusionMatrix")
    protected ConfusionMatrix confusionMatrix;
    @XmlElement(name = "LiftData")
    protected List<LiftData> liftData;
    @XmlElement(name = "ROC")
    protected ROC roc;
    @XmlAttribute(name = "targetField", required = true)
    protected String targetField;
    @XmlAttribute(name = "dataName")
    protected String dataName;
    @XmlAttribute(name = "dataUsage")
    protected String dataUsage;
    @XmlAttribute(name = "meanError")
    protected Double meanError;
    @XmlAttribute(name = "meanAbsoluteError")
    protected Double meanAbsoluteError;
    @XmlAttribute(name = "meanSquaredError")
    protected Double meanSquaredError;
    @XmlAttribute(name = "rootMeanSquaredError")
    protected Double rootMeanSquaredError;
    @XmlAttribute(name = "r-squared")
    protected Double rSquared;
    @XmlAttribute(name = "adj-r-squared")
    protected Double adjRSquared;
    @XmlAttribute(name = "sumSquaredError")
    protected Double sumSquaredError;
    @XmlAttribute(name = "sumSquaredRegression")
    protected Double sumSquaredRegression;
    @XmlAttribute(name = "numOfRecords")
    protected Double numOfRecords;
    @XmlAttribute(name = "numOfRecordsWeighted")
    protected Double numOfRecordsWeighted;
    @XmlAttribute(name = "numOfPredictors")
    protected Double numOfPredictors;
    @XmlAttribute(name = "degreesOfFreedom")
    protected Double degreesOfFreedom;
    @XmlAttribute(name = "fStatistic")
    protected Double fStatistic;
    @XmlAttribute(name = "AIC")
    protected Double aic;
    @XmlAttribute(name = "BIC")
    protected Double bic;
    @XmlAttribute(name = "AICc")
    protected Double aiCc;

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
     * Obtiene el valor de la propiedad confusionMatrix.
     * 
     * @return
     *     possible object is
     *     {@link ConfusionMatrix }
     *     
     */
    public ConfusionMatrix getConfusionMatrix() {
        return confusionMatrix;
    }

    /**
     * Define el valor de la propiedad confusionMatrix.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfusionMatrix }
     *     
     */
    public void setConfusionMatrix(ConfusionMatrix value) {
        this.confusionMatrix = value;
    }

    /**
     * Gets the value of the liftData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liftData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiftData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiftData }
     * 
     * 
     */
    public List<LiftData> getLiftData() {
        if (liftData == null) {
            liftData = new ArrayList<LiftData>();
        }
        return this.liftData;
    }

    /**
     * Obtiene el valor de la propiedad roc.
     * 
     * @return
     *     possible object is
     *     {@link ROC }
     *     
     */
    public ROC getROC() {
        return roc;
    }

    /**
     * Define el valor de la propiedad roc.
     * 
     * @param value
     *     allowed object is
     *     {@link ROC }
     *     
     */
    public void setROC(ROC value) {
        this.roc = value;
    }

    /**
     * Obtiene el valor de la propiedad targetField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetField() {
        return targetField;
    }

    /**
     * Define el valor de la propiedad targetField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetField(String value) {
        this.targetField = value;
    }

    /**
     * Obtiene el valor de la propiedad dataName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * Define el valor de la propiedad dataName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataName(String value) {
        this.dataName = value;
    }

    /**
     * Obtiene el valor de la propiedad dataUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUsage() {
        if (dataUsage == null) {
            return "training";
        } else {
            return dataUsage;
        }
    }

    /**
     * Define el valor de la propiedad dataUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUsage(String value) {
        this.dataUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad meanError.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanError() {
        return meanError;
    }

    /**
     * Define el valor de la propiedad meanError.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanError(Double value) {
        this.meanError = value;
    }

    /**
     * Obtiene el valor de la propiedad meanAbsoluteError.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanAbsoluteError() {
        return meanAbsoluteError;
    }

    /**
     * Define el valor de la propiedad meanAbsoluteError.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanAbsoluteError(Double value) {
        this.meanAbsoluteError = value;
    }

    /**
     * Obtiene el valor de la propiedad meanSquaredError.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanSquaredError() {
        return meanSquaredError;
    }

    /**
     * Define el valor de la propiedad meanSquaredError.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanSquaredError(Double value) {
        this.meanSquaredError = value;
    }

    /**
     * Obtiene el valor de la propiedad rootMeanSquaredError.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRootMeanSquaredError() {
        return rootMeanSquaredError;
    }

    /**
     * Define el valor de la propiedad rootMeanSquaredError.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRootMeanSquaredError(Double value) {
        this.rootMeanSquaredError = value;
    }

    /**
     * Obtiene el valor de la propiedad rSquared.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRSquared() {
        return rSquared;
    }

    /**
     * Define el valor de la propiedad rSquared.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRSquared(Double value) {
        this.rSquared = value;
    }

    /**
     * Obtiene el valor de la propiedad adjRSquared.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjRSquared() {
        return adjRSquared;
    }

    /**
     * Define el valor de la propiedad adjRSquared.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjRSquared(Double value) {
        this.adjRSquared = value;
    }

    /**
     * Obtiene el valor de la propiedad sumSquaredError.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSumSquaredError() {
        return sumSquaredError;
    }

    /**
     * Define el valor de la propiedad sumSquaredError.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSumSquaredError(Double value) {
        this.sumSquaredError = value;
    }

    /**
     * Obtiene el valor de la propiedad sumSquaredRegression.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSumSquaredRegression() {
        return sumSquaredRegression;
    }

    /**
     * Define el valor de la propiedad sumSquaredRegression.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSumSquaredRegression(Double value) {
        this.sumSquaredRegression = value;
    }

    /**
     * Obtiene el valor de la propiedad numOfRecords.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumOfRecords() {
        return numOfRecords;
    }

    /**
     * Define el valor de la propiedad numOfRecords.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumOfRecords(Double value) {
        this.numOfRecords = value;
    }

    /**
     * Obtiene el valor de la propiedad numOfRecordsWeighted.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumOfRecordsWeighted() {
        return numOfRecordsWeighted;
    }

    /**
     * Define el valor de la propiedad numOfRecordsWeighted.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumOfRecordsWeighted(Double value) {
        this.numOfRecordsWeighted = value;
    }

    /**
     * Obtiene el valor de la propiedad numOfPredictors.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumOfPredictors() {
        return numOfPredictors;
    }

    /**
     * Define el valor de la propiedad numOfPredictors.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumOfPredictors(Double value) {
        this.numOfPredictors = value;
    }

    /**
     * Obtiene el valor de la propiedad degreesOfFreedom.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDegreesOfFreedom() {
        return degreesOfFreedom;
    }

    /**
     * Define el valor de la propiedad degreesOfFreedom.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDegreesOfFreedom(Double value) {
        this.degreesOfFreedom = value;
    }

    /**
     * Obtiene el valor de la propiedad fStatistic.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFStatistic() {
        return fStatistic;
    }

    /**
     * Define el valor de la propiedad fStatistic.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFStatistic(Double value) {
        this.fStatistic = value;
    }

    /**
     * Obtiene el valor de la propiedad aic.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAIC() {
        return aic;
    }

    /**
     * Define el valor de la propiedad aic.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAIC(Double value) {
        this.aic = value;
    }

    /**
     * Obtiene el valor de la propiedad bic.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBIC() {
        return bic;
    }

    /**
     * Define el valor de la propiedad bic.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBIC(Double value) {
        this.bic = value;
    }

    /**
     * Obtiene el valor de la propiedad aiCc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAICc() {
        return aiCc;
    }

    /**
     * Define el valor de la propiedad aiCc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAICc(Double value) {
        this.aiCc = value;
    }

}
