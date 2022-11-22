
package org.signserver.adminws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for base64SignerCertReqData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="base64SignerCertReqData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="base64CertReq" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "base64SignerCertReqData", propOrder = {
    "base64CertReq"
})
public class Base64SignerCertReqData {

    protected byte[] base64CertReq;

    /**
     * Gets the value of the base64CertReq property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase64CertReq() {
        return base64CertReq;
    }

    /**
     * Sets the value of the base64CertReq property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase64CertReq(byte[] value) {
        this.base64CertReq = value;
    }

}
