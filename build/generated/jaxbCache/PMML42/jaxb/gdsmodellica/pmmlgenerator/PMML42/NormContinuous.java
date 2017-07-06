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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}LinearNorm" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mapMissingTo" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_2}FIELD-NAME" />
 *       &lt;attribute name="outliers" type="{http://www.dmg.org/PMML-4_2}OUTLIER-TREATMENT-METHOD" default="asIs" />
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
    "linearNorm"
})
@XmlRootElement(name = "NormContinuous")
public class NormContinuous {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "LinearNorm", required = true)
    protected List<LinearNorm> linearNorm;
    @XmlAttribute(name = "mapMissingTo")
    protected Double mapMissingTo;
    @XmlAttribute(name = "field", required = true)
    protected String field;
    @XmlAttribute(name = "outliers")
    protected OUTLIERTREATMENTMETHOD outliers;

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
     * Gets the value of the linearNorm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linearNorm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinearNorm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearNorm }
     * 
     * 
     */
    public List<LinearNorm> getLinearNorm() {
        if (linearNorm == null) {
            linearNorm = new ArrayList<LinearNorm>();
        }
        return this.linearNorm;
    }

    /**
     * Obtiene el valor de la propiedad mapMissingTo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMapMissingTo() {
        return mapMissingTo;
    }

    /**
     * Define el valor de la propiedad mapMissingTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMapMissingTo(Double value) {
        this.mapMissingTo = value;
    }

    /**
     * Obtiene el valor de la propiedad field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Define el valor de la propiedad field.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Obtiene el valor de la propiedad outliers.
     * 
     * @return
     *     possible object is
     *     {@link OUTLIERTREATMENTMETHOD }
     *     
     */
    public OUTLIERTREATMENTMETHOD getOutliers() {
        if (outliers == null) {
            return OUTLIERTREATMENTMETHOD.AS_IS;
        } else {
            return outliers;
        }
    }

    /**
     * Define el valor de la propiedad outliers.
     * 
     * @param value
     *     allowed object is
     *     {@link OUTLIERTREATMENTMETHOD }
     *     
     */
    public void setOutliers(OUTLIERTREATMENTMETHOD value) {
        this.outliers = value;
    }

}
