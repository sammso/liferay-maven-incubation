/**
 * JournalTemplateServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.journal.service.http;

public class JournalTemplateServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.journal.service.http.JournalTemplateServiceSoapService {

    public JournalTemplateServiceSoapServiceLocator() {
    }


    public JournalTemplateServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JournalTemplateServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Journal_JournalTemplateService
    private java.lang.String Portlet_Journal_JournalTemplateService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Journal_JournalTemplateService";

    public java.lang.String getPortlet_Journal_JournalTemplateServiceAddress() {
        return Portlet_Journal_JournalTemplateService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Journal_JournalTemplateServiceWSDDServiceName = "Portlet_Journal_JournalTemplateService";

    public java.lang.String getPortlet_Journal_JournalTemplateServiceWSDDServiceName() {
        return Portlet_Journal_JournalTemplateServiceWSDDServiceName;
    }

    public void setPortlet_Journal_JournalTemplateServiceWSDDServiceName(java.lang.String name) {
        Portlet_Journal_JournalTemplateServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.journal.service.http.JournalTemplateServiceSoap getPortlet_Journal_JournalTemplateService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Journal_JournalTemplateService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Journal_JournalTemplateService(endpoint);
    }

    public com.liferay.client.soap.portlet.journal.service.http.JournalTemplateServiceSoap getPortlet_Journal_JournalTemplateService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalTemplateServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalTemplateServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Journal_JournalTemplateServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Journal_JournalTemplateServiceEndpointAddress(java.lang.String address) {
        Portlet_Journal_JournalTemplateService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.journal.service.http.JournalTemplateServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalTemplateServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.journal.service.http.Portlet_Journal_JournalTemplateServiceSoapBindingStub(new java.net.URL(Portlet_Journal_JournalTemplateService_address), this);
                _stub.setPortName(getPortlet_Journal_JournalTemplateServiceWSDDServiceName());
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
        if ("Portlet_Journal_JournalTemplateService".equals(inputPortName)) {
            return getPortlet_Journal_JournalTemplateService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.journal.portlet.liferay.com", "JournalTemplateServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.journal.portlet.liferay.com", "Portlet_Journal_JournalTemplateService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Journal_JournalTemplateService".equals(portName)) {
            setPortlet_Journal_JournalTemplateServiceEndpointAddress(address);
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
