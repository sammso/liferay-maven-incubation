/**
 * SCProductVersionServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.softwarecatalog.service.http;

public interface SCProductVersionServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCProductVersionSoap addProductVersion(long productEntryId, java.lang.String version, java.lang.String changeLog, java.lang.String downloadPageURL, java.lang.String directDownloadURL, boolean testDirectDownloadURL, boolean repoStoreArtifact, long[] frameworkVersionIds, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteProductVersion(long productVersionId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCProductVersionSoap getProductVersion(long productVersionId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCProductVersionSoap[] getProductVersions(long productEntryId, int start, int end) throws java.rmi.RemoteException;
    public int getProductVersionsCount(long productEntryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCProductVersionSoap updateProductVersion(long productVersionId, java.lang.String version, java.lang.String changeLog, java.lang.String downloadPageURL, java.lang.String directDownloadURL, boolean testDirectDownloadURL, boolean repoStoreArtifact, long[] frameworkVersionIds) throws java.rmi.RemoteException;
}
