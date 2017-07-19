//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.07.19 a las 09:57:14 AM CEST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}VerificationFields"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}InlineTable"/>
 *       &lt;/sequence>
 *       &lt;attribute name="recordCount" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="fieldCount" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
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
    "verificationFields",
    "inlineTable"
})
@XmlRootElement(name = "ModelVerification")
public class ModelVerification {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "VerificationFields", required = true)
    protected VerificationFields verificationFields;
    @XmlElement(name = "InlineTable", required = true)
    protected InlineTable inlineTable;
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
     * Obtiene el valor de la propiedad verificationFields.
     * 
     * @return
     *     possible object is
     *     {@link VerificationFields }
     *     
     */
    public VerificationFields getVerificationFields() {
        return verificationFields;
    }

    /**
     * Define el valor de la propiedad verificationFields.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationFields }
     *     
     */
    public void setVerificationFields(VerificationFields value) {
        this.verificationFields = value;
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
