/**
 * JournalArticleServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.journal.service.http;

public interface JournalArticleServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.journal.model.JournalArticleSoap addArticle(long groupId, java.lang.String articleId, boolean autoArticleId, java.lang.String title, java.lang.String description, java.lang.String content, java.lang.String type, java.lang.String structureId, java.lang.String templateId, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear, int reviewDateHour, int reviewDateMinute, boolean neverReview, boolean indexable, java.lang.String articleURL, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalArticleSoap approveArticle(long groupId, java.lang.String articleId, double version, java.lang.String articleURL, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalArticleSoap copyArticle(long groupId, java.lang.String oldArticleId, java.lang.String newArticleId, boolean autoArticleId, double version) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalArticleSoap getArticle(long groupId, java.lang.String articleId, double version) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalArticleSoap getArticle(long groupId, java.lang.String articleId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalArticleSoap getArticleByUrlTitle(long groupId, java.lang.String urlTitle) throws java.rmi.RemoteException;
    public void deleteArticle(long groupId, java.lang.String articleId, double version, java.lang.String articleURL, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void expireArticle(long groupId, java.lang.String articleId, double version, java.lang.String articleURL, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalArticleSoap removeArticleLocale(long groupId, java.lang.String articleId, double version, java.lang.String languageId) throws java.rmi.RemoteException;
    public void removeArticleLocale(long companyId, java.lang.String languageId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalArticleSoap updateArticle(long groupId, java.lang.String articleId, double version, boolean incrementVersion, java.lang.String content) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalArticleSoap updateContent(long groupId, java.lang.String articleId, double version, java.lang.String content) throws java.rmi.RemoteException;
}
