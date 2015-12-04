/**
 * UserGroupServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface UserGroupServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.UserGroupSoap getUserGroup(java.lang.String name) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.UserGroupSoap getUserGroup(long userGroupId) throws java.rmi.RemoteException;
    public void addGroupUserGroups(long groupId, long[] userGroupIds) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.UserGroupSoap addUserGroup(java.lang.String name, java.lang.String description) throws java.rmi.RemoteException;
    public void deleteUserGroup(long userGroupId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.UserGroupSoap[] getUserUserGroups(long userId) throws java.rmi.RemoteException;
    public void unsetGroupUserGroups(long groupId, long[] userGroupIds) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.UserGroupSoap updateUserGroup(long userGroupId, java.lang.String name, java.lang.String description) throws java.rmi.RemoteException;
}
