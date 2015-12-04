/**
 * JournalStructureServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.journal.service.http;

public class JournalStructureServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.journal.service.http.JournalStructureServiceSoapService {

    public JournalStructureServiceSoapServiceLocator() {
    }


    public JournalStructureServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JournalStructureServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Journal_JournalStructureService
    private java.lang.String Portlet_Journal_JournalStructureService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Journal_JournalStructureService";

    public java.lang.String getPortlet_Journal_JournalStructureServiceAddress() {
        return Portlet_Journal_JournalStructureService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Journal_JournalStructureServiceWSDDServiceName = "Portlet_Journal_JournalStructureService";

    public java.lang.String getPortlet_Journal_JournalStructureServiceWSDDServiceName() {
        return Portlet_Journal_JournalStructureServiceWSDDServiceName;
    }

    public void setPortlet_Journal_JournalStructureServiceWSDDServiceName(java.lang.String name) {
        Portlet_Journal_JournalStructureServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.journal.service.http.JournalStructureServiceSoap getPortlet_Journal_JournalStructureService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Journal_JournalStructureService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Journal_JournalStructureService(endpoint);
    }

    public com.liferay.client.soap.portlet.journal.service.http.JournalStructureServiceSoap getPortlet_Journal_JournalStructureService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalStructureServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalStructureServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Journal_JournalStructureServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Journal_JournalStructureServiceEndpointAddress(java.lang.String address) {
        Portlet_Journal_JournalStructureService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.journal.service.http.JournalStructureServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalStructureServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalStructureServiceSoapBindingStub(new java.net.URL(Portlet_Journal_JournalStructureService_address), this);
                _stub.setPortName(getPortlet_Journal_JournalStructureServiceWSDDServiceName());
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
        if ("Portlet_Journal_JournalStructureService".equals(inputPortName)) {
            return getPortlet_Journal_JournalStructureService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.journal.portlet.liferay.com", "JournalStructureServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.journal.portlet.liferay.com", "Portlet_Journal_JournalStructureService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Journal_JournalStructureService".equals(portName)) {
            setPortlet_Journal_JournalStructureServiceEndpointAddress(address);
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
