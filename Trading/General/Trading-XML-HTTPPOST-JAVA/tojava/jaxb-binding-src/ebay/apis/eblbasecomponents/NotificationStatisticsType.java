//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Summary information about notifications delivered, failed, errors, queued for
 * 				a given application ID and time period.
 * 			
 * 
 * <p>Java class for NotificationStatisticsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationStatisticsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveredCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QueuedNewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QueuedPendingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpiredCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ErrorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationStatisticsType", propOrder = {
    "deliveredCount",
    "queuedNewCount",
    "queuedPendingCount",
    "expiredCount",
    "errorCount"
})
public class NotificationStatisticsType {

    @XmlElement(name = "DeliveredCount")
    protected Integer deliveredCount;
    @XmlElement(name = "QueuedNewCount")
    protected Integer queuedNewCount;
    @XmlElement(name = "QueuedPendingCount")
    protected Integer queuedPendingCount;
    @XmlElement(name = "ExpiredCount")
    protected Integer expiredCount;
    @XmlElement(name = "ErrorCount")
    protected Integer errorCount;

    /**
     * Gets the value of the deliveredCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveredCount() {
        return deliveredCount;
    }

    /**
     * Sets the value of the deliveredCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveredCount(Integer value) {
        this.deliveredCount = value;
    }

    /**
     * Gets the value of the queuedNewCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueuedNewCount() {
        return queuedNewCount;
    }

    /**
     * Sets the value of the queuedNewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueuedNewCount(Integer value) {
        this.queuedNewCount = value;
    }

    /**
     * Gets the value of the queuedPendingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueuedPendingCount() {
        return queuedPendingCount;
    }

    /**
     * Sets the value of the queuedPendingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueuedPendingCount(Integer value) {
        this.queuedPendingCount = value;
    }

    /**
     * Gets the value of the expiredCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiredCount() {
        return expiredCount;
    }

    /**
     * Sets the value of the expiredCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiredCount(Integer value) {
        this.expiredCount = value;
    }

    /**
     * Gets the value of the errorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * Sets the value of the errorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCount(Integer value) {
        this.errorCount = value;
    }

}
