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
 * <p>Clase Java para CONT-SCORING-METHOD.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CONT-SCORING-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="median"/>
 *     &lt;enumeration value="average"/>
 *     &lt;enumeration value="weightedAverage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CONT-SCORING-METHOD")
@XmlEnum
public enum CONTSCORINGMETHOD {

    @XmlEnumValue("median")
    MEDIAN("median"),
    @XmlEnumValue("average")
    AVERAGE("average"),
    @XmlEnumValue("weightedAverage")
    WEIGHTED_AVERAGE("weightedAverage");
    private final String value;

    CONTSCORINGMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CONTSCORINGMETHOD fromValue(String v) {
        for (CONTSCORINGMETHOD c: CONTSCORINGMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
