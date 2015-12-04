/**
 * PollsVoteServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.polls.service.http;

public interface PollsVoteServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.polls.model.PollsVoteSoap addVote(long questionId, long choiceId) throws java.rmi.RemoteException;
}
