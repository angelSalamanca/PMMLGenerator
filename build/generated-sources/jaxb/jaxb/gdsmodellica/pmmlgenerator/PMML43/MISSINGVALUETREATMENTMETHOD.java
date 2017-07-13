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
 * <p>Clase Java para MISSING-VALUE-TREATMENT-METHOD.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MISSING-VALUE-TREATMENT-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="asIs"/>
 *     &lt;enumeration value="asMean"/>
 *     &lt;enumeration value="asMode"/>
 *     &lt;enumeration value="asMedian"/>
 *     &lt;enumeration value="asValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MISSING-VALUE-TREATMENT-METHOD")
@XmlEnum
public enum MISSINGVALUETREATMENTMETHOD {

    @XmlEnumValue("asIs")
    AS_IS("asIs"),
    @XmlEnumValue("asMean")
    AS_MEAN("asMean"),
    @XmlEnumValue("asMode")
    AS_MODE("asMode"),
    @XmlEnumValue("asMedian")
    AS_MEDIAN("asMedian"),
    @XmlEnumValue("asValue")
    AS_VALUE("asValue");
    private final String value;

    MISSINGVALUETREATMENTMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MISSINGVALUETREATMENTMETHOD fromValue(String v) {
        for (MISSINGVALUETREATMENTMETHOD c: MISSINGVALUETREATMENTMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
