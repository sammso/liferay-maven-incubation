/**
 * Portal_LayoutServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public class Portal_LayoutServiceSoapBindingImpl implements com.liferay.client.soap.portal.service.http.LayoutServiceSoap{
    public com.liferay.client.soap.portal.model.LayoutSoap updateLayout(long groupId, boolean privateLayout, long layoutId, java.lang.String typeSettings) throws java.rmi.RemoteException {
        return null;
    }

    public void setLayouts(long groupId, boolean privateLayout, long parentLayoutId, long[] layoutIds) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portal.model.LayoutSoap addLayout(long groupId, boolean privateLayout, long parentLayoutId, java.lang.String name, java.lang.String title, java.lang.String description, java.lang.String type, boolean hidden, java.lang.String friendlyURL) throws java.rmi.RemoteException {
        return null;
    }

    public void deleteLayout(long plid) throws java.rmi.RemoteException {
    }

    public void deleteLayout(long groupId, boolean privateLayout, long layoutId) throws java.rmi.RemoteException {
    }

    public java.lang.String getLayoutName(long groupId, boolean privateLayout, long layoutId, java.lang.String languageId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.LayoutReference[] getLayoutReferences(long companyId, java.lang.String portletId, java.lang.String preferencesKey, java.lang.String preferencesValue) throws java.rmi.RemoteException {
        return null;
    }

    public void unschedulePublishToLive(long groupId, java.lang.String jobName, java.lang.String groupName) throws java.rmi.RemoteException {
    }

    public void unschedulePublishToRemote(long groupId, java.lang.String jobName, java.lang.String groupName) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portal.model.LayoutSoap updateLookAndFeel(long groupId, boolean privateLayout, long layoutId, java.lang.String themeId, java.lang.String colorSchemeId, java.lang.String css, boolean wapTheme) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.LayoutSoap updateName(long plid, java.lang.String name, java.lang.String languageId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.LayoutSoap updateName(long groupId, boolean privateLayout, long layoutId, java.lang.String name, java.lang.String languageId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.LayoutSoap updateParentLayoutId(long plid, long parentPlid) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.LayoutSoap updateParentLayoutId(long groupId, boolean privateLayout, long layoutId, long parentLayoutId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.LayoutSoap updatePriority(long plid, int priority) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portal.model.LayoutSoap updatePriority(long groupId, boolean privateLayout, long layoutId, int priority) throws java.rmi.RemoteException {
        return null;
    }

}
