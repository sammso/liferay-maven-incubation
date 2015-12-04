/**
 * WikiPageServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.wiki.service.http;

public interface WikiPageServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.wiki.model.WikiPageSoap addPage(long nodeId, java.lang.String title, java.lang.String content, java.lang.String summary, boolean minorEdit, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.wiki.model.WikiPageSoap addPage(long nodeId, java.lang.String title, java.lang.String content, java.lang.String summary, boolean minorEdit, java.lang.String format, java.lang.String parentTitle, java.lang.String redirectTitle, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.wiki.model.WikiPageSoap getPage(long nodeId, java.lang.String title, double version) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.wiki.model.WikiPageSoap getPage(long nodeId, java.lang.String title) throws java.rmi.RemoteException;
    public void addPageAttachments(long nodeId, java.lang.String title, java.lang.Object[] files) throws java.rmi.RemoteException;
    public void changeParent(long nodeId, java.lang.String title, java.lang.String newParentTitle, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deletePage(long nodeId, java.lang.String title) throws java.rmi.RemoteException;
    public void deletePageAttachment(long nodeId, java.lang.String title, java.lang.String fileName) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.wiki.model.WikiPageSoap[] getNodePages(long nodeId, int max) throws java.rmi.RemoteException;
    public java.lang.String getNodePagesRSS(long nodeId, int max, java.lang.String type, double version, java.lang.String displayStyle, java.lang.String feedURL, java.lang.String entryURL) throws java.rmi.RemoteException;
    public java.lang.String getPagesRSS(long companyId, long nodeId, java.lang.String title, int max, java.lang.String type, double version, java.lang.String displayStyle, java.lang.String feedURL, java.lang.String entryURL, java.lang.String locale) throws java.rmi.RemoteException;
    public void movePage(long nodeId, java.lang.String title, java.lang.String newTitle, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.wiki.model.WikiPageSoap revertPage(long nodeId, java.lang.String title, double version, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void subscribePage(long nodeId, java.lang.String title) throws java.rmi.RemoteException;
    public void unsubscribePage(long nodeId, java.lang.String title) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.wiki.model.WikiPageSoap updatePage(long nodeId, java.lang.String title, double version, java.lang.String content, java.lang.String summary, boolean minorEdit, java.lang.String format, java.lang.String parentTitle, java.lang.String redirectTitle, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
