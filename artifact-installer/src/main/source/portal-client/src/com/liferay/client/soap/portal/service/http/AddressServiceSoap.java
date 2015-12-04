/**
 * AddressServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface AddressServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.AddressSoap getAddress(long addressId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.AddressSoap[] getAddresses(java.lang.String className, long classPK) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.AddressSoap addAddress(java.lang.String className, long classPK, java.lang.String street1, java.lang.String street2, java.lang.String street3, java.lang.String city, java.lang.String zip, long regionId, long countryId, int typeId, boolean mailing, boolean primary) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.AddressSoap updateAddress(long addressId, java.lang.String street1, java.lang.String street2, java.lang.String street3, java.lang.String city, java.lang.String zip, long regionId, long countryId, int typeId, boolean mailing, boolean primary) throws java.rmi.RemoteException;
    public void deleteAddress(long addressId) throws java.rmi.RemoteException;
}
