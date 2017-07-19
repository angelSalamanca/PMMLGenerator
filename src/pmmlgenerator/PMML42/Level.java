//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package pmmlgenerator.PMML42;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="alpha" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="smoothedValue" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Level")
public class Level {

    @XmlAttribute(name = "alpha")
    protected Double alpha;
    @XmlAttribute(name = "smoothedValue")
    protected Double smoothedValue;

    /**
     * Obtiene el valor de la propiedad alpha.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAlpha() {
        return alpha;
    }

    /**
     * Define el valor de la propiedad alpha.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAlpha(Double value) {
        this.alpha = value;
    }

    /**
     * Obtiene el valor de la propiedad smoothedValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSmoothedValue() {
        return smoothedValue;
    }

    /**
     * Define el valor de la propiedad smoothedValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSmoothedValue(Double value) {
        this.smoothedValue = value;
    }

}
