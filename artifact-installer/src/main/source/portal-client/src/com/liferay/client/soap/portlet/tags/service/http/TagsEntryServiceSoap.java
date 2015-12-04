/**
 * TagsEntryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.tags.service.http;

public interface TagsEntryServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.tags.model.TagsEntrySoap addEntry(java.lang.String parentEntryName, java.lang.String name, java.lang.String vocabularyName, java.lang.String[] properties, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tags.model.TagsEntrySoap getEntry(long entryId) throws java.rmi.RemoteException;
    public java.lang.Object search(long groupId, java.lang.String name, java.lang.String[] properties, int start, int end) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tags.model.TagsEntrySoap[] getEntries(java.lang.String className, long classPK) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tags.model.TagsEntrySoap[] getEntries(long groupId, long classNameId, java.lang.String name) throws java.rmi.RemoteException;
    public void deleteEntry(long entryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tags.model.TagsEntrySoap updateEntry(long entryId, java.lang.String parentEntryName, java.lang.String name, java.lang.String vocabularyName, java.lang.String[] properties) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tags.model.TagsEntrySoap[] getGroupVocabularyEntries(long groupId, java.lang.String parentEntryName, java.lang.String vocabularyName) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tags.model.TagsEntrySoap[] getGroupVocabularyEntries(long groupId, java.lang.String vocabularyName) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tags.model.TagsEntrySoap[] getGroupVocabularyRootEntries(long groupId, java.lang.String vocabularyName) throws java.rmi.RemoteException;
    public void mergeEntries(long fromEntryId, long toEntryId) throws java.rmi.RemoteException;
}
