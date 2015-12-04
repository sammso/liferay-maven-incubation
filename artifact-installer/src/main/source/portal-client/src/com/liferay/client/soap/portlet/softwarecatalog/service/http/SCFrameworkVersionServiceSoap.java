/**
 * SCFrameworkVersionServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.softwarecatalog.service.http;

public interface SCFrameworkVersionServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCFrameworkVersionSoap addFrameworkVersion(java.lang.String name, java.lang.String url, boolean active, int priority, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteFrameworkVersion(long frameworkVersionId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCFrameworkVersionSoap getFrameworkVersion(long frameworkVersionId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCFrameworkVersionSoap[] getFrameworkVersions(long groupId, boolean active, int start, int end) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCFrameworkVersionSoap[] getFrameworkVersions(long groupId, boolean active) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCFrameworkVersionSoap updateFrameworkVersion(long frameworkVersionId, java.lang.String name, java.lang.String url, boolean active, int priority) throws java.rmi.RemoteException;
}
