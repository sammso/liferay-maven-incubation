/**
 * BookmarksFolderServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.bookmarks.service.http;

public interface BookmarksFolderServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.bookmarks.model.BookmarksFolderSoap getFolder(long folderId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.bookmarks.model.BookmarksFolderSoap addFolder(long parentFolderId, java.lang.String name, java.lang.String description, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteFolder(long folderId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.bookmarks.model.BookmarksFolderSoap updateFolder(long folderId, long parentFolderId, java.lang.String name, java.lang.String description, boolean mergeWithParentFolder, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
