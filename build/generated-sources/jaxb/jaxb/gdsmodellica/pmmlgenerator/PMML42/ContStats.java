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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Interval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_2}FrequenciesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="totalValuesSum" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="totalSquaresSum" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
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
    "interval",
    "numarray"
})
@XmlRootElement(name = "ContStats")
public class ContStats {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "Interval")
    protected List<Interval> interval;
    @XmlElement(name = "Array")
    protected List<ArrayType> numarray;
    @XmlAttribute(name = "totalValuesSum")
    protected Double totalValuesSum;
    @XmlAttribute(name = "totalSquaresSum")
    protected Double totalSquaresSum;

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
     * Gets the value of the interval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interval }
     * 
     * 
     */
    public List<Interval> getInterval() {
        if (interval == null) {
            interval = new ArrayList<Interval>();
        }
        return this.interval;
    }

    /**
     * Gets the value of the numarray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numarray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNUMARRAY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNUMARRAY() {
        if (numarray == null) {
            numarray = new ArrayList<ArrayType>();
        }
        return this.numarray;
    }

    /**
     * Obtiene el valor de la propiedad totalValuesSum.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalValuesSum() {
        return totalValuesSum;
    }

    /**
     * Define el valor de la propiedad totalValuesSum.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalValuesSum(Double value) {
        this.totalValuesSum = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSquaresSum.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSquaresSum() {
        return totalSquaresSum;
    }

    /**
     * Define el valor de la propiedad totalSquaresSum.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSquaresSum(Double value) {
        this.totalSquaresSum = value;
    }

}
