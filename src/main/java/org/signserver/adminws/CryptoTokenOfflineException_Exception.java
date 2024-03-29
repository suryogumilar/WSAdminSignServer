
package org.signserver.adminws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.4
 * 2023-02-14T14:53:03.788+07:00
 * Generated source version: 3.5.4
 */

@WebFault(name = "CryptoTokenOfflineException", targetNamespace = "http://adminws.signserver.org/")
public class CryptoTokenOfflineException_Exception extends Exception {

    private org.signserver.adminws.CryptoTokenOfflineException faultInfo;

    public CryptoTokenOfflineException_Exception() {
        super();
    }

    public CryptoTokenOfflineException_Exception(String message) {
        super(message);
    }

    public CryptoTokenOfflineException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public CryptoTokenOfflineException_Exception(String message, org.signserver.adminws.CryptoTokenOfflineException cryptoTokenOfflineException) {
        super(message);
        this.faultInfo = cryptoTokenOfflineException;
    }

    public CryptoTokenOfflineException_Exception(String message, org.signserver.adminws.CryptoTokenOfflineException cryptoTokenOfflineException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = cryptoTokenOfflineException;
    }

    public org.signserver.adminws.CryptoTokenOfflineException getFaultInfo() {
        return this.faultInfo;
    }
}
