package org.signserver.adminws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.4
 * 2023-02-14T14:53:03.928+07:00
 * Generated source version: 3.5.4
 *
 */
@WebServiceClient(name = "AdminWSService",
                  wsdlLocation = "file:/C:/Worksite/WORK/Project/2022/Peruri/WSAdminSignServer/src/main/config/AdminWS.wsdl",
                  targetNamespace = "http://adminws.signserver.org/")
public class AdminWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://adminws.signserver.org/", "AdminWSService");
    public final static QName AdminWSPort = new QName("http://adminws.signserver.org/", "AdminWSPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Worksite/WORK/Project/2022/Peruri/WSAdminSignServer/src/main/config/AdminWS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AdminWSService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Worksite/WORK/Project/2022/Peruri/WSAdminSignServer/src/main/config/AdminWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AdminWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AdminWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdminWSService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AdminWSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AdminWSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AdminWSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AdminWS
     */
    @WebEndpoint(name = "AdminWSPort")
    public AdminWS getAdminWSPort() {
        return super.getPort(AdminWSPort, AdminWS.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdminWS
     */
    @WebEndpoint(name = "AdminWSPort")
    public AdminWS getAdminWSPort(WebServiceFeature... features) {
        return super.getPort(AdminWSPort, AdminWS.class, features);
    }

}
