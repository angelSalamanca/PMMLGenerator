//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:21 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_2}PREDICATE"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_2}Partition" minOccurs="0"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_2}ScoreDistribution" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_2}Node" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;group ref="{http://www.dmg.org/PMML-4_2}EmbeddedModel"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordCount" type="{http://www.dmg.org/PMML-4_2}NUMBER" />
 *       &lt;attribute name="defaultChild" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Node")
public class Node {

    @XmlElementRefs({
        @XmlElementRef(name = "SimplePredicate", namespace = "http://www.dmg.org/PMML-4_2", type = SimplePredicate.class, required = false),
        @XmlElementRef(name = "True", namespace = "http://www.dmg.org/PMML-4_2", type = True.class, required = false),
        @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_2", type = Extension.class, required = false),
        @XmlElementRef(name = "ScoreDistribution", namespace = "http://www.dmg.org/PMML-4_2", type = ScoreDistribution.class, required = false),
        @XmlElementRef(name = "Node", namespace = "http://www.dmg.org/PMML-4_2", type = Node.class, required = false),
        @XmlElementRef(name = "DecisionTree", namespace = "http://www.dmg.org/PMML-4_2", type = DecisionTree.class, required = false),
        @XmlElementRef(name = "False", namespace = "http://www.dmg.org/PMML-4_2", type = False.class, required = false),
        @XmlElementRef(name = "CompoundPredicate", namespace = "http://www.dmg.org/PMML-4_2", type = CompoundPredicate.class, required = false),
        @XmlElementRef(name = "SimpleSetPredicate", namespace = "http://www.dmg.org/PMML-4_2", type = SimpleSetPredicate.class, required = false),
        @XmlElementRef(name = "Regression", namespace = "http://www.dmg.org/PMML-4_2", type = Regression.class, required = false),
        @XmlElementRef(name = "Partition", namespace = "http://www.dmg.org/PMML-4_2", type = Partition.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "score")
    protected String score;
    @XmlAttribute(name = "recordCount")
    protected Double recordCount;
    @XmlAttribute(name = "defaultChild")
    protected String defaultChild;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "Extension" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 93 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML42/pmml-4-2.mod..xsd
     * línea 3337 de file:/D:/Java%20Projects/PMMLGenerator/xml-resources/jaxb/PMML42/pmml-4-2.mod..xsd
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePredicate }
     * {@link True }
     * {@link Extension }
     * {@link ScoreDistribution }
     * {@link Node }
     * {@link DecisionTree }
     * {@link False }
     * {@link CompoundPredicate }
     * {@link SimpleSetPredicate }
     * {@link Regression }
     * {@link Partition }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * Obtiene el valor de la propiedad score.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Define el valor de la propiedad score.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

    /**
     * Obtiene el valor de la propiedad recordCount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecordCount() {
        return recordCount;
    }

    /**
     * Define el valor de la propiedad recordCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecordCount(Double value) {
        this.recordCount = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultChild.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultChild() {
        return defaultChild;
    }

    /**
     * Define el valor de la propiedad defaultChild.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultChild(String value) {
        this.defaultChild = value;
    }

}
