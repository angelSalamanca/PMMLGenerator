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
 * <p>Clase Java para BASELINE-TEST-STATISTIC.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="BASELINE-TEST-STATISTIC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="zValue"/>
 *     &lt;enumeration value="chiSquareIndependence"/>
 *     &lt;enumeration value="chiSquareDistribution"/>
 *     &lt;enumeration value="CUSUM"/>
 *     &lt;enumeration value="scalarProduct"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BASELINE-TEST-STATISTIC")
@XmlEnum
public enum BASELINETESTSTATISTIC {

    @XmlEnumValue("zValue")
    Z_VALUE("zValue"),
    @XmlEnumValue("chiSquareIndependence")
    CHI_SQUARE_INDEPENDENCE("chiSquareIndependence"),
    @XmlEnumValue("chiSquareDistribution")
    CHI_SQUARE_DISTRIBUTION("chiSquareDistribution"),
    CUSUM("CUSUM"),
    @XmlEnumValue("scalarProduct")
    SCALAR_PRODUCT("scalarProduct");
    private final String value;

    BASELINETESTSTATISTIC(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BASELINETESTSTATISTIC fromValue(String v) {
        for (BASELINETESTSTATISTIC c: BASELINETESTSTATISTIC.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
