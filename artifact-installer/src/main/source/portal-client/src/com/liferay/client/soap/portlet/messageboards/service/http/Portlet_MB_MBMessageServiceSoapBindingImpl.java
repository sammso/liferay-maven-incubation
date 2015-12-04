/**
 * Portlet_MB_MBMessageServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.messageboards.service.http;

public class Portlet_MB_MBMessageServiceSoapBindingImpl implements com.liferay.client.soap.portlet.messageboards.service.http.MBMessageServiceSoap{
    public com.liferay.client.soap.portlet.messageboards.model.MBMessageSoap getMessage(long messageId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.messageboards.model.MBMessageSoap addMessage(long categoryId, java.lang.String subject, java.lang.String body, java.lang.Object[] files, boolean anonymous, double priority, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.messageboards.model.MBMessageSoap addMessage(long categoryId, long threadId, long parentMessageId, java.lang.String subject, java.lang.String body, java.lang.Object[] files, boolean anonymous, double priority, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.messageboards.model.MBMessageSoap addDiscussionMessage(java.lang.String className, long classPK, long threadId, long parentMessageId, java.lang.String subject, java.lang.String body, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public void deleteDiscussionMessage(long groupId, java.lang.String className, long classPK, long messageId) throws java.rmi.RemoteException {
    }

    public void deleteMessage(long messageId) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portlet.messageboards.model.MBMessageSoap[] getCategoryMessages(long categoryId, int start, int end) throws java.rmi.RemoteException {
        return null;
    }

    public int getCategoryMessagesCount(long categoryId) throws java.rmi.RemoteException {
        return -3;
    }

    public void subscribeMessage(long messageId) throws java.rmi.RemoteException {
    }

    public void unsubscribeMessage(long messageId) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portlet.messageboards.model.MBMessageSoap updateDiscussionMessage(java.lang.String className, long classPK, long messageId, java.lang.String subject, java.lang.String body, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.messageboards.model.MBMessageSoap updateMessage(long messageId, java.lang.String subject, java.lang.String body, java.lang.Object[] files, java.lang.Object[] existingFiles, double priority, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

}
