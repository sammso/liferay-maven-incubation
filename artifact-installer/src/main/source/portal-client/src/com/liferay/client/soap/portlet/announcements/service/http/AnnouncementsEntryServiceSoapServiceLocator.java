/**
 * AnnouncementsEntryServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.announcements.service.http;

public class AnnouncementsEntryServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.announcements.service.http.AnnouncementsEntryServiceSoapService {

    public AnnouncementsEntryServiceSoapServiceLocator() {
    }


    public AnnouncementsEntryServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AnnouncementsEntryServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Announcements_AnnouncementsEntryService
    private java.lang.String Portlet_Announcements_AnnouncementsEntryService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Announcements_AnnouncementsEntryService";

    public java.lang.String getPortlet_Announcements_AnnouncementsEntryServiceAddress() {
        return Portlet_Announcements_AnnouncementsEntryService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Announcements_AnnouncementsEntryServiceWSDDServiceName = "Portlet_Announcements_AnnouncementsEntryService";

    public java.lang.String getPortlet_Announcements_AnnouncementsEntryServiceWSDDServiceName() {
        return Portlet_Announcements_AnnouncementsEntryServiceWSDDServiceName;
    }

    public void setPortlet_Announcements_AnnouncementsEntryServiceWSDDServiceName(java.lang.String name) {
        Portlet_Announcements_AnnouncementsEntryServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.announcements.service.http.AnnouncementsEntryServiceSoap getPortlet_Announcements_AnnouncementsEntryService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Announcements_AnnouncementsEntryService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Announcements_AnnouncementsEntryService(endpoint);
    }

    public com.liferay.client.soap.portlet.announcements.service.http.AnnouncementsEntryServiceSoap getPortlet_Announcements_AnnouncementsEntryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.announcements.service.http.Portlet_Announcements_AnnouncementsEntryServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.announcements.service.http.Portlet_Announcements_AnnouncementsEntryServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Announcements_AnnouncementsEntryServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Announcements_AnnouncementsEntryServiceEndpointAddress(java.lang.String address) {
        Portlet_Announcements_AnnouncementsEntryService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.announcements.service.http.AnnouncementsEntryServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.announcements.service.http.Portlet_Announcements_AnnouncementsEntryServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.announcements.service.http.Portlet_Announcements_AnnouncementsEntryServiceSoapBindingStub(new java.net.URL(Portlet_Announcements_AnnouncementsEntryService_address), this);
                _stub.setPortName(getPortlet_Announcements_AnnouncementsEntryServiceWSDDServiceName());
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
        if ("Portlet_Announcements_AnnouncementsEntryService".equals(inputPortName)) {
            return getPortlet_Announcements_AnnouncementsEntryService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.announcements.portlet.liferay.com", "AnnouncementsEntryServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.announcements.portlet.liferay.com", "Portlet_Announcements_AnnouncementsEntryService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Announcements_AnnouncementsEntryService".equals(portName)) {
            setPortlet_Announcements_AnnouncementsEntryServiceEndpointAddress(address);
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
