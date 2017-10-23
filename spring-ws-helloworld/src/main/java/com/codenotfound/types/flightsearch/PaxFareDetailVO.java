//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.17 at 11:06:24 AM IST 
//


package com.codenotfound.types.flightsearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paxFareDetailVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paxFareDetailVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paxFareNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalFareAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="codeShareDetails" type="{http://codenotfound.com/types/flightsearch}CodeShareDetailsVO" minOccurs="0"/&gt;
 *         &lt;element name="monetaryDetails" type="{http://codenotfound.com/types/flightsearch}monetaryDetailVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pricingTicketing" type="{http://codenotfound.com/types/flightsearch}PricingTktVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paxFareDetailVO", propOrder = {
    "paxFareNum",
    "totalFareAmount",
    "totalTaxAmount",
    "codeShareDetails",
    "monetaryDetails",
    "pricingTicketing"
})
public class PaxFareDetailVO {

    protected int paxFareNum;
    protected double totalFareAmount = 256.76;
    protected double totalTaxAmount;
    protected CodeShareDetailsVO codeShareDetails;
    protected List<MonetaryDetailVO> monetaryDetails;
    protected PricingTktVO pricingTicketing;

    /**
     * Gets the value of the paxFareNum property.
     * 
     */
    public int getPaxFareNum() {
        return paxFareNum;
    }

    /**
     * Sets the value of the paxFareNum property.
     * 
     */
    public void setPaxFareNum(int value) {
        this.paxFareNum = value;
    }

    /**
     * Gets the value of the totalFareAmount property.
     * 
     */
    public double getTotalFareAmount() {
        return totalFareAmount;
    }

    /**
     * Sets the value of the totalFareAmount property.
     * 
     */
    public void setTotalFareAmount(double value) {
        this.totalFareAmount = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     */
    public double getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     */
    public void setTotalTaxAmount(double value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the codeShareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CodeShareDetailsVO }
     *     
     */
    public CodeShareDetailsVO getCodeShareDetails() {
        return codeShareDetails;
    }

    /**
     * Sets the value of the codeShareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeShareDetailsVO }
     *     
     */
    public void setCodeShareDetails(CodeShareDetailsVO value) {
        this.codeShareDetails = value;
    }

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryDetailVO }
     * 
     * 
     */
    public List<MonetaryDetailVO> getMonetaryDetails() {
        if (monetaryDetails == null) {
            monetaryDetails = new ArrayList<MonetaryDetailVO>();
        }
        return this.monetaryDetails;
    }

    /**
     * Gets the value of the pricingTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTktVO }
     *     
     */
    public PricingTktVO getPricingTicketing() {
        return pricingTicketing;
    }

    /**
     * Sets the value of the pricingTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTktVO }
     *     
     */
    public void setPricingTicketing(PricingTktVO value) {
        this.pricingTicketing = value;
    }

}