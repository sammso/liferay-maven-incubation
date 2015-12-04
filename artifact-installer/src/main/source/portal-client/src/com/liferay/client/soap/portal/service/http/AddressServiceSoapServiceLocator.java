/**
 * AddressServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public class AddressServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portal.service.http.AddressServiceSoapService {

    public AddressServiceSoapServiceLocator() {
    }


    public AddressServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddressServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portal_AddressService
    private java.lang.String Portal_AddressService_address = "http://localhost:8080/tunnel-web/axis/Portal_AddressService";

    public java.lang.String getPortal_AddressServiceAddress() {
        return Portal_AddressService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portal_AddressServiceWSDDServiceName = "Portal_AddressService";

    public java.lang.String getPortal_AddressServiceWSDDServiceName() {
        return Portal_AddressServiceWSDDServiceName;
    }

    public void setPortal_AddressServiceWSDDServiceName(java.lang.String name) {
        Portal_AddressServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portal.service.http.AddressServiceSoap getPortal_AddressService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portal_AddressService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortal_AddressService(endpoint);
    }

    public com.liferay.client.soap.portal.service.http.AddressServiceSoap getPortal_AddressService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portal.service.http.Portal_AddressServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_AddressServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortal_AddressServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortal_AddressServiceEndpointAddress(java.lang.String address) {
        Portal_AddressService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portal.service.http.AddressServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portal.service.http.Portal_AddressServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_AddressServiceSoapBindingStub(new java.net.URL(Portal_AddressService_address), this);
                _stub.setPortName(getPortal_AddressServiceWSDDServiceName());
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
        if ("Portal_AddressService".equals(inputPortName)) {
            return getPortal_AddressService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "AddressServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "Portal_AddressService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portal_AddressService".equals(portName)) {
            setPortal_AddressServiceEndpointAddress(address);
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
