/**
 * ClassNameServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public class ClassNameServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portal.service.http.ClassNameServiceSoapService {

    public ClassNameServiceSoapServiceLocator() {
    }


    public ClassNameServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClassNameServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portal_ClassNameService
    private java.lang.String Portal_ClassNameService_address = "http://localhost:8080/tunnel-web/axis/Portal_ClassNameService";

    public java.lang.String getPortal_ClassNameServiceAddress() {
        return Portal_ClassNameService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portal_ClassNameServiceWSDDServiceName = "Portal_ClassNameService";

    public java.lang.String getPortal_ClassNameServiceWSDDServiceName() {
        return Portal_ClassNameServiceWSDDServiceName;
    }

    public void setPortal_ClassNameServiceWSDDServiceName(java.lang.String name) {
        Portal_ClassNameServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portal.service.http.ClassNameServiceSoap getPortal_ClassNameService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portal_ClassNameService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortal_ClassNameService(endpoint);
    }

    public com.liferay.client.soap.portal.service.http.ClassNameServiceSoap getPortal_ClassNameService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portal.service.http.Portal_ClassNameServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_ClassNameServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortal_ClassNameServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortal_ClassNameServiceEndpointAddress(java.lang.String address) {
        Portal_ClassNameService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portal.service.http.ClassNameServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portal.service.http.Portal_ClassNameServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_ClassNameServiceSoapBindingStub(new java.net.URL(Portal_ClassNameService_address), this);
                _stub.setPortName(getPortal_ClassNameServiceWSDDServiceName());
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
        if ("Portal_ClassNameService".equals(inputPortName)) {
            return getPortal_ClassNameService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "ClassNameServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "Portal_ClassNameService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portal_ClassNameService".equals(portName)) {
            setPortal_ClassNameServiceEndpointAddress(address);
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
