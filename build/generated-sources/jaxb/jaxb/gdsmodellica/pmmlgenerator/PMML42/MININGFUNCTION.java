//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:21 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MINING-FUNCTION.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MINING-FUNCTION">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="associationRules"/>
 *     &lt;enumeration value="sequences"/>
 *     &lt;enumeration value="classification"/>
 *     &lt;enumeration value="regression"/>
 *     &lt;enumeration value="clustering"/>
 *     &lt;enumeration value="timeSeries"/>
 *     &lt;enumeration value="mixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MINING-FUNCTION")
@XmlEnum
public enum MININGFUNCTION {

    @XmlEnumValue("associationRules")
    ASSOCIATION_RULES("associationRules"),
    @XmlEnumValue("sequences")
    SEQUENCES("sequences"),
    @XmlEnumValue("classification")
    CLASSIFICATION("classification"),
    @XmlEnumValue("regression")
    REGRESSION("regression"),
    @XmlEnumValue("clustering")
    CLUSTERING("clustering"),
    @XmlEnumValue("timeSeries")
    TIME_SERIES("timeSeries"),
    @XmlEnumValue("mixed")
    MIXED("mixed");
    private final String value;

    MININGFUNCTION(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MININGFUNCTION fromValue(String v) {
        for (MININGFUNCTION c: MININGFUNCTION.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
