//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:29 PM CEST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TextIndexNormalization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}EXPRESSION"/>
 *       &lt;/sequence>
 *       &lt;attribute name="textField" use="required" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="localTermWeights" default="termFrequency">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="termFrequency"/>
 *             &lt;enumeration value="binary"/>
 *             &lt;enumeration value="logarithmic"/>
 *             &lt;enumeration value="augmentedNormalizedTermFrequency"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="maxLevenshteinDistance" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="countHits" default="allHits">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="allHits"/>
 *             &lt;enumeration value="bestHits"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="wordSeparatorCharacterRE" type="{http://www.w3.org/2001/XMLSchema}string" default="\s" />
 *       &lt;attribute name="tokenize" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
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
    "textIndexNormalization",
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
@XmlRootElement(name = "TextIndex")
public class TextIndex {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "TextIndexNormalization")
    protected List<TextIndexNormalization> textIndexNormalization;
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
    @XmlAttribute(name = "textField", required = true)
    protected String textField;
    @XmlAttribute(name = "localTermWeights")
    protected String localTermWeights;
    @XmlAttribute(name = "isCaseSensitive")
    protected Boolean isCaseSensitive;
    @XmlAttribute(name = "maxLevenshteinDistance")
    protected BigInteger maxLevenshteinDistance;
    @XmlAttribute(name = "countHits")
    protected String countHits;
    @XmlAttribute(name = "wordSeparatorCharacterRE")
    protected String wordSeparatorCharacterRE;
    @XmlAttribute(name = "tokenize")
    protected Boolean tokenize;

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
     * Gets the value of the textIndexNormalization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textIndexNormalization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextIndexNormalization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextIndexNormalization }
     * 
     * 
     */
    public List<TextIndexNormalization> getTextIndexNormalization() {
        if (textIndexNormalization == null) {
            textIndexNormalization = new ArrayList<TextIndexNormalization>();
        }
        return this.textIndexNormalization;
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
     * Obtiene el valor de la propiedad textField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextField() {
        return textField;
    }

    /**
     * Define el valor de la propiedad textField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextField(String value) {
        this.textField = value;
    }

    /**
     * Obtiene el valor de la propiedad localTermWeights.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTermWeights() {
        if (localTermWeights == null) {
            return "termFrequency";
        } else {
            return localTermWeights;
        }
    }

    /**
     * Define el valor de la propiedad localTermWeights.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTermWeights(String value) {
        this.localTermWeights = value;
    }

    /**
     * Obtiene el valor de la propiedad isCaseSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCaseSensitive() {
        if (isCaseSensitive == null) {
            return false;
        } else {
            return isCaseSensitive;
        }
    }

    /**
     * Define el valor de la propiedad isCaseSensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCaseSensitive(Boolean value) {
        this.isCaseSensitive = value;
    }

    /**
     * Obtiene el valor de la propiedad maxLevenshteinDistance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxLevenshteinDistance() {
        if (maxLevenshteinDistance == null) {
            return new BigInteger("0");
        } else {
            return maxLevenshteinDistance;
        }
    }

    /**
     * Define el valor de la propiedad maxLevenshteinDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxLevenshteinDistance(BigInteger value) {
        this.maxLevenshteinDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad countHits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountHits() {
        if (countHits == null) {
            return "allHits";
        } else {
            return countHits;
        }
    }

    /**
     * Define el valor de la propiedad countHits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountHits(String value) {
        this.countHits = value;
    }

    /**
     * Obtiene el valor de la propiedad wordSeparatorCharacterRE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordSeparatorCharacterRE() {
        if (wordSeparatorCharacterRE == null) {
            return "\\s";
        } else {
            return wordSeparatorCharacterRE;
        }
    }

    /**
     * Define el valor de la propiedad wordSeparatorCharacterRE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordSeparatorCharacterRE(String value) {
        this.wordSeparatorCharacterRE = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenize.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTokenize() {
        if (tokenize == null) {
            return true;
        } else {
            return tokenize;
        }
    }

    /**
     * Define el valor de la propiedad tokenize.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTokenize(Boolean value) {
        this.tokenize = value;
    }

}
