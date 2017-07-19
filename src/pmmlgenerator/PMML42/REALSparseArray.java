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
import javax.xml.bind.annotation.XmlList;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Indices" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}REAL-Entries" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="n" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="defaultValue" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "indices",
    "realEntries"
})
@XmlRootElement(name = "REAL-SparseArray")
public class REALSparseArray {

    @XmlList
    @XmlElement(name = "Indices", type = Integer.class)
    protected List<Integer> indices;
    @XmlList
    @XmlElement(name = "REAL-Entries", type = Double.class)
    protected List<Double> realEntries;
    @XmlAttribute(name = "n")
    protected BigInteger n;
    @XmlAttribute(name = "defaultValue")
    protected Double defaultValue;

    /**
     * Gets the value of the indices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIndices() {
        if (indices == null) {
            indices = new ArrayList<Integer>();
        }
        return this.indices;
    }

    /**
     * Gets the value of the realEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREALEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getREALEntries() {
        if (realEntries == null) {
            realEntries = new ArrayList<Double>();
        }
        return this.realEntries;
    }

    /**
     * Obtiene el valor de la propiedad n.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getN() {
        return n;
    }

    /**
     * Define el valor de la propiedad n.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setN(BigInteger value) {
        this.n = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDefaultValue() {
        if (defaultValue == null) {
            return  0.0D;
        } else {
            return defaultValue;
        }
    }

    /**
     * Define el valor de la propiedad defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultValue(Double value) {
        this.defaultValue = value;
    }

}
