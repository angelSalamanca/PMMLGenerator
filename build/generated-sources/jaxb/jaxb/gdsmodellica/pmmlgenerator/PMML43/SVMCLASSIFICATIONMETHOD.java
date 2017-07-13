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
 * <p>Clase Java para SVM-CLASSIFICATION-METHOD.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SVM-CLASSIFICATION-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OneAgainstAll"/>
 *     &lt;enumeration value="OneAgainstOne"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SVM-CLASSIFICATION-METHOD")
@XmlEnum
public enum SVMCLASSIFICATIONMETHOD {

    @XmlEnumValue("OneAgainstAll")
    ONE_AGAINST_ALL("OneAgainstAll"),
    @XmlEnumValue("OneAgainstOne")
    ONE_AGAINST_ONE("OneAgainstOne");
    private final String value;

    SVMCLASSIFICATIONMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SVMCLASSIFICATIONMETHOD fromValue(String v) {
        for (SVMCLASSIFICATIONMETHOD c: SVMCLASSIFICATIONMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
