/**
 * CalEventServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.calendar.service.http;

public class CalEventServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.calendar.service.http.CalEventServiceSoapService {

    public CalEventServiceSoapServiceLocator() {
    }


    public CalEventServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalEventServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Cal_CalEventService
    private java.lang.String Portlet_Cal_CalEventService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Cal_CalEventService";

    public java.lang.String getPortlet_Cal_CalEventServiceAddress() {
        return Portlet_Cal_CalEventService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Cal_CalEventServiceWSDDServiceName = "Portlet_Cal_CalEventService";

    public java.lang.String getPortlet_Cal_CalEventServiceWSDDServiceName() {
        return Portlet_Cal_CalEventServiceWSDDServiceName;
    }

    public void setPortlet_Cal_CalEventServiceWSDDServiceName(java.lang.String name) {
        Portlet_Cal_CalEventServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.calendar.service.http.CalEventServiceSoap getPortlet_Cal_CalEventService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Cal_CalEventService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Cal_CalEventService(endpoint);
    }

    public com.liferay.client.soap.portlet.calendar.service.http.CalEventServiceSoap getPortlet_Cal_CalEventService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.calendar.service.http.Portlet_Cal_CalEventServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.calendar.service.http.Portlet_Cal_CalEventServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Cal_CalEventServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Cal_CalEventServiceEndpointAddress(java.lang.String address) {
        Portlet_Cal_CalEventService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.calendar.service.http.CalEventServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.calendar.service.http.Portlet_Cal_CalEventServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.calendar.service.http.Portlet_Cal_CalEventServiceSoapBindingStub(new java.net.URL(Portlet_Cal_CalEventService_address), this);
                _stub.setPortName(getPortlet_Cal_CalEventServiceWSDDServiceName());
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
        if ("Portlet_Cal_CalEventService".equals(inputPortName)) {
            return getPortlet_Cal_CalEventService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.calendar.portlet.liferay.com", "CalEventServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.calendar.portlet.liferay.com", "Portlet_Cal_CalEventService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Cal_CalEventService".equals(portName)) {
            setPortlet_Cal_CalEventServiceEndpointAddress(address);
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
