/**
 * DLFileEntryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.documentlibrary.service.http;

public interface DLFileEntryServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileEntrySoap getFileEntry(long folderId, java.lang.String name) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileEntrySoap addFileEntry(long folderId, java.lang.String name, java.lang.String title, java.lang.String description, java.lang.String extraSettings, byte[] bytes, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileEntrySoap addFileEntry(long folderId, java.lang.String name, java.lang.String title, java.lang.String description, java.lang.String versionDescription, java.lang.String extraSettings, byte[] bytes, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteFileEntry(long folderId, java.lang.String name, double version) throws java.rmi.RemoteException;
    public void deleteFileEntry(long folderId, java.lang.String name) throws java.rmi.RemoteException;
    public void deleteFileEntryByTitle(long folderId, java.lang.String titleWithExtension) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileEntrySoap[] getFileEntries(long folderId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileEntrySoap getFileEntryByTitle(long folderId, java.lang.String titleWithExtension) throws java.rmi.RemoteException;
    public boolean hasFileEntryLock(long folderId, java.lang.String name) throws java.rmi.RemoteException;
    public void unlockFileEntry(long folderId, java.lang.String name, java.lang.String lockUuid) throws java.rmi.RemoteException;
    public void unlockFileEntry(long folderId, java.lang.String name) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileEntrySoap updateFileEntry(long folderId, long newFolderId, java.lang.String name, java.lang.String sourceFileName, java.lang.String title, java.lang.String description, java.lang.String versionDescription, java.lang.String extraSettings, byte[] bytes, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.documentlibrary.model.DLFileEntrySoap updateFileEntry(long folderId, long newFolderId, java.lang.String name, java.lang.String sourceFileName, java.lang.String title, java.lang.String description, java.lang.String extraSettings, byte[] bytes, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public boolean verifyFileEntryLock(long folderId, java.lang.String name, java.lang.String lockUuid) throws java.rmi.RemoteException;
}
