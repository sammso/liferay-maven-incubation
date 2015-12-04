/**
 * LayoutSetServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public class LayoutSetServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portal.service.http.LayoutSetServiceSoapService {

    public LayoutSetServiceSoapServiceLocator() {
    }


    public LayoutSetServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LayoutSetServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portal_LayoutSetService
    private java.lang.String Portal_LayoutSetService_address = "http://localhost:8080/tunnel-web/axis/Portal_LayoutSetService";

    public java.lang.String getPortal_LayoutSetServiceAddress() {
        return Portal_LayoutSetService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portal_LayoutSetServiceWSDDServiceName = "Portal_LayoutSetService";

    public java.lang.String getPortal_LayoutSetServiceWSDDServiceName() {
        return Portal_LayoutSetServiceWSDDServiceName;
    }

    public void setPortal_LayoutSetServiceWSDDServiceName(java.lang.String name) {
        Portal_LayoutSetServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portal.service.http.LayoutSetServiceSoap getPortal_LayoutSetService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portal_LayoutSetService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortal_LayoutSetService(endpoint);
    }

    public com.liferay.client.soap.portal.service.http.LayoutSetServiceSoap getPortal_LayoutSetService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portal.service.http.Portal_LayoutSetServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_LayoutSetServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortal_LayoutSetServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortal_LayoutSetServiceEndpointAddress(java.lang.String address) {
        Portal_LayoutSetService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portal.service.http.LayoutSetServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portal.service.http.Portal_LayoutSetServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_LayoutSetServiceSoapBindingStub(new java.net.URL(Portal_LayoutSetService_address), this);
                _stub.setPortName(getPortal_LayoutSetServiceWSDDServiceName());
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
        if ("Portal_LayoutSetService".equals(inputPortName)) {
            return getPortal_LayoutSetService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "LayoutSetServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "Portal_LayoutSetService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portal_LayoutSetService".equals(portName)) {
            setPortal_LayoutSetServiceEndpointAddress(address);
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
