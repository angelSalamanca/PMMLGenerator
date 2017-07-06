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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}MiningSchema"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelStats" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Constraints" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Itemset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}SetPredicate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Sequence" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}SequenceRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_3}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfTransactions" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="maxNumberOfItemsPerTransaction" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="avgNumberOfItemsPerTransaction" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="numberOfTransactionGroups" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="maxNumberOfTAsPerTAGroup" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="avgNumberOfTAsPerTAGroup" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
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
@XmlRootElement(name = "SequenceModel")
public class SequenceModel {

    @XmlElementRefs({
        @XmlElementRef(name = "LocalTransformations", namespace = "http://www.dmg.org/PMML-4_3", type = LocalTransformations.class, required = false),
        @XmlElementRef(name = "Itemset", namespace = "http://www.dmg.org/PMML-4_3", type = Itemset.class, required = false),
        @XmlElementRef(name = "SetPredicate", namespace = "http://www.dmg.org/PMML-4_3", type = SetPredicate.class, required = false),
        @XmlElementRef(name = "MiningSchema", namespace = "http://www.dmg.org/PMML-4_3", type = MiningSchema.class, required = false),
        @XmlElementRef(name = "Sequence", namespace = "http://www.dmg.org/PMML-4_3", type = Sequence.class, required = false),
        @XmlElementRef(name = "SequenceRule", namespace = "http://www.dmg.org/PMML-4_3", type = SequenceRule.class, required = false),
        @XmlElementRef(name = "ModelStats", namespace = "http://www.dmg.org/PMML-4_3", type = ModelStats.class, required = false),
        @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_3", type = Extension.class, required = false),
        @XmlElementRef(name = "Constraints", namespace = "http://www.dmg.org/PMML-4_3", type = Constraints.class, required = false),
        @XmlElementRef(name = "Item", namespace = "http://www.dmg.org/PMML-4_3", type = Item.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "modelName")
    protected String modelName;
    @XmlAttribute(name = "functionName", required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute(name = "algorithmName")
    protected String algorithmName;
    @XmlAttribute(name = "numberOfTransactions")
    protected BigInteger numberOfTransactions;
    @XmlAttribute(name = "maxNumberOfItemsPerTransaction")
    protected BigInteger maxNumberOfItemsPerTransaction;
    @XmlAttribute(name = "avgNumberOfItemsPerTransaction")
    protected Double avgNumberOfItemsPerTransaction;
    @XmlAttribute(name = "numberOfTransactionGroups")
    protected BigInteger numberOfTransactionGroups;
    @XmlAttribute(name = "maxNumberOfTAsPerTAGroup")
    protected BigInteger maxNumberOfTAsPerTAGroup;
    @XmlAttribute(name = "avgNumberOfTAsPerTAGroup")
    protected Double avgNumberOfTAsPerTAGroup;
    @XmlAttribute(name = "isScorable")
    protected Boolean isScorable;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "Extension" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 2545 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML43/pmml-4-3.mod.xsd
     * línea 2535 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML43/pmml-4-3.mod.xsd
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
     * {@link LocalTransformations }
     * {@link Itemset }
     * {@link SetPredicate }
     * {@link MiningSchema }
     * {@link Sequence }
     * {@link SequenceRule }
     * {@link ModelStats }
     * {@link Extension }
     * {@link Constraints }
     * {@link Item }
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
     * Obtiene el valor de la propiedad maxNumberOfItemsPerTransaction.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfItemsPerTransaction() {
        return maxNumberOfItemsPerTransaction;
    }

    /**
     * Define el valor de la propiedad maxNumberOfItemsPerTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfItemsPerTransaction(BigInteger value) {
        this.maxNumberOfItemsPerTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad avgNumberOfItemsPerTransaction.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgNumberOfItemsPerTransaction() {
        return avgNumberOfItemsPerTransaction;
    }

    /**
     * Define el valor de la propiedad avgNumberOfItemsPerTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgNumberOfItemsPerTransaction(Double value) {
        this.avgNumberOfItemsPerTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfTransactionGroups.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTransactionGroups() {
        return numberOfTransactionGroups;
    }

    /**
     * Define el valor de la propiedad numberOfTransactionGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTransactionGroups(BigInteger value) {
        this.numberOfTransactionGroups = value;
    }

    /**
     * Obtiene el valor de la propiedad maxNumberOfTAsPerTAGroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfTAsPerTAGroup() {
        return maxNumberOfTAsPerTAGroup;
    }

    /**
     * Define el valor de la propiedad maxNumberOfTAsPerTAGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfTAsPerTAGroup(BigInteger value) {
        this.maxNumberOfTAsPerTAGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad avgNumberOfTAsPerTAGroup.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgNumberOfTAsPerTAGroup() {
        return avgNumberOfTAsPerTAGroup;
    }

    /**
     * Define el valor de la propiedad avgNumberOfTAsPerTAGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgNumberOfTAsPerTAGroup(Double value) {
        this.avgNumberOfTAsPerTAGroup = value;
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
