/**
 * MBThreadServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.messageboards.service.http;

public interface MBThreadServiceSoap extends java.rmi.Remote {
    public void deleteThread(long threadId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.messageboards.model.MBThreadSoap moveThread(long categoryId, long threadId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.messageboards.model.MBThreadSoap splitThread(long messageId, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void unlockThread(long threadId) throws java.rmi.RemoteException;
}
