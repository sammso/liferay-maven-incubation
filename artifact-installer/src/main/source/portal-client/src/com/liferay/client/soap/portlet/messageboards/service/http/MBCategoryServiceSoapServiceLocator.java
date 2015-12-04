/**
 * MBCategoryServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.messageboards.service.http;

public class MBCategoryServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.messageboards.service.http.MBCategoryServiceSoapService {

    public MBCategoryServiceSoapServiceLocator() {
    }


    public MBCategoryServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MBCategoryServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_MB_MBCategoryService
    private java.lang.String Portlet_MB_MBCategoryService_address = "http://localhost:8080/tunnel-web/axis/Portlet_MB_MBCategoryService";

    public java.lang.String getPortlet_MB_MBCategoryServiceAddress() {
        return Portlet_MB_MBCategoryService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_MB_MBCategoryServiceWSDDServiceName = "Portlet_MB_MBCategoryService";

    public java.lang.String getPortlet_MB_MBCategoryServiceWSDDServiceName() {
        return Portlet_MB_MBCategoryServiceWSDDServiceName;
    }

    public void setPortlet_MB_MBCategoryServiceWSDDServiceName(java.lang.String name) {
        Portlet_MB_MBCategoryServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.messageboards.service.http.MBCategoryServiceSoap getPortlet_MB_MBCategoryService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_MB_MBCategoryService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_MB_MBCategoryService(endpoint);
    }

    public com.liferay.client.soap.portlet.messageboards.service.http.MBCategoryServiceSoap getPortlet_MB_MBCategoryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.messageboards.service.http.Portlet_MB_MBCategoryServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.messageboards.service.http.Portlet_MB_MBCategoryServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_MB_MBCategoryServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_MB_MBCategoryServiceEndpointAddress(java.lang.String address) {
        Portlet_MB_MBCategoryService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.messageboards.service.http.MBCategoryServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.messageboards.service.http.Portlet_MB_MBCategoryServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.messageboards.service.http.Portlet_MB_MBCategoryServiceSoapBindingStub(new java.net.URL(Portlet_MB_MBCategoryService_address), this);
                _stub.setPortName(getPortlet_MB_MBCategoryServiceWSDDServiceName());
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
        if ("Portlet_MB_MBCategoryService".equals(inputPortName)) {
            return getPortlet_MB_MBCategoryService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.messageboards.portlet.liferay.com", "MBCategoryServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.messageboards.portlet.liferay.com", "Portlet_MB_MBCategoryService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_MB_MBCategoryService".equals(portName)) {
            setPortlet_MB_MBCategoryServiceEndpointAddress(address);
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
