/**
 * TagsPropertyServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.tags.service.http;

public class TagsPropertyServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.tags.service.http.TagsPropertyServiceSoapService {

    public TagsPropertyServiceSoapServiceLocator() {
    }


    public TagsPropertyServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TagsPropertyServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Tags_TagsPropertyService
    private java.lang.String Portlet_Tags_TagsPropertyService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Tags_TagsPropertyService";

    public java.lang.String getPortlet_Tags_TagsPropertyServiceAddress() {
        return Portlet_Tags_TagsPropertyService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Tags_TagsPropertyServiceWSDDServiceName = "Portlet_Tags_TagsPropertyService";

    public java.lang.String getPortlet_Tags_TagsPropertyServiceWSDDServiceName() {
        return Portlet_Tags_TagsPropertyServiceWSDDServiceName;
    }

    public void setPortlet_Tags_TagsPropertyServiceWSDDServiceName(java.lang.String name) {
        Portlet_Tags_TagsPropertyServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.tags.service.http.TagsPropertyServiceSoap getPortlet_Tags_TagsPropertyService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Tags_TagsPropertyService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Tags_TagsPropertyService(endpoint);
    }

    public com.liferay.client.soap.portlet.tags.service.http.TagsPropertyServiceSoap getPortlet_Tags_TagsPropertyService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.tags.service.http.Portlet_Tags_TagsPropertyServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.tags.service.http.Portlet_Tags_TagsPropertyServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Tags_TagsPropertyServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Tags_TagsPropertyServiceEndpointAddress(java.lang.String address) {
        Portlet_Tags_TagsPropertyService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.tags.service.http.TagsPropertyServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.tags.service.http.Portlet_Tags_TagsPropertyServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.tags.service.http.Portlet_Tags_TagsPropertyServiceSoapBindingStub(new java.net.URL(Portlet_Tags_TagsPropertyService_address), this);
                _stub.setPortName(getPortlet_Tags_TagsPropertyServiceWSDDServiceName());
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
        if ("Portlet_Tags_TagsPropertyService".equals(inputPortName)) {
            return getPortlet_Tags_TagsPropertyService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.tags.portlet.liferay.com", "TagsPropertyServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.tags.portlet.liferay.com", "Portlet_Tags_TagsPropertyService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Tags_TagsPropertyService".equals(portName)) {
            setPortlet_Tags_TagsPropertyServiceEndpointAddress(address);
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
