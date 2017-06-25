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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}TableLocator"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}InlineTable"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="inField" type="{http://www.w3.org/2001/XMLSchema}string" default="string" />
 *       &lt;attribute name="outField" type="{http://www.w3.org/2001/XMLSchema}string" default="stem" />
 *       &lt;attribute name="regexField" type="{http://www.w3.org/2001/XMLSchema}string" default="regex" />
 *       &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxLevenshteinDistance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="wordSeparatorCharacterRE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tokenize" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "tableLocator",
    "inlineTable"
})
@XmlRootElement(name = "TextIndexNormalization")
public class TextIndexNormalization {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "TableLocator")
    protected TableLocator tableLocator;
    @XmlElement(name = "InlineTable")
    protected InlineTable inlineTable;
    @XmlAttribute(name = "inField")
    protected String inField;
    @XmlAttribute(name = "outField")
    protected String outField;
    @XmlAttribute(name = "regexField")
    protected String regexField;
    @XmlAttribute(name = "recursive")
    protected Boolean recursive;
    @XmlAttribute(name = "isCaseSensitive")
    protected Boolean isCaseSensitive;
    @XmlAttribute(name = "maxLevenshteinDistance")
    protected BigInteger maxLevenshteinDistance;
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
     * Obtiene el valor de la propiedad inField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInField() {
        if (inField == null) {
            return "string";
        } else {
            return inField;
        }
    }

    /**
     * Define el valor de la propiedad inField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInField(String value) {
        this.inField = value;
    }

    /**
     * Obtiene el valor de la propiedad outField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutField() {
        if (outField == null) {
            return "stem";
        } else {
            return outField;
        }
    }

    /**
     * Define el valor de la propiedad outField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutField(String value) {
        this.outField = value;
    }

    /**
     * Obtiene el valor de la propiedad regexField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegexField() {
        if (regexField == null) {
            return "regex";
        } else {
            return regexField;
        }
    }

    /**
     * Define el valor de la propiedad regexField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegexField(String value) {
        this.regexField = value;
    }

    /**
     * Obtiene el valor de la propiedad recursive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRecursive() {
        if (recursive == null) {
            return false;
        } else {
            return recursive;
        }
    }

    /**
     * Define el valor de la propiedad recursive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecursive(Boolean value) {
        this.recursive = value;
    }

    /**
     * Obtiene el valor de la propiedad isCaseSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCaseSensitive() {
        return isCaseSensitive;
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
        return maxLevenshteinDistance;
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
     * Obtiene el valor de la propiedad wordSeparatorCharacterRE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordSeparatorCharacterRE() {
        return wordSeparatorCharacterRE;
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
    public Boolean isTokenize() {
        return tokenize;
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
