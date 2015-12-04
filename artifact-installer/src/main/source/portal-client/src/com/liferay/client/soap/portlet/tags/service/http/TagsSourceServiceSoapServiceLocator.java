/**
 * TagsSourceServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.tags.service.http;

public class TagsSourceServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.tags.service.http.TagsSourceServiceSoapService {

    public TagsSourceServiceSoapServiceLocator() {
    }


    public TagsSourceServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TagsSourceServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Tags_TagsSourceService
    private java.lang.String Portlet_Tags_TagsSourceService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Tags_TagsSourceService";

    public java.lang.String getPortlet_Tags_TagsSourceServiceAddress() {
        return Portlet_Tags_TagsSourceService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Tags_TagsSourceServiceWSDDServiceName = "Portlet_Tags_TagsSourceService";

    public java.lang.String getPortlet_Tags_TagsSourceServiceWSDDServiceName() {
        return Portlet_Tags_TagsSourceServiceWSDDServiceName;
    }

    public void setPortlet_Tags_TagsSourceServiceWSDDServiceName(java.lang.String name) {
        Portlet_Tags_TagsSourceServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.tags.service.http.TagsSourceServiceSoap getPortlet_Tags_TagsSourceService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Tags_TagsSourceService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Tags_TagsSourceService(endpoint);
    }

    public com.liferay.client.soap.portlet.tags.service.http.TagsSourceServiceSoap getPortlet_Tags_TagsSourceService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.tags.service.http.Portlet_Tags_TagsSourceServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.tags.service.http.Portlet_Tags_TagsSourceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Tags_TagsSourceServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Tags_TagsSourceServiceEndpointAddress(java.lang.String address) {
        Portlet_Tags_TagsSourceService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.tags.service.http.TagsSourceServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.tags.service.http.Portlet_Tags_TagsSourceServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.tags.service.http.Portlet_Tags_TagsSourceServiceSoapBindingStub(new java.net.URL(Portlet_Tags_TagsSourceService_address), this);
                _stub.setPortName(getPortlet_Tags_TagsSourceServiceWSDDServiceName());
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
        if ("Portlet_Tags_TagsSourceService".equals(inputPortName)) {
            return getPortlet_Tags_TagsSourceService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.tags.portlet.liferay.com", "TagsSourceServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.tags.portlet.liferay.com", "Portlet_Tags_TagsSourceService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Tags_TagsSourceService".equals(portName)) {
            setPortlet_Tags_TagsSourceServiceEndpointAddress(address);
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
