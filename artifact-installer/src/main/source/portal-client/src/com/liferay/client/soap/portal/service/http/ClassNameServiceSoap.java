/**
 * ClassNameServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface ClassNameServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.ClassNameSoap getClassName(java.lang.String value) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.ClassNameSoap getClassName(long classNameId) throws java.rmi.RemoteException;
    public long getClassNameId(java.lang.String value) throws java.rmi.RemoteException;
    public long getClassNameId(java.lang.Object classObj) throws java.rmi.RemoteException;
}
