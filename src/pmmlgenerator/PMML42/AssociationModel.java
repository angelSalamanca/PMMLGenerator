//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package pmmlgenerator.PMML42;

import java.math.BigDecimal;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Itemset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}AssociationRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_2}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfTransactions" use="required" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="maxNumberOfItemsPerTA" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="avgNumberOfItemsPerTA" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="minimumSupport" use="required" type="{http://www.dmg.org/PMML-4_2}PROB-NUMBER" />
 *       &lt;attribute name="minimumConfidence" use="required" type="{http://www.dmg.org/PMML-4_2}PROB-NUMBER" />
 *       &lt;attribute name="lengthLimit" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="numberOfItems" use="required" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="numberOfItemsets" use="required" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="numberOfRules" use="required" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
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
@XmlRootElement(name = "AssociationModel")
public class AssociationModel {

    @XmlElementRefs({
        @XmlElementRef(name = "AssociationRule", namespace = "http://www.dmg.org/PMML-4_2", type = AssociationRule.class, required = false),
        @XmlElementRef(name = "MiningSchema", namespace = "http://www.dmg.org/PMML-4_2", type = MiningSchema.class, required = false),
        @XmlElementRef(name = "Output", namespace = "http://www.dmg.org/PMML-4_2", type = Output.class, required = false),
        @XmlElementRef(name = "ModelStats", namespace = "http://www.dmg.org/PMML-4_2", type = ModelStats.class, required = false),
        @XmlElementRef(name = "Item", namespace = "http://www.dmg.org/PMML-4_2", type = Item.class, required = false),
        @XmlElementRef(name = "Itemset", namespace = "http://www.dmg.org/PMML-4_2", type = Itemset.class, required = false),
        @XmlElementRef(name = "ModelVerification", namespace = "http://www.dmg.org/PMML-4_2", type = ModelVerification.class, required = false),
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
    @XmlAttribute(name = "numberOfTransactions", required = true)
    protected BigInteger numberOfTransactions;
    @XmlAttribute(name = "maxNumberOfItemsPerTA")
    protected BigInteger maxNumberOfItemsPerTA;
    @XmlAttribute(name = "avgNumberOfItemsPerTA")
    protected Double avgNumberOfItemsPerTA;
    @XmlAttribute(name = "minimumSupport", required = true)
    protected BigDecimal minimumSupport;
    @XmlAttribute(name = "minimumConfidence", required = true)
    protected BigDecimal minimumConfidence;
    @XmlAttribute(name = "lengthLimit")
    protected BigInteger lengthLimit;
    @XmlAttribute(name = "numberOfItems", required = true)
    protected BigInteger numberOfItems;
    @XmlAttribute(name = "numberOfItemsets", required = true)
    protected BigInteger numberOfItemsets;
    @XmlAttribute(name = "numberOfRules", required = true)
    protected BigInteger numberOfRules;
    @XmlAttribute(name = "isScorable")
    protected Boolean isScorable;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "Extension" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 169 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML42/pmml-4-2.mod..xsd
     * línea 160 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML42/pmml-4-2.mod..xsd
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
     * {@link AssociationRule }
     * {@link MiningSchema }
     * {@link Output }
     * {@link ModelStats }
     * {@link Item }
     * {@link Itemset }
     * {@link ModelVerification }
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
     * Obtiene el valor de la propiedad numberOfTransactions.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTransactions() {
        return numberOfTransactions;
    }

    /**
     * Define el valor de la propiedad numberOfTransactions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTransactions(BigInteger value) {
        this.numberOfTransactions = value;
    }

    /**
     * Obtiene el valor de la propiedad maxNumberOfItemsPerTA.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfItemsPerTA() {
        return maxNumberOfItemsPerTA;
    }

    /**
     * Define el valor de la propiedad maxNumberOfItemsPerTA.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfItemsPerTA(BigInteger value) {
        this.maxNumberOfItemsPerTA = value;
    }

    /**
     * Obtiene el valor de la propiedad avgNumberOfItemsPerTA.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgNumberOfItemsPerTA() {
        return avgNumberOfItemsPerTA;
    }

    /**
     * Define el valor de la propiedad avgNumberOfItemsPerTA.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgNumberOfItemsPerTA(Double value) {
        this.avgNumberOfItemsPerTA = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumSupport.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumSupport() {
        return minimumSupport;
    }

    /**
     * Define el valor de la propiedad minimumSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumSupport(BigDecimal value) {
        this.minimumSupport = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumConfidence.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumConfidence() {
        return minimumConfidence;
    }

    /**
     * Define el valor de la propiedad minimumConfidence.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumConfidence(BigDecimal value) {
        this.minimumConfidence = value;
    }

    /**
     * Obtiene el valor de la propiedad lengthLimit.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLengthLimit() {
        return lengthLimit;
    }

    /**
     * Define el valor de la propiedad lengthLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLengthLimit(BigInteger value) {
        this.lengthLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfItems.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Define el valor de la propiedad numberOfItems.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItems(BigInteger value) {
        this.numberOfItems = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfItemsets.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItemsets() {
        return numberOfItemsets;
    }

    /**
     * Define el valor de la propiedad numberOfItemsets.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItemsets(BigInteger value) {
        this.numberOfItemsets = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfRules.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRules() {
        return numberOfRules;
    }

    /**
     * Define el valor de la propiedad numberOfRules.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRules(BigInteger value) {
        this.numberOfRules = value;
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
