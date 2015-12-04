/**
 * OrgLaborServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public class OrgLaborServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portal.service.http.OrgLaborServiceSoapService {

    public OrgLaborServiceSoapServiceLocator() {
    }


    public OrgLaborServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrgLaborServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portal_OrgLaborService
    private java.lang.String Portal_OrgLaborService_address = "http://localhost:8080/tunnel-web/axis/Portal_OrgLaborService";

    public java.lang.String getPortal_OrgLaborServiceAddress() {
        return Portal_OrgLaborService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portal_OrgLaborServiceWSDDServiceName = "Portal_OrgLaborService";

    public java.lang.String getPortal_OrgLaborServiceWSDDServiceName() {
        return Portal_OrgLaborServiceWSDDServiceName;
    }

    public void setPortal_OrgLaborServiceWSDDServiceName(java.lang.String name) {
        Portal_OrgLaborServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portal.service.http.OrgLaborServiceSoap getPortal_OrgLaborService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portal_OrgLaborService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortal_OrgLaborService(endpoint);
    }

    public com.liferay.client.soap.portal.service.http.OrgLaborServiceSoap getPortal_OrgLaborService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portal.service.http.Portal_OrgLaborServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_OrgLaborServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortal_OrgLaborServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortal_OrgLaborServiceEndpointAddress(java.lang.String address) {
        Portal_OrgLaborService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portal.service.http.OrgLaborServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portal.service.http.Portal_OrgLaborServiceSoapBindingStub _stub = new com.liferay.client.soap.portal.service.http.Portal_OrgLaborServiceSoapBindingStub(new java.net.URL(Portal_OrgLaborService_address), this);
                _stub.setPortName(getPortal_OrgLaborServiceWSDDServiceName());
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
        if ("Portal_OrgLaborService".equals(inputPortName)) {
            return getPortal_OrgLaborService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "OrgLaborServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "Portal_OrgLaborService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portal_OrgLaborService".equals(portName)) {
            setPortal_OrgLaborServiceEndpointAddress(address);
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
