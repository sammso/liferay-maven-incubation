/**
 * RegionServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface RegionServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.RegionSoap getRegion(long regionId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RegionSoap addRegion(long countryId, java.lang.String regionCode, java.lang.String name, boolean active) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RegionSoap[] getRegions(long countryId, boolean active) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RegionSoap[] getRegions(boolean active) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RegionSoap[] getRegions(long countryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.RegionSoap[] getRegions() throws java.rmi.RemoteException;
}
