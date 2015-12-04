/**
 * Portlet_MB_MBCategoryServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.messageboards.service.http;

public class Portlet_MB_MBCategoryServiceSoapBindingImpl implements com.liferay.client.soap.portlet.messageboards.service.http.MBCategoryServiceSoap{
    public com.liferay.client.soap.portlet.messageboards.model.MBCategorySoap getCategory(long categoryId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.messageboards.model.MBCategorySoap addCategory(long parentCategoryId, java.lang.String name, java.lang.String description, java.lang.String emailAddress, java.lang.String inProtocol, java.lang.String inServerName, int inServerPort, boolean inUseSSL, java.lang.String inUserName, java.lang.String inPassword, int inReadInterval, java.lang.String outEmailAddress, boolean outCustom, java.lang.String outServerName, int outServerPort, boolean outUseSSL, java.lang.String outUserName, java.lang.String outPassword, boolean mailingListActive, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException {
        return null;
    }

    public void deleteCategory(long categoryId) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portlet.messageboards.model.MBCategorySoap[] getCategories(long groupId, long parentCategoryId, int start, int end) throws java.rmi.RemoteException {
        return null;
    }

    public int getCategoriesCount(long groupId, long parentCategoryId) throws java.rmi.RemoteException {
        return -3;
    }

    public void subscribeCategory(long categoryId) throws java.rmi.RemoteException {
    }

    public void unsubscribeCategory(long categoryId) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portlet.messageboards.model.MBCategorySoap updateCategory(long categoryId, long parentCategoryId, java.lang.String name, java.lang.String description, java.lang.String emailAddress, java.lang.String inProtocol, java.lang.String inServerName, int inServerPort, boolean inUseSSL, java.lang.String inUserName, java.lang.String inPassword, int inReadInterval, java.lang.String outEmailAddress, boolean outCustom, java.lang.String outServerName, int outServerPort, boolean outUseSSL, java.lang.String outUserName, java.lang.String outPassword, boolean mailingListActive, boolean mergeWithParentCategory) throws java.rmi.RemoteException {
        return null;
    }

}
