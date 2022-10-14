
package com.training;

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
@WebServiceClient(name = "WeatherServiceImplService", targetNamespace = "http://service.training.com/", wsdlLocation = "http://localhost:8081/weather?wsdl")
public class WeatherServiceImplService
    extends Service
{

    private final static URL WEATHERSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEATHERSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName WEATHERSERVICEIMPLSERVICE_QNAME = new QName("http://service.training.com/", "WeatherServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/weather?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEATHERSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        WEATHERSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public WeatherServiceImplService() {
        super(__getWsdlLocation(), WEATHERSERVICEIMPLSERVICE_QNAME);
    }

    public WeatherServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERSERVICEIMPLSERVICE_QNAME, features);
    }

    public WeatherServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, WEATHERSERVICEIMPLSERVICE_QNAME);
    }

    public WeatherServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERSERVICEIMPLSERVICE_QNAME, features);
    }

    public WeatherServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherService
     */
    @WebEndpoint(name = "WeatherServiceImplPort")
    public WeatherService getWeatherServiceImplPort() {
        return super.getPort(new QName("http://service.training.com/", "WeatherServiceImplPort"), WeatherService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherService
     */
    @WebEndpoint(name = "WeatherServiceImplPort")
    public WeatherService getWeatherServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.training.com/", "WeatherServiceImplPort"), WeatherService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw WEATHERSERVICEIMPLSERVICE_EXCEPTION;
        }
        return WEATHERSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
