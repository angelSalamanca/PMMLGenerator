//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.07.19 a las 09:57:14 AM CEST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}XCoordinates"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}YCoordinates"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}BoundaryValues" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}BoundaryValueMeans" minOccurs="0"/>
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
    "xCoordinates",
    "yCoordinates",
    "boundaryValues",
    "boundaryValueMeans"
})
@XmlRootElement(name = "LiftGraph")
public class LiftGraph {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "XCoordinates", required = true)
    protected XCoordinates xCoordinates;
    @XmlElement(name = "YCoordinates", required = true)
    protected YCoordinates yCoordinates;
    @XmlElement(name = "BoundaryValues")
    protected BoundaryValues boundaryValues;
    @XmlElement(name = "BoundaryValueMeans")
    protected BoundaryValueMeans boundaryValueMeans;

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
     * Obtiene el valor de la propiedad xCoordinates.
     * 
     * @return
     *     possible object is
     *     {@link XCoordinates }
     *     
     */
    public XCoordinates getXCoordinates() {
        return xCoordinates;
    }

    /**
     * Define el valor de la propiedad xCoordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link XCoordinates }
     *     
     */
    public void setXCoordinates(XCoordinates value) {
        this.xCoordinates = value;
    }

    /**
     * Obtiene el valor de la propiedad yCoordinates.
     * 
     * @return
     *     possible object is
     *     {@link YCoordinates }
     *     
     */
    public YCoordinates getYCoordinates() {
        return yCoordinates;
    }

    /**
     * Define el valor de la propiedad yCoordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link YCoordinates }
     *     
     */
    public void setYCoordinates(YCoordinates value) {
        this.yCoordinates = value;
    }

    /**
     * Obtiene el valor de la propiedad boundaryValues.
     * 
     * @return
     *     possible object is
     *     {@link BoundaryValues }
     *     
     */
    public BoundaryValues getBoundaryValues() {
        return boundaryValues;
    }

    /**
     * Define el valor de la propiedad boundaryValues.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundaryValues }
     *     
     */
    public void setBoundaryValues(BoundaryValues value) {
        this.boundaryValues = value;
    }

    /**
     * Obtiene el valor de la propiedad boundaryValueMeans.
     * 
     * @return
     *     possible object is
     *     {@link BoundaryValueMeans }
     *     
     */
    public BoundaryValueMeans getBoundaryValueMeans() {
        return boundaryValueMeans;
    }

    /**
     * Define el valor de la propiedad boundaryValueMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundaryValueMeans }
     *     
     */
    public void setBoundaryValueMeans(BoundaryValueMeans value) {
        this.boundaryValueMeans = value;
    }

}
