/**
 * AnnouncementsEntryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.announcements.service.http;

public interface AnnouncementsEntryServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.announcements.model.AnnouncementsEntrySoap addEntry(long plid, long classNameId, long classPK, java.lang.String title, java.lang.String content, java.lang.String url, java.lang.String type, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, int priority, boolean alert) throws java.rmi.RemoteException;
    public void deleteEntry(long entryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.announcements.model.AnnouncementsEntrySoap updateEntry(long entryId, java.lang.String title, java.lang.String content, java.lang.String url, java.lang.String type, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, int priority) throws java.rmi.RemoteException;
}
