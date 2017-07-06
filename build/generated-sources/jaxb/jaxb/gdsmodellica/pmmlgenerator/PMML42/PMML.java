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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Header"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}MiningBuildTask" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}DataDictionary"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}TransformationDictionary" minOccurs="0"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{http://www.dmg.org/PMML-4_2}MODEL-ELEMENT"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "miningBuildTask",
    "dataDictionary",
    "transformationDictionary",
    "associationModelOrBaselineModelOrClusteringModel",
    "extension"
})
@XmlRootElement(name = "PMML")
public class PMML {

    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "MiningBuildTask")
    protected MiningBuildTask miningBuildTask;
    @XmlElement(name = "DataDictionary", required = true)
    protected DataDictionary dataDictionary;
    @XmlElement(name = "TransformationDictionary")
    protected TransformationDictionary transformationDictionary;
    @XmlElements({
        @XmlElement(name = "AssociationModel", type = AssociationModel.class),
        @XmlElement(name = "BaselineModel", type = BaselineModel.class),
        @XmlElement(name = "ClusteringModel", type = ClusteringModel.class),
        @XmlElement(name = "GeneralRegressionModel", type = GeneralRegressionModel.class),
        @XmlElement(name = "MiningModel", type = MiningModel.class),
        @XmlElement(name = "NaiveBayesModel", type = NaiveBayesModel.class),
        @XmlElement(name = "NearestNeighborModel", type = NearestNeighborModel.class),
        @XmlElement(name = "NeuralNetwork", type = NeuralNetwork.class),
        @XmlElement(name = "RegressionModel", type = RegressionModel.class),
        @XmlElement(name = "RuleSetModel", type = RuleSetModel.class),
        @XmlElement(name = "SequenceModel", type = SequenceModel.class),
        @XmlElement(name = "Scorecard", type = Scorecard.class),
        @XmlElement(name = "SupportVectorMachineModel", type = SupportVectorMachineModel.class),
        @XmlElement(name = "TextModel", type = TextModel.class),
        @XmlElement(name = "TimeSeriesModel", type = TimeSeriesModel.class),
        @XmlElement(name = "TreeModel", type = TreeModel.class)
    })
    protected List<Object> associationModelOrBaselineModelOrClusteringModel;
    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Obtiene el valor de la propiedad header.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Define el valor de la propiedad header.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Obtiene el valor de la propiedad miningBuildTask.
     * 
     * @return
     *     possible object is
     *     {@link MiningBuildTask }
     *     
     */
    public MiningBuildTask getMiningBuildTask() {
        return miningBuildTask;
    }

    /**
     * Define el valor de la propiedad miningBuildTask.
     * 
     * @param value
     *     allowed object is
     *     {@link MiningBuildTask }
     *     
     */
    public void setMiningBuildTask(MiningBuildTask value) {
        this.miningBuildTask = value;
    }

    /**
     * Obtiene el valor de la propiedad dataDictionary.
     * 
     * @return
     *     possible object is
     *     {@link DataDictionary }
     *     
     */
    public DataDictionary getDataDictionary() {
        return dataDictionary;
    }

    /**
     * Define el valor de la propiedad dataDictionary.
     * 
     * @param value
     *     allowed object is
     *     {@link DataDictionary }
     *     
     */
    public void setDataDictionary(DataDictionary value) {
        this.dataDictionary = value;
    }

    /**
     * Obtiene el valor de la propiedad transformationDictionary.
     * 
     * @return
     *     possible object is
     *     {@link TransformationDictionary }
     *     
     */
    public TransformationDictionary getTransformationDictionary() {
        return transformationDictionary;
    }

    /**
     * Define el valor de la propiedad transformationDictionary.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformationDictionary }
     *     
     */
    public void setTransformationDictionary(TransformationDictionary value) {
        this.transformationDictionary = value;
    }

    /**
     * Gets the value of the associationModelOrBaselineModelOrClusteringModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associationModelOrBaselineModelOrClusteringModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociationModelOrBaselineModelOrClusteringModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationModel }
     * {@link BaselineModel }
     * {@link ClusteringModel }
     * {@link GeneralRegressionModel }
     * {@link MiningModel }
     * {@link NaiveBayesModel }
     * {@link NearestNeighborModel }
     * {@link NeuralNetwork }
     * {@link RegressionModel }
     * {@link RuleSetModel }
     * {@link SequenceModel }
     * {@link Scorecard }
     * {@link SupportVectorMachineModel }
     * {@link TextModel }
     * {@link TimeSeriesModel }
     * {@link TreeModel }
     * 
     * 
     */
    public List<Object> getAssociationModelOrBaselineModelOrClusteringModel() {
        if (associationModelOrBaselineModelOrClusteringModel == null) {
            associationModelOrBaselineModelOrClusteringModel = new ArrayList<Object>();
        }
        return this.associationModelOrBaselineModelOrClusteringModel;
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
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
