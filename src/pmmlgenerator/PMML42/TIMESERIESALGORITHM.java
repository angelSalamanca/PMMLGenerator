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
 * <p>Clase Java para TIMESERIES-ALGORITHM.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TIMESERIES-ALGORITHM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARIMA"/>
 *     &lt;enumeration value="ExponentialSmoothing"/>
 *     &lt;enumeration value="SeasonalTrendDecomposition"/>
 *     &lt;enumeration value="SpectralAnalysis"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TIMESERIES-ALGORITHM")
@XmlEnum
public enum TIMESERIESALGORITHM {

    ARIMA("ARIMA"),
    @XmlEnumValue("ExponentialSmoothing")
    EXPONENTIAL_SMOOTHING("ExponentialSmoothing"),
    @XmlEnumValue("SeasonalTrendDecomposition")
    SEASONAL_TREND_DECOMPOSITION("SeasonalTrendDecomposition"),
    @XmlEnumValue("SpectralAnalysis")
    SPECTRAL_ANALYSIS("SpectralAnalysis");
    private final String value;

    TIMESERIESALGORITHM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMESERIESALGORITHM fromValue(String v) {
        for (TIMESERIESALGORITHM c: TIMESERIESALGORITHM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
