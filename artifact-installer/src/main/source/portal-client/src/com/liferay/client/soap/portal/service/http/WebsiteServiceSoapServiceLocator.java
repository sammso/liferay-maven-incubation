/**
 * WebsiteServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public class WebsiteServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portal.service.http.WebsiteServiceSoapService {

    public WebsiteServiceSoapServiceLocator() {
    }


    public WebsiteServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebsiteServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portal_WebsiteService
    private java.lang.String Portal_WebsiteService_address = "http://localhost:8080/tunnel-web/axis/Portal_WebsiteService";

    public java.lang.String getPortal_WebsiteServiceAddress() {
        return Portal_WebsiteService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portal_WebsiteServiceWSDDServiceName = "Portal_WebsiteService";

    public java.lang.String getPortal_WebsiteServiceWSDDServiceName() {
        return Portal_WebsiteServiceWSDDServiceName;
    }

    public void setPortal_WebsiteServiceWSDDServiceName(java.lang.String name) {
        Portal_WebsiteServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portal.service.http.WebsiteServiceSoap getPortal_WebsiteService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portal_WebsiteService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortal_WebsiteService(endpoint);
    }

    public com.liferay.client.soap.portal.service.http.WebsiteServiceSoap getPortal_WebsiteService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portal.service.http.Portal_WebsiteServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_WebsiteServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortal_WebsiteServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortal_WebsiteServiceEndpointAddress(java.lang.String address) {
        Portal_WebsiteService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portal.service.http.WebsiteServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portal.service.http.Portal_WebsiteServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_WebsiteServiceSoapBindingStub(new java.net.URL(Portal_WebsiteService_address), this);
                _stub.setPortName(getPortal_WebsiteServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Portal_WebsiteService".equals(inputPortName)) {
            return getPortal_WebsiteService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "WebsiteServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "Portal_WebsiteService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portal_WebsiteService".equals(portName)) {
            setPortal_WebsiteServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
