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
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}PredictiveModelQuality" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}ClusteringModelQuality" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Correlations" minOccurs="0"/>
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
    "predictiveModelQuality",
    "clusteringModelQuality",
    "correlations"
})
@XmlRootElement(name = "ModelExplanation")
public class ModelExplanation {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "PredictiveModelQuality")
    protected List<PredictiveModelQuality> predictiveModelQuality;
    @XmlElement(name = "ClusteringModelQuality")
    protected List<ClusteringModelQuality> clusteringModelQuality;
    @XmlElement(name = "Correlations")
    protected Correlations correlations;

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
     * Gets the value of the predictiveModelQuality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictiveModelQuality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictiveModelQuality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredictiveModelQuality }
     * 
     * 
     */
    public List<PredictiveModelQuality> getPredictiveModelQuality() {
        if (predictiveModelQuality == null) {
            predictiveModelQuality = new ArrayList<PredictiveModelQuality>();
        }
        return this.predictiveModelQuality;
    }

    /**
     * Gets the value of the clusteringModelQuality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusteringModelQuality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusteringModelQuality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusteringModelQuality }
     * 
     * 
     */
    public List<ClusteringModelQuality> getClusteringModelQuality() {
        if (clusteringModelQuality == null) {
            clusteringModelQuality = new ArrayList<ClusteringModelQuality>();
        }
        return this.clusteringModelQuality;
    }

    /**
     * Obtiene el valor de la propiedad correlations.
     * 
     * @return
     *     possible object is
     *     {@link Correlations }
     *     
     */
    public Correlations getCorrelations() {
        return correlations;
    }

    /**
     * Define el valor de la propiedad correlations.
     * 
     * @param value
     *     allowed object is
     *     {@link Correlations }
     *     
     */
    public void setCorrelations(Correlations value) {
        this.correlations = value;
    }

}
