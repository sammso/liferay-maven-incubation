/**
 * DLFileShortcutServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.documentlibrary.service.http;

public interface DLFileShortcutServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileShortcutSoap addFileShortcut(long folderId, long toFolderId, java.lang.String toName, java.lang.String[] communityPermissions, java.lang.String[] guestPermissions) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileShortcutSoap addFileShortcut(long folderId, long toFolderId, java.lang.String toName, boolean addCommunityPermissions, boolean addGuestPermissions) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileShortcutSoap addFileShortcut(long folderId, long toFolderId, java.lang.String toName, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteFileShortcut(long fileShortcutId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileShortcutSoap getFileShortcut(long fileShortcutId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileShortcutSoap updateFileShortcut(long fileShortcutId, long folderId, long toFolderId, java.lang.String toName, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileShortcutSoap updateFileShortcut(long fileShortcutId, long folderId, long toFolderId, java.lang.String toName) throws java.rmi.RemoteException;
}
