/**
 * ResourceServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface ResourceServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.ResourceSoap getResource(long companyId, java.lang.String name, int scope, java.lang.String primKey) throws java.rmi.RemoteException;
}
