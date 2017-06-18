//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:24 AM CEST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TimeAnchor" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TimeValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="usage" type="{http://www.dmg.org/PMML-4_3}TIMESERIES-USAGE" default="original" />
 *       &lt;attribute name="startTime" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="endTime" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="interpolationMethod" type="{http://www.dmg.org/PMML-4_3}INTERPOLATION-METHOD" default="none" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "timeAnchor",
    "timeValue"
})
@XmlRootElement(name = "TimeSeries")
public class TimeSeries {

    @XmlElement(name = "TimeAnchor")
    protected TimeAnchor timeAnchor;
    @XmlElement(name = "TimeValue")
    protected List<TimeValue> timeValue;
    @XmlAttribute(name = "usage")
    protected TIMESERIESUSAGE usage;
    @XmlAttribute(name = "startTime")
    protected Double startTime;
    @XmlAttribute(name = "endTime")
    protected Double endTime;
    @XmlAttribute(name = "interpolationMethod")
    protected INTERPOLATIONMETHOD interpolationMethod;

    /**
     * Obtiene el valor de la propiedad timeAnchor.
     * 
     * @return
     *     possible object is
     *     {@link TimeAnchor }
     *     
     */
    public TimeAnchor getTimeAnchor() {
        return timeAnchor;
    }

    /**
     * Define el valor de la propiedad timeAnchor.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAnchor }
     *     
     */
    public void setTimeAnchor(TimeAnchor value) {
        this.timeAnchor = value;
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
     * Obtiene el valor de la propiedad usage.
     * 
     * @return
     *     possible object is
     *     {@link TIMESERIESUSAGE }
     *     
     */
    public TIMESERIESUSAGE getUsage() {
        if (usage == null) {
            return TIMESERIESUSAGE.ORIGINAL;
        } else {
            return usage;
        }
    }

    /**
     * Define el valor de la propiedad usage.
     * 
     * @param value
     *     allowed object is
     *     {@link TIMESERIESUSAGE }
     *     
     */
    public void setUsage(TIMESERIESUSAGE value) {
        this.usage = value;
    }

    /**
     * Obtiene el valor de la propiedad startTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartTime() {
        return startTime;
    }

    /**
     * Define el valor de la propiedad startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartTime(Double value) {
        this.startTime = value;
    }

    /**
     * Obtiene el valor de la propiedad endTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEndTime() {
        return endTime;
    }

    /**
     * Define el valor de la propiedad endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEndTime(Double value) {
        this.endTime = value;
    }

    /**
     * Obtiene el valor de la propiedad interpolationMethod.
     * 
     * @return
     *     possible object is
     *     {@link INTERPOLATIONMETHOD }
     *     
     */
    public INTERPOLATIONMETHOD getInterpolationMethod() {
        if (interpolationMethod == null) {
            return INTERPOLATIONMETHOD.NONE;
        } else {
            return interpolationMethod;
        }
    }

    /**
     * Define el valor de la propiedad interpolationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link INTERPOLATIONMETHOD }
     *     
     */
    public void setInterpolationMethod(INTERPOLATIONMETHOD value) {
        this.interpolationMethod = value;
    }

}
