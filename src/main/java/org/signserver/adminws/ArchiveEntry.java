
package org.signserver.adminws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for archiveEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="archiveEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="archiveData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="archiveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestCertSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestIssuerDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="uniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "archiveEntry", propOrder = {
    "archiveData",
    "archiveId",
    "requestCertSerialNumber",
    "requestIP",
    "requestIssuerDN",
    "signerId",
    "time",
    "type",
    "uniqueId"
})
public class ArchiveEntry {

    protected byte[] archiveData;
    protected String archiveId;
    protected String requestCertSerialNumber;
    protected String requestIP;
    protected String requestIssuerDN;
    protected Integer signerId;
    protected Long time;
    protected Integer type;
    protected String uniqueId;

    /**
     * Gets the value of the archiveData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchiveData() {
        return archiveData;
    }

    /**
     * Sets the value of the archiveData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchiveData(byte[] value) {
        this.archiveData = value;
    }

    /**
     * Gets the value of the archiveId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveId() {
        return archiveId;
    }

    /**
     * Sets the value of the archiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveId(String value) {
        this.archiveId = value;
    }

    /**
     * Gets the value of the requestCertSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCertSerialNumber() {
        return requestCertSerialNumber;
    }

    /**
     * Sets the value of the requestCertSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCertSerialNumber(String value) {
        this.requestCertSerialNumber = value;
    }

    /**
     * Gets the value of the requestIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIP() {
        return requestIP;
    }

    /**
     * Sets the value of the requestIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIP(String value) {
        this.requestIP = value;
    }

    /**
     * Gets the value of the requestIssuerDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIssuerDN() {
        return requestIssuerDN;
    }

    /**
     * Sets the value of the requestIssuerDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIssuerDN(String value) {
        this.requestIssuerDN = value;
    }

    /**
     * Gets the value of the signerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignerId() {
        return signerId;
    }

    /**
     * Sets the value of the signerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignerId(Integer value) {
        this.signerId = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTime(Long value) {
        this.time = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setType(Integer value) {
        this.type = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

}
