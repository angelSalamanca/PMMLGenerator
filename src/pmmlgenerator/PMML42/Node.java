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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"extensions", "predicate", "partition", "scoreDistributions", "nodes", "embeddedModel"})
@XmlRootElement(name = "Node", namespace = "http://www.dmg.org/PMML-4_2")
public class Node  {

    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "score")    
    private String score;
    @XmlAttribute(name = "recordCount")
    private Double recordCount;
    @XmlAttribute(name = "defaultChild")  
    private String defaultChild;
    @XmlElement(name = "Extension", namespace = "http://www.dmg.org/PMML-4_2")
    private List<Extension> extensions;
    @XmlElements(value = {
        @XmlElement(name = "SimplePredicate", namespace = "http://www.dmg.org/PMML-4_2", type = SimplePredicate.class),
        @XmlElement(name = "CompoundPredicate", namespace = "http://www.dmg.org/PMML-4_2", type = CompoundPredicate.class),
        @XmlElement(name = "SimpleSetPredicate", namespace = "http://www.dmg.org/PMML-4_2", type = SimpleSetPredicate.class),
        @XmlElement(name = "True", namespace = "http://www.dmg.org/PMML-4_2", type = True.class),
        @XmlElement(name = "False", namespace = "http://www.dmg.org/PMML-4_2", type = False.class)})
    private Object predicate;
    @XmlElement(name = "Partition", namespace = "http://www.dmg.org/PMML-4_2")
    private Partition partition;
    @XmlElement(name = "ScoreDistribution", namespace = "http://www.dmg.org/PMML-4_2")
    private List<ScoreDistribution> scoreDistributions;
    @XmlElement(name = "Node", namespace = "http://www.dmg.org/PMML-4_2")
    private List<Node> nodes;
    @XmlElements(value = {
        @XmlElement(name = "Regression", namespace = "http://www.dmg.org/PMML-4_2", type = Regression.class),
        @XmlElement(name = "DecisionTree", namespace = "http://www.dmg.org/PMML-4_2", type = DecisionTree.class)})
    private Object embeddedModel;
    private static final long serialVersionUID = 67305473L;
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
     * {@link DecisionTree }
     * {@link Partition }
     * {@link ScoreDistribution }
     * {@link Extension }
     * {@link CompoundPredicate }
     * {@link False }
     * {@link Node }
     * {@link SimpleSetPredicate }
     * {@link Regression }
     * 
     * 
     */
  
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

    public List<ScoreDistribution> getScoreDistributions()
    {
        return this.scoreDistributions;
    }
    
    public List<Node> getNodes()
    {
        if (nodes == null)
        {
            nodes = new ArrayList<Node>();
        }
        return this.nodes;
    }
    
     public void setScoreDistributions(List<ScoreDistribution> sd)
    {
       this.scoreDistributions = sd;
    }
    
     public void setPredicate(Object p)
     {
         this.predicate = p;
     }
}

