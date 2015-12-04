/**
 * Portlet_Tags_TagsAssetServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.tags.service.http;

public class Portlet_Tags_TagsAssetServiceSoapBindingImpl implements com.liferay.client.soap.portlet.tags.service.http.TagsAssetServiceSoap{
    public void deleteAsset(long assetId) throws java.rmi.RemoteException {
    }

    public com.liferay.client.soap.portlet.tags.model.TagsAssetSoap getAsset(long assetId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.tags.model.TagsAssetSoap[] getAssets(long groupId, long[] classNameIds, long[] entryIds, long[] notEntryIds, boolean andOperator, java.lang.String orderByCol1, java.lang.String orderByCol2, java.lang.String orderByType1, java.lang.String orderByType2, boolean excludeZeroViewCount, java.util.Calendar publishDate, java.util.Calendar expirationDate, int start, int end) throws java.rmi.RemoteException {
        return null;
    }

    public int getAssetsCount(long groupId, long[] classNameIds, long[] entryIds, long[] notEntryIds, boolean andOperator, boolean excludeZeroViewCount, java.util.Calendar publishDate, java.util.Calendar expirationDate) throws java.rmi.RemoteException {
        return -3;
    }

    public java.lang.String getAssetsRSS(long groupId, long[] classNameIds, long[] entryIds, long[] notEntryIds, boolean andOperator, java.lang.String orderByCol1, java.lang.String orderByCol2, java.lang.String orderByType1, java.lang.String orderByType2, boolean excludeZeroViewCount, java.util.Calendar publishDate, java.util.Calendar expirationDate, int max, java.lang.String type, double version, java.lang.String displayStyle, java.lang.String feedURL, java.lang.String entryURL) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.tags.model.TagsAssetType[] getAssetTypes(java.lang.String languageId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.tags.model.TagsAssetDisplay[] getCompanyAssetDisplays(long companyId, int start, int end, java.lang.String languageId) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.tags.model.TagsAssetSoap[] getCompanyAssets(long companyId, int start, int end) throws java.rmi.RemoteException {
        return null;
    }

    public int getCompanyAssetsCount(long companyId) throws java.rmi.RemoteException {
        return -3;
    }

    public java.lang.String getCompanyAssetsRSS(long companyId, int max, java.lang.String type, double version, java.lang.String displayStyle, java.lang.String feedURL, java.lang.String entryURL) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.tags.model.TagsAssetSoap incrementViewCounter(java.lang.String className, long classPK) throws java.rmi.RemoteException {
        return null;
    }

    public com.liferay.client.soap.portlet.tags.model.TagsAssetDisplay[] searchAssetDisplays(long companyId, java.lang.String portletId, java.lang.String keywords, java.lang.String languageId, int start, int end) throws java.rmi.RemoteException {
        return null;
    }

    public int searchAssetDisplaysCount(long companyId, java.lang.String portletId, java.lang.String keywords, java.lang.String languageId) throws java.rmi.RemoteException {
        return -3;
    }

    public com.liferay.client.soap.portlet.tags.model.TagsAssetSoap updateAsset(long groupId, java.lang.String className, long classPK, java.lang.String[] categoryNames, java.lang.String[] entryNames, boolean visible, java.util.Calendar startDate, java.util.Calendar endDate, java.util.Calendar publishDate, java.util.Calendar expirationDate, java.lang.String mimeType, java.lang.String title, java.lang.String description, java.lang.String summary, java.lang.String url, int height, int width, int priority) throws java.rmi.RemoteException {
        return null;
    }

}
