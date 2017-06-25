//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:21 AM CEST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}ROCGraph"/>
 *       &lt;/sequence>
 *       &lt;attribute name="positiveTargetFieldValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positiveTargetFieldDisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="negativeTargetFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="negativeTargetFieldDisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "rocGraph"
})
@XmlRootElement(name = "ROC")
public class ROC {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "ROCGraph", required = true)
    protected ROCGraph rocGraph;
    @XmlAttribute(name = "positiveTargetFieldValue", required = true)
    protected String positiveTargetFieldValue;
    @XmlAttribute(name = "positiveTargetFieldDisplayValue")
    protected String positiveTargetFieldDisplayValue;
    @XmlAttribute(name = "negativeTargetFieldValue")
    protected String negativeTargetFieldValue;
    @XmlAttribute(name = "negativeTargetFieldDisplayValue")
    protected String negativeTargetFieldDisplayValue;

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
     * Obtiene el valor de la propiedad rocGraph.
     * 
     * @return
     *     possible object is
     *     {@link ROCGraph }
     *     
     */
    public ROCGraph getROCGraph() {
        return rocGraph;
    }

    /**
     * Define el valor de la propiedad rocGraph.
     * 
     * @param value
     *     allowed object is
     *     {@link ROCGraph }
     *     
     */
    public void setROCGraph(ROCGraph value) {
        this.rocGraph = value;
    }

    /**
     * Obtiene el valor de la propiedad positiveTargetFieldValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveTargetFieldValue() {
        return positiveTargetFieldValue;
    }

    /**
     * Define el valor de la propiedad positiveTargetFieldValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveTargetFieldValue(String value) {
        this.positiveTargetFieldValue = value;
    }

    /**
     * Obtiene el valor de la propiedad positiveTargetFieldDisplayValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveTargetFieldDisplayValue() {
        return positiveTargetFieldDisplayValue;
    }

    /**
     * Define el valor de la propiedad positiveTargetFieldDisplayValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveTargetFieldDisplayValue(String value) {
        this.positiveTargetFieldDisplayValue = value;
    }

    /**
     * Obtiene el valor de la propiedad negativeTargetFieldValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeTargetFieldValue() {
        return negativeTargetFieldValue;
    }

    /**
     * Define el valor de la propiedad negativeTargetFieldValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeTargetFieldValue(String value) {
        this.negativeTargetFieldValue = value;
    }

    /**
     * Obtiene el valor de la propiedad negativeTargetFieldDisplayValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeTargetFieldDisplayValue() {
        return negativeTargetFieldDisplayValue;
    }

    /**
     * Define el valor de la propiedad negativeTargetFieldDisplayValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeTargetFieldDisplayValue(String value) {
        this.negativeTargetFieldDisplayValue = value;
    }

}
