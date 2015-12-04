/**
 * TasksProposalServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.tasks.service.http;

public class TasksProposalServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.liferay.client.soap.portlet.tasks.service.http.TasksProposalServiceSoapService {

    public TasksProposalServiceSoapServiceLocator() {
    }


    public TasksProposalServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TasksProposalServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Tasks_TasksProposalService
    private java.lang.String Portlet_Tasks_TasksProposalService_address = "http://localhost:8080/tunnel-web/axis/Portlet_Tasks_TasksProposalService";

    public java.lang.String getPortlet_Tasks_TasksProposalServiceAddress() {
        return Portlet_Tasks_TasksProposalService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Tasks_TasksProposalServiceWSDDServiceName = "Portlet_Tasks_TasksProposalService";

    public java.lang.String getPortlet_Tasks_TasksProposalServiceWSDDServiceName() {
        return Portlet_Tasks_TasksProposalServiceWSDDServiceName;
    }

    public void setPortlet_Tasks_TasksProposalServiceWSDDServiceName(java.lang.String name) {
        Portlet_Tasks_TasksProposalServiceWSDDServiceName = name;
    }

    public com.liferay.client.soap.portlet.tasks.service.http.TasksProposalServiceSoap getPortlet_Tasks_TasksProposalService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Tasks_TasksProposalService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Tasks_TasksProposalService(endpoint);
    }

    public com.liferay.client.soap.portlet.tasks.service.http.TasksProposalServiceSoap getPortlet_Tasks_TasksProposalService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.liferay.client.soap.portlet.tasks.service.http.Portlet_Tasks_TasksProposalServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.tasks.service.http.Portlet_Tasks_TasksProposalServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Tasks_TasksProposalServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Tasks_TasksProposalServiceEndpointAddress(java.lang.String address) {
        Portlet_Tasks_TasksProposalService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.liferay.client.soap.portlet.tasks.service.http.TasksProposalServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.liferay.client.soap.portlet.tasks.service.http.Portlet_Tasks_TasksProposalServiceSoapBindingStub _stub = new com.liferay.client.soap.portlet.tasks.service.http.Portlet_Tasks_TasksProposalServiceSoapBindingStub(new java.net.URL(Portlet_Tasks_TasksProposalService_address), this);
                _stub.setPortName(getPortlet_Tasks_TasksProposalServiceWSDDServiceName());
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
        if ("Portlet_Tasks_TasksProposalService".equals(inputPortName)) {
            return getPortlet_Tasks_TasksProposalService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.tasks.portlet.liferay.com", "TasksProposalServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.tasks.portlet.liferay.com", "Portlet_Tasks_TasksProposalService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Tasks_TasksProposalService".equals(portName)) {
            setPortlet_Tasks_TasksProposalServiceEndpointAddress(address);
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
