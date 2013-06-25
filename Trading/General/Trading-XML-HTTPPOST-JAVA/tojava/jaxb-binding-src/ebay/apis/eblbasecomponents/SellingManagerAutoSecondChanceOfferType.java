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
 * 				Defines the options available for an automated 
 * 				second chance offer rule.
 * 			
 * 
 * <p>Java class for SellingManagerAutoSecondChanceOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAutoSecondChanceOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecondChanceOfferCondition" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoSecondChanceOfferTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Duration" type="{urn:ebay:apis:eBLBaseComponents}SecondChanceOfferDurationCodeType" minOccurs="0"/>
 *         &lt;element name="ListingHoldInventoryLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerAutoSecondChanceOfferType", propOrder = {
    "secondChanceOfferCondition",
    "amount",
    "profitPercent",
    "duration",
    "listingHoldInventoryLevel"
})
public class SellingManagerAutoSecondChanceOfferType {

    @XmlElement(name = "SecondChanceOfferCondition")
    protected SellingManagerAutoSecondChanceOfferTypeCodeType secondChanceOfferCondition;
    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "ProfitPercent")
    protected Float profitPercent;
    @XmlElement(name = "Duration")
    protected SecondChanceOfferDurationCodeType duration;
    @XmlElement(name = "ListingHoldInventoryLevel")
    protected Integer listingHoldInventoryLevel;

    /**
     * Gets the value of the secondChanceOfferCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoSecondChanceOfferTypeCodeType }
     *     
     */
    public SellingManagerAutoSecondChanceOfferTypeCodeType getSecondChanceOfferCondition() {
        return secondChanceOfferCondition;
    }

    /**
     * Sets the value of the secondChanceOfferCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoSecondChanceOfferTypeCodeType }
     *     
     */
    public void setSecondChanceOfferCondition(SellingManagerAutoSecondChanceOfferTypeCodeType value) {
        this.secondChanceOfferCondition = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the profitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProfitPercent() {
        return profitPercent;
    }

    /**
     * Sets the value of the profitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProfitPercent(Float value) {
        this.profitPercent = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link SecondChanceOfferDurationCodeType }
     *     
     */
    public SecondChanceOfferDurationCodeType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondChanceOfferDurationCodeType }
     *     
     */
    public void setDuration(SecondChanceOfferDurationCodeType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the listingHoldInventoryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListingHoldInventoryLevel() {
        return listingHoldInventoryLevel;
    }

    /**
     * Sets the value of the listingHoldInventoryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListingHoldInventoryLevel(Integer value) {
        this.listingHoldInventoryLevel = value;
    }

}