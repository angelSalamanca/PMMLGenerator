//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.07.19 a las 09:57:14 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OPTYPE.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OPTYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="categorical"/>
 *     &lt;enumeration value="ordinal"/>
 *     &lt;enumeration value="continuous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OPTYPE")
@XmlEnum
public enum OPTYPE {

    @XmlEnumValue("categorical")
    CATEGORICAL("categorical"),
    @XmlEnumValue("ordinal")
    ORDINAL("ordinal"),
    @XmlEnumValue("continuous")
    CONTINUOUS("continuous");
    private final String value;

    OPTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OPTYPE fromValue(String v) {
        for (OPTYPE c: OPTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
