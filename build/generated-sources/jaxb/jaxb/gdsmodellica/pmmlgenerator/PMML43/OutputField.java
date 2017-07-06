//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.06 a las 10:07:22 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}Decisions" minOccurs="0"/>
 *           &lt;group ref="{http://www.dmg.org/PMML-4_3}EXPRESSION"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="optype" type="{http://www.dmg.org/PMML-4_3}OPTYPE" />
 *       &lt;attribute name="dataType" use="required" type="{http://www.dmg.org/PMML-4_3}DATATYPE" />
 *       &lt;attribute name="targetField" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="feature" type="{http://www.dmg.org/PMML-4_3}RESULT-FEATURE" default="predictedValue" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ruleFeature" type="{http://www.dmg.org/PMML-4_3}RULE-FEATURE" default="consequent" />
 *       &lt;attribute name="algorithm" default="exclusiveRecommendation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="recommendation"/>
 *             &lt;enumeration value="exclusiveRecommendation"/>
 *             &lt;enumeration value="ruleAssociation"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rank" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" default="1" />
 *       &lt;attribute name="rankBasis" default="confidence">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="confidence"/>
 *             &lt;enumeration value="support"/>
 *             &lt;enumeration value="lift"/>
 *             &lt;enumeration value="leverage"/>
 *             &lt;enumeration value="affinity"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rankOrder" default="descending">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="descending"/>
 *             &lt;enumeration value="ascending"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isMultiValued" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="0" />
 *       &lt;attribute name="segmentId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isFinalResult" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
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
    "decisions",
    "constant",
    "fieldRef",
    "normContinuous",
    "normDiscrete",
    "discretize",
    "mapValues",
    "textIndex",
    "apply",
    "aggregate",
    "lag"
})
@XmlRootElement(name = "OutputField")
public class OutputField {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "Decisions")
    protected Decisions decisions;
    @XmlElement(name = "Constant")
    protected Constant constant;
    @XmlElement(name = "FieldRef")
    protected FieldRef fieldRef;
    @XmlElement(name = "NormContinuous")
    protected NormContinuous normContinuous;
    @XmlElement(name = "NormDiscrete")
    protected NormDiscrete normDiscrete;
    @XmlElement(name = "Discretize")
    protected Discretize discretize;
    @XmlElement(name = "MapValues")
    protected MapValues mapValues;
    @XmlElement(name = "TextIndex")
    protected TextIndex textIndex;
    @XmlElement(name = "Apply")
    protected Apply apply;
    @XmlElement(name = "Aggregate")
    protected Aggregate aggregate;
    @XmlElement(name = "Lag")
    protected Lag lag;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "optype")
    protected OPTYPE optype;
    @XmlAttribute(name = "dataType", required = true)
    protected DATATYPE dataType;
    @XmlAttribute(name = "targetField")
    protected String targetField;
    @XmlAttribute(name = "feature")
    protected RESULTFEATURE feature;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "ruleFeature")
    protected RULEFEATURE ruleFeature;
    @XmlAttribute(name = "algorithm")
    protected String algorithm;
    @XmlAttribute(name = "rank")
    protected BigInteger rank;
    @XmlAttribute(name = "rankBasis")
    protected String rankBasis;
    @XmlAttribute(name = "rankOrder")
    protected String rankOrder;
    @XmlAttribute(name = "isMultiValued")
    @XmlSchemaType(name = "anySimpleType")
    protected String isMultiValued;
    @XmlAttribute(name = "segmentId")
    protected String segmentId;
    @XmlAttribute(name = "isFinalResult")
    protected Boolean isFinalResult;

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
     * Obtiene el valor de la propiedad decisions.
     * 
     * @return
     *     possible object is
     *     {@link Decisions }
     *     
     */
    public Decisions getDecisions() {
        return decisions;
    }

    /**
     * Define el valor de la propiedad decisions.
     * 
     * @param value
     *     allowed object is
     *     {@link Decisions }
     *     
     */
    public void setDecisions(Decisions value) {
        this.decisions = value;
    }

    /**
     * Obtiene el valor de la propiedad constant.
     * 
     * @return
     *     possible object is
     *     {@link Constant }
     *     
     */
    public Constant getConstant() {
        return constant;
    }

    /**
     * Define el valor de la propiedad constant.
     * 
     * @param value
     *     allowed object is
     *     {@link Constant }
     *     
     */
    public void setConstant(Constant value) {
        this.constant = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldRef.
     * 
     * @return
     *     possible object is
     *     {@link FieldRef }
     *     
     */
    public FieldRef getFieldRef() {
        return fieldRef;
    }

    /**
     * Define el valor de la propiedad fieldRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldRef }
     *     
     */
    public void setFieldRef(FieldRef value) {
        this.fieldRef = value;
    }

    /**
     * Obtiene el valor de la propiedad normContinuous.
     * 
     * @return
     *     possible object is
     *     {@link NormContinuous }
     *     
     */
    public NormContinuous getNormContinuous() {
        return normContinuous;
    }

    /**
     * Define el valor de la propiedad normContinuous.
     * 
     * @param value
     *     allowed object is
     *     {@link NormContinuous }
     *     
     */
    public void setNormContinuous(NormContinuous value) {
        this.normContinuous = value;
    }

    /**
     * Obtiene el valor de la propiedad normDiscrete.
     * 
     * @return
     *     possible object is
     *     {@link NormDiscrete }
     *     
     */
    public NormDiscrete getNormDiscrete() {
        return normDiscrete;
    }

    /**
     * Define el valor de la propiedad normDiscrete.
     * 
     * @param value
     *     allowed object is
     *     {@link NormDiscrete }
     *     
     */
    public void setNormDiscrete(NormDiscrete value) {
        this.normDiscrete = value;
    }

    /**
     * Obtiene el valor de la propiedad discretize.
     * 
     * @return
     *     possible object is
     *     {@link Discretize }
     *     
     */
    public Discretize getDiscretize() {
        return discretize;
    }

    /**
     * Define el valor de la propiedad discretize.
     * 
     * @param value
     *     allowed object is
     *     {@link Discretize }
     *     
     */
    public void setDiscretize(Discretize value) {
        this.discretize = value;
    }

    /**
     * Obtiene el valor de la propiedad mapValues.
     * 
     * @return
     *     possible object is
     *     {@link MapValues }
     *     
     */
    public MapValues getMapValues() {
        return mapValues;
    }

    /**
     * Define el valor de la propiedad mapValues.
     * 
     * @param value
     *     allowed object is
     *     {@link MapValues }
     *     
     */
    public void setMapValues(MapValues value) {
        this.mapValues = value;
    }

    /**
     * Obtiene el valor de la propiedad textIndex.
     * 
     * @return
     *     possible object is
     *     {@link TextIndex }
     *     
     */
    public TextIndex getTextIndex() {
        return textIndex;
    }

    /**
     * Define el valor de la propiedad textIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link TextIndex }
     *     
     */
    public void setTextIndex(TextIndex value) {
        this.textIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad apply.
     * 
     * @return
     *     possible object is
     *     {@link Apply }
     *     
     */
    public Apply getApply() {
        return apply;
    }

    /**
     * Define el valor de la propiedad apply.
     * 
     * @param value
     *     allowed object is
     *     {@link Apply }
     *     
     */
    public void setApply(Apply value) {
        this.apply = value;
    }

    /**
     * Obtiene el valor de la propiedad aggregate.
     * 
     * @return
     *     possible object is
     *     {@link Aggregate }
     *     
     */
    public Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * Define el valor de la propiedad aggregate.
     * 
     * @param value
     *     allowed object is
     *     {@link Aggregate }
     *     
     */
    public void setAggregate(Aggregate value) {
        this.aggregate = value;
    }

    /**
     * Obtiene el valor de la propiedad lag.
     * 
     * @return
     *     possible object is
     *     {@link Lag }
     *     
     */
    public Lag getLag() {
        return lag;
    }

    /**
     * Define el valor de la propiedad lag.
     * 
     * @param value
     *     allowed object is
     *     {@link Lag }
     *     
     */
    public void setLag(Lag value) {
        this.lag = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad displayName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Define el valor de la propiedad displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Obtiene el valor de la propiedad optype.
     * 
     * @return
     *     possible object is
     *     {@link OPTYPE }
     *     
     */
    public OPTYPE getOptype() {
        return optype;
    }

    /**
     * Define el valor de la propiedad optype.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTYPE }
     *     
     */
    public void setOptype(OPTYPE value) {
        this.optype = value;
    }

    /**
     * Obtiene el valor de la propiedad dataType.
     * 
     * @return
     *     possible object is
     *     {@link DATATYPE }
     *     
     */
    public DATATYPE getDataType() {
        return dataType;
    }

    /**
     * Define el valor de la propiedad dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link DATATYPE }
     *     
     */
    public void setDataType(DATATYPE value) {
        this.dataType = value;
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
     * Obtiene el valor de la propiedad feature.
     * 
     * @return
     *     possible object is
     *     {@link RESULTFEATURE }
     *     
     */
    public RESULTFEATURE getFeature() {
        if (feature == null) {
            return RESULTFEATURE.PREDICTED_VALUE;
        } else {
            return feature;
        }
    }

    /**
     * Define el valor de la propiedad feature.
     * 
     * @param value
     *     allowed object is
     *     {@link RESULTFEATURE }
     *     
     */
    public void setFeature(RESULTFEATURE value) {
        this.feature = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad ruleFeature.
     * 
     * @return
     *     possible object is
     *     {@link RULEFEATURE }
     *     
     */
    public RULEFEATURE getRuleFeature() {
        if (ruleFeature == null) {
            return RULEFEATURE.CONSEQUENT;
        } else {
            return ruleFeature;
        }
    }

    /**
     * Define el valor de la propiedad ruleFeature.
     * 
     * @param value
     *     allowed object is
     *     {@link RULEFEATURE }
     *     
     */
    public void setRuleFeature(RULEFEATURE value) {
        this.ruleFeature = value;
    }

    /**
     * Obtiene el valor de la propiedad algorithm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        if (algorithm == null) {
            return "exclusiveRecommendation";
        } else {
            return algorithm;
        }
    }

    /**
     * Define el valor de la propiedad algorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Obtiene el valor de la propiedad rank.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRank() {
        if (rank == null) {
            return new BigInteger("1");
        } else {
            return rank;
        }
    }

    /**
     * Define el valor de la propiedad rank.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRank(BigInteger value) {
        this.rank = value;
    }

    /**
     * Obtiene el valor de la propiedad rankBasis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankBasis() {
        if (rankBasis == null) {
            return "confidence";
        } else {
            return rankBasis;
        }
    }

    /**
     * Define el valor de la propiedad rankBasis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankBasis(String value) {
        this.rankBasis = value;
    }

    /**
     * Obtiene el valor de la propiedad rankOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankOrder() {
        if (rankOrder == null) {
            return "descending";
        } else {
            return rankOrder;
        }
    }

    /**
     * Define el valor de la propiedad rankOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankOrder(String value) {
        this.rankOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad isMultiValued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultiValued() {
        if (isMultiValued == null) {
            return "0";
        } else {
            return isMultiValued;
        }
    }

    /**
     * Define el valor de la propiedad isMultiValued.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultiValued(String value) {
        this.isMultiValued = value;
    }

    /**
     * Obtiene el valor de la propiedad segmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Define el valor de la propiedad segmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

    /**
     * Obtiene el valor de la propiedad isFinalResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsFinalResult() {
        if (isFinalResult == null) {
            return true;
        } else {
            return isFinalResult;
        }
    }

    /**
     * Define el valor de la propiedad isFinalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFinalResult(Boolean value) {
        this.isFinalResult = value;
    }

}
