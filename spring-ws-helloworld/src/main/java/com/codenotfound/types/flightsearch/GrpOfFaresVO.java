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
 * <p>Java class for GrpOfFaresVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrpOfFaresVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productInformation" type="{http://codenotfound.com/types/flightsearch}ProductInformationVO" minOccurs="0"/&gt;
 *         &lt;element name="fareCalculationCodeDetails" type="{http://codenotfound.com/types/flightsearch}FareCalcCdeDetailsVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrpOfFaresVO", propOrder = {
    "productInformation",
    "fareCalculationCodeDetails"
})
public class GrpOfFaresVO {

    protected ProductInformationVO productInformation;
    protected FareCalcCdeDetailsVO fareCalculationCodeDetails;

    /**
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationVO }
     *     
     */
    public ProductInformationVO getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationVO }
     *     
     */
    public void setProductInformation(ProductInformationVO value) {
        this.productInformation = value;
    }

    /**
     * Gets the value of the fareCalculationCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareCalcCdeDetailsVO }
     *     
     */
    public FareCalcCdeDetailsVO getFareCalculationCodeDetails() {
        return fareCalculationCodeDetails;
    }

    /**
     * Sets the value of the fareCalculationCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCalcCdeDetailsVO }
     *     
     */
    public void setFareCalculationCodeDetails(FareCalcCdeDetailsVO value) {
        this.fareCalculationCodeDetails = value;
    }

}
