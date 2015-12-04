/**
 * ExpandoColumnServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.expando.service.http;

public interface ExpandoColumnServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.expando.model.ExpandoColumnSoap addColumn(long tableId, java.lang.String name, int type, java.lang.Object defaultData) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.expando.model.ExpandoColumnSoap addColumn(long tableId, java.lang.String name, int type) throws java.rmi.RemoteException;
    public void deleteColumn(long columnId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.expando.model.ExpandoColumnSoap updateColumn(long columnId, java.lang.String name, int type, java.lang.Object defaultData) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.expando.model.ExpandoColumnSoap updateColumn(long columnId, java.lang.String name, int type) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.expando.model.ExpandoColumnSoap updateTypeSettings(long columnId, java.lang.String typeSettings) throws java.rmi.RemoteException;
}
