/**
 * PollsQuestionServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.polls.service.http;

public class PollsQuestionServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.polls.service.http.PollsQuestionServiceSoapService {

    public PollsQuestionServiceSoapServiceLocator() {
    }


    public PollsQuestionServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PollsQuestionServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Polls_PollsQuestionService
    private java.lang.String Portlet_Polls_PollsQuestionService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Polls_PollsQuestionService";

    public java.lang.String getPortlet_Polls_PollsQuestionServiceAddress() {
        return Portlet_Polls_PollsQuestionService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Polls_PollsQuestionServiceWSDDServiceName = "Portlet_Polls_PollsQuestionService";

    public java.lang.String getPortlet_Polls_PollsQuestionServiceWSDDServiceName() {
        return Portlet_Polls_PollsQuestionServiceWSDDServiceName;
    }

    public void setPortlet_Polls_PollsQuestionServiceWSDDServiceName(java.lang.String name) {
        Portlet_Polls_PollsQuestionServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.polls.service.http.PollsQuestionServiceSoap getPortlet_Polls_PollsQuestionService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Polls_PollsQuestionService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Polls_PollsQuestionService(endpoint);
    }

    public com.liferay.client.soap.portlet.polls.service.http.PollsQuestionServiceSoap getPortlet_Polls_PollsQuestionService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.polls.service.http.Portlet_Polls_PollsQuestionServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.polls.service.http.Portlet_Polls_PollsQuestionServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Polls_PollsQuestionServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Polls_PollsQuestionServiceEndpointAddress(java.lang.String address) {
        Portlet_Polls_PollsQuestionService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.polls.service.http.PollsQuestionServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.polls.service.http.Portlet_Polls_PollsQuestionServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.polls.service.http.Portlet_Polls_PollsQuestionServiceSoapBindingStub(new java.net.URL(Portlet_Polls_PollsQuestionService_address), this);
                _stub.setPortName(getPortlet_Polls_PollsQuestionServiceWSDDServiceName());
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
        if ("Portlet_Polls_PollsQuestionService".equals(inputPortName)) {
            return getPortlet_Polls_PollsQuestionService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.polls.portlet.liferay.com", "PollsQuestionServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.polls.portlet.liferay.com", "Portlet_Polls_PollsQuestionService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Polls_PollsQuestionService".equals(portName)) {
            setPortlet_Polls_PollsQuestionServiceEndpointAddress(address);
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
