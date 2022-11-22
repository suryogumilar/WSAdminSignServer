
package org.signserver.adminws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPKCS10CertificateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPKCS10CertificateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="certReqInfo" type="{http://adminws.signserver.org/}pkcs10CertReqInfo" minOccurs="0"/&gt;
 *         &lt;element name="explicitEccParameters" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPKCS10CertificateRequest", propOrder = {
    "signerId",
    "certReqInfo",
    "explicitEccParameters"
})
public class GetPKCS10CertificateRequest {

    protected int signerId;
    protected Pkcs10CertReqInfo certReqInfo;
    protected boolean explicitEccParameters;

    /**
     * Gets the value of the signerId property.
     * 
     */
    public int getSignerId() {
        return signerId;
    }

    /**
     * Sets the value of the signerId property.
     * 
     */
    public void setSignerId(int value) {
        this.signerId = value;
    }

    /**
     * Gets the value of the certReqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Pkcs10CertReqInfo }
     *     
     */
    public Pkcs10CertReqInfo getCertReqInfo() {
        return certReqInfo;
    }

    /**
     * Sets the value of the certReqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pkcs10CertReqInfo }
     *     
     */
    public void setCertReqInfo(Pkcs10CertReqInfo value) {
        this.certReqInfo = value;
    }

    /**
     * Gets the value of the explicitEccParameters property.
     * 
     */
    public boolean isExplicitEccParameters() {
        return explicitEccParameters;
    }

    /**
     * Sets the value of the explicitEccParameters property.
     * 
     */
    public void setExplicitEccParameters(boolean value) {
        this.explicitEccParameters = value;
    }

}
