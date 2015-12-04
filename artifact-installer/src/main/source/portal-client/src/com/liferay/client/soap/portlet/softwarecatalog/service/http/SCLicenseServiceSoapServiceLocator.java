/**
 * SCLicenseServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.softwarecatalog.service.http;

public class SCLicenseServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.softwarecatalog.service.http.SCLicenseServiceSoapService {

    public SCLicenseServiceSoapServiceLocator() {
    }


    public SCLicenseServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SCLicenseServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_SC_SCLicenseService
    private java.lang.String Portlet_SC_SCLicenseService_address = "http://localhost:8080/tunnel-web/axis/Portlet_SC_SCLicenseService";

    public java.lang.String getPortlet_SC_SCLicenseServiceAddress() {
        return Portlet_SC_SCLicenseService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_SC_SCLicenseServiceWSDDServiceName = "Portlet_SC_SCLicenseService";

    public java.lang.String getPortlet_SC_SCLicenseServiceWSDDServiceName() {
        return Portlet_SC_SCLicenseServiceWSDDServiceName;
    }

    public void setPortlet_SC_SCLicenseServiceWSDDServiceName(java.lang.String name) {
        Portlet_SC_SCLicenseServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.softwarecatalog.service.http.SCLicenseServiceSoap getPortlet_SC_SCLicenseService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_SC_SCLicenseService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_SC_SCLicenseService(endpoint);
    }

    public com.liferay.client.soap.portlet.softwarecatalog.service.http.SCLicenseServiceSoap getPortlet_SC_SCLicenseService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.softwarecatalog.service.http.Portlet_SC_SCLicenseServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.softwarecatalog.service.http.Portlet_SC_SCLicenseServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_SC_SCLicenseServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_SC_SCLicenseServiceEndpointAddress(java.lang.String address) {
        Portlet_SC_SCLicenseService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.softwarecatalog.service.http.SCLicenseServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.softwarecatalog.service.http.Portlet_SC_SCLicenseServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.softwarecatalog.service.http.Portlet_SC_SCLicenseServiceSoapBindingStub(new java.net.URL(Portlet_SC_SCLicenseService_address), this);
                _stub.setPortName(getPortlet_SC_SCLicenseServiceWSDDServiceName());
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
        if ("Portlet_SC_SCLicenseService".equals(inputPortName)) {
            return getPortlet_SC_SCLicenseService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.softwarecatalog.portlet.liferay.com", "SCLicenseServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.softwarecatalog.portlet.liferay.com", "Portlet_SC_SCLicenseService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_SC_SCLicenseService".equals(portName)) {
            setPortlet_SC_SCLicenseServiceEndpointAddress(address);
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
