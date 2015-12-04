/**
 * IGImageServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.imagegallery.service.http;

public class IGImageServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.imagegallery.service.http.IGImageServiceSoapService {

    public IGImageServiceSoapServiceLocator() {
    }


    public IGImageServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IGImageServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_IG_IGImageService
    private java.lang.String Portlet_IG_IGImageService_address = "http://localhost:8080/tunnel-web/axis/Portlet_IG_IGImageService";

    public java.lang.String getPortlet_IG_IGImageServiceAddress() {
        return Portlet_IG_IGImageService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_IG_IGImageServiceWSDDServiceName = "Portlet_IG_IGImageService";

    public java.lang.String getPortlet_IG_IGImageServiceWSDDServiceName() {
        return Portlet_IG_IGImageServiceWSDDServiceName;
    }

    public void setPortlet_IG_IGImageServiceWSDDServiceName(java.lang.String name) {
        Portlet_IG_IGImageServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.imagegallery.service.http.IGImageServiceSoap getPortlet_IG_IGImageService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_IG_IGImageService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_IG_IGImageService(endpoint);
    }

    public com.liferay.client.soap.portlet.imagegallery.service.http.IGImageServiceSoap getPortlet_IG_IGImageService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.imagegallery.service.http.Portlet_IG_IGImageServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.imagegallery.service.http.Portlet_IG_IGImageServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_IG_IGImageServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_IG_IGImageServiceEndpointAddress(java.lang.String address) {
        Portlet_IG_IGImageService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.imagegallery.service.http.IGImageServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.imagegallery.service.http.Portlet_IG_IGImageServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.imagegallery.service.http.Portlet_IG_IGImageServiceSoapBindingStub(new java.net.URL(Portlet_IG_IGImageService_address), this);
                _stub.setPortName(getPortlet_IG_IGImageServiceWSDDServiceName());
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
        if ("Portlet_IG_IGImageService".equals(inputPortName)) {
            return getPortlet_IG_IGImageService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.imagegallery.portlet.liferay.com", "IGImageServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.imagegallery.portlet.liferay.com", "Portlet_IG_IGImageService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_IG_IGImageService".equals(portName)) {
            setPortlet_IG_IGImageServiceEndpointAddress(address);
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
