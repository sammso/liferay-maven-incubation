/**
 * PortletServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface PortletServiceSoap extends java.rmi.Remote {
    public java.lang.Object getWARPortlets() throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.PortletSoap updatePortlet(long companyId, java.lang.String portletId, java.lang.String roles, boolean active) throws java.rmi.RemoteException;
}
