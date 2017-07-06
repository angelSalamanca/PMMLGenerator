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
 * <p>Clase Java para VALID-TIME-SPEC.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="VALID-TIME-SPEC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="includeAll"/>
 *     &lt;enumeration value="includeFromTo"/>
 *     &lt;enumeration value="excludeFromTo"/>
 *     &lt;enumeration value="includeSet"/>
 *     &lt;enumeration value="excludeSet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VALID-TIME-SPEC")
@XmlEnum
public enum VALIDTIMESPEC {

    @XmlEnumValue("includeAll")
    INCLUDE_ALL("includeAll"),
    @XmlEnumValue("includeFromTo")
    INCLUDE_FROM_TO("includeFromTo"),
    @XmlEnumValue("excludeFromTo")
    EXCLUDE_FROM_TO("excludeFromTo"),
    @XmlEnumValue("includeSet")
    INCLUDE_SET("includeSet"),
    @XmlEnumValue("excludeSet")
    EXCLUDE_SET("excludeSet");
    private final String value;

    VALIDTIMESPEC(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VALIDTIMESPEC fromValue(String v) {
        for (VALIDTIMESPEC c: VALIDTIMESPEC.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
