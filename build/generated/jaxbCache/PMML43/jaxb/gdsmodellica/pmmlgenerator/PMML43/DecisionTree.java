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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Output" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelStats" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Targets" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ResultField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Node"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_3}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="missingValueStrategy" type="{http://www.dmg.org/PMML-4_3}MISSING-VALUE-STRATEGY" default="none" />
 *       &lt;attribute name="missingValuePenalty" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" default="1.0" />
 *       &lt;attribute name="noTrueChildStrategy" type="{http://www.dmg.org/PMML-4_3}NO-TRUE-CHILD-STRATEGY" default="returnNullPrediction" />
 *       &lt;attribute name="splitCharacteristic" default="multiSplit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="binarySplit"/>
 *             &lt;enumeration value="multiSplit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "output",
    "modelStats",
    "targets",
    "localTransformations",
    "resultField",
    "node"
})
@XmlRootElement(name = "DecisionTree")
public class DecisionTree {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "Output")
    protected Output output;
    @XmlElement(name = "ModelStats")
    protected ModelStats modelStats;
    @XmlElement(name = "Targets")
    protected Targets targets;
    @XmlElement(name = "LocalTransformations")
    protected LocalTransformations localTransformations;
    @XmlElement(name = "ResultField")
    protected List<ResultField> resultField;
    @XmlElement(name = "Node", required = true)
    protected Node node;
    @XmlAttribute(name = "modelName")
    protected String modelName;
    @XmlAttribute(name = "functionName", required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute(name = "algorithmName")
    protected String algorithmName;
    @XmlAttribute(name = "missingValueStrategy")
    protected MISSINGVALUESTRATEGY missingValueStrategy;
    @XmlAttribute(name = "missingValuePenalty")
    protected Double missingValuePenalty;
    @XmlAttribute(name = "noTrueChildStrategy")
    protected NOTRUECHILDSTRATEGY noTrueChildStrategy;
    @XmlAttribute(name = "splitCharacteristic")
    protected String splitCharacteristic;

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
     * Obtiene el valor de la propiedad output.
     * 
     * @return
     *     possible object is
     *     {@link Output }
     *     
     */
    public Output getOutput() {
        return output;
    }

    /**
     * Define el valor de la propiedad output.
     * 
     * @param value
     *     allowed object is
     *     {@link Output }
     *     
     */
    public void setOutput(Output value) {
        this.output = value;
    }

    /**
     * Obtiene el valor de la propiedad modelStats.
     * 
     * @return
     *     possible object is
     *     {@link ModelStats }
     *     
     */
    public ModelStats getModelStats() {
        return modelStats;
    }

    /**
     * Define el valor de la propiedad modelStats.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelStats }
     *     
     */
    public void setModelStats(ModelStats value) {
        this.modelStats = value;
    }

    /**
     * Obtiene el valor de la propiedad targets.
     * 
     * @return
     *     possible object is
     *     {@link Targets }
     *     
     */
    public Targets getTargets() {
        return targets;
    }

    /**
     * Define el valor de la propiedad targets.
     * 
     * @param value
     *     allowed object is
     *     {@link Targets }
     *     
     */
    public void setTargets(Targets value) {
        this.targets = value;
    }

    /**
     * Obtiene el valor de la propiedad localTransformations.
     * 
     * @return
     *     possible object is
     *     {@link LocalTransformations }
     *     
     */
    public LocalTransformations getLocalTransformations() {
        return localTransformations;
    }

    /**
     * Define el valor de la propiedad localTransformations.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTransformations }
     *     
     */
    public void setLocalTransformations(LocalTransformations value) {
        this.localTransformations = value;
    }

    /**
     * Gets the value of the resultField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultField }
     * 
     * 
     */
    public List<ResultField> getResultField() {
        if (resultField == null) {
            resultField = new ArrayList<ResultField>();
        }
        return this.resultField;
    }

    /**
     * Obtiene el valor de la propiedad node.
     * 
     * @return
     *     possible object is
     *     {@link Node }
     *     
     */
    public Node getNode() {
        return node;
    }

    /**
     * Define el valor de la propiedad node.
     * 
     * @param value
     *     allowed object is
     *     {@link Node }
     *     
     */
    public void setNode(Node value) {
        this.node = value;
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
     * Obtiene el valor de la propiedad missingValueStrategy.
     * 
     * @return
     *     possible object is
     *     {@link MISSINGVALUESTRATEGY }
     *     
     */
    public MISSINGVALUESTRATEGY getMissingValueStrategy() {
        if (missingValueStrategy == null) {
            return MISSINGVALUESTRATEGY.NONE;
        } else {
            return missingValueStrategy;
        }
    }

    /**
     * Define el valor de la propiedad missingValueStrategy.
     * 
     * @param value
     *     allowed object is
     *     {@link MISSINGVALUESTRATEGY }
     *     
     */
    public void setMissingValueStrategy(MISSINGVALUESTRATEGY value) {
        this.missingValueStrategy = value;
    }

    /**
     * Obtiene el valor de la propiedad missingValuePenalty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMissingValuePenalty() {
        if (missingValuePenalty == null) {
            return  1.0D;
        } else {
            return missingValuePenalty;
        }
    }

    /**
     * Define el valor de la propiedad missingValuePenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMissingValuePenalty(Double value) {
        this.missingValuePenalty = value;
    }

    /**
     * Obtiene el valor de la propiedad noTrueChildStrategy.
     * 
     * @return
     *     possible object is
     *     {@link NOTRUECHILDSTRATEGY }
     *     
     */
    public NOTRUECHILDSTRATEGY getNoTrueChildStrategy() {
        if (noTrueChildStrategy == null) {
            return NOTRUECHILDSTRATEGY.RETURN_NULL_PREDICTION;
        } else {
            return noTrueChildStrategy;
        }
    }

    /**
     * Define el valor de la propiedad noTrueChildStrategy.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTRUECHILDSTRATEGY }
     *     
     */
    public void setNoTrueChildStrategy(NOTRUECHILDSTRATEGY value) {
        this.noTrueChildStrategy = value;
    }

    /**
     * Obtiene el valor de la propiedad splitCharacteristic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitCharacteristic() {
        if (splitCharacteristic == null) {
            return "multiSplit";
        } else {
            return splitCharacteristic;
        }
    }

    /**
     * Define el valor de la propiedad splitCharacteristic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitCharacteristic(String value) {
        this.splitCharacteristic = value;
    }

}
