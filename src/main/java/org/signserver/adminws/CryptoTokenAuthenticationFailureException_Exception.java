
package org.signserver.adminws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.4
 * 2023-02-14T14:53:03.865+07:00
 * Generated source version: 3.5.4
 */

@WebFault(name = "CryptoTokenAuthenticationFailureException", targetNamespace = "http://adminws.signserver.org/")
public class CryptoTokenAuthenticationFailureException_Exception extends Exception {

    private org.signserver.adminws.CryptoTokenAuthenticationFailureException faultInfo;

    public CryptoTokenAuthenticationFailureException_Exception() {
        super();
    }

    public CryptoTokenAuthenticationFailureException_Exception(String message) {
        super(message);
    }

    public CryptoTokenAuthenticationFailureException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public CryptoTokenAuthenticationFailureException_Exception(String message, org.signserver.adminws.CryptoTokenAuthenticationFailureException cryptoTokenAuthenticationFailureException) {
        super(message);
        this.faultInfo = cryptoTokenAuthenticationFailureException;
    }

    public CryptoTokenAuthenticationFailureException_Exception(String message, org.signserver.adminws.CryptoTokenAuthenticationFailureException cryptoTokenAuthenticationFailureException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = cryptoTokenAuthenticationFailureException;
    }

    public org.signserver.adminws.CryptoTokenAuthenticationFailureException getFaultInfo() {
        return this.faultInfo;
    }
}
