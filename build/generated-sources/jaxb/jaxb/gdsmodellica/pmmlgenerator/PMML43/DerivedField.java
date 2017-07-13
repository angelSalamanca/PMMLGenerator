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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}EXPRESSION"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Value" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="optype" use="required" type="{http://www.dmg.org/PMML-4_3}OPTYPE" />
 *       &lt;attribute name="dataType" use="required" type="{http://www.dmg.org/PMML-4_3}DATATYPE" />
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
    "constant",
    "fieldRef",
    "normContinuous",
    "normDiscrete",
    "discretize",
    "mapValues",
    "textIndex",
    "apply",
    "aggregate",
    "lag",
    "value"
})
@XmlRootElement(name = "DerivedField")
public class DerivedField {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
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
    @XmlElement(name = "Value")
    protected List<Value> value;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "optype", required = true)
    protected OPTYPE optype;
    @XmlAttribute(name = "dataType", required = true)
    protected DATATYPE dataType;

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
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Value }
     * 
     * 
     */
    public List<Value> getValue() {
        if (value == null) {
            value = new ArrayList<Value>();
        }
        return this.value;
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

}
