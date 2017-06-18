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
 * <p>Clase Java para CUMULATIVE-LINK-FUNCTION.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CUMULATIVE-LINK-FUNCTION">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="logit"/>
 *     &lt;enumeration value="probit"/>
 *     &lt;enumeration value="cloglog"/>
 *     &lt;enumeration value="loglog"/>
 *     &lt;enumeration value="cauchit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CUMULATIVE-LINK-FUNCTION")
@XmlEnum
public enum CUMULATIVELINKFUNCTION {

    @XmlEnumValue("logit")
    LOGIT("logit"),
    @XmlEnumValue("probit")
    PROBIT("probit"),
    @XmlEnumValue("cloglog")
    CLOGLOG("cloglog"),
    @XmlEnumValue("loglog")
    LOGLOG("loglog"),
    @XmlEnumValue("cauchit")
    CAUCHIT("cauchit");
    private final String value;

    CUMULATIVELINKFUNCTION(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CUMULATIVELINKFUNCTION fromValue(String v) {
        for (CUMULATIVELINKFUNCTION c: CUMULATIVELINKFUNCTION.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
