
package org.signserver.adminws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authorizedClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorizedClient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuerDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorizedClient", propOrder = {
    "certSN",
    "issuerDN"
})
public class AuthorizedClient {

    protected String certSN;
    protected String issuerDN;

    /**
     * Gets the value of the certSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertSN() {
        return certSN;
    }

    /**
     * Sets the value of the certSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertSN(String value) {
        this.certSN = value;
    }

    /**
     * Gets the value of the issuerDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerDN() {
        return issuerDN;
    }

    /**
     * Sets the value of the issuerDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerDN(String value) {
        this.issuerDN = value;
    }

}
