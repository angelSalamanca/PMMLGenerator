//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package pmmlgenerator.PMML42;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para COMPARE-FUNCTION.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="COMPARE-FUNCTION">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="absDiff"/>
 *     &lt;enumeration value="gaussSim"/>
 *     &lt;enumeration value="delta"/>
 *     &lt;enumeration value="equal"/>
 *     &lt;enumeration value="table"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COMPARE-FUNCTION")
@XmlEnum
public enum COMPAREFUNCTION {

    @XmlEnumValue("absDiff")
    ABS_DIFF("absDiff"),
    @XmlEnumValue("gaussSim")
    GAUSS_SIM("gaussSim"),
    @XmlEnumValue("delta")
    DELTA("delta"),
    @XmlEnumValue("equal")
    EQUAL("equal"),
    @XmlEnumValue("table")
    TABLE("table");
    private final String value;

    COMPAREFUNCTION(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COMPAREFUNCTION fromValue(String v) {
        for (COMPAREFUNCTION c: COMPAREFUNCTION.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
