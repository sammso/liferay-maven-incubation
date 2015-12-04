/**
 * IGImageServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.imagegallery.service.http;

public interface IGImageServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.imagegallery.model.IGImageSoap getImage(long imageId) throws java.rmi.RemoteException;
    public void deleteImage(long imageId) throws java.rmi.RemoteException;
    public void deleteImageByFolderIdAndNameWithExtension(long folderId, java.lang.String nameWithExtension) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.imagegallery.model.IGImageSoap getImageByFolderIdAndNameWithExtension(long folderId, java.lang.String nameWithExtension) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.imagegallery.model.IGImageSoap getImageByLargeImageId(long largeImageId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.imagegallery.model.IGImageSoap getImageBySmallImageId(long smallImageId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.imagegallery.model.IGImageSoap[] getImages(long folderId) throws java.rmi.RemoteException;
}
