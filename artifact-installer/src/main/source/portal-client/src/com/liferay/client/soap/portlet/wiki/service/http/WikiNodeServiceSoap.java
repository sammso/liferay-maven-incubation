/**
 * WikiNodeServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.wiki.service.http;

public interface WikiNodeServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.wiki.model.WikiNodeSoap addNode(java.lang.String name, java.lang.String description, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.wiki.model.WikiNodeSoap getNode(long groupId, java.lang.String name) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.wiki.model.WikiNodeSoap getNode(long nodeId) throws java.rmi.RemoteException;
    public void deleteNode(long nodeId) throws java.rmi.RemoteException;
    public void subscribeNode(long nodeId) throws java.rmi.RemoteException;
    public void unsubscribeNode(long nodeId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.wiki.model.WikiNodeSoap updateNode(long nodeId, java.lang.String name, java.lang.String description, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.wiki.model.WikiNodeSoap updateNode(long nodeId, java.lang.String name, java.lang.String description) throws java.rmi.RemoteException;
}
