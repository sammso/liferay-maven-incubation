/**
 * WebsiteServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface WebsiteServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.WebsiteSoap[] getWebsites(java.lang.String className, long classPK) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.WebsiteSoap addWebsite(java.lang.String className, long classPK, java.lang.String url, int typeId, boolean primary) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.WebsiteSoap updateWebsite(long websiteId, java.lang.String url, int typeId, boolean primary) throws java.rmi.RemoteException;
    public void deleteWebsite(long websiteId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.WebsiteSoap getWebsite(long websiteId) throws java.rmi.RemoteException;
}
