/**
 * Portal_OrganizationServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public class Portal_OrganizationServiceSoapBindingImpl implements com.liferay.client.soap.portal.service.http.OrganizationServiceSoap{
    public long getOrganizationId(long companyId, java.lang.String name) throws java.rmi.RemoteException {
        return -3;
    }

    public com.liferay.client.soap.portal.model.OrganizationSoap getOrganization(long organizationId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.OrganizationSoap[] getUserOrganizations(long userId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.OrganizationSoap[] getUserOrganizations(long userId, boolean inheritUserGroups) throws java.rmi.RemoteException {
        return null;
    }

    public void deleteLogo(long organizationId) throws java.rmi.RemoteException {
    }

    public void addGroupOrganizations(long groupId, long[] organizationIds) throws java.rmi.RemoteException {
    }

    public void addPasswordPolicyOrganizations(long passwordPolicyId, long[] organizationIds) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portal.model.OrganizationSoap addOrganization(long parentOrganizationId, java.lang.String name, java.lang.String type, boolean recursable, long regionId, long countryId, int statusId, java.lang.String comments, com.liferay.client.soap.portal.model.AddressSoap[] addresses, com.liferay.client.soap.portal.model.EmailAddressSoap[] emailAddresses, com.liferay.client.soap.portal.model.OrgLaborSoap[] orgLabors, com.liferay.client.soap.portal.model.PhoneSoap[] phones, com.liferay.client.soap.portal.model.WebsiteSoap[] websites, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.OrganizationSoap addOrganization(long parentOrganizationId, java.lang.String name, java.lang.String type, boolean recursable, long regionId, long countryId, int statusId, java.lang.String comments, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public void deleteOrganization(long organizationId) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portal.model.OrganizationSoap[] getManageableOrganizations(java.lang.String actionId, int max) throws java.rmi.RemoteException {
        return null;
    }

    public void setGroupOrganizations(long groupId, long[] organizationIds) throws java.rmi.RemoteException {
    }

    public void unsetGroupOrganizations(long groupId, long[] organizationIds) throws java.rmi.RemoteException {
    }

    public void unsetPasswordPolicyOrganizations(long passwordPolicyId, long[] organizationIds) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portal.model.OrganizationSoap updateOrganization(long organizationId, long parentOrganizationId, java.lang.String name, java.lang.String type, boolean recursable, long regionId, long countryId, int statusId, java.lang.String comments, com.liferay.client.soap.portal.model.AddressSoap[] addresses, com.liferay.client.soap.portal.model.EmailAddressSoap[] emailAddresses, com.liferay.client.soap.portal.model.OrgLaborSoap[] orgLabors, com.liferay.client.soap.portal.model.PhoneSoap[] phones, com.liferay.client.soap.portal.model.WebsiteSoap[] websites, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.OrganizationSoap updateOrganization(long organizationId, long parentOrganizationId, java.lang.String name, java.lang.String type, boolean recursable, long regionId, long countryId, int statusId, java.lang.String comments, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

}
