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
 * <p>Clase Java para RULE-FEATURE.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RULE-FEATURE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="antecedent"/>
 *     &lt;enumeration value="consequent"/>
 *     &lt;enumeration value="rule"/>
 *     &lt;enumeration value="ruleId"/>
 *     &lt;enumeration value="confidence"/>
 *     &lt;enumeration value="support"/>
 *     &lt;enumeration value="lift"/>
 *     &lt;enumeration value="leverage"/>
 *     &lt;enumeration value="affinity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RULE-FEATURE")
@XmlEnum
public enum RULEFEATURE {

    @XmlEnumValue("antecedent")
    ANTECEDENT("antecedent"),
    @XmlEnumValue("consequent")
    CONSEQUENT("consequent"),
    @XmlEnumValue("rule")
    RULE("rule"),
    @XmlEnumValue("ruleId")
    RULE_ID("ruleId"),
    @XmlEnumValue("confidence")
    CONFIDENCE("confidence"),
    @XmlEnumValue("support")
    SUPPORT("support"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("leverage")
    LEVERAGE("leverage"),
    @XmlEnumValue("affinity")
    AFFINITY("affinity");
    private final String value;

    RULEFEATURE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RULEFEATURE fromValue(String v) {
        for (RULEFEATURE c: RULEFEATURE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
