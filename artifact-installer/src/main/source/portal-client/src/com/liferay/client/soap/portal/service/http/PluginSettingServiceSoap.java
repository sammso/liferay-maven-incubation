/**
 * PluginSettingServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface PluginSettingServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.PluginSettingSoap updatePluginSetting(long companyId, java.lang.String pluginId, java.lang.String pluginType, java.lang.String roles, boolean active) throws java.rmi.RemoteException;
}
