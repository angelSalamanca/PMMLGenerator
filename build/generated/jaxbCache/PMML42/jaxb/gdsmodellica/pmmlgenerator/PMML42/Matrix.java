//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

import java.math.BigInteger;
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
 *       &lt;choice minOccurs="0">
 *         &lt;group ref="{http://www.dmg.org/PMML-4_2}NUM-ARRAY" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}MatCell" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="kind" default="any">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="diagonal"/>
 *             &lt;enumeration value="symmetric"/>
 *             &lt;enumeration value="any"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nbRows" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="nbCols" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="diagDefault" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="offDiagDefault" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numarray",
    "matCell"
})
@XmlRootElement(name = "Matrix")
public class Matrix {

    @XmlElement(name = "Array")
    protected List<ArrayType> numarray;
    @XmlElement(name = "MatCell")
    protected List<MatCell> matCell;
    @XmlAttribute(name = "kind")
    protected String kind;
    @XmlAttribute(name = "nbRows")
    protected BigInteger nbRows;
    @XmlAttribute(name = "nbCols")
    protected BigInteger nbCols;
    @XmlAttribute(name = "diagDefault")
    protected Double diagDefault;
    @XmlAttribute(name = "offDiagDefault")
    protected Double offDiagDefault;

    /**
     * Gets the value of the numarray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numarray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNUMARRAY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNUMARRAY() {
        if (numarray == null) {
            numarray = new ArrayList<ArrayType>();
        }
        return this.numarray;
    }

    /**
     * Gets the value of the matCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatCell }
     * 
     * 
     */
    public List<MatCell> getMatCell() {
        if (matCell == null) {
            matCell = new ArrayList<MatCell>();
        }
        return this.matCell;
    }

    /**
     * Obtiene el valor de la propiedad kind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        if (kind == null) {
            return "any";
        } else {
            return kind;
        }
    }

    /**
     * Define el valor de la propiedad kind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Obtiene el valor de la propiedad nbRows.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNbRows() {
        return nbRows;
    }

    /**
     * Define el valor de la propiedad nbRows.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNbRows(BigInteger value) {
        this.nbRows = value;
    }

    /**
     * Obtiene el valor de la propiedad nbCols.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNbCols() {
        return nbCols;
    }

    /**
     * Define el valor de la propiedad nbCols.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNbCols(BigInteger value) {
        this.nbCols = value;
    }

    /**
     * Obtiene el valor de la propiedad diagDefault.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiagDefault() {
        return diagDefault;
    }

    /**
     * Define el valor de la propiedad diagDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiagDefault(Double value) {
        this.diagDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad offDiagDefault.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOffDiagDefault() {
        return offDiagDefault;
    }

    /**
     * Define el valor de la propiedad offDiagDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffDiagDefault(Double value) {
        this.offDiagDefault = value;
    }

}
