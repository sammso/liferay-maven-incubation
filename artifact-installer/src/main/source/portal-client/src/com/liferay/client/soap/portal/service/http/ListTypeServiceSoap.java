/**
 * ListTypeServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface ListTypeServiceSoap extends java.rmi.Remote {
    public void validate(int listTypeId, java.lang.String type) throws java.rmi.RemoteException;
    public void validate(int listTypeId, long classNameId, java.lang.String type) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.ListTypeSoap getListType(int listTypeId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.ListTypeSoap[] getListTypes(java.lang.String type) throws java.rmi.RemoteException;
}
