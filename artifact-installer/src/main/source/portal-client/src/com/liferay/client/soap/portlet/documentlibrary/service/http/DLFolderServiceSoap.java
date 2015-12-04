/**
 * DLFolderServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.documentlibrary.service.http;

public interface DLFolderServiceSoap extends java.rmi.Remote {
    public long getFolderId(long groupId, long parentFolderId, java.lang.String name) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFolderSoap getFolder(long folderId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFolderSoap getFolder(long groupId, long parentFolderId, java.lang.String name) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFolderSoap addFolder(long groupId, long parentFolderId, java.lang.String name, java.lang.String description, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFolderSoap copyFolder(long groupId, long sourceFolderId, long parentFolderId, java.lang.String name, java.lang.String description, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteFolder(long groupId, long parentFolderId, java.lang.String name) throws java.rmi.RemoteException;
    public void deleteFolder(long folderId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFolderSoap[] getFolders(long groupId, long parentFolderId) throws java.rmi.RemoteException;
    public boolean hasInheritableLock(long folderId) throws java.rmi.RemoteException;
    public void reIndexSearch(long companyId) throws java.rmi.RemoteException;
    public void unlockFolder(long folderId, java.lang.String lockUuid) throws java.rmi.RemoteException;
    public void unlockFolder(long groupId, long parentFolderId, java.lang.String name, java.lang.String lockUuid) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFolderSoap updateFolder(long folderId, long parentFolderId, java.lang.String name, java.lang.String description, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public boolean verifyInheritableLock(long folderId, java.lang.String lockUuid) throws java.rmi.RemoteException;
}
