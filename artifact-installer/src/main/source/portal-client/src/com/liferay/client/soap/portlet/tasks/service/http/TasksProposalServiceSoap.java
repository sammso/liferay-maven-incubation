/**
 * TasksProposalServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.tasks.service.http;

public interface TasksProposalServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.tasks.model.TasksProposalSoap addProposal(long groupId, java.lang.String className, java.lang.String classPK, java.lang.String name, java.lang.String description, long reviewUserId, java.lang.String[] communityPermissions, java.lang.String[] guestPermissions) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tasks.model.TasksProposalSoap addProposal(long groupId, java.lang.String className, java.lang.String classPK, java.lang.String name, java.lang.String description, long reviewUserId, boolean addCommunityPermissions, boolean addGuestPermissions) throws java.rmi.RemoteException;
    public void deleteProposal(long proposalId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tasks.model.TasksProposalSoap updateProposal(long proposalId, java.lang.String description, int dueDateMonth, int dueDateDay, int dueDateYear, int dueDateHour, int dueDateMinute) throws java.rmi.RemoteException;
}
