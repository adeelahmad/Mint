//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.04 at 01:49:42 PM EEST 
//


package gr.ntua.ivml.mint.rdf.edm.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An event is a change “of states in cultural, social or physical systems,
 * regardless of scale, brought about by a series or group of coherent physical,
 * cultural, technological or legal phenomena” (E5 Event in CIDOC CRM) or a
 * “set of coherent phenomena or cultural manifestations bounded in time and
 * space” (E4 Period in CIDOC CRM)
 * 
 * Example:the act of painting Mona Lisa, the 2nd World War, the change of custody of Mona Lisa
 * 
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="happenedAt" type="{http://www.example.org/EDMSchemaV9}PlaceType"/>
 *         &lt;element name="occuredAt" type="{http://www.example.org/EDMSchemaV9}TimeSpanType"/>
 *         &lt;element name="agentWasPresentAt" type="{http://www.example.org/EDMSchemaV9}AgentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="physThWasPresentAt" type="{http://www.example.org/EDMSchemaV9}PhysicalThingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="infResWasPresentAt" type="{http://www.example.org/EDMSchemaV9}InformationResourceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {
    "happenedAt",
    "occuredAt",
    "agentWasPresentAt",
    "physThWasPresentAt",
    "infResWasPresentAt"
})
public class EventType {

    @XmlElement(required = true)
    protected PlaceType happenedAt;
    @XmlElement(required = true)
    protected TimeSpanType occuredAt;
    protected List<AgentType> agentWasPresentAt;
    protected List<PhysicalThingType> physThWasPresentAt;
    protected List<InformationResourceType> infResWasPresentAt;

    /**
     * Gets the value of the happenedAt property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceType }
     *     
     */
    public PlaceType getHappenedAt() {
        return happenedAt;
    }

    /**
     * Sets the value of the happenedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceType }
     *     
     */
    public void setHappenedAt(PlaceType value) {
        this.happenedAt = value;
    }

    /**
     * Gets the value of the occuredAt property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpanType }
     *     
     */
    public TimeSpanType getOccuredAt() {
        return occuredAt;
    }

    /**
     * Sets the value of the occuredAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpanType }
     *     
     */
    public void setOccuredAt(TimeSpanType value) {
        this.occuredAt = value;
    }

    /**
     * Gets the value of the agentWasPresentAt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentWasPresentAt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentWasPresentAt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentType }
     * 
     * 
     */
    public List<AgentType> getAgentWasPresentAt() {
        if (agentWasPresentAt == null) {
            agentWasPresentAt = new ArrayList<AgentType>();
        }
        return this.agentWasPresentAt;
    }

    /**
     * Gets the value of the physThWasPresentAt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physThWasPresentAt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysThWasPresentAt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalThingType }
     * 
     * 
     */
    public List<PhysicalThingType> getPhysThWasPresentAt() {
        if (physThWasPresentAt == null) {
            physThWasPresentAt = new ArrayList<PhysicalThingType>();
        }
        return this.physThWasPresentAt;
    }

    /**
     * Gets the value of the infResWasPresentAt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infResWasPresentAt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfResWasPresentAt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationResourceType }
     * 
     * 
     */
    public List<InformationResourceType> getInfResWasPresentAt() {
        if (infResWasPresentAt == null) {
            infResWasPresentAt = new ArrayList<InformationResourceType>();
        }
        return this.infResWasPresentAt;
    }

}
