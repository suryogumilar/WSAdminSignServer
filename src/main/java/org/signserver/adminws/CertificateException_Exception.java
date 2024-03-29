
package org.signserver.adminws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.4
 * 2023-02-14T14:53:03.820+07:00
 * Generated source version: 3.5.4
 */

@WebFault(name = "CertificateException", targetNamespace = "http://adminws.signserver.org/")
public class CertificateException_Exception extends Exception {

    private org.signserver.adminws.CertificateException faultInfo;

    public CertificateException_Exception() {
        super();
    }

    public CertificateException_Exception(String message) {
        super(message);
    }

    public CertificateException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public CertificateException_Exception(String message, org.signserver.adminws.CertificateException certificateException) {
        super(message);
        this.faultInfo = certificateException;
    }

    public CertificateException_Exception(String message, org.signserver.adminws.CertificateException certificateException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = certificateException;
    }

    public org.signserver.adminws.CertificateException getFaultInfo() {
        return this.faultInfo;
    }
}
