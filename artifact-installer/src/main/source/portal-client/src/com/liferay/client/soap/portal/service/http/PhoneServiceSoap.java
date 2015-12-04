/**
 * PhoneServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface PhoneServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.PhoneSoap[] getPhones(java.lang.String className, long classPK) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.PhoneSoap addPhone(java.lang.String className, long classPK, java.lang.String number, java.lang.String extension, int typeId, boolean primary) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.PhoneSoap updatePhone(long phoneId, java.lang.String number, java.lang.String extension, int typeId, boolean primary) throws java.rmi.RemoteException;
    public void deletePhone(long phoneId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.PhoneSoap getPhone(long phoneId) throws java.rmi.RemoteException;
}
