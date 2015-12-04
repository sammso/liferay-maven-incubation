/**
 * BookmarksEntryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.bookmarks.service.http;

public interface BookmarksEntryServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.bookmarks.model.BookmarksEntrySoap addEntry(long folderId, java.lang.String name, java.lang.String url, java.lang.String comments, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.bookmarks.model.BookmarksEntrySoap getEntry(long entryId) throws java.rmi.RemoteException;
    public void deleteEntry(long entryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.bookmarks.model.BookmarksEntrySoap updateEntry(long entryId, long folderId, java.lang.String name, java.lang.String url, java.lang.String comments, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.bookmarks.model.BookmarksEntrySoap openEntry(long entryId) throws java.rmi.RemoteException;
}
