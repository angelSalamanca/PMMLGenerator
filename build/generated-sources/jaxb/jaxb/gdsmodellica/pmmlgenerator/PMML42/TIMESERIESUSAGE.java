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
 * <p>Clase Java para TIMESERIES-USAGE.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TIMESERIES-USAGE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="original"/>
 *     &lt;enumeration value="logical"/>
 *     &lt;enumeration value="prediction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TIMESERIES-USAGE")
@XmlEnum
public enum TIMESERIESUSAGE {

    @XmlEnumValue("original")
    ORIGINAL("original"),
    @XmlEnumValue("logical")
    LOGICAL("logical"),
    @XmlEnumValue("prediction")
    PREDICTION("prediction");
    private final String value;

    TIMESERIESUSAGE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMESERIESUSAGE fromValue(String v) {
        for (TIMESERIESUSAGE c: TIMESERIESUSAGE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
