/**
 * TasksReviewServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.tasks.service.http;

public interface TasksReviewServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.tasks.model.TasksReviewSoap approveReview(long proposalId, int stage) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.tasks.model.TasksReviewSoap rejectReview(long proposalId, int stage) throws java.rmi.RemoteException;
    public void updateReviews(long proposalId, long[][] userIdsPerStage) throws java.rmi.RemoteException;
}
