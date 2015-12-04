/**
 * EmailAddressServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface EmailAddressServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.EmailAddressSoap[] getEmailAddresses(java.lang.String className, long classPK) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.EmailAddressSoap addEmailAddress(java.lang.String className, long classPK, java.lang.String address, int typeId, boolean primary) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.EmailAddressSoap updateEmailAddress(long emailAddressId, java.lang.String address, int typeId, boolean primary) throws java.rmi.RemoteException;
    public void deleteEmailAddress(long emailAddressId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.EmailAddressSoap getEmailAddress(long emailAddressId) throws java.rmi.RemoteException;
}
