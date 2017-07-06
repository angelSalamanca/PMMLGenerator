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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Level"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Trend_ExpoSmooth" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Seasonality_ExpoSmooth" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TimeValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RMSE" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="transformation" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="logarithmic"/>
 *             &lt;enumeration value="squareroot"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "level",
    "trendExpoSmooth",
    "seasonalityExpoSmooth",
    "timeValue"
})
@XmlRootElement(name = "ExponentialSmoothing")
public class ExponentialSmoothing {

    @XmlElement(name = "Level", required = true)
    protected Level level;
    @XmlElement(name = "Trend_ExpoSmooth")
    protected TrendExpoSmooth trendExpoSmooth;
    @XmlElement(name = "Seasonality_ExpoSmooth")
    protected SeasonalityExpoSmooth seasonalityExpoSmooth;
    @XmlElement(name = "TimeValue")
    protected List<TimeValue> timeValue;
    @XmlAttribute(name = "RMSE")
    protected Double rmse;
    @XmlAttribute(name = "transformation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transformation;

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad trendExpoSmooth.
     * 
     * @return
     *     possible object is
     *     {@link TrendExpoSmooth }
     *     
     */
    public TrendExpoSmooth getTrendExpoSmooth() {
        return trendExpoSmooth;
    }

    /**
     * Define el valor de la propiedad trendExpoSmooth.
     * 
     * @param value
     *     allowed object is
     *     {@link TrendExpoSmooth }
     *     
     */
    public void setTrendExpoSmooth(TrendExpoSmooth value) {
        this.trendExpoSmooth = value;
    }

    /**
     * Obtiene el valor de la propiedad seasonalityExpoSmooth.
     * 
     * @return
     *     possible object is
     *     {@link SeasonalityExpoSmooth }
     *     
     */
    public SeasonalityExpoSmooth getSeasonalityExpoSmooth() {
        return seasonalityExpoSmooth;
    }

    /**
     * Define el valor de la propiedad seasonalityExpoSmooth.
     * 
     * @param value
     *     allowed object is
     *     {@link SeasonalityExpoSmooth }
     *     
     */
    public void setSeasonalityExpoSmooth(SeasonalityExpoSmooth value) {
        this.seasonalityExpoSmooth = value;
    }

    /**
     * Gets the value of the timeValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeValue }
     * 
     * 
     */
    public List<TimeValue> getTimeValue() {
        if (timeValue == null) {
            timeValue = new ArrayList<TimeValue>();
        }
        return this.timeValue;
    }

    /**
     * Obtiene el valor de la propiedad rmse.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRMSE() {
        return rmse;
    }

    /**
     * Define el valor de la propiedad rmse.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRMSE(Double value) {
        this.rmse = value;
    }

    /**
     * Obtiene el valor de la propiedad transformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformation() {
        if (transformation == null) {
            return "none";
        } else {
            return transformation;
        }
    }

    /**
     * Define el valor de la propiedad transformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformation(String value) {
        this.transformation = value;
    }

}
