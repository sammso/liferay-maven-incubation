/**
 * JournalFeedServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.journal.service.http;

public interface JournalFeedServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.journal.model.JournalFeedSoap addFeed(long groupId, java.lang.String feedId, boolean autoFeedId, java.lang.String name, java.lang.String description, java.lang.String type, java.lang.String structureId, java.lang.String templateId, java.lang.String rendererTemplateId, int delta, java.lang.String orderByCol, java.lang.String orderByType, java.lang.String targetLayoutFriendlyUrl, java.lang.String targetPortletId, java.lang.String contentField, java.lang.String feedType, double feedVersion, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteFeed(long groupId, java.lang.String feedId) throws java.rmi.RemoteException;
    public void deleteFeed(long groupId, long feedId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalFeedSoap getFeed(long groupId, java.lang.String feedId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalFeedSoap getFeed(long groupId, long feedId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalFeedSoap updateFeed(long groupId, java.lang.String feedId, java.lang.String name, java.lang.String description, java.lang.String type, java.lang.String structureId, java.lang.String templateId, java.lang.String rendererTemplateId, int delta, java.lang.String orderByCol, java.lang.String orderByType, java.lang.String targetLayoutFriendlyUrl, java.lang.String targetPortletId, java.lang.String contentField, java.lang.String feedType, double feedVersion, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
