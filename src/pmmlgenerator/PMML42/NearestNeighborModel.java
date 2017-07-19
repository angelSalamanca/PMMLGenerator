//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package pmmlgenerator.PMML42;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}MiningSchema"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Output" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}ModelStats" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}ModelExplanation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Targets" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}TrainingInstances"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}ComparisonMeasure"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}KNNInputs"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_2}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfNeighbors" use="required" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="continuousScoringMethod" type="{http://www.dmg.org/PMML-4_2}CONT-SCORING-METHOD" default="average" />
 *       &lt;attribute name="categoricalScoringMethod" type="{http://www.dmg.org/PMML-4_2}CAT-SCORING-METHOD" default="majorityVote" />
 *       &lt;attribute name="instanceIdVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="threshold" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="0.001" />
 *       &lt;attribute name="isScorable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "NearestNeighborModel")
public class NearestNeighborModel {

    @XmlElementRefs({
        @XmlElementRef(name = "KNNInputs", namespace = "http://www.dmg.org/PMML-4_2", type = KNNInputs.class, required = false),
        @XmlElementRef(name = "MiningSchema", namespace = "http://www.dmg.org/PMML-4_2", type = MiningSchema.class, required = false),
        @XmlElementRef(name = "ModelExplanation", namespace = "http://www.dmg.org/PMML-4_2", type = ModelExplanation.class, required = false),
        @XmlElementRef(name = "TrainingInstances", namespace = "http://www.dmg.org/PMML-4_2", type = TrainingInstances.class, required = false),
        @XmlElementRef(name = "Output", namespace = "http://www.dmg.org/PMML-4_2", type = Output.class, required = false),
        @XmlElementRef(name = "ModelStats", namespace = "http://www.dmg.org/PMML-4_2", type = ModelStats.class, required = false),
        @XmlElementRef(name = "ModelVerification", namespace = "http://www.dmg.org/PMML-4_2", type = ModelVerification.class, required = false),
        @XmlElementRef(name = "Targets", namespace = "http://www.dmg.org/PMML-4_2", type = Targets.class, required = false),
        @XmlElementRef(name = "ComparisonMeasure", namespace = "http://www.dmg.org/PMML-4_2", type = ComparisonMeasure.class, required = false),
        @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_2", type = Extension.class, required = false),
        @XmlElementRef(name = "LocalTransformations", namespace = "http://www.dmg.org/PMML-4_2", type = LocalTransformations.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "modelName")
    protected String modelName;
    @XmlAttribute(name = "functionName", required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute(name = "algorithmName")
    protected String algorithmName;
    @XmlAttribute(name = "numberOfNeighbors", required = true)
    protected BigInteger numberOfNeighbors;
    @XmlAttribute(name = "continuousScoringMethod")
    protected CONTSCORINGMETHOD continuousScoringMethod;
    @XmlAttribute(name = "categoricalScoringMethod")
    protected CATSCORINGMETHOD categoricalScoringMethod;
    @XmlAttribute(name = "instanceIdVariable")
    protected String instanceIdVariable;
    @XmlAttribute(name = "threshold")
    protected Double threshold;
    @XmlAttribute(name = "isScorable")
    protected Boolean isScorable;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "Extension" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 733 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML42/pmml-4-2.mod..xsd
     * línea 722 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML42/pmml-4-2.mod..xsd
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KNNInputs }
     * {@link MiningSchema }
     * {@link ModelExplanation }
     * {@link TrainingInstances }
     * {@link Output }
     * {@link ModelStats }
     * {@link ModelVerification }
     * {@link Targets }
     * {@link ComparisonMeasure }
     * {@link Extension }
     * {@link LocalTransformations }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Obtiene el valor de la propiedad modelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Define el valor de la propiedad modelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Obtiene el valor de la propiedad functionName.
     * 
     * @return
     *     possible object is
     *     {@link MININGFUNCTION }
     *     
     */
    public MININGFUNCTION getFunctionName() {
        return functionName;
    }

    /**
     * Define el valor de la propiedad functionName.
     * 
     * @param value
     *     allowed object is
     *     {@link MININGFUNCTION }
     *     
     */
    public void setFunctionName(MININGFUNCTION value) {
        this.functionName = value;
    }

    /**
     * Obtiene el valor de la propiedad algorithmName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * Define el valor de la propiedad algorithmName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithmName(String value) {
        this.algorithmName = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfNeighbors.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfNeighbors() {
        return numberOfNeighbors;
    }

    /**
     * Define el valor de la propiedad numberOfNeighbors.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfNeighbors(BigInteger value) {
        this.numberOfNeighbors = value;
    }

    /**
     * Obtiene el valor de la propiedad continuousScoringMethod.
     * 
     * @return
     *     possible object is
     *     {@link CONTSCORINGMETHOD }
     *     
     */
    public CONTSCORINGMETHOD getContinuousScoringMethod() {
        if (continuousScoringMethod == null) {
            return CONTSCORINGMETHOD.AVERAGE;
        } else {
            return continuousScoringMethod;
        }
    }

    /**
     * Define el valor de la propiedad continuousScoringMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTSCORINGMETHOD }
     *     
     */
    public void setContinuousScoringMethod(CONTSCORINGMETHOD value) {
        this.continuousScoringMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad categoricalScoringMethod.
     * 
     * @return
     *     possible object is
     *     {@link CATSCORINGMETHOD }
     *     
     */
    public CATSCORINGMETHOD getCategoricalScoringMethod() {
        if (categoricalScoringMethod == null) {
            return CATSCORINGMETHOD.MAJORITY_VOTE;
        } else {
            return categoricalScoringMethod;
        }
    }

    /**
     * Define el valor de la propiedad categoricalScoringMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link CATSCORINGMETHOD }
     *     
     */
    public void setCategoricalScoringMethod(CATSCORINGMETHOD value) {
        this.categoricalScoringMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad instanceIdVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceIdVariable() {
        return instanceIdVariable;
    }

    /**
     * Define el valor de la propiedad instanceIdVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceIdVariable(String value) {
        this.instanceIdVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad threshold.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getThreshold() {
        if (threshold == null) {
            return  0.001D;
        } else {
            return threshold;
        }
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

    /**
     * Obtiene el valor de la propiedad isScorable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsScorable() {
        if (isScorable == null) {
            return true;
        } else {
            return isScorable;
        }
    }

    /**
     * Define el valor de la propiedad isScorable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsScorable(Boolean value) {
        this.isScorable = value;
    }

}
