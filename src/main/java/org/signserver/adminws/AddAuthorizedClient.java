
package org.signserver.adminws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addAuthorizedClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addAuthorizedClient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="authClient" type="{http://adminws.signserver.org/}authorizedClient" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAuthorizedClient", propOrder = {
    "workerId",
    "authClient"
})
public class AddAuthorizedClient {

    protected int workerId;
    protected AuthorizedClient authClient;

    /**
     * Gets the value of the workerId property.
     * 
     */
    public int getWorkerId() {
        return workerId;
    }

    /**
     * Sets the value of the workerId property.
     * 
     */
    public void setWorkerId(int value) {
        this.workerId = value;
    }

    /**
     * Gets the value of the authClient property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedClient }
     *     
     */
    public AuthorizedClient getAuthClient() {
        return authClient;
    }

    /**
     * Sets the value of the authClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedClient }
     *     
     */
    public void setAuthClient(AuthorizedClient value) {
        this.authClient = value;
    }

}
