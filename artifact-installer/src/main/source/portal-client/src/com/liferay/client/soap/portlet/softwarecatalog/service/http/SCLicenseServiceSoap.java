/**
 * SCLicenseServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.softwarecatalog.service.http;

public interface SCLicenseServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCLicenseSoap addLicense(java.lang.String name, java.lang.String url, boolean openSource, boolean active, boolean recommended) throws java.rmi.RemoteException;
    public void deleteLicense(long licenseId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCLicenseSoap getLicense(long licenseId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.softwarecatalog.model.SCLicenseSoap updateLicense(long licenseId, java.lang.String name, java.lang.String url, boolean openSource, boolean active, boolean recommended) throws java.rmi.RemoteException;
}
