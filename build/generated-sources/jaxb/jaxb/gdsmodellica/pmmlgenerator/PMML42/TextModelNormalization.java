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
 *       &lt;/sequence>
 *       &lt;attribute name="localTermWeights" default="termFrequency">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="termFrequency"/>
 *             &lt;enumeration value="binary"/>
 *             &lt;enumeration value="logarithmic"/>
 *             &lt;enumeration value="augmentedNormalizedTermFrequency"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="globalTermWeights" default="inverseDocumentFrequency">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="inverseDocumentFrequency"/>
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="GFIDF"/>
 *             &lt;enumeration value="normal"/>
 *             &lt;enumeration value="probabilisticInverse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="documentNormalization" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="cosine"/>
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
    "extension"
})
@XmlRootElement(name = "TextModelNormalization")
public class TextModelNormalization {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "localTermWeights")
    protected String localTermWeights;
    @XmlAttribute(name = "globalTermWeights")
    protected String globalTermWeights;
    @XmlAttribute(name = "documentNormalization")
    protected String documentNormalization;

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
     * Obtiene el valor de la propiedad localTermWeights.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTermWeights() {
        if (localTermWeights == null) {
            return "termFrequency";
        } else {
            return localTermWeights;
        }
    }

    /**
     * Define el valor de la propiedad localTermWeights.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTermWeights(String value) {
        this.localTermWeights = value;
    }

    /**
     * Obtiene el valor de la propiedad globalTermWeights.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalTermWeights() {
        if (globalTermWeights == null) {
            return "inverseDocumentFrequency";
        } else {
            return globalTermWeights;
        }
    }

    /**
     * Define el valor de la propiedad globalTermWeights.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalTermWeights(String value) {
        this.globalTermWeights = value;
    }

    /**
     * Obtiene el valor de la propiedad documentNormalization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNormalization() {
        if (documentNormalization == null) {
            return "none";
        } else {
            return documentNormalization;
        }
    }

    /**
     * Define el valor de la propiedad documentNormalization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNormalization(String value) {
        this.documentNormalization = value;
    }

}
