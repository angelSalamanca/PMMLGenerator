//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.06 a las 10:07:22 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MISSING-VALUE-STRATEGY.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MISSING-VALUE-STRATEGY">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lastPrediction"/>
 *     &lt;enumeration value="nullPrediction"/>
 *     &lt;enumeration value="defaultChild"/>
 *     &lt;enumeration value="weightedConfidence"/>
 *     &lt;enumeration value="aggregateNodes"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MISSING-VALUE-STRATEGY")
@XmlEnum
public enum MISSINGVALUESTRATEGY {

    @XmlEnumValue("lastPrediction")
    LAST_PREDICTION("lastPrediction"),
    @XmlEnumValue("nullPrediction")
    NULL_PREDICTION("nullPrediction"),
    @XmlEnumValue("defaultChild")
    DEFAULT_CHILD("defaultChild"),
    @XmlEnumValue("weightedConfidence")
    WEIGHTED_CONFIDENCE("weightedConfidence"),
    @XmlEnumValue("aggregateNodes")
    AGGREGATE_NODES("aggregateNodes"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    MISSINGVALUESTRATEGY(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MISSINGVALUESTRATEGY fromValue(String v) {
        for (MISSINGVALUESTRATEGY c: MISSINGVALUESTRATEGY.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
