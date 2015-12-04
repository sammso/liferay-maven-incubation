/**
 * MBMessageFlagServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.messageboards.service.http;

public interface MBMessageFlagServiceSoap extends java.rmi.Remote {
    public void addAnswerFlag(long messageId) throws java.rmi.RemoteException;
    public void deleteAnswerFlag(long messageId) throws java.rmi.RemoteException;
}
