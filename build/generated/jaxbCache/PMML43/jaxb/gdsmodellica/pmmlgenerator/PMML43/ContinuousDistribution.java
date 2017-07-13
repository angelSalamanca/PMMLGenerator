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
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}TriangularDistributionForBN"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}NormalDistributionForBN"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}LognormalDistributionForBN"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}UniformDistributionForBN"/>
 *         &lt;/choice>
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
    "triangularDistributionForBN",
    "normalDistributionForBN",
    "lognormalDistributionForBN",
    "uniformDistributionForBN"
})
@XmlRootElement(name = "ContinuousDistribution")
public class ContinuousDistribution {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "TriangularDistributionForBN")
    protected TriangularDistributionForBN triangularDistributionForBN;
    @XmlElement(name = "NormalDistributionForBN")
    protected NormalDistributionForBN normalDistributionForBN;
    @XmlElement(name = "LognormalDistributionForBN")
    protected LognormalDistributionForBN lognormalDistributionForBN;
    @XmlElement(name = "UniformDistributionForBN")
    protected UniformDistributionForBN uniformDistributionForBN;

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
     * Obtiene el valor de la propiedad triangularDistributionForBN.
     * 
     * @return
     *     possible object is
     *     {@link TriangularDistributionForBN }
     *     
     */
    public TriangularDistributionForBN getTriangularDistributionForBN() {
        return triangularDistributionForBN;
    }

    /**
     * Define el valor de la propiedad triangularDistributionForBN.
     * 
     * @param value
     *     allowed object is
     *     {@link TriangularDistributionForBN }
     *     
     */
    public void setTriangularDistributionForBN(TriangularDistributionForBN value) {
        this.triangularDistributionForBN = value;
    }

    /**
     * Obtiene el valor de la propiedad normalDistributionForBN.
     * 
     * @return
     *     possible object is
     *     {@link NormalDistributionForBN }
     *     
     */
    public NormalDistributionForBN getNormalDistributionForBN() {
        return normalDistributionForBN;
    }

    /**
     * Define el valor de la propiedad normalDistributionForBN.
     * 
     * @param value
     *     allowed object is
     *     {@link NormalDistributionForBN }
     *     
     */
    public void setNormalDistributionForBN(NormalDistributionForBN value) {
        this.normalDistributionForBN = value;
    }

    /**
     * Obtiene el valor de la propiedad lognormalDistributionForBN.
     * 
     * @return
     *     possible object is
     *     {@link LognormalDistributionForBN }
     *     
     */
    public LognormalDistributionForBN getLognormalDistributionForBN() {
        return lognormalDistributionForBN;
    }

    /**
     * Define el valor de la propiedad lognormalDistributionForBN.
     * 
     * @param value
     *     allowed object is
     *     {@link LognormalDistributionForBN }
     *     
     */
    public void setLognormalDistributionForBN(LognormalDistributionForBN value) {
        this.lognormalDistributionForBN = value;
    }

    /**
     * Obtiene el valor de la propiedad uniformDistributionForBN.
     * 
     * @return
     *     possible object is
     *     {@link UniformDistributionForBN }
     *     
     */
    public UniformDistributionForBN getUniformDistributionForBN() {
        return uniformDistributionForBN;
    }

    /**
     * Define el valor de la propiedad uniformDistributionForBN.
     * 
     * @param value
     *     allowed object is
     *     {@link UniformDistributionForBN }
     *     
     */
    public void setUniformDistributionForBN(UniformDistributionForBN value) {
        this.uniformDistributionForBN = value;
    }

}
