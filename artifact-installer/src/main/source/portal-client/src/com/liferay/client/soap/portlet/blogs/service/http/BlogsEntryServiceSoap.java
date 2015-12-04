/**
 * BlogsEntryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.blogs.service.http;

public interface BlogsEntryServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.blogs.model.BlogsEntrySoap addEntry(java.lang.String title, java.lang.String content, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, boolean draft, boolean allowTrackbacks, java.lang.String[] trackbacks, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.blogs.model.BlogsEntrySoap getEntry(long entryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.blogs.model.BlogsEntrySoap getEntry(long groupId, java.lang.String urlTitle) throws java.rmi.RemoteException;
    public void deleteEntry(long entryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.blogs.model.BlogsEntrySoap updateEntry(long entryId, java.lang.String title, java.lang.String content, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, boolean draft, boolean allowTrackbacks, java.lang.String[] trackbacks, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.blogs.model.BlogsEntrySoap[] getCompanyEntries(long companyId, int max) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.blogs.model.BlogsEntrySoap[] getGroupEntries(long groupId, int max) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.blogs.model.BlogsEntrySoap[] getGroupsEntries(long companyId, long groupId, int max) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.blogs.model.BlogsEntrySoap[] getOrganizationEntries(long organizationId, int max) throws java.rmi.RemoteException;
}
