/**
 * DLFileShortcutServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.documentlibrary.service.http;

public class DLFileShortcutServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.documentlibrary.service.http.DLFileShortcutServiceSoapService {

    public DLFileShortcutServiceSoapServiceLocator() {
    }


    public DLFileShortcutServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DLFileShortcutServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_DL_DLFileShortcutService
    private java.lang.String Portlet_DL_DLFileShortcutService_address = "http://localhost:8080/tunnel-web/axis/Portlet_DL_DLFileShortcutService";

    public java.lang.String getPortlet_DL_DLFileShortcutServiceAddress() {
        return Portlet_DL_DLFileShortcutService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_DL_DLFileShortcutServiceWSDDServiceName = "Portlet_DL_DLFileShortcutService";

    public java.lang.String getPortlet_DL_DLFileShortcutServiceWSDDServiceName() {
        return Portlet_DL_DLFileShortcutServiceWSDDServiceName;
    }

    public void setPortlet_DL_DLFileShortcutServiceWSDDServiceName(java.lang.String name) {
        Portlet_DL_DLFileShortcutServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.documentlibrary.service.http.DLFileShortcutServiceSoap getPortlet_DL_DLFileShortcutService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_DL_DLFileShortcutService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_DL_DLFileShortcutService(endpoint);
    }

    public com.liferay.client.soap.portlet.documentlibrary.service.http.DLFileShortcutServiceSoap getPortlet_DL_DLFileShortcutService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.documentlibrary.service.http.Portlet_DL_DLFileShortcutServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.documentlibrary.service.http.Portlet_DL_DLFileShortcutServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_DL_DLFileShortcutServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_DL_DLFileShortcutServiceEndpointAddress(java.lang.String address) {
        Portlet_DL_DLFileShortcutService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.documentlibrary.service.http.DLFileShortcutServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.documentlibrary.service.http.Portlet_DL_DLFileShortcutServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.documentlibrary.service.http.Portlet_DL_DLFileShortcutServiceSoapBindingStub(new java.net.URL(Portlet_DL_DLFileShortcutService_address), this);
                _stub.setPortName(getPortlet_DL_DLFileShortcutServiceWSDDServiceName());
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
        if ("Portlet_DL_DLFileShortcutService".equals(inputPortName)) {
            return getPortlet_DL_DLFileShortcutService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.documentlibrary.portlet.liferay.com", "DLFileShortcutServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.documentlibrary.portlet.liferay.com", "Portlet_DL_DLFileShortcutService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_DL_DLFileShortcutService".equals(portName)) {
            setPortlet_DL_DLFileShortcutServiceEndpointAddress(address);
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
