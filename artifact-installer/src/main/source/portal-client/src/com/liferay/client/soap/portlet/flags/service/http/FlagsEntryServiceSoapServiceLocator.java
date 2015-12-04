/**
 * FlagsEntryServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.flags.service.http;

public class FlagsEntryServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.flags.service.http.FlagsEntryServiceSoapService {

    public FlagsEntryServiceSoapServiceLocator() {
    }


    public FlagsEntryServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FlagsEntryServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Flags_FlagsEntryService
    private java.lang.String Portlet_Flags_FlagsEntryService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Flags_FlagsEntryService";

    public java.lang.String getPortlet_Flags_FlagsEntryServiceAddress() {
        return Portlet_Flags_FlagsEntryService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Flags_FlagsEntryServiceWSDDServiceName = "Portlet_Flags_FlagsEntryService";

    public java.lang.String getPortlet_Flags_FlagsEntryServiceWSDDServiceName() {
        return Portlet_Flags_FlagsEntryServiceWSDDServiceName;
    }

    public void setPortlet_Flags_FlagsEntryServiceWSDDServiceName(java.lang.String name) {
        Portlet_Flags_FlagsEntryServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.flags.service.http.FlagsEntryServiceSoap getPortlet_Flags_FlagsEntryService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Flags_FlagsEntryService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Flags_FlagsEntryService(endpoint);
    }

    public com.liferay.client.soap.portlet.flags.service.http.FlagsEntryServiceSoap getPortlet_Flags_FlagsEntryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.flags.service.http.Portlet_Flags_FlagsEntryServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.flags.service.http.Portlet_Flags_FlagsEntryServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Flags_FlagsEntryServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Flags_FlagsEntryServiceEndpointAddress(java.lang.String address) {
        Portlet_Flags_FlagsEntryService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.flags.service.http.FlagsEntryServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.flags.service.http.Portlet_Flags_FlagsEntryServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.flags.service.http.Portlet_Flags_FlagsEntryServiceSoapBindingStub(new java.net.URL(Portlet_Flags_FlagsEntryService_address), this);
                _stub.setPortName(getPortlet_Flags_FlagsEntryServiceWSDDServiceName());
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
        if ("Portlet_Flags_FlagsEntryService".equals(inputPortName)) {
            return getPortlet_Flags_FlagsEntryService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.flags.portlet.liferay.com", "FlagsEntryServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.flags.portlet.liferay.com", "Portlet_Flags_FlagsEntryService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Flags_FlagsEntryService".equals(portName)) {
            setPortlet_Flags_FlagsEntryServiceEndpointAddress(address);
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
