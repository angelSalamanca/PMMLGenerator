//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:24 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TIME-EXCEPTION-TYPE.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TIME-EXCEPTION-TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="exclude"/>
 *     &lt;enumeration value="include"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TIME-EXCEPTION-TYPE")
@XmlEnum
public enum TIMEEXCEPTIONTYPE {

    @XmlEnumValue("exclude")
    EXCLUDE("exclude"),
    @XmlEnumValue("include")
    INCLUDE("include");
    private final String value;

    TIMEEXCEPTIONTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMEEXCEPTIONTYPE fromValue(String v) {
        for (TIMEEXCEPTIONTYPE c: TIMEEXCEPTIONTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
