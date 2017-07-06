//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.06 a las 10:07:19 PM CEST 
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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_2}PREDICATE"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}ComplexPartialScore" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="partialScore" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
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
    "simplePredicate",
    "compoundPredicate",
    "simpleSetPredicate",
    "_true",
    "_false",
    "complexPartialScore"
})
@XmlRootElement(name = "Attribute")
public class Attribute {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "SimplePredicate")
    protected SimplePredicate simplePredicate;
    @XmlElement(name = "CompoundPredicate")
    protected CompoundPredicate compoundPredicate;
    @XmlElement(name = "SimpleSetPredicate")
    protected SimpleSetPredicate simpleSetPredicate;
    @XmlElement(name = "True")
    protected True _true;
    @XmlElement(name = "False")
    protected False _false;
    @XmlElement(name = "ComplexPartialScore")
    protected ComplexPartialScore complexPartialScore;
    @XmlAttribute(name = "reasonCode")
    protected String reasonCode;
    @XmlAttribute(name = "partialScore")
    protected Double partialScore;

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
     * Obtiene el valor de la propiedad simplePredicate.
     * 
     * @return
     *     possible object is
     *     {@link SimplePredicate }
     *     
     */
    public SimplePredicate getSimplePredicate() {
        return simplePredicate;
    }

    /**
     * Define el valor de la propiedad simplePredicate.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePredicate }
     *     
     */
    public void setSimplePredicate(SimplePredicate value) {
        this.simplePredicate = value;
    }

    /**
     * Obtiene el valor de la propiedad compoundPredicate.
     * 
     * @return
     *     possible object is
     *     {@link CompoundPredicate }
     *     
     */
    public CompoundPredicate getCompoundPredicate() {
        return compoundPredicate;
    }

    /**
     * Define el valor de la propiedad compoundPredicate.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundPredicate }
     *     
     */
    public void setCompoundPredicate(CompoundPredicate value) {
        this.compoundPredicate = value;
    }

    /**
     * Obtiene el valor de la propiedad simpleSetPredicate.
     * 
     * @return
     *     possible object is
     *     {@link SimpleSetPredicate }
     *     
     */
    public SimpleSetPredicate getSimpleSetPredicate() {
        return simpleSetPredicate;
    }

    /**
     * Define el valor de la propiedad simpleSetPredicate.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleSetPredicate }
     *     
     */
    public void setSimpleSetPredicate(SimpleSetPredicate value) {
        this.simpleSetPredicate = value;
    }

    /**
     * Obtiene el valor de la propiedad true.
     * 
     * @return
     *     possible object is
     *     {@link True }
     *     
     */
    public True getTrue() {
        return _true;
    }

    /**
     * Define el valor de la propiedad true.
     * 
     * @param value
     *     allowed object is
     *     {@link True }
     *     
     */
    public void setTrue(True value) {
        this._true = value;
    }

    /**
     * Obtiene el valor de la propiedad false.
     * 
     * @return
     *     possible object is
     *     {@link False }
     *     
     */
    public False getFalse() {
        return _false;
    }

    /**
     * Define el valor de la propiedad false.
     * 
     * @param value
     *     allowed object is
     *     {@link False }
     *     
     */
    public void setFalse(False value) {
        this._false = value;
    }

    /**
     * Obtiene el valor de la propiedad complexPartialScore.
     * 
     * @return
     *     possible object is
     *     {@link ComplexPartialScore }
     *     
     */
    public ComplexPartialScore getComplexPartialScore() {
        return complexPartialScore;
    }

    /**
     * Define el valor de la propiedad complexPartialScore.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexPartialScore }
     *     
     */
    public void setComplexPartialScore(ComplexPartialScore value) {
        this.complexPartialScore = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad partialScore.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPartialScore() {
        return partialScore;
    }

    /**
     * Define el valor de la propiedad partialScore.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPartialScore(Double value) {
        this.partialScore = value;
    }

}
