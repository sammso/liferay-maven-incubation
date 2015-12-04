/**
 * ResourceServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public class ResourceServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portal.service.http.ResourceServiceSoapService {

    public ResourceServiceSoapServiceLocator() {
    }


    public ResourceServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ResourceServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portal_ResourceService
    private java.lang.String Portal_ResourceService_address = "http://localhost:8080/tunnel-web/axis/Portal_ResourceService";

    public java.lang.String getPortal_ResourceServiceAddress() {
        return Portal_ResourceService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portal_ResourceServiceWSDDServiceName = "Portal_ResourceService";

    public java.lang.String getPortal_ResourceServiceWSDDServiceName() {
        return Portal_ResourceServiceWSDDServiceName;
    }

    public void setPortal_ResourceServiceWSDDServiceName(java.lang.String name) {
        Portal_ResourceServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portal.service.http.ResourceServiceSoap getPortal_ResourceService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portal_ResourceService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortal_ResourceService(endpoint);
    }

    public com.liferay.client.soap.portal.service.http.ResourceServiceSoap getPortal_ResourceService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portal.service.http.Portal_ResourceServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_ResourceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortal_ResourceServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortal_ResourceServiceEndpointAddress(java.lang.String address) {
        Portal_ResourceService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portal.service.http.ResourceServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portal.service.http.Portal_ResourceServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_ResourceServiceSoapBindingStub(new java.net.URL(Portal_ResourceService_address), this);
                _stub.setPortName(getPortal_ResourceServiceWSDDServiceName());
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
        if ("Portal_ResourceService".equals(inputPortName)) {
            return getPortal_ResourceService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "ResourceServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "Portal_ResourceService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portal_ResourceService".equals(portName)) {
            setPortal_ResourceServiceEndpointAddress(address);
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
