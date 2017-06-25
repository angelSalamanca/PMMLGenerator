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
 * <p>Clase Java para FIELD-USAGE-TYPE.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FIELD-USAGE-TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="predicted"/>
 *     &lt;enumeration value="target"/>
 *     &lt;enumeration value="supplementary"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="order"/>
 *     &lt;enumeration value="frequencyWeight"/>
 *     &lt;enumeration value="analysisWeight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FIELD-USAGE-TYPE")
@XmlEnum
public enum FIELDUSAGETYPE {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("predicted")
    PREDICTED("predicted"),
    @XmlEnumValue("target")
    TARGET("target"),
    @XmlEnumValue("supplementary")
    SUPPLEMENTARY("supplementary"),
    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("order")
    ORDER("order"),
    @XmlEnumValue("frequencyWeight")
    FREQUENCY_WEIGHT("frequencyWeight"),
    @XmlEnumValue("analysisWeight")
    ANALYSIS_WEIGHT("analysisWeight");
    private final String value;

    FIELDUSAGETYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FIELDUSAGETYPE fromValue(String v) {
        for (FIELDUSAGETYPE c: FIELDUSAGETYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
