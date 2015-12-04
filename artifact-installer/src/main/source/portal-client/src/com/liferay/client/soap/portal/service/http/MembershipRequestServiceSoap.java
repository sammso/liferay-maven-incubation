/**
 * MembershipRequestServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface MembershipRequestServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.MembershipRequestSoap addMembershipRequest(long groupId, java.lang.String comments) throws java.rmi.RemoteException;
    public void deleteMembershipRequests(long groupId, int statusId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.MembershipRequestSoap getMembershipRequest(long membershipRequestId) throws java.rmi.RemoteException;
    public void updateStatus(long membershipRequestId, java.lang.String reviewComments, int statusId) throws java.rmi.RemoteException;
}
