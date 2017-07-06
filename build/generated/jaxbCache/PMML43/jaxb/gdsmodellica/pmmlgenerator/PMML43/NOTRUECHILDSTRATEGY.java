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
 * <p>Clase Java para NO-TRUE-CHILD-STRATEGY.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="NO-TRUE-CHILD-STRATEGY">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="returnNullPrediction"/>
 *     &lt;enumeration value="returnLastPrediction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NO-TRUE-CHILD-STRATEGY")
@XmlEnum
public enum NOTRUECHILDSTRATEGY {

    @XmlEnumValue("returnNullPrediction")
    RETURN_NULL_PREDICTION("returnNullPrediction"),
    @XmlEnumValue("returnLastPrediction")
    RETURN_LAST_PREDICTION("returnLastPrediction");
    private final String value;

    NOTRUECHILDSTRATEGY(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NOTRUECHILDSTRATEGY fromValue(String v) {
        for (NOTRUECHILDSTRATEGY c: NOTRUECHILDSTRATEGY.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
