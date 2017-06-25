//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:21 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}ParameterList"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}FactorList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}CovariateList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}PPMatrix"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}PCovMatrix" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}ParamMatrix"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}EventValues" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}BaseCumHazardTables" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetVariableName" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="modelType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="regression"/>
 *             &lt;enumeration value="generalLinear"/>
 *             &lt;enumeration value="multinomialLogistic"/>
 *             &lt;enumeration value="ordinalMultinomial"/>
 *             &lt;enumeration value="generalizedLinear"/>
 *             &lt;enumeration value="CoxRegression"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_2}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetReferenceCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cumulativeLink" type="{http://www.dmg.org/PMML-4_2}CUMULATIVE-LINK-FUNCTION" />
 *       &lt;attribute name="linkFunction" type="{http://www.dmg.org/PMML-4_2}LINK-FUNCTION" />
 *       &lt;attribute name="linkParameter" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="trialsVariable" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="trialsValue" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="distribution">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="binomial"/>
 *             &lt;enumeration value="gamma"/>
 *             &lt;enumeration value="igauss"/>
 *             &lt;enumeration value="negbin"/>
 *             &lt;enumeration value="normal"/>
 *             &lt;enumeration value="poisson"/>
 *             &lt;enumeration value="tweedie"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="distParameter" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="offsetVariable" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="offsetValue" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="modelDF" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="endTimeVariable" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="startTimeVariable" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="subjectIDVariable" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="statusVariable" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="baselineStrataVariable" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
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
@XmlRootElement(name = "GeneralRegressionModel")
public class GeneralRegressionModel {

    @XmlElementRefs({
        @XmlElementRef(name = "ModelVerification", namespace = "http://www.dmg.org/PMML-4_2", type = ModelVerification.class, required = false),
        @XmlElementRef(name = "ModelExplanation", namespace = "http://www.dmg.org/PMML-4_2", type = ModelExplanation.class, required = false),
        @XmlElementRef(name = "FactorList", namespace = "http://www.dmg.org/PMML-4_2", type = FactorList.class, required = false),
        @XmlElementRef(name = "CovariateList", namespace = "http://www.dmg.org/PMML-4_2", type = CovariateList.class, required = false),
        @XmlElementRef(name = "BaseCumHazardTables", namespace = "http://www.dmg.org/PMML-4_2", type = BaseCumHazardTables.class, required = false),
        @XmlElementRef(name = "LocalTransformations", namespace = "http://www.dmg.org/PMML-4_2", type = LocalTransformations.class, required = false),
        @XmlElementRef(name = "MiningSchema", namespace = "http://www.dmg.org/PMML-4_2", type = MiningSchema.class, required = false),
        @XmlElementRef(name = "ParameterList", namespace = "http://www.dmg.org/PMML-4_2", type = ParameterList.class, required = false),
        @XmlElementRef(name = "EventValues", namespace = "http://www.dmg.org/PMML-4_2", type = EventValues.class, required = false),
        @XmlElementRef(name = "PCovMatrix", namespace = "http://www.dmg.org/PMML-4_2", type = PCovMatrix.class, required = false),
        @XmlElementRef(name = "ParamMatrix", namespace = "http://www.dmg.org/PMML-4_2", type = ParamMatrix.class, required = false),
        @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_2", type = Extension.class, required = false),
        @XmlElementRef(name = "Output", namespace = "http://www.dmg.org/PMML-4_2", type = Output.class, required = false),
        @XmlElementRef(name = "ModelStats", namespace = "http://www.dmg.org/PMML-4_2", type = ModelStats.class, required = false),
        @XmlElementRef(name = "Targets", namespace = "http://www.dmg.org/PMML-4_2", type = Targets.class, required = false),
        @XmlElementRef(name = "PPMatrix", namespace = "http://www.dmg.org/PMML-4_2", type = PPMatrix.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "targetVariableName")
    protected String targetVariableName;
    @XmlAttribute(name = "modelType", required = true)
    protected String modelType;
    @XmlAttribute(name = "modelName")
    protected String modelName;
    @XmlAttribute(name = "functionName", required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute(name = "algorithmName")
    protected String algorithmName;
    @XmlAttribute(name = "targetReferenceCategory")
    protected String targetReferenceCategory;
    @XmlAttribute(name = "cumulativeLink")
    protected CUMULATIVELINKFUNCTION cumulativeLink;
    @XmlAttribute(name = "linkFunction")
    protected LINKFUNCTION linkFunction;
    @XmlAttribute(name = "linkParameter")
    protected Double linkParameter;
    @XmlAttribute(name = "trialsVariable")
    protected String trialsVariable;
    @XmlAttribute(name = "trialsValue")
    protected BigInteger trialsValue;
    @XmlAttribute(name = "distribution")
    protected String distribution;
    @XmlAttribute(name = "distParameter")
    protected Double distParameter;
    @XmlAttribute(name = "offsetVariable")
    protected String offsetVariable;
    @XmlAttribute(name = "offsetValue")
    protected Double offsetValue;
    @XmlAttribute(name = "modelDF")
    protected Double modelDF;
    @XmlAttribute(name = "endTimeVariable")
    protected String endTimeVariable;
    @XmlAttribute(name = "startTimeVariable")
    protected String startTimeVariable;
    @XmlAttribute(name = "subjectIDVariable")
    protected String subjectIDVariable;
    @XmlAttribute(name = "statusVariable")
    protected String statusVariable;
    @XmlAttribute(name = "baselineStrataVariable")
    protected String baselineStrataVariable;
    @XmlAttribute(name = "isScorable")
    protected Boolean isScorable;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "Extension" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 1363 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML42/pmml-4-2.mod..xsd
     * línea 1347 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML42/pmml-4-2.mod..xsd
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
     * {@link ModelVerification }
     * {@link ModelExplanation }
     * {@link FactorList }
     * {@link CovariateList }
     * {@link BaseCumHazardTables }
     * {@link LocalTransformations }
     * {@link MiningSchema }
     * {@link ParameterList }
     * {@link EventValues }
     * {@link PCovMatrix }
     * {@link ParamMatrix }
     * {@link Extension }
     * {@link Output }
     * {@link ModelStats }
     * {@link Targets }
     * {@link PPMatrix }
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
     * Obtiene el valor de la propiedad targetVariableName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetVariableName() {
        return targetVariableName;
    }

    /**
     * Define el valor de la propiedad targetVariableName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetVariableName(String value) {
        this.targetVariableName = value;
    }

    /**
     * Obtiene el valor de la propiedad modelType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * Define el valor de la propiedad modelType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelType(String value) {
        this.modelType = value;
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
     * Obtiene el valor de la propiedad targetReferenceCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetReferenceCategory() {
        return targetReferenceCategory;
    }

    /**
     * Define el valor de la propiedad targetReferenceCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetReferenceCategory(String value) {
        this.targetReferenceCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad cumulativeLink.
     * 
     * @return
     *     possible object is
     *     {@link CUMULATIVELINKFUNCTION }
     *     
     */
    public CUMULATIVELINKFUNCTION getCumulativeLink() {
        return cumulativeLink;
    }

    /**
     * Define el valor de la propiedad cumulativeLink.
     * 
     * @param value
     *     allowed object is
     *     {@link CUMULATIVELINKFUNCTION }
     *     
     */
    public void setCumulativeLink(CUMULATIVELINKFUNCTION value) {
        this.cumulativeLink = value;
    }

    /**
     * Obtiene el valor de la propiedad linkFunction.
     * 
     * @return
     *     possible object is
     *     {@link LINKFUNCTION }
     *     
     */
    public LINKFUNCTION getLinkFunction() {
        return linkFunction;
    }

    /**
     * Define el valor de la propiedad linkFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link LINKFUNCTION }
     *     
     */
    public void setLinkFunction(LINKFUNCTION value) {
        this.linkFunction = value;
    }

    /**
     * Obtiene el valor de la propiedad linkParameter.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLinkParameter() {
        return linkParameter;
    }

    /**
     * Define el valor de la propiedad linkParameter.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLinkParameter(Double value) {
        this.linkParameter = value;
    }

    /**
     * Obtiene el valor de la propiedad trialsVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrialsVariable() {
        return trialsVariable;
    }

    /**
     * Define el valor de la propiedad trialsVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrialsVariable(String value) {
        this.trialsVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad trialsValue.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrialsValue() {
        return trialsValue;
    }

    /**
     * Define el valor de la propiedad trialsValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrialsValue(BigInteger value) {
        this.trialsValue = value;
    }

    /**
     * Obtiene el valor de la propiedad distribution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribution() {
        return distribution;
    }

    /**
     * Define el valor de la propiedad distribution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribution(String value) {
        this.distribution = value;
    }

    /**
     * Obtiene el valor de la propiedad distParameter.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistParameter() {
        return distParameter;
    }

    /**
     * Define el valor de la propiedad distParameter.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistParameter(Double value) {
        this.distParameter = value;
    }

    /**
     * Obtiene el valor de la propiedad offsetVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetVariable() {
        return offsetVariable;
    }

    /**
     * Define el valor de la propiedad offsetVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetVariable(String value) {
        this.offsetVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad offsetValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOffsetValue() {
        return offsetValue;
    }

    /**
     * Define el valor de la propiedad offsetValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffsetValue(Double value) {
        this.offsetValue = value;
    }

    /**
     * Obtiene el valor de la propiedad modelDF.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getModelDF() {
        return modelDF;
    }

    /**
     * Define el valor de la propiedad modelDF.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setModelDF(Double value) {
        this.modelDF = value;
    }

    /**
     * Obtiene el valor de la propiedad endTimeVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTimeVariable() {
        return endTimeVariable;
    }

    /**
     * Define el valor de la propiedad endTimeVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeVariable(String value) {
        this.endTimeVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad startTimeVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimeVariable() {
        return startTimeVariable;
    }

    /**
     * Define el valor de la propiedad startTimeVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeVariable(String value) {
        this.startTimeVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad subjectIDVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectIDVariable() {
        return subjectIDVariable;
    }

    /**
     * Define el valor de la propiedad subjectIDVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectIDVariable(String value) {
        this.subjectIDVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad statusVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVariable() {
        return statusVariable;
    }

    /**
     * Define el valor de la propiedad statusVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusVariable(String value) {
        this.statusVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad baselineStrataVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaselineStrataVariable() {
        return baselineStrataVariable;
    }

    /**
     * Define el valor de la propiedad baselineStrataVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaselineStrataVariable(String value) {
        this.baselineStrataVariable = value;
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

    public void setMiningSchema(MiningSchema mySchema)
    {
  //     this.MiningSchema = mySchema;
    }
    
    public void addToContent(Object item)
    {
        if (this.content == null){
            this.content = new ArrayList<Object>();
        }
        this.content.add(item);
    }
}
