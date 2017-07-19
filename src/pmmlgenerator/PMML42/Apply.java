//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package pmmlgenerator.PMML42;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_2}EXPRESSION" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="function" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mapMissingTo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="invalidValueTreatment" type="{http://www.dmg.org/PMML-4_2}INVALID-VALUE-TREATMENT-METHOD" default="returnInvalid" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "expression"
})
@XmlRootElement(name = "Apply")
public class Apply {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElements({
        @XmlElement(name = "Constant", type = Constant.class),
        @XmlElement(name = "FieldRef", type = FieldRef.class),
        @XmlElement(name = "NormContinuous", type = NormContinuous.class),
        @XmlElement(name = "NormDiscrete", type = NormDiscrete.class),
        @XmlElement(name = "Discretize", type = Discretize.class),
        @XmlElement(name = "MapValues", type = MapValues.class),
        @XmlElement(name = "TextIndex", type = TextIndex.class),
        @XmlElement(name = "Apply", type = Apply.class),
        @XmlElement(name = "Aggregate", type = Aggregate.class)
    })
    protected List<Object> expression;
    @XmlAttribute(name = "function", required = true)
    protected String function;
    @XmlAttribute(name = "mapMissingTo")
    protected String mapMissingTo;
    @XmlAttribute(name = "defaultValue")
    protected String defaultValue;
    @XmlAttribute(name = "invalidValueTreatment")
    protected INVALIDVALUETREATMENTMETHOD invalidValueTreatment;

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the expression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXPRESSION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Constant }
     * {@link FieldRef }
     * {@link NormContinuous }
     * {@link NormDiscrete }
     * {@link Discretize }
     * {@link MapValues }
     * {@link TextIndex }
     * {@link Apply }
     * {@link Aggregate }
     * 
     * 
     */
    public List<Object> getEXPRESSION() {
        if (expression == null) {
            expression = new ArrayList<Object>();
        }
        return this.expression;
    }

    /**
     * Obtiene el valor de la propiedad function.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Define el valor de la propiedad function.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Obtiene el valor de la propiedad mapMissingTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapMissingTo() {
        return mapMissingTo;
    }

    /**
     * Define el valor de la propiedad mapMissingTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapMissingTo(String value) {
        this.mapMissingTo = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Define el valor de la propiedad defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Obtiene el valor de la propiedad invalidValueTreatment.
     * 
     * @return
     *     possible object is
     *     {@link INVALIDVALUETREATMENTMETHOD }
     *     
     */
    public INVALIDVALUETREATMENTMETHOD getInvalidValueTreatment() {
        if (invalidValueTreatment == null) {
            return INVALIDVALUETREATMENTMETHOD.RETURN_INVALID;
        } else {
            return invalidValueTreatment;
        }
    }

    /**
     * Define el valor de la propiedad invalidValueTreatment.
     * 
     * @param value
     *     allowed object is
     *     {@link INVALIDVALUETREATMENTMETHOD }
     *     
     */
    public void setInvalidValueTreatment(INVALIDVALUETREATMENTMETHOD value) {
        this.invalidValueTreatment = value;
    }

}
