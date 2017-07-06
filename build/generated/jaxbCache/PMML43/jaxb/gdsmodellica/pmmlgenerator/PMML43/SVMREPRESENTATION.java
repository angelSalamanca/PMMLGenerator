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
 * <p>Clase Java para SVM-REPRESENTATION.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SVM-REPRESENTATION">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SupportVectors"/>
 *     &lt;enumeration value="Coefficients"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SVM-REPRESENTATION")
@XmlEnum
public enum SVMREPRESENTATION {

    @XmlEnumValue("SupportVectors")
    SUPPORT_VECTORS("SupportVectors"),
    @XmlEnumValue("Coefficients")
    COEFFICIENTS("Coefficients");
    private final String value;

    SVMREPRESENTATION(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SVMREPRESENTATION fromValue(String v) {
        for (SVMREPRESENTATION c: SVMREPRESENTATION.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
