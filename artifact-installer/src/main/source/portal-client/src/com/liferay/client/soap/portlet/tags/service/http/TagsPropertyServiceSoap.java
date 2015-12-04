/**
 * TagsPropertyServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.tags.service.http;

public interface TagsPropertyServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.tags.model.TagsPropertySoap[] getProperties(long entryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tags.model.TagsPropertySoap addProperty(long entryId, java.lang.String key, java.lang.String value) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tags.model.TagsPropertySoap[] getPropertyValues(long companyId, java.lang.String key) throws java.rmi.RemoteException;
    public void deleteProperty(long propertyId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tags.model.TagsPropertySoap updateProperty(long propertyId, java.lang.String key, java.lang.String value) throws java.rmi.RemoteException;
}
