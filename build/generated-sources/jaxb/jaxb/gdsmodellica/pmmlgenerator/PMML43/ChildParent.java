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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}FieldColumnPair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}TableLocator"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}InlineTable"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="childField" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentField" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentLevelField" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isRecursive" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="no"/>
 *             &lt;enumeration value="yes"/>
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
    "fieldColumnPair",
    "tableLocator",
    "inlineTable"
})
@XmlRootElement(name = "ChildParent")
public class ChildParent {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "FieldColumnPair")
    protected List<FieldColumnPair> fieldColumnPair;
    @XmlElement(name = "TableLocator")
    protected TableLocator tableLocator;
    @XmlElement(name = "InlineTable")
    protected InlineTable inlineTable;
    @XmlAttribute(name = "childField", required = true)
    protected String childField;
    @XmlAttribute(name = "parentField", required = true)
    protected String parentField;
    @XmlAttribute(name = "parentLevelField")
    protected String parentLevelField;
    @XmlAttribute(name = "isRecursive")
    protected String isRecursive;

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
     * Gets the value of the fieldColumnPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldColumnPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldColumnPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldColumnPair }
     * 
     * 
     */
    public List<FieldColumnPair> getFieldColumnPair() {
        if (fieldColumnPair == null) {
            fieldColumnPair = new ArrayList<FieldColumnPair>();
        }
        return this.fieldColumnPair;
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
     * Obtiene el valor de la propiedad childField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildField() {
        return childField;
    }

    /**
     * Define el valor de la propiedad childField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildField(String value) {
        this.childField = value;
    }

    /**
     * Obtiene el valor de la propiedad parentField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentField() {
        return parentField;
    }

    /**
     * Define el valor de la propiedad parentField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentField(String value) {
        this.parentField = value;
    }

    /**
     * Obtiene el valor de la propiedad parentLevelField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentLevelField() {
        return parentLevelField;
    }

    /**
     * Define el valor de la propiedad parentLevelField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentLevelField(String value) {
        this.parentLevelField = value;
    }

    /**
     * Obtiene el valor de la propiedad isRecursive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRecursive() {
        if (isRecursive == null) {
            return "no";
        } else {
            return isRecursive;
        }
    }

    /**
     * Define el valor de la propiedad isRecursive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRecursive(String value) {
        this.isRecursive = value;
    }

}
