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
 * <p>Java class for recommendationVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recommendationVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemNumber" type="{http://codenotfound.com/types/flightsearch}ItemNumberVO" minOccurs="0"/&gt;
 *         &lt;element name="recPriceInfo" type="{http://codenotfound.com/types/flightsearch}recPriceInfoVO" minOccurs="0"/&gt;
 *         &lt;element name="segmentFlightRef" type="{http://codenotfound.com/types/flightsearch}segFlightRefVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paxFareProduct" type="{http://codenotfound.com/types/flightsearch}paxFareProduct" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recommendationVO", propOrder = {
    "itemNumber",
    "recPriceInfo",
    "segmentFlightRef",
    "paxFareProduct"
})
public class RecommendationVO {

    protected ItemNumberVO itemNumber;
    protected RecPriceInfoVO recPriceInfo;
    protected List<SegFlightRefVO> segmentFlightRef;
    protected PaxFareProduct paxFareProduct;

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberVO }
     *     
     */
    public ItemNumberVO getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberVO }
     *     
     */
    public void setItemNumber(ItemNumberVO value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the recPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecPriceInfoVO }
     *     
     */
    public RecPriceInfoVO getRecPriceInfo() {
        return recPriceInfo;
    }

    /**
     * Sets the value of the recPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPriceInfoVO }
     *     
     */
    public void setRecPriceInfo(RecPriceInfoVO value) {
        this.recPriceInfo = value;
    }

    /**
     * Gets the value of the segmentFlightRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentFlightRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentFlightRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegFlightRefVO }
     * 
     * 
     */
    public List<SegFlightRefVO> getSegmentFlightRef() {
        if (segmentFlightRef == null) {
            segmentFlightRef = new ArrayList<SegFlightRefVO>();
        }
        return this.segmentFlightRef;
    }

    /**
     * Gets the value of the paxFareProduct property.
     * 
     * @return
     *     possible object is
     *     {@link PaxFareProduct }
     *     
     */
    public PaxFareProduct getPaxFareProduct() {
        return paxFareProduct;
    }

    /**
     * Sets the value of the paxFareProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxFareProduct }
     *     
     */
    public void setPaxFareProduct(PaxFareProduct value) {
        this.paxFareProduct = value;
    }

}
