/**
 * AnnouncementsFlagServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.announcements.service.http;

public interface AnnouncementsFlagServiceSoap extends java.rmi.Remote {
    public void addFlag(long entryId, int value) throws java.rmi.RemoteException;
    public void deleteFlag(long flagId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.announcements.model.AnnouncementsFlagSoap getFlag(long entryId, int value) throws java.rmi.RemoteException;
}
