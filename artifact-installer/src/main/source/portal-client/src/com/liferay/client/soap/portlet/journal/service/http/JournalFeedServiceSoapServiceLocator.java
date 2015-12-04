/**
 * JournalFeedServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.journal.service.http;

public class JournalFeedServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.journal.service.http.JournalFeedServiceSoapService {

    public JournalFeedServiceSoapServiceLocator() {
    }


    public JournalFeedServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JournalFeedServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Journal_JournalFeedService
    private java.lang.String Portlet_Journal_JournalFeedService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Journal_JournalFeedService";

    public java.lang.String getPortlet_Journal_JournalFeedServiceAddress() {
        return Portlet_Journal_JournalFeedService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Journal_JournalFeedServiceWSDDServiceName = "Portlet_Journal_JournalFeedService";

    public java.lang.String getPortlet_Journal_JournalFeedServiceWSDDServiceName() {
        return Portlet_Journal_JournalFeedServiceWSDDServiceName;
    }

    public void setPortlet_Journal_JournalFeedServiceWSDDServiceName(java.lang.String name) {
        Portlet_Journal_JournalFeedServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.journal.service.http.JournalFeedServiceSoap getPortlet_Journal_JournalFeedService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Journal_JournalFeedService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Journal_JournalFeedService(endpoint);
    }

    public com.liferay.client.soap.portlet.journal.service.http.JournalFeedServiceSoap getPortlet_Journal_JournalFeedService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalFeedServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalFeedServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Journal_JournalFeedServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Journal_JournalFeedServiceEndpointAddress(java.lang.String address) {
        Portlet_Journal_JournalFeedService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.journal.service.http.JournalFeedServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalFeedServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalFeedServiceSoapBindingStub(new java.net.URL(Portlet_Journal_JournalFeedService_address), this);
                _stub.setPortName(getPortlet_Journal_JournalFeedServiceWSDDServiceName());
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
        if ("Portlet_Journal_JournalFeedService".equals(inputPortName)) {
            return getPortlet_Journal_JournalFeedService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.journal.portlet.liferay.com", "JournalFeedServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.journal.portlet.liferay.com", "Portlet_Journal_JournalFeedService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Journal_JournalFeedService".equals(portName)) {
            setPortlet_Journal_JournalFeedServiceEndpointAddress(address);
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
