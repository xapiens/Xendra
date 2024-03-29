
package pe.gob.sunat.serviceOescondatagate;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BillServicePortService", targetNamespace = "http://service.sunat.gob.pe", wsdlLocation = "http://calidad.escondatagate.net/wsValidator_2_1/ol-ti-itcpe/billService.wsdl")
public class BillServicePortService
    extends Service
{

    private final static URL BILLSERVICEPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException BILLSERVICEPORTSERVICE_EXCEPTION;
    private final static QName BILLSERVICEPORTSERVICE_QNAME = new QName("http://service.sunat.gob.pe", "BillServicePortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://calidad.escondatagate.net/wsValidator_2_1/ol-ti-itcpe/billService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BILLSERVICEPORTSERVICE_WSDL_LOCATION = url;
        BILLSERVICEPORTSERVICE_EXCEPTION = e;
    }

    public BillServicePortService() {
        super(__getWsdlLocation(), BILLSERVICEPORTSERVICE_QNAME);
    }

    public BillServicePortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BILLSERVICEPORTSERVICE_QNAME, features);
    }

    public BillServicePortService(URL wsdlLocation) {
        super(wsdlLocation, BILLSERVICEPORTSERVICE_QNAME);
    }

    public BillServicePortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BILLSERVICEPORTSERVICE_QNAME, features);
    }

    public BillServicePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BillServicePortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BillServicePort
     */
    @WebEndpoint(name = "BillServicePortSoap11")
    public BillServicePort getBillServicePortSoap11() {
        return super.getPort(new QName("http://service.sunat.gob.pe", "BillServicePortSoap11"), BillServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BillServicePort
     */
    @WebEndpoint(name = "BillServicePortSoap11")
    public BillServicePort getBillServicePortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.sunat.gob.pe", "BillServicePortSoap11"), BillServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BILLSERVICEPORTSERVICE_EXCEPTION!= null) {
            throw BILLSERVICEPORTSERVICE_EXCEPTION;
        }
        return BILLSERVICEPORTSERVICE_WSDL_LOCATION;
    }

}
