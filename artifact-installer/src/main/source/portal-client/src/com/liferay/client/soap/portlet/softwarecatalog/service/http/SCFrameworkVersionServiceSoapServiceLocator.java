/**
 * SCFrameworkVersionServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.softwarecatalog.service.http;

public class SCFrameworkVersionServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.softwarecatalog.service.http.SCFrameworkVersionServiceSoapService {

    public SCFrameworkVersionServiceSoapServiceLocator() {
    }


    public SCFrameworkVersionServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SCFrameworkVersionServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_SC_SCFrameworkVersionService
    private java.lang.String Portlet_SC_SCFrameworkVersionService_address = "http://localhost:8080/tunnel-web/axis/Portlet_SC_SCFrameworkVersionService";

    public java.lang.String getPortlet_SC_SCFrameworkVersionServiceAddress() {
        return Portlet_SC_SCFrameworkVersionService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_SC_SCFrameworkVersionServiceWSDDServiceName = "Portlet_SC_SCFrameworkVersionService";

    public java.lang.String getPortlet_SC_SCFrameworkVersionServiceWSDDServiceName() {
        return Portlet_SC_SCFrameworkVersionServiceWSDDServiceName;
    }

    public void setPortlet_SC_SCFrameworkVersionServiceWSDDServiceName(java.lang.String name) {
        Portlet_SC_SCFrameworkVersionServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.softwarecatalog.service.http.SCFrameworkVersionServiceSoap getPortlet_SC_SCFrameworkVersionService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_SC_SCFrameworkVersionService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_SC_SCFrameworkVersionService(endpoint);
    }

    public com.liferay.client.soap.portlet.softwarecatalog.service.http.SCFrameworkVersionServiceSoap getPortlet_SC_SCFrameworkVersionService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.softwarecatalog.service.http.Portlet_SC_SCFrameworkVersionServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.softwarecatalog.service.http.Portlet_SC_SCFrameworkVersionServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_SC_SCFrameworkVersionServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_SC_SCFrameworkVersionServiceEndpointAddress(java.lang.String address) {
        Portlet_SC_SCFrameworkVersionService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.softwarecatalog.service.http.SCFrameworkVersionServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.softwarecatalog.service.http.Portlet_SC_SCFrameworkVersionServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.softwarecatalog.service.http.Portlet_SC_SCFrameworkVersionServiceSoapBindingStub(new java.net.URL(Portlet_SC_SCFrameworkVersionService_address), this);
                _stub.setPortName(getPortlet_SC_SCFrameworkVersionServiceWSDDServiceName());
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
        if ("Portlet_SC_SCFrameworkVersionService".equals(inputPortName)) {
            return getPortlet_SC_SCFrameworkVersionService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.softwarecatalog.portlet.liferay.com", "SCFrameworkVersionServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.softwarecatalog.portlet.liferay.com", "Portlet_SC_SCFrameworkVersionService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_SC_SCFrameworkVersionService".equals(portName)) {
            setPortlet_SC_SCFrameworkVersionServiceEndpointAddress(address);
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
