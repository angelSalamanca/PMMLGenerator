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
 * <p>Clase Java para REGRESSIONNORMALIZATIONMETHOD.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="REGRESSIONNORMALIZATIONMETHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="simplemax"/>
 *     &lt;enumeration value="softmax"/>
 *     &lt;enumeration value="logit"/>
 *     &lt;enumeration value="probit"/>
 *     &lt;enumeration value="cloglog"/>
 *     &lt;enumeration value="exp"/>
 *     &lt;enumeration value="loglog"/>
 *     &lt;enumeration value="cauchit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "REGRESSIONNORMALIZATIONMETHOD")
@XmlEnum
public enum REGRESSIONNORMALIZATIONMETHOD {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("simplemax")
    SIMPLEMAX("simplemax"),
    @XmlEnumValue("softmax")
    SOFTMAX("softmax"),
    @XmlEnumValue("logit")
    LOGIT("logit"),
    @XmlEnumValue("probit")
    PROBIT("probit"),
    @XmlEnumValue("cloglog")
    CLOGLOG("cloglog"),
    @XmlEnumValue("exp")
    EXP("exp"),
    @XmlEnumValue("loglog")
    LOGLOG("loglog"),
    @XmlEnumValue("cauchit")
    CAUCHIT("cauchit");
    private final String value;

    REGRESSIONNORMALIZATIONMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static REGRESSIONNORMALIZATIONMETHOD fromValue(String v) {
        for (REGRESSIONNORMALIZATIONMETHOD c: REGRESSIONNORMALIZATIONMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
