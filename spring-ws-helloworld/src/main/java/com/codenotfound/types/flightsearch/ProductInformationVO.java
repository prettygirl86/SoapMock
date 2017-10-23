//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.17 at 11:06:24 AM IST 
//


package com.codenotfound.types.flightsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductInformationVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cabinProduct" type="{http://codenotfound.com/types/flightsearch}CabinPdtVO" minOccurs="0"/&gt;
 *         &lt;element name="fareProductDetail" type="{http://codenotfound.com/types/flightsearch}FarePdtDetailVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationVO", propOrder = {
    "cabinProduct",
    "fareProductDetail"
})
public class ProductInformationVO {

    protected CabinPdtVO cabinProduct;
    protected FarePdtDetailVO fareProductDetail;

    /**
     * Gets the value of the cabinProduct property.
     * 
     * @return
     *     possible object is
     *     {@link CabinPdtVO }
     *     
     */
    public CabinPdtVO getCabinProduct() {
        return cabinProduct;
    }

    /**
     * Sets the value of the cabinProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinPdtVO }
     *     
     */
    public void setCabinProduct(CabinPdtVO value) {
        this.cabinProduct = value;
    }

    /**
     * Gets the value of the fareProductDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FarePdtDetailVO }
     *     
     */
    public FarePdtDetailVO getFareProductDetail() {
        return fareProductDetail;
    }

    /**
     * Sets the value of the fareProductDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePdtDetailVO }
     *     
     */
    public void setFareProductDetail(FarePdtDetailVO value) {
        this.fareProductDetail = value;
    }

}