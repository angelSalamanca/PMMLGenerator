//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.06 a las 10:07:19 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para INTERPOLATION-METHOD.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="INTERPOLATION-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="linear"/>
 *     &lt;enumeration value="exponentialSpline"/>
 *     &lt;enumeration value="cubicSpline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "INTERPOLATION-METHOD")
@XmlEnum
public enum INTERPOLATIONMETHOD {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("linear")
    LINEAR("linear"),
    @XmlEnumValue("exponentialSpline")
    EXPONENTIAL_SPLINE("exponentialSpline"),
    @XmlEnumValue("cubicSpline")
    CUBIC_SPLINE("cubicSpline");
    private final String value;

    INTERPOLATIONMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static INTERPOLATIONMETHOD fromValue(String v) {
        for (INTERPOLATIONMETHOD c: INTERPOLATIONMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
