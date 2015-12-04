/**
 * PollsQuestionServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.polls.service.http;

public interface PollsQuestionServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.polls.model.PollsQuestionSoap addQuestion(java.lang.String title, java.lang.String description, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, com.liferay.client.soap.portlet.polls.model.PollsChoiceSoap[] choices, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteQuestion(long questionId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.polls.model.PollsQuestionSoap getQuestion(long questionId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.polls.model.PollsQuestionSoap updateQuestion(long questionId, java.lang.String title, java.lang.String description, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, com.liferay.client.soap.portlet.polls.model.PollsChoiceSoap[] choices, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
