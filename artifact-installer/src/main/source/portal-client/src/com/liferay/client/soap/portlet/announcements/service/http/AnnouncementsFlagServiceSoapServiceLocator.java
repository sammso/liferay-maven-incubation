/**
 * AnnouncementsFlagServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.announcements.service.http;

public class AnnouncementsFlagServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.announcements.service.http.AnnouncementsFlagServiceSoapService {

    public AnnouncementsFlagServiceSoapServiceLocator() {
    }


    public AnnouncementsFlagServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AnnouncementsFlagServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Announcements_AnnouncementsFlagService
    private java.lang.String Portlet_Announcements_AnnouncementsFlagService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Announcements_AnnouncementsFlagService";

    public java.lang.String getPortlet_Announcements_AnnouncementsFlagServiceAddress() {
        return Portlet_Announcements_AnnouncementsFlagService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Announcements_AnnouncementsFlagServiceWSDDServiceName = "Portlet_Announcements_AnnouncementsFlagService";

    public java.lang.String getPortlet_Announcements_AnnouncementsFlagServiceWSDDServiceName() {
        return Portlet_Announcements_AnnouncementsFlagServiceWSDDServiceName;
    }

    public void setPortlet_Announcements_AnnouncementsFlagServiceWSDDServiceName(java.lang.String name) {
        Portlet_Announcements_AnnouncementsFlagServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.announcements.service.http.AnnouncementsFlagServiceSoap getPortlet_Announcements_AnnouncementsFlagService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Announcements_AnnouncementsFlagService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Announcements_AnnouncementsFlagService(endpoint);
    }

    public com.liferay.client.soap.portlet.announcements.service.http.AnnouncementsFlagServiceSoap getPortlet_Announcements_AnnouncementsFlagService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.announcements.service.http.Portlet_Announcements_AnnouncementsFlagServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.announcements.service.http.Portlet_Announcements_AnnouncementsFlagServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Announcements_AnnouncementsFlagServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Announcements_AnnouncementsFlagServiceEndpointAddress(java.lang.String address) {
        Portlet_Announcements_AnnouncementsFlagService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.announcements.service.http.AnnouncementsFlagServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.announcements.service.http.Portlet_Announcements_AnnouncementsFlagServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.announcements.service.http.Portlet_Announcements_AnnouncementsFlagServiceSoapBindingStub(new java.net.URL(Portlet_Announcements_AnnouncementsFlagService_address), this);
                _stub.setPortName(getPortlet_Announcements_AnnouncementsFlagServiceWSDDServiceName());
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
        if ("Portlet_Announcements_AnnouncementsFlagService".equals(inputPortName)) {
            return getPortlet_Announcements_AnnouncementsFlagService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.announcements.portlet.liferay.com", "AnnouncementsFlagServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.announcements.portlet.liferay.com", "Portlet_Announcements_AnnouncementsFlagService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Announcements_AnnouncementsFlagService".equals(portName)) {
            setPortlet_Announcements_AnnouncementsFlagServiceEndpointAddress(address);
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
