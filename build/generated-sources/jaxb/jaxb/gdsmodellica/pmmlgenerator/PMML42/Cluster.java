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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}KohonenMap" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_2}NUM-ARRAY" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Partition" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Covariances" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
    "kohonenMap",
    "array",
    "partition",
    "covariances"
})
@XmlRootElement(name = "Cluster")
public class Cluster {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "KohonenMap")
    protected KohonenMap kohonenMap;
    @XmlElement(name = "Array")
    protected ArrayType array;
    @XmlElement(name = "Partition")
    protected Partition partition;
    @XmlElement(name = "Covariances")
    protected Covariances covariances;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "size")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger size;

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
     * Obtiene el valor de la propiedad kohonenMap.
     * 
     * @return
     *     possible object is
     *     {@link KohonenMap }
     *     
     */
    public KohonenMap getKohonenMap() {
        return kohonenMap;
    }

    /**
     * Define el valor de la propiedad kohonenMap.
     * 
     * @param value
     *     allowed object is
     *     {@link KohonenMap }
     *     
     */
    public void setKohonenMap(KohonenMap value) {
        this.kohonenMap = value;
    }

    /**
     * Obtiene el valor de la propiedad array.
     * 
     * @return
     *     possible object is
     *     {@link ArrayType }
     *     
     */
    public ArrayType getArray() {
        return array;
    }

    /**
     * Define el valor de la propiedad array.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayType }
     *     
     */
    public void setArray(ArrayType value) {
        this.array = value;
    }

    /**
     * Obtiene el valor de la propiedad partition.
     * 
     * @return
     *     possible object is
     *     {@link Partition }
     *     
     */
    public Partition getPartition() {
        return partition;
    }

    /**
     * Define el valor de la propiedad partition.
     * 
     * @param value
     *     allowed object is
     *     {@link Partition }
     *     
     */
    public void setPartition(Partition value) {
        this.partition = value;
    }

    /**
     * Obtiene el valor de la propiedad covariances.
     * 
     * @return
     *     possible object is
     *     {@link Covariances }
     *     
     */
    public Covariances getCovariances() {
        return covariances;
    }

    /**
     * Define el valor de la propiedad covariances.
     * 
     * @param value
     *     allowed object is
     *     {@link Covariances }
     *     
     */
    public void setCovariances(Covariances value) {
        this.covariances = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad size.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Define el valor de la propiedad size.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

}
