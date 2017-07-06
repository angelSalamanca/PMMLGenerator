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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para COUNT-TABLE-TYPE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="COUNT-TABLE-TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}FieldValue" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}FieldValueCount" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="sample" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COUNT-TABLE-TYPE", propOrder = {
    "extension",
    "fieldValue",
    "fieldValueCount"
})
public class COUNTTABLETYPE {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "FieldValue")
    protected List<FieldValue> fieldValue;
    @XmlElement(name = "FieldValueCount")
    protected List<FieldValueCount> fieldValueCount;
    @XmlAttribute(name = "sample")
    protected Double sample;

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
     * Gets the value of the fieldValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldValue }
     * 
     * 
     */
    public List<FieldValue> getFieldValue() {
        if (fieldValue == null) {
            fieldValue = new ArrayList<FieldValue>();
        }
        return this.fieldValue;
    }

    /**
     * Gets the value of the fieldValueCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldValueCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldValueCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldValueCount }
     * 
     * 
     */
    public List<FieldValueCount> getFieldValueCount() {
        if (fieldValueCount == null) {
            fieldValueCount = new ArrayList<FieldValueCount>();
        }
        return this.fieldValueCount;
    }

    /**
     * Obtiene el valor de la propiedad sample.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSample() {
        return sample;
    }

    /**
     * Define el valor de la propiedad sample.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSample(Double value) {
        this.sample = value;
    }

}
