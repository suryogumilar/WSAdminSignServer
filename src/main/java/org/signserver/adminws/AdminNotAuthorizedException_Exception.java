
package org.signserver.adminws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.4
 * 2022-11-22T12:25:20.054+07:00
 * Generated source version: 3.5.4
 */

@WebFault(name = "AdminNotAuthorizedException", targetNamespace = "http://adminws.signserver.org/")
public class AdminNotAuthorizedException_Exception extends Exception {

    private org.signserver.adminws.AdminNotAuthorizedException faultInfo;

    public AdminNotAuthorizedException_Exception() {
        super();
    }

    public AdminNotAuthorizedException_Exception(String message) {
        super(message);
    }

    public AdminNotAuthorizedException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public AdminNotAuthorizedException_Exception(String message, org.signserver.adminws.AdminNotAuthorizedException adminNotAuthorizedException) {
        super(message);
        this.faultInfo = adminNotAuthorizedException;
    }

    public AdminNotAuthorizedException_Exception(String message, org.signserver.adminws.AdminNotAuthorizedException adminNotAuthorizedException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = adminNotAuthorizedException;
    }

    public org.signserver.adminws.AdminNotAuthorizedException getFaultInfo() {
        return this.faultInfo;
    }
}