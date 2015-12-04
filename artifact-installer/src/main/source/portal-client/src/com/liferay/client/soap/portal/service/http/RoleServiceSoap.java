/**
 * RoleServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface RoleServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.RoleSoap getRole(long roleId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RoleSoap getRole(long companyId, java.lang.String name) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RoleSoap[] getUserGroupRoles(long userId, long groupId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RoleSoap addRole(java.lang.String name, java.lang.String description, int type) throws java.rmi.RemoteException;
    public void addUserRoles(long userId, long[] roleIds) throws java.rmi.RemoteException;
    public void deleteRole(long roleId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RoleSoap getGroupRole(long companyId, long groupId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RoleSoap[] getGroupRoles(long groupId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RoleSoap[] getUserGroupGroupRoles(long userId, long groupId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RoleSoap[] getUserRelatedRoles(long userId, com.liferay.client.soap.portal.model.GroupSoap[] groups) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RoleSoap[] getUserRoles(long userId) throws java.rmi.RemoteException;
    public boolean hasUserRole(long userId, long companyId, java.lang.String name, boolean inherited) throws java.rmi.RemoteException;
    public boolean hasUserRoles(long userId, long companyId, java.lang.String[] names, boolean inherited) throws java.rmi.RemoteException;
    public void unsetUserRoles(long userId, long[] roleIds) throws java.rmi.RemoteException;
}
