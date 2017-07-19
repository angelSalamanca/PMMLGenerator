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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}InstanceFields"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}TableLocator"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}InlineTable"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="isTransformed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="recordCount" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="fieldCount" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
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
    "instanceFields",
    "tableLocator",
    "inlineTable"
})
@XmlRootElement(name = "TrainingInstances")
public class TrainingInstances {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "InstanceFields", required = true)
    protected InstanceFields instanceFields;
    @XmlElement(name = "TableLocator")
    protected TableLocator tableLocator;
    @XmlElement(name = "InlineTable")
    protected InlineTable inlineTable;
    @XmlAttribute(name = "isTransformed")
    protected Boolean isTransformed;
    @XmlAttribute(name = "recordCount")
    protected BigInteger recordCount;
    @XmlAttribute(name = "fieldCount")
    protected BigInteger fieldCount;

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
     * Obtiene el valor de la propiedad instanceFields.
     * 
     * @return
     *     possible object is
     *     {@link InstanceFields }
     *     
     */
    public InstanceFields getInstanceFields() {
        return instanceFields;
    }

    /**
     * Define el valor de la propiedad instanceFields.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceFields }
     *     
     */
    public void setInstanceFields(InstanceFields value) {
        this.instanceFields = value;
    }

    /**
     * Obtiene el valor de la propiedad tableLocator.
     * 
     * @return
     *     possible object is
     *     {@link TableLocator }
     *     
     */
    public TableLocator getTableLocator() {
        return tableLocator;
    }

    /**
     * Define el valor de la propiedad tableLocator.
     * 
     * @param value
     *     allowed object is
     *     {@link TableLocator }
     *     
     */
    public void setTableLocator(TableLocator value) {
        this.tableLocator = value;
    }

    /**
     * Obtiene el valor de la propiedad inlineTable.
     * 
     * @return
     *     possible object is
     *     {@link InlineTable }
     *     
     */
    public InlineTable getInlineTable() {
        return inlineTable;
    }

    /**
     * Define el valor de la propiedad inlineTable.
     * 
     * @param value
     *     allowed object is
     *     {@link InlineTable }
     *     
     */
    public void setInlineTable(InlineTable value) {
        this.inlineTable = value;
    }

    /**
     * Obtiene el valor de la propiedad isTransformed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsTransformed() {
        if (isTransformed == null) {
            return false;
        } else {
            return isTransformed;
        }
    }

    /**
     * Define el valor de la propiedad isTransformed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTransformed(Boolean value) {
        this.isTransformed = value;
    }

    /**
     * Obtiene el valor de la propiedad recordCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordCount() {
        return recordCount;
    }

    /**
     * Define el valor de la propiedad recordCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordCount(BigInteger value) {
        this.recordCount = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFieldCount() {
        return fieldCount;
    }

    /**
     * Define el valor de la propiedad fieldCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFieldCount(BigInteger value) {
        this.fieldCount = value;
    }

}
