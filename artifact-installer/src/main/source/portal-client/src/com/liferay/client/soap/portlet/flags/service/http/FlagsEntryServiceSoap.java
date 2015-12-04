/**
 * FlagsEntryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.flags.service.http;

public interface FlagsEntryServiceSoap extends java.rmi.Remote {
    public void addEntry(java.lang.String className, long classPK, java.lang.String reporterEmailAddress, long reportedUserId, java.lang.String contentTitle, java.lang.String contentURL, java.lang.String reason, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
