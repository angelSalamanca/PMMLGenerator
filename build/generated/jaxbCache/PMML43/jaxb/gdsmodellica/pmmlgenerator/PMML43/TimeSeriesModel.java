//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.07.19 a las 09:57:14 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}MiningSchema"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Output" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelStats" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelExplanation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TimeSeries" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}SpectralAnalysis" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ARIMA" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ExponentialSmoothing" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}SeasonalTrendDecomposition" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_3}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bestFit" use="required" type="{http://www.dmg.org/PMML-4_3}TIMESERIES-ALGORITHM" />
 *       &lt;attribute name="isScorable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "TimeSeriesModel")
public class TimeSeriesModel {

    @XmlElementRefs({
        @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_3", type = Extension.class, required = false),
        @XmlElementRef(name = "Output", namespace = "http://www.dmg.org/PMML-4_3", type = Output.class, required = false),
        @XmlElementRef(name = "LocalTransformations", namespace = "http://www.dmg.org/PMML-4_3", type = LocalTransformations.class, required = false),
        @XmlElementRef(name = "SpectralAnalysis", namespace = "http://www.dmg.org/PMML-4_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ExponentialSmoothing", namespace = "http://www.dmg.org/PMML-4_3", type = ExponentialSmoothing.class, required = false),
        @XmlElementRef(name = "ModelVerification", namespace = "http://www.dmg.org/PMML-4_3", type = ModelVerification.class, required = false),
        @XmlElementRef(name = "TimeSeries", namespace = "http://www.dmg.org/PMML-4_3", type = TimeSeries.class, required = false),
        @XmlElementRef(name = "ARIMA", namespace = "http://www.dmg.org/PMML-4_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SeasonalTrendDecomposition", namespace = "http://www.dmg.org/PMML-4_3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ModelExplanation", namespace = "http://www.dmg.org/PMML-4_3", type = ModelExplanation.class, required = false),
        @XmlElementRef(name = "MiningSchema", namespace = "http://www.dmg.org/PMML-4_3", type = MiningSchema.class, required = false),
        @XmlElementRef(name = "ModelStats", namespace = "http://www.dmg.org/PMML-4_3", type = ModelStats.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "modelName")
    protected String modelName;
    @XmlAttribute(name = "functionName", required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute(name = "algorithmName")
    protected String algorithmName;
    @XmlAttribute(name = "bestFit", required = true)
    protected TIMESERIESALGORITHM bestFit;
    @XmlAttribute(name = "isScorable")
    protected Boolean isScorable;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "Extension" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 3315 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML43/pmml-4-3.mod.xsd
     * línea 3303 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML43/pmml-4-3.mod.xsd
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * {@link Output }
     * {@link LocalTransformations }
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link ExponentialSmoothing }
     * {@link ModelVerification }
     * {@link TimeSeries }
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link ModelExplanation }
     * {@link MiningSchema }
     * {@link ModelStats }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Obtiene el valor de la propiedad modelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Define el valor de la propiedad modelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Obtiene el valor de la propiedad functionName.
     * 
     * @return
     *     possible object is
     *     {@link MININGFUNCTION }
     *     
     */
    public MININGFUNCTION getFunctionName() {
        return functionName;
    }

    /**
     * Define el valor de la propiedad functionName.
     * 
     * @param value
     *     allowed object is
     *     {@link MININGFUNCTION }
     *     
     */
    public void setFunctionName(MININGFUNCTION value) {
        this.functionName = value;
    }

    /**
     * Obtiene el valor de la propiedad algorithmName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * Define el valor de la propiedad algorithmName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithmName(String value) {
        this.algorithmName = value;
    }

    /**
     * Obtiene el valor de la propiedad bestFit.
     * 
     * @return
     *     possible object is
     *     {@link TIMESERIESALGORITHM }
     *     
     */
    public TIMESERIESALGORITHM getBestFit() {
        return bestFit;
    }

    /**
     * Define el valor de la propiedad bestFit.
     * 
     * @param value
     *     allowed object is
     *     {@link TIMESERIESALGORITHM }
     *     
     */
    public void setBestFit(TIMESERIESALGORITHM value) {
        this.bestFit = value;
    }

    /**
     * Obtiene el valor de la propiedad isScorable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsScorable() {
        if (isScorable == null) {
            return true;
        } else {
            return isScorable;
        }
    }

    /**
     * Define el valor de la propiedad isScorable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsScorable(Boolean value) {
        this.isScorable = value;
    }

}
