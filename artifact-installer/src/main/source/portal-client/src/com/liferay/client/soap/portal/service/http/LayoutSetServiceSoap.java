/**
 * LayoutSetServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface LayoutSetServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.LayoutSetSoap updateLookAndFeel(long groupId, boolean privateLayout, java.lang.String themeId, java.lang.String colorSchemeId, java.lang.String css, boolean wapTheme) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.LayoutSetSoap updateVirtualHost(long groupId, boolean privateLayout, java.lang.String virtualHost) throws java.rmi.RemoteException;
}
