//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

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
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}TargetValueStats"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_2}DerivedField" minOccurs="0"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_2}PairCounts" maxOccurs="unbounded"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="fieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "targetValueStats",
    "derivedField",
    "pairCounts"
})
@XmlRootElement(name = "BayesInput")
public class BayesInput {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "TargetValueStats")
    protected TargetValueStats targetValueStats;
    @XmlElement(name = "DerivedField")
    protected DerivedField derivedField;
    @XmlElement(name = "PairCounts")
    protected List<PairCounts> pairCounts;
    @XmlAttribute(name = "fieldName", required = true)
    protected String fieldName;

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
     * Obtiene el valor de la propiedad targetValueStats.
     * 
     * @return
     *     possible object is
     *     {@link TargetValueStats }
     *     
     */
    public TargetValueStats getTargetValueStats() {
        return targetValueStats;
    }

    /**
     * Define el valor de la propiedad targetValueStats.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetValueStats }
     *     
     */
    public void setTargetValueStats(TargetValueStats value) {
        this.targetValueStats = value;
    }

    /**
     * Obtiene el valor de la propiedad derivedField.
     * 
     * @return
     *     possible object is
     *     {@link DerivedField }
     *     
     */
    public DerivedField getDerivedField() {
        return derivedField;
    }

    /**
     * Define el valor de la propiedad derivedField.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedField }
     *     
     */
    public void setDerivedField(DerivedField value) {
        this.derivedField = value;
    }

    /**
     * Gets the value of the pairCounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairCounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairCounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PairCounts }
     * 
     * 
     */
    public List<PairCounts> getPairCounts() {
        if (pairCounts == null) {
            pairCounts = new ArrayList<PairCounts>();
        }
        return this.pairCounts;
    }

    /**
     * Obtiene el valor de la propiedad fieldName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Define el valor de la propiedad fieldName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

}
