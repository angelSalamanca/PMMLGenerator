//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;/sequence>
 *       &lt;attribute name="pRow" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCol" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tRow" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tCol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" use="required" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="targetCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension"
})
@XmlRootElement(name = "PCovCell")
public class PCovCell {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "pRow", required = true)
    protected String pRow;
    @XmlAttribute(name = "pCol", required = true)
    protected String pCol;
    @XmlAttribute(name = "tRow")
    protected String tRow;
    @XmlAttribute(name = "tCol")
    protected String tCol;
    @XmlAttribute(name = "value", required = true)
    protected double value;
    @XmlAttribute(name = "targetCategory")
    protected String targetCategory;

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
     * Obtiene el valor de la propiedad pRow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRow() {
        return pRow;
    }

    /**
     * Define el valor de la propiedad pRow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRow(String value) {
        this.pRow = value;
    }

    /**
     * Obtiene el valor de la propiedad pCol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCol() {
        return pCol;
    }

    /**
     * Define el valor de la propiedad pCol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCol(String value) {
        this.pCol = value;
    }

    /**
     * Obtiene el valor de la propiedad tRow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRow() {
        return tRow;
    }

    /**
     * Define el valor de la propiedad tRow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRow(String value) {
        this.tRow = value;
    }

    /**
     * Obtiene el valor de la propiedad tCol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCol() {
        return tCol;
    }

    /**
     * Define el valor de la propiedad tCol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCol(String value) {
        this.tCol = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad targetCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCategory() {
        return targetCategory;
    }

    /**
     * Define el valor de la propiedad targetCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCategory(String value) {
        this.targetCategory = value;
    }

}
