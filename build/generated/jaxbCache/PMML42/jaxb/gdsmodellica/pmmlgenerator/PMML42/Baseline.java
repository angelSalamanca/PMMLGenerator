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
 *       &lt;choice>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_2}CONTINUOUS-DISTRIBUTION-TYPES"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_2}DISCRETE-DISTRIBUTION-TYPES"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anyDistribution",
    "gaussianDistribution",
    "poissonDistribution",
    "uniformDistribution",
    "extension",
    "countTable",
    "normalizedCountTable",
    "fieldRef"
})
@XmlRootElement(name = "Baseline")
public class Baseline {

    @XmlElement(name = "AnyDistribution")
    protected AnyDistribution anyDistribution;
    @XmlElement(name = "GaussianDistribution")
    protected GaussianDistribution gaussianDistribution;
    @XmlElement(name = "PoissonDistribution")
    protected PoissonDistribution poissonDistribution;
    @XmlElement(name = "UniformDistribution")
    protected UniformDistribution uniformDistribution;
    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "CountTable")
    protected COUNTTABLETYPE countTable;
    @XmlElement(name = "NormalizedCountTable")
    protected COUNTTABLETYPE normalizedCountTable;
    @XmlElement(name = "FieldRef")
    protected List<FieldRef> fieldRef;

    /**
     * Obtiene el valor de la propiedad anyDistribution.
     * 
     * @return
     *     possible object is
     *     {@link AnyDistribution }
     *     
     */
    public AnyDistribution getAnyDistribution() {
        return anyDistribution;
    }

    /**
     * Define el valor de la propiedad anyDistribution.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyDistribution }
     *     
     */
    public void setAnyDistribution(AnyDistribution value) {
        this.anyDistribution = value;
    }

    /**
     * Obtiene el valor de la propiedad gaussianDistribution.
     * 
     * @return
     *     possible object is
     *     {@link GaussianDistribution }
     *     
     */
    public GaussianDistribution getGaussianDistribution() {
        return gaussianDistribution;
    }

    /**
     * Define el valor de la propiedad gaussianDistribution.
     * 
     * @param value
     *     allowed object is
     *     {@link GaussianDistribution }
     *     
     */
    public void setGaussianDistribution(GaussianDistribution value) {
        this.gaussianDistribution = value;
    }

    /**
     * Obtiene el valor de la propiedad poissonDistribution.
     * 
     * @return
     *     possible object is
     *     {@link PoissonDistribution }
     *     
     */
    public PoissonDistribution getPoissonDistribution() {
        return poissonDistribution;
    }

    /**
     * Define el valor de la propiedad poissonDistribution.
     * 
     * @param value
     *     allowed object is
     *     {@link PoissonDistribution }
     *     
     */
    public void setPoissonDistribution(PoissonDistribution value) {
        this.poissonDistribution = value;
    }

    /**
     * Obtiene el valor de la propiedad uniformDistribution.
     * 
     * @return
     *     possible object is
     *     {@link UniformDistribution }
     *     
     */
    public UniformDistribution getUniformDistribution() {
        return uniformDistribution;
    }

    /**
     * Define el valor de la propiedad uniformDistribution.
     * 
     * @param value
     *     allowed object is
     *     {@link UniformDistribution }
     *     
     */
    public void setUniformDistribution(UniformDistribution value) {
        this.uniformDistribution = value;
    }

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
     * Obtiene el valor de la propiedad countTable.
     * 
     * @return
     *     possible object is
     *     {@link COUNTTABLETYPE }
     *     
     */
    public COUNTTABLETYPE getCountTable() {
        return countTable;
    }

    /**
     * Define el valor de la propiedad countTable.
     * 
     * @param value
     *     allowed object is
     *     {@link COUNTTABLETYPE }
     *     
     */
    public void setCountTable(COUNTTABLETYPE value) {
        this.countTable = value;
    }

    /**
     * Obtiene el valor de la propiedad normalizedCountTable.
     * 
     * @return
     *     possible object is
     *     {@link COUNTTABLETYPE }
     *     
     */
    public COUNTTABLETYPE getNormalizedCountTable() {
        return normalizedCountTable;
    }

    /**
     * Define el valor de la propiedad normalizedCountTable.
     * 
     * @param value
     *     allowed object is
     *     {@link COUNTTABLETYPE }
     *     
     */
    public void setNormalizedCountTable(COUNTTABLETYPE value) {
        this.normalizedCountTable = value;
    }

    /**
     * Gets the value of the fieldRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldRef }
     * 
     * 
     */
    public List<FieldRef> getFieldRef() {
        if (fieldRef == null) {
            fieldRef = new ArrayList<FieldRef>();
        }
        return this.fieldRef;
    }

}
