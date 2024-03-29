
package org.signserver.adminws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.4
 * 2023-02-14T14:53:03.812+07:00
 * Generated source version: 3.5.4
 */

@WebFault(name = "OperationUnsupportedException", targetNamespace = "http://adminws.signserver.org/")
public class OperationUnsupportedException_Exception extends Exception {

    private org.signserver.adminws.OperationUnsupportedException faultInfo;

    public OperationUnsupportedException_Exception() {
        super();
    }

    public OperationUnsupportedException_Exception(String message) {
        super(message);
    }

    public OperationUnsupportedException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public OperationUnsupportedException_Exception(String message, org.signserver.adminws.OperationUnsupportedException operationUnsupportedException) {
        super(message);
        this.faultInfo = operationUnsupportedException;
    }

    public OperationUnsupportedException_Exception(String message, org.signserver.adminws.OperationUnsupportedException operationUnsupportedException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = operationUnsupportedException;
    }

    public org.signserver.adminws.OperationUnsupportedException getFaultInfo() {
        return this.faultInfo;
    }
}
