/**
 * PermissionServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface PermissionServiceSoap extends java.rmi.Remote {
    public void checkPermission(long groupId, java.lang.String name, java.lang.String primKey) throws java.rmi.RemoteException;
    public void checkPermission(long groupId, long resourceId) throws java.rmi.RemoteException;
    public void checkPermission(long groupId, java.lang.String name, long primKey) throws java.rmi.RemoteException;
    public void setRolePermission(long roleId, long groupId, java.lang.String name, int scope, java.lang.String primKey, java.lang.String actionId) throws java.rmi.RemoteException;
    public boolean hasUserPermission(long userId, java.lang.String actionId, long resourceId) throws java.rmi.RemoteException;
    public boolean hasGroupPermission(long groupId, java.lang.String actionId, long resourceId) throws java.rmi.RemoteException;
    public boolean hasUserPermissions(long userId, long groupId, com.liferay.client.soap.portal.model.ResourceSoap[] resources, java.lang.String actionId, java.lang.Object permissionCheckerBag) throws java.rmi.RemoteException;
    public void setGroupPermissions(java.lang.String className, java.lang.String classPK, long groupId, java.lang.String[] actionIds, long resourceId) throws java.rmi.RemoteException;
    public void setGroupPermissions(long groupId, java.lang.String[] actionIds, long resourceId) throws java.rmi.RemoteException;
    public void setOrgGroupPermissions(long organizationId, long groupId, java.lang.String[] actionIds, long resourceId) throws java.rmi.RemoteException;
    public void setRolePermissions(long roleId, long groupId, java.lang.String[] actionIds, long resourceId) throws java.rmi.RemoteException;
    public void setUserPermissions(long userId, long groupId, java.lang.String[] actionIds, long resourceId) throws java.rmi.RemoteException;
    public void unsetRolePermission(long roleId, long groupId, java.lang.String name, int scope, java.lang.String primKey, java.lang.String actionId) throws java.rmi.RemoteException;
    public void unsetRolePermission(long roleId, long groupId, long permissionId) throws java.rmi.RemoteException;
    public void unsetRolePermissions(long roleId, long groupId, java.lang.String name, int scope, java.lang.String actionId) throws java.rmi.RemoteException;
    public void unsetUserPermissions(long userId, long groupId, java.lang.String[] actionIds, long resourceId) throws java.rmi.RemoteException;
}
