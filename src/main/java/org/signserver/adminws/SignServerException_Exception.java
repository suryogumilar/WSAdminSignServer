
package org.signserver.adminws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.4
 * 2022-11-22T12:25:20.070+07:00
 * Generated source version: 3.5.4
 */

@WebFault(name = "SignServerException", targetNamespace = "http://adminws.signserver.org/")
public class SignServerException_Exception extends Exception {

    private org.signserver.adminws.SignServerException faultInfo;

    public SignServerException_Exception() {
        super();
    }

    public SignServerException_Exception(String message) {
        super(message);
    }

    public SignServerException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SignServerException_Exception(String message, org.signserver.adminws.SignServerException signServerException) {
        super(message);
        this.faultInfo = signServerException;
    }

    public SignServerException_Exception(String message, org.signserver.adminws.SignServerException signServerException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = signServerException;
    }

    public org.signserver.adminws.SignServerException getFaultInfo() {
        return this.faultInfo;
    }
}
