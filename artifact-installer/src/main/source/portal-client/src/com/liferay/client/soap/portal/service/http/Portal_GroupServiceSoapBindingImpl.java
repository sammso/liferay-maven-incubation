/**
 * Portal_GroupServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public class Portal_GroupServiceSoapBindingImpl implements com.liferay.client.soap.portal.service.http.GroupServiceSoap{
    public com.liferay.client.soap.portal.model.GroupSoap[] search(long companyId, java.lang.String name, java.lang.String description, java.lang.String[] params, int start, int end) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap getGroup(long groupId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap getGroup(long companyId, java.lang.String name) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap addGroup(long liveGroupId, java.lang.String name, java.lang.String description, int type, java.lang.String friendlyURL, boolean active, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap addGroup(java.lang.String name, java.lang.String description, int type, java.lang.String friendlyURL, boolean active, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public void addRoleGroups(long roleId, long[] groupIds) throws java.rmi.RemoteException {
    }

    public void deleteGroup(long groupId) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portal.model.GroupSoap[] getManageableGroups(java.lang.String actionId, int max) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap[] getOrganizationsGroups(com.liferay.client.soap.portal.model.OrganizationSoap[] organizations) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap getUserGroup(long companyId, long userId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap[] getUserGroupsGroups(com.liferay.client.soap.portal.model.UserGroupSoap[] userGroups) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap[] getUserOrganizationsGroups(long userId, int start, int end) throws java.rmi.RemoteException {
        return null;
    }

    public boolean hasUserGroup(long userId, long groupId) throws java.rmi.RemoteException {
        return false;
    }

    public int searchCount(long companyId, java.lang.String name, java.lang.String description, java.lang.String[] params) throws java.rmi.RemoteException {
        return -3;
    }

    public void setRoleGroups(long roleId, long[] groupIds) throws java.rmi.RemoteException {
    }

    public void unsetRoleGroups(long roleId, long[] groupIds) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portal.model.GroupSoap updateFriendlyURL(long groupId, java.lang.String friendlyURL) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap updateGroup(long groupId, java.lang.String typeSettings) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap updateGroup(long groupId, java.lang.String name, java.lang.String description, int type, java.lang.String friendlyURL, boolean active, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.GroupSoap updateWorkflow(long groupId, boolean workflowEnabled, int workflowStages, java.lang.String workflowRoleNames) throws java.rmi.RemoteException {
        return null;
    }

}
