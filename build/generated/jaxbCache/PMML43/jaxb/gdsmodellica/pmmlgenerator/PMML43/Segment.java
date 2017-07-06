//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.06 a las 10:07:22 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}PREDICATE"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}MODEL-ELEMENT"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="weight" type="{http://www.dmg.org/PMML-4_3}NUMBER" default="1" />
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
    "simplePredicate",
    "compoundPredicate",
    "simpleSetPredicate",
    "_true",
    "_false",
    "associationModel",
    "bayesianNetworkModel",
    "baselineModel",
    "clusteringModel",
    "gaussianProcessModel",
    "generalRegressionModel",
    "miningModel",
    "naiveBayesModel",
    "nearestNeighborModel",
    "neuralNetwork",
    "regressionModel",
    "ruleSetModel",
    "sequenceModel",
    "scorecard",
    "supportVectorMachineModel",
    "textModel",
    "timeSeriesModel",
    "treeModel"
})
@XmlRootElement(name = "Segment")
public class Segment {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "SimplePredicate")
    protected SimplePredicate simplePredicate;
    @XmlElement(name = "CompoundPredicate")
    protected CompoundPredicate compoundPredicate;
    @XmlElement(name = "SimpleSetPredicate")
    protected SimpleSetPredicate simpleSetPredicate;
    @XmlElement(name = "True")
    protected True _true;
    @XmlElement(name = "False")
    protected False _false;
    @XmlElement(name = "AssociationModel")
    protected AssociationModel associationModel;
    @XmlElement(name = "BayesianNetworkModel")
    protected BayesianNetworkModel bayesianNetworkModel;
    @XmlElement(name = "BaselineModel")
    protected BaselineModel baselineModel;
    @XmlElement(name = "ClusteringModel")
    protected ClusteringModel clusteringModel;
    @XmlElement(name = "GaussianProcessModel")
    protected GaussianProcessModel gaussianProcessModel;
    @XmlElement(name = "GeneralRegressionModel")
    protected GeneralRegressionModel generalRegressionModel;
    @XmlElement(name = "MiningModel")
    protected MiningModel miningModel;
    @XmlElement(name = "NaiveBayesModel")
    protected NaiveBayesModel naiveBayesModel;
    @XmlElement(name = "NearestNeighborModel")
    protected NearestNeighborModel nearestNeighborModel;
    @XmlElement(name = "NeuralNetwork")
    protected NeuralNetwork neuralNetwork;
    @XmlElement(name = "RegressionModel")
    protected RegressionModel regressionModel;
    @XmlElement(name = "RuleSetModel")
    protected RuleSetModel ruleSetModel;
    @XmlElement(name = "SequenceModel")
    protected SequenceModel sequenceModel;
    @XmlElement(name = "Scorecard")
    protected Scorecard scorecard;
    @XmlElement(name = "SupportVectorMachineModel")
    protected SupportVectorMachineModel supportVectorMachineModel;
    @XmlElement(name = "TextModel")
    protected TextModel textModel;
    @XmlElement(name = "TimeSeriesModel")
    protected TimeSeriesModel timeSeriesModel;
    @XmlElement(name = "TreeModel")
    protected TreeModel treeModel;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "weight")
    protected Double weight;

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
     * Obtiene el valor de la propiedad simplePredicate.
     * 
     * @return
     *     possible object is
     *     {@link SimplePredicate }
     *     
     */
    public SimplePredicate getSimplePredicate() {
        return simplePredicate;
    }

    /**
     * Define el valor de la propiedad simplePredicate.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePredicate }
     *     
     */
    public void setSimplePredicate(SimplePredicate value) {
        this.simplePredicate = value;
    }

    /**
     * Obtiene el valor de la propiedad compoundPredicate.
     * 
     * @return
     *     possible object is
     *     {@link CompoundPredicate }
     *     
     */
    public CompoundPredicate getCompoundPredicate() {
        return compoundPredicate;
    }

    /**
     * Define el valor de la propiedad compoundPredicate.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundPredicate }
     *     
     */
    public void setCompoundPredicate(CompoundPredicate value) {
        this.compoundPredicate = value;
    }

    /**
     * Obtiene el valor de la propiedad simpleSetPredicate.
     * 
     * @return
     *     possible object is
     *     {@link SimpleSetPredicate }
     *     
     */
    public SimpleSetPredicate getSimpleSetPredicate() {
        return simpleSetPredicate;
    }

    /**
     * Define el valor de la propiedad simpleSetPredicate.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleSetPredicate }
     *     
     */
    public void setSimpleSetPredicate(SimpleSetPredicate value) {
        this.simpleSetPredicate = value;
    }

    /**
     * Obtiene el valor de la propiedad true.
     * 
     * @return
     *     possible object is
     *     {@link True }
     *     
     */
    public True getTrue() {
        return _true;
    }

    /**
     * Define el valor de la propiedad true.
     * 
     * @param value
     *     allowed object is
     *     {@link True }
     *     
     */
    public void setTrue(True value) {
        this._true = value;
    }

    /**
     * Obtiene el valor de la propiedad false.
     * 
     * @return
     *     possible object is
     *     {@link False }
     *     
     */
    public False getFalse() {
        return _false;
    }

    /**
     * Define el valor de la propiedad false.
     * 
     * @param value
     *     allowed object is
     *     {@link False }
     *     
     */
    public void setFalse(False value) {
        this._false = value;
    }

    /**
     * Obtiene el valor de la propiedad associationModel.
     * 
     * @return
     *     possible object is
     *     {@link AssociationModel }
     *     
     */
    public AssociationModel getAssociationModel() {
        return associationModel;
    }

    /**
     * Define el valor de la propiedad associationModel.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationModel }
     *     
     */
    public void setAssociationModel(AssociationModel value) {
        this.associationModel = value;
    }

    /**
     * Obtiene el valor de la propiedad bayesianNetworkModel.
     * 
     * @return
     *     possible object is
     *     {@link BayesianNetworkModel }
     *     
     */
    public BayesianNetworkModel getBayesianNetworkModel() {
        return bayesianNetworkModel;
    }

    /**
     * Define el valor de la propiedad bayesianNetworkModel.
     * 
     * @param value
     *     allowed object is
     *     {@link BayesianNetworkModel }
     *     
     */
    public void setBayesianNetworkModel(BayesianNetworkModel value) {
        this.bayesianNetworkModel = value;
    }

    /**
     * Obtiene el valor de la propiedad baselineModel.
     * 
     * @return
     *     possible object is
     *     {@link BaselineModel }
     *     
     */
    public BaselineModel getBaselineModel() {
        return baselineModel;
    }

    /**
     * Define el valor de la propiedad baselineModel.
     * 
     * @param value
     *     allowed object is
     *     {@link BaselineModel }
     *     
     */
    public void setBaselineModel(BaselineModel value) {
        this.baselineModel = value;
    }

    /**
     * Obtiene el valor de la propiedad clusteringModel.
     * 
     * @return
     *     possible object is
     *     {@link ClusteringModel }
     *     
     */
    public ClusteringModel getClusteringModel() {
        return clusteringModel;
    }

    /**
     * Define el valor de la propiedad clusteringModel.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusteringModel }
     *     
     */
    public void setClusteringModel(ClusteringModel value) {
        this.clusteringModel = value;
    }

    /**
     * Obtiene el valor de la propiedad gaussianProcessModel.
     * 
     * @return
     *     possible object is
     *     {@link GaussianProcessModel }
     *     
     */
    public GaussianProcessModel getGaussianProcessModel() {
        return gaussianProcessModel;
    }

    /**
     * Define el valor de la propiedad gaussianProcessModel.
     * 
     * @param value
     *     allowed object is
     *     {@link GaussianProcessModel }
     *     
     */
    public void setGaussianProcessModel(GaussianProcessModel value) {
        this.gaussianProcessModel = value;
    }

    /**
     * Obtiene el valor de la propiedad generalRegressionModel.
     * 
     * @return
     *     possible object is
     *     {@link GeneralRegressionModel }
     *     
     */
    public GeneralRegressionModel getGeneralRegressionModel() {
        return generalRegressionModel;
    }

    /**
     * Define el valor de la propiedad generalRegressionModel.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralRegressionModel }
     *     
     */
    public void setGeneralRegressionModel(GeneralRegressionModel value) {
        this.generalRegressionModel = value;
    }

    /**
     * Obtiene el valor de la propiedad miningModel.
     * 
     * @return
     *     possible object is
     *     {@link MiningModel }
     *     
     */
    public MiningModel getMiningModel() {
        return miningModel;
    }

    /**
     * Define el valor de la propiedad miningModel.
     * 
     * @param value
     *     allowed object is
     *     {@link MiningModel }
     *     
     */
    public void setMiningModel(MiningModel value) {
        this.miningModel = value;
    }

    /**
     * Obtiene el valor de la propiedad naiveBayesModel.
     * 
     * @return
     *     possible object is
     *     {@link NaiveBayesModel }
     *     
     */
    public NaiveBayesModel getNaiveBayesModel() {
        return naiveBayesModel;
    }

    /**
     * Define el valor de la propiedad naiveBayesModel.
     * 
     * @param value
     *     allowed object is
     *     {@link NaiveBayesModel }
     *     
     */
    public void setNaiveBayesModel(NaiveBayesModel value) {
        this.naiveBayesModel = value;
    }

    /**
     * Obtiene el valor de la propiedad nearestNeighborModel.
     * 
     * @return
     *     possible object is
     *     {@link NearestNeighborModel }
     *     
     */
    public NearestNeighborModel getNearestNeighborModel() {
        return nearestNeighborModel;
    }

    /**
     * Define el valor de la propiedad nearestNeighborModel.
     * 
     * @param value
     *     allowed object is
     *     {@link NearestNeighborModel }
     *     
     */
    public void setNearestNeighborModel(NearestNeighborModel value) {
        this.nearestNeighborModel = value;
    }

    /**
     * Obtiene el valor de la propiedad neuralNetwork.
     * 
     * @return
     *     possible object is
     *     {@link NeuralNetwork }
     *     
     */
    public NeuralNetwork getNeuralNetwork() {
        return neuralNetwork;
    }

    /**
     * Define el valor de la propiedad neuralNetwork.
     * 
     * @param value
     *     allowed object is
     *     {@link NeuralNetwork }
     *     
     */
    public void setNeuralNetwork(NeuralNetwork value) {
        this.neuralNetwork = value;
    }

    /**
     * Obtiene el valor de la propiedad regressionModel.
     * 
     * @return
     *     possible object is
     *     {@link RegressionModel }
     *     
     */
    public RegressionModel getRegressionModel() {
        return regressionModel;
    }

    /**
     * Define el valor de la propiedad regressionModel.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionModel }
     *     
     */
    public void setRegressionModel(RegressionModel value) {
        this.regressionModel = value;
    }

    /**
     * Obtiene el valor de la propiedad ruleSetModel.
     * 
     * @return
     *     possible object is
     *     {@link RuleSetModel }
     *     
     */
    public RuleSetModel getRuleSetModel() {
        return ruleSetModel;
    }

    /**
     * Define el valor de la propiedad ruleSetModel.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleSetModel }
     *     
     */
    public void setRuleSetModel(RuleSetModel value) {
        this.ruleSetModel = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceModel.
     * 
     * @return
     *     possible object is
     *     {@link SequenceModel }
     *     
     */
    public SequenceModel getSequenceModel() {
        return sequenceModel;
    }

    /**
     * Define el valor de la propiedad sequenceModel.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceModel }
     *     
     */
    public void setSequenceModel(SequenceModel value) {
        this.sequenceModel = value;
    }

    /**
     * Obtiene el valor de la propiedad scorecard.
     * 
     * @return
     *     possible object is
     *     {@link Scorecard }
     *     
     */
    public Scorecard getScorecard() {
        return scorecard;
    }

    /**
     * Define el valor de la propiedad scorecard.
     * 
     * @param value
     *     allowed object is
     *     {@link Scorecard }
     *     
     */
    public void setScorecard(Scorecard value) {
        this.scorecard = value;
    }

    /**
     * Obtiene el valor de la propiedad supportVectorMachineModel.
     * 
     * @return
     *     possible object is
     *     {@link SupportVectorMachineModel }
     *     
     */
    public SupportVectorMachineModel getSupportVectorMachineModel() {
        return supportVectorMachineModel;
    }

    /**
     * Define el valor de la propiedad supportVectorMachineModel.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportVectorMachineModel }
     *     
     */
    public void setSupportVectorMachineModel(SupportVectorMachineModel value) {
        this.supportVectorMachineModel = value;
    }

    /**
     * Obtiene el valor de la propiedad textModel.
     * 
     * @return
     *     possible object is
     *     {@link TextModel }
     *     
     */
    public TextModel getTextModel() {
        return textModel;
    }

    /**
     * Define el valor de la propiedad textModel.
     * 
     * @param value
     *     allowed object is
     *     {@link TextModel }
     *     
     */
    public void setTextModel(TextModel value) {
        this.textModel = value;
    }

    /**
     * Obtiene el valor de la propiedad timeSeriesModel.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesModel }
     *     
     */
    public TimeSeriesModel getTimeSeriesModel() {
        return timeSeriesModel;
    }

    /**
     * Define el valor de la propiedad timeSeriesModel.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesModel }
     *     
     */
    public void setTimeSeriesModel(TimeSeriesModel value) {
        this.timeSeriesModel = value;
    }

    /**
     * Obtiene el valor de la propiedad treeModel.
     * 
     * @return
     *     possible object is
     *     {@link TreeModel }
     *     
     */
    public TreeModel getTreeModel() {
        return treeModel;
    }

    /**
     * Define el valor de la propiedad treeModel.
     * 
     * @param value
     *     allowed object is
     *     {@link TreeModel }
     *     
     */
    public void setTreeModel(TreeModel value) {
        this.treeModel = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad weight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getWeight() {
        if (weight == null) {
            return  1.0D;
        } else {
            return weight;
        }
    }

    /**
     * Define el valor de la propiedad weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

}
