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
 * <p>Java class for segFlightRefVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segFlightRefVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referencingDetail" type="{http://codenotfound.com/types/flightsearch}refDetailVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segFlightRefVO", propOrder = {
    "referencingDetail"
})
public class SegFlightRefVO {

    protected RefDetailVO referencingDetail;

    /**
     * Gets the value of the referencingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RefDetailVO }
     *     
     */
    public RefDetailVO getReferencingDetail() {
        return referencingDetail;
    }

    /**
     * Sets the value of the referencingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDetailVO }
     *     
     */
    public void setReferencingDetail(RefDetailVO value) {
        this.referencingDetail = value;
    }

}