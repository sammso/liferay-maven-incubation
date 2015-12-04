/**
 * SCProductEntryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.softwarecatalog.service.http;

public interface SCProductEntryServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCProductEntrySoap addProductEntry(java.lang.String name, java.lang.String type, java.lang.String tags, java.lang.String shortDescription, java.lang.String longDescription, java.lang.String pageURL, java.lang.String author, java.lang.String repoGroupId, java.lang.String repoArtifactId, long[] licenseIds, java.lang.Object[] thumbnails, java.lang.Object[] fullImages, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteProductEntry(long productEntryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCProductEntrySoap getProductEntry(long productEntryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCProductEntrySoap updateProductEntry(long productEntryId, java.lang.String name, java.lang.String type, java.lang.String tags, java.lang.String shortDescription, java.lang.String longDescription, java.lang.String pageURL, java.lang.String author, java.lang.String repoGroupId, java.lang.String repoArtifactId, long[] licenseIds, java.lang.Object[] thumbnails, java.lang.Object[] fullImages) throws java.rmi.RemoteException;
}
