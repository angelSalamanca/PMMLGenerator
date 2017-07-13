//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:29 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}CorrelationFields"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}CorrelationValues"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}CorrelationMethods" minOccurs="0"/>
 *       &lt;/sequence>
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
    "correlationFields",
    "correlationValues",
    "correlationMethods"
})
@XmlRootElement(name = "Correlations")
public class Correlations {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "CorrelationFields", required = true)
    protected CorrelationFields correlationFields;
    @XmlElement(name = "CorrelationValues", required = true)
    protected CorrelationValues correlationValues;
    @XmlElement(name = "CorrelationMethods")
    protected CorrelationMethods correlationMethods;

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
     * Obtiene el valor de la propiedad correlationFields.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationFields }
     *     
     */
    public CorrelationFields getCorrelationFields() {
        return correlationFields;
    }

    /**
     * Define el valor de la propiedad correlationFields.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationFields }
     *     
     */
    public void setCorrelationFields(CorrelationFields value) {
        this.correlationFields = value;
    }

    /**
     * Obtiene el valor de la propiedad correlationValues.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationValues }
     *     
     */
    public CorrelationValues getCorrelationValues() {
        return correlationValues;
    }

    /**
     * Define el valor de la propiedad correlationValues.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationValues }
     *     
     */
    public void setCorrelationValues(CorrelationValues value) {
        this.correlationValues = value;
    }

    /**
     * Obtiene el valor de la propiedad correlationMethods.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationMethods }
     *     
     */
    public CorrelationMethods getCorrelationMethods() {
        return correlationMethods;
    }

    /**
     * Define el valor de la propiedad correlationMethods.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationMethods }
     *     
     */
    public void setCorrelationMethods(CorrelationMethods value) {
        this.correlationMethods = value;
    }

}
