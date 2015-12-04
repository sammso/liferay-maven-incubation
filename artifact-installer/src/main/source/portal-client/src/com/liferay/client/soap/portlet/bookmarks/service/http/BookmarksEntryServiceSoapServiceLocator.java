/**
 * BookmarksEntryServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.bookmarks.service.http;

public class BookmarksEntryServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.bookmarks.service.http.BookmarksEntryServiceSoapService {

    public BookmarksEntryServiceSoapServiceLocator() {
    }


    public BookmarksEntryServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookmarksEntryServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Bookmarks_BookmarksEntryService
    private java.lang.String Portlet_Bookmarks_BookmarksEntryService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Bookmarks_BookmarksEntryService";

    public java.lang.String getPortlet_Bookmarks_BookmarksEntryServiceAddress() {
        return Portlet_Bookmarks_BookmarksEntryService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Bookmarks_BookmarksEntryServiceWSDDServiceName = "Portlet_Bookmarks_BookmarksEntryService";

    public java.lang.String getPortlet_Bookmarks_BookmarksEntryServiceWSDDServiceName() {
        return Portlet_Bookmarks_BookmarksEntryServiceWSDDServiceName;
    }

    public void setPortlet_Bookmarks_BookmarksEntryServiceWSDDServiceName(java.lang.String name) {
        Portlet_Bookmarks_BookmarksEntryServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.bookmarks.service.http.BookmarksEntryServiceSoap getPortlet_Bookmarks_BookmarksEntryService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Bookmarks_BookmarksEntryService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Bookmarks_BookmarksEntryService(endpoint);
    }

    public com.liferay.client.soap.portlet.bookmarks.service.http.BookmarksEntryServiceSoap getPortlet_Bookmarks_BookmarksEntryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.bookmarks.service.http.Portlet_Bookmarks_BookmarksEntryServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.bookmarks.service.http.Portlet_Bookmarks_BookmarksEntryServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Bookmarks_BookmarksEntryServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Bookmarks_BookmarksEntryServiceEndpointAddress(java.lang.String address) {
        Portlet_Bookmarks_BookmarksEntryService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.bookmarks.service.http.BookmarksEntryServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.bookmarks.service.http.Portlet_Bookmarks_BookmarksEntryServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.bookmarks.service.http.Portlet_Bookmarks_BookmarksEntryServiceSoapBindingStub(new java.net.URL(Portlet_Bookmarks_BookmarksEntryService_address), this);
                _stub.setPortName(getPortlet_Bookmarks_BookmarksEntryServiceWSDDServiceName());
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
        if ("Portlet_Bookmarks_BookmarksEntryService".equals(inputPortName)) {
            return getPortlet_Bookmarks_BookmarksEntryService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.bookmarks.portlet.liferay.com", "BookmarksEntryServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.bookmarks.portlet.liferay.com", "Portlet_Bookmarks_BookmarksEntryService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Bookmarks_BookmarksEntryService".equals(portName)) {
            setPortlet_Bookmarks_BookmarksEntryServiceEndpointAddress(address);
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
