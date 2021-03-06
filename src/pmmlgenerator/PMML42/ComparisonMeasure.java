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
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}euclidean"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}squaredEuclidean"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}chebychev"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}cityBlock"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}minkowski"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}simpleMatching"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}jaccard"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}tanimoto"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_2}binarySimilarity"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="kind" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="distance"/>
 *             &lt;enumeration value="similarity"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="compareFunction" type="{http://www.dmg.org/PMML-4_2}COMPARE-FUNCTION" default="absDiff" />
 *       &lt;attribute name="minimum" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="maximum" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
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
    "euclidean",
    "squaredEuclidean",
    "chebychev",
    "cityBlock",
    "minkowski",
    "simpleMatching",
    "jaccard",
    "tanimoto",
    "binarySimilarity"
})
@XmlRootElement(name = "ComparisonMeasure")
public class ComparisonMeasure {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    protected Euclidean euclidean;
    protected SquaredEuclidean squaredEuclidean;
    protected Chebychev chebychev;
    protected CityBlock cityBlock;
    protected Minkowski minkowski;
    protected SimpleMatching simpleMatching;
    protected Jaccard jaccard;
    protected Tanimoto tanimoto;
    protected BinarySimilarity binarySimilarity;
    @XmlAttribute(name = "kind", required = true)
    protected String kind;
    @XmlAttribute(name = "compareFunction")
    protected COMPAREFUNCTION compareFunction;
    @XmlAttribute(name = "minimum")
    protected Double minimum;
    @XmlAttribute(name = "maximum")
    protected Double maximum;

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
     * Obtiene el valor de la propiedad euclidean.
     * 
     * @return
     *     possible object is
     *     {@link Euclidean }
     *     
     */
    public Euclidean getEuclidean() {
        return euclidean;
    }

    /**
     * Define el valor de la propiedad euclidean.
     * 
     * @param value
     *     allowed object is
     *     {@link Euclidean }
     *     
     */
    public void setEuclidean(Euclidean value) {
        this.euclidean = value;
    }

    /**
     * Obtiene el valor de la propiedad squaredEuclidean.
     * 
     * @return
     *     possible object is
     *     {@link SquaredEuclidean }
     *     
     */
    public SquaredEuclidean getSquaredEuclidean() {
        return squaredEuclidean;
    }

    /**
     * Define el valor de la propiedad squaredEuclidean.
     * 
     * @param value
     *     allowed object is
     *     {@link SquaredEuclidean }
     *     
     */
    public void setSquaredEuclidean(SquaredEuclidean value) {
        this.squaredEuclidean = value;
    }

    /**
     * Obtiene el valor de la propiedad chebychev.
     * 
     * @return
     *     possible object is
     *     {@link Chebychev }
     *     
     */
    public Chebychev getChebychev() {
        return chebychev;
    }

    /**
     * Define el valor de la propiedad chebychev.
     * 
     * @param value
     *     allowed object is
     *     {@link Chebychev }
     *     
     */
    public void setChebychev(Chebychev value) {
        this.chebychev = value;
    }

    /**
     * Obtiene el valor de la propiedad cityBlock.
     * 
     * @return
     *     possible object is
     *     {@link CityBlock }
     *     
     */
    public CityBlock getCityBlock() {
        return cityBlock;
    }

    /**
     * Define el valor de la propiedad cityBlock.
     * 
     * @param value
     *     allowed object is
     *     {@link CityBlock }
     *     
     */
    public void setCityBlock(CityBlock value) {
        this.cityBlock = value;
    }

    /**
     * Obtiene el valor de la propiedad minkowski.
     * 
     * @return
     *     possible object is
     *     {@link Minkowski }
     *     
     */
    public Minkowski getMinkowski() {
        return minkowski;
    }

    /**
     * Define el valor de la propiedad minkowski.
     * 
     * @param value
     *     allowed object is
     *     {@link Minkowski }
     *     
     */
    public void setMinkowski(Minkowski value) {
        this.minkowski = value;
    }

    /**
     * Obtiene el valor de la propiedad simpleMatching.
     * 
     * @return
     *     possible object is
     *     {@link SimpleMatching }
     *     
     */
    public SimpleMatching getSimpleMatching() {
        return simpleMatching;
    }

    /**
     * Define el valor de la propiedad simpleMatching.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleMatching }
     *     
     */
    public void setSimpleMatching(SimpleMatching value) {
        this.simpleMatching = value;
    }

    /**
     * Obtiene el valor de la propiedad jaccard.
     * 
     * @return
     *     possible object is
     *     {@link Jaccard }
     *     
     */
    public Jaccard getJaccard() {
        return jaccard;
    }

    /**
     * Define el valor de la propiedad jaccard.
     * 
     * @param value
     *     allowed object is
     *     {@link Jaccard }
     *     
     */
    public void setJaccard(Jaccard value) {
        this.jaccard = value;
    }

    /**
     * Obtiene el valor de la propiedad tanimoto.
     * 
     * @return
     *     possible object is
     *     {@link Tanimoto }
     *     
     */
    public Tanimoto getTanimoto() {
        return tanimoto;
    }

    /**
     * Define el valor de la propiedad tanimoto.
     * 
     * @param value
     *     allowed object is
     *     {@link Tanimoto }
     *     
     */
    public void setTanimoto(Tanimoto value) {
        this.tanimoto = value;
    }

    /**
     * Obtiene el valor de la propiedad binarySimilarity.
     * 
     * @return
     *     possible object is
     *     {@link BinarySimilarity }
     *     
     */
    public BinarySimilarity getBinarySimilarity() {
        return binarySimilarity;
    }

    /**
     * Define el valor de la propiedad binarySimilarity.
     * 
     * @param value
     *     allowed object is
     *     {@link BinarySimilarity }
     *     
     */
    public void setBinarySimilarity(BinarySimilarity value) {
        this.binarySimilarity = value;
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
        return kind;
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
     * Obtiene el valor de la propiedad compareFunction.
     * 
     * @return
     *     possible object is
     *     {@link COMPAREFUNCTION }
     *     
     */
    public COMPAREFUNCTION getCompareFunction() {
        if (compareFunction == null) {
            return COMPAREFUNCTION.ABS_DIFF;
        } else {
            return compareFunction;
        }
    }

    /**
     * Define el valor de la propiedad compareFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPAREFUNCTION }
     *     
     */
    public void setCompareFunction(COMPAREFUNCTION value) {
        this.compareFunction = value;
    }

    /**
     * Obtiene el valor de la propiedad minimum.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * Define el valor de la propiedad minimum.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimum(Double value) {
        this.minimum = value;
    }

    /**
     * Obtiene el valor de la propiedad maximum.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximum() {
        return maximum;
    }

    /**
     * Define el valor de la propiedad maximum.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximum(Double value) {
        this.maximum = value;
    }

}
