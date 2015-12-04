/**
 * OrgLaborServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface OrgLaborServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.OrgLaborSoap[] getOrgLabors(long organizationId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.OrgLaborSoap addOrgLabor(long organizationId, int typeId, int sunOpen, int sunClose, int monOpen, int monClose, int tueOpen, int tueClose, int wedOpen, int wedClose, int thuOpen, int thuClose, int friOpen, int friClose, int satOpen, int satClose) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.OrgLaborSoap updateOrgLabor(long orgLaborId, int typeId, int sunOpen, int sunClose, int monOpen, int monClose, int tueOpen, int tueClose, int wedOpen, int wedClose, int thuOpen, int thuClose, int friOpen, int friClose, int satOpen, int satClose) throws java.rmi.RemoteException;
    public void deleteOrgLabor(long orgLaborId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.OrgLaborSoap getOrgLabor(long orgLaborId) throws java.rmi.RemoteException;
}
