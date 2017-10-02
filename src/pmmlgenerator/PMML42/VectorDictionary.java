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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}VectorFields"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}VectorInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numberOfVectors" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
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
    "vectorFields",
    "vectorInstance"
})
@XmlRootElement(name = "VectorDictionary")
public class VectorDictionary {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "VectorFields", required = true)
    protected VectorFields vectorFields;
    @XmlElement(name = "VectorInstance")
    protected List<VectorInstance> vectorInstance;
    @XmlAttribute(name = "numberOfVectors")
    protected BigInteger numberOfVectors;

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
     * Obtiene el valor de la propiedad vectorFields.
     * 
     * @return
     *     possible object is
     *     {@link VectorFields }
     *     
     */
    public VectorFields getVectorFields() {
        return vectorFields;
    }

    /**
     * Define el valor de la propiedad vectorFields.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorFields }
     *     
     */
    public void setVectorFields(VectorFields value) {
        this.vectorFields = value;
    }

    /**
     * Gets the value of the vectorInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vectorInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVectorInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorInstance }
     * 
     * 
     */
    public List<VectorInstance> getVectorInstance() {
        if (vectorInstance == null) {
            vectorInstance = new ArrayList<VectorInstance>();
        }
        return this.vectorInstance;
    }

    /**
     * Obtiene el valor de la propiedad numberOfVectors.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVectors() {
        if (numberOfVectors == null)
        {
            return BigInteger.valueOf(this.vectorInstance.size());
        }
        return numberOfVectors;
    }

    /**
     * Define el valor de la propiedad numberOfVectors.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVectors(BigInteger value) {
        this.numberOfVectors = value;
    }

}
