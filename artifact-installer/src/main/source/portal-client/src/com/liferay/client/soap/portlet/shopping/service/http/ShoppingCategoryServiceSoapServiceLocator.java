/**
 * ShoppingCategoryServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.shopping.service.http;

public class ShoppingCategoryServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.shopping.service.http.ShoppingCategoryServiceSoapService {

    public ShoppingCategoryServiceSoapServiceLocator() {
    }


    public ShoppingCategoryServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ShoppingCategoryServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Shopping_ShoppingCategoryService
    private java.lang.String Portlet_Shopping_ShoppingCategoryService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Shopping_ShoppingCategoryService";

    public java.lang.String getPortlet_Shopping_ShoppingCategoryServiceAddress() {
        return Portlet_Shopping_ShoppingCategoryService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Shopping_ShoppingCategoryServiceWSDDServiceName = "Portlet_Shopping_ShoppingCategoryService";

    public java.lang.String getPortlet_Shopping_ShoppingCategoryServiceWSDDServiceName() {
        return Portlet_Shopping_ShoppingCategoryServiceWSDDServiceName;
    }

    public void setPortlet_Shopping_ShoppingCategoryServiceWSDDServiceName(java.lang.String name) {
        Portlet_Shopping_ShoppingCategoryServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.shopping.service.http.ShoppingCategoryServiceSoap getPortlet_Shopping_ShoppingCategoryService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Shopping_ShoppingCategoryService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Shopping_ShoppingCategoryService(endpoint);
    }

    public com.liferay.client.soap.portlet.shopping.service.http.ShoppingCategoryServiceSoap getPortlet_Shopping_ShoppingCategoryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.shopping.service.http.Portlet_Shopping_ShoppingCategoryServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.shopping.service.http.Portlet_Shopping_ShoppingCategoryServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Shopping_ShoppingCategoryServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Shopping_ShoppingCategoryServiceEndpointAddress(java.lang.String address) {
        Portlet_Shopping_ShoppingCategoryService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.shopping.service.http.ShoppingCategoryServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.shopping.service.http.Portlet_Shopping_ShoppingCategoryServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.shopping.service.http.Portlet_Shopping_ShoppingCategoryServiceSoapBindingStub(new java.net.URL(Portlet_Shopping_ShoppingCategoryService_address), this);
                _stub.setPortName(getPortlet_Shopping_ShoppingCategoryServiceWSDDServiceName());
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
        if ("Portlet_Shopping_ShoppingCategoryService".equals(inputPortName)) {
            return getPortlet_Shopping_ShoppingCategoryService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.shopping.portlet.liferay.com", "ShoppingCategoryServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.shopping.portlet.liferay.com", "Portlet_Shopping_ShoppingCategoryService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Shopping_ShoppingCategoryService".equals(portName)) {
            setPortlet_Shopping_ShoppingCategoryServiceEndpointAddress(address);
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
