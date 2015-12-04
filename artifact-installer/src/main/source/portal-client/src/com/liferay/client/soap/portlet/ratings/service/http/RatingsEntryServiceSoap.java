/**
 * RatingsEntryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.ratings.service.http;

public interface RatingsEntryServiceSoap extends java.rmi.Remote {
    public void deleteEntry(java.lang.String className, long classPK) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.ratings.model.RatingsEntrySoap updateEntry(java.lang.String className, long classPK, double score) throws java.rmi.RemoteException;
}
