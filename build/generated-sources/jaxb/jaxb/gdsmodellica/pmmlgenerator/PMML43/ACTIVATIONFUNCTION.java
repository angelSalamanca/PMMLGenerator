//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:29 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ACTIVATION-FUNCTION.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ACTIVATION-FUNCTION">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="threshold"/>
 *     &lt;enumeration value="logistic"/>
 *     &lt;enumeration value="tanh"/>
 *     &lt;enumeration value="identity"/>
 *     &lt;enumeration value="exponential"/>
 *     &lt;enumeration value="reciprocal"/>
 *     &lt;enumeration value="square"/>
 *     &lt;enumeration value="Gauss"/>
 *     &lt;enumeration value="sine"/>
 *     &lt;enumeration value="cosine"/>
 *     &lt;enumeration value="Elliott"/>
 *     &lt;enumeration value="arctan"/>
 *     &lt;enumeration value="rectifier"/>
 *     &lt;enumeration value="radialBasis"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ACTIVATION-FUNCTION")
@XmlEnum
public enum ACTIVATIONFUNCTION {

    @XmlEnumValue("threshold")
    THRESHOLD("threshold"),
    @XmlEnumValue("logistic")
    LOGISTIC("logistic"),
    @XmlEnumValue("tanh")
    TANH("tanh"),
    @XmlEnumValue("identity")
    IDENTITY("identity"),
    @XmlEnumValue("exponential")
    EXPONENTIAL("exponential"),
    @XmlEnumValue("reciprocal")
    RECIPROCAL("reciprocal"),
    @XmlEnumValue("square")
    SQUARE("square"),
    @XmlEnumValue("Gauss")
    GAUSS("Gauss"),
    @XmlEnumValue("sine")
    SINE("sine"),
    @XmlEnumValue("cosine")
    COSINE("cosine"),
    @XmlEnumValue("Elliott")
    ELLIOTT("Elliott"),
    @XmlEnumValue("arctan")
    ARCTAN("arctan"),
    @XmlEnumValue("rectifier")
    RECTIFIER("rectifier"),
    @XmlEnumValue("radialBasis")
    RADIAL_BASIS("radialBasis");
    private final String value;

    ACTIVATIONFUNCTION(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ACTIVATIONFUNCTION fromValue(String v) {
        for (ACTIVATIONFUNCTION c: ACTIVATIONFUNCTION.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
