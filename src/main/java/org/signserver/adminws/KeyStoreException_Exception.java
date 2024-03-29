
package org.signserver.adminws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.4
 * 2023-02-14T14:53:03.829+07:00
 * Generated source version: 3.5.4
 */

@WebFault(name = "KeyStoreException", targetNamespace = "http://adminws.signserver.org/")
public class KeyStoreException_Exception extends Exception {

    private org.signserver.adminws.KeyStoreException faultInfo;

    public KeyStoreException_Exception() {
        super();
    }

    public KeyStoreException_Exception(String message) {
        super(message);
    }

    public KeyStoreException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public KeyStoreException_Exception(String message, org.signserver.adminws.KeyStoreException keyStoreException) {
        super(message);
        this.faultInfo = keyStoreException;
    }

    public KeyStoreException_Exception(String message, org.signserver.adminws.KeyStoreException keyStoreException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = keyStoreException;
    }

    public org.signserver.adminws.KeyStoreException getFaultInfo() {
        return this.faultInfo;
    }
}
