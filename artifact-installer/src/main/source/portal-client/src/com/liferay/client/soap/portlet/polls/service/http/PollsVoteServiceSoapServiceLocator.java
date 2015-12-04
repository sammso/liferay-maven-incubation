/**
 * PollsVoteServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.polls.service.http;

public class PollsVoteServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.polls.service.http.PollsVoteServiceSoapService {

    public PollsVoteServiceSoapServiceLocator() {
    }


    public PollsVoteServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PollsVoteServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Polls_PollsVoteService
    private java.lang.String Portlet_Polls_PollsVoteService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Polls_PollsVoteService";

    public java.lang.String getPortlet_Polls_PollsVoteServiceAddress() {
        return Portlet_Polls_PollsVoteService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Polls_PollsVoteServiceWSDDServiceName = "Portlet_Polls_PollsVoteService";

    public java.lang.String getPortlet_Polls_PollsVoteServiceWSDDServiceName() {
        return Portlet_Polls_PollsVoteServiceWSDDServiceName;
    }

    public void setPortlet_Polls_PollsVoteServiceWSDDServiceName(java.lang.String name) {
        Portlet_Polls_PollsVoteServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.polls.service.http.PollsVoteServiceSoap getPortlet_Polls_PollsVoteService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Polls_PollsVoteService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Polls_PollsVoteService(endpoint);
    }

    public com.liferay.client.soap.portlet.polls.service.http.PollsVoteServiceSoap getPortlet_Polls_PollsVoteService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.polls.service.http.Portlet_Polls_PollsVoteServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.polls.service.http.Portlet_Polls_PollsVoteServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Polls_PollsVoteServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Polls_PollsVoteServiceEndpointAddress(java.lang.String address) {
        Portlet_Polls_PollsVoteService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.polls.service.http.PollsVoteServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.polls.service.http.Portlet_Polls_PollsVoteServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.polls.service.http.Portlet_Polls_PollsVoteServiceSoapBindingStub(new java.net.URL(Portlet_Polls_PollsVoteService_address), this);
                _stub.setPortName(getPortlet_Polls_PollsVoteServiceWSDDServiceName());
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
        if ("Portlet_Polls_PollsVoteService".equals(inputPortName)) {
            return getPortlet_Polls_PollsVoteService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.polls.portlet.liferay.com", "PollsVoteServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.polls.portlet.liferay.com", "Portlet_Polls_PollsVoteService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Polls_PollsVoteService".equals(portName)) {
            setPortlet_Polls_PollsVoteServiceEndpointAddress(address);
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
