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
 * <p>Clase Java para INVALID-VALUE-TREATMENT-METHOD.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="INVALID-VALUE-TREATMENT-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="returnInvalid"/>
 *     &lt;enumeration value="asIs"/>
 *     &lt;enumeration value="asMissing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "INVALID-VALUE-TREATMENT-METHOD")
@XmlEnum
public enum INVALIDVALUETREATMENTMETHOD {

    @XmlEnumValue("returnInvalid")
    RETURN_INVALID("returnInvalid"),
    @XmlEnumValue("asIs")
    AS_IS("asIs"),
    @XmlEnumValue("asMissing")
    AS_MISSING("asMissing");
    private final String value;

    INVALIDVALUETREATMENTMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static INVALIDVALUETREATMENTMETHOD fromValue(String v) {
        for (INVALIDVALUETREATMENTMETHOD c: INVALIDVALUETREATMENTMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
