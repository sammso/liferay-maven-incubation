/**
 * JournalStructureServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.journal.service.http;

public interface JournalStructureServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.journal.model.JournalStructureSoap addStructure(long groupId, java.lang.String structureId, boolean autoStructureId, java.lang.String parentStructureId, java.lang.String name, java.lang.String description, java.lang.String xsd, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalStructureSoap copyStructure(long groupId, java.lang.String oldStructureId, java.lang.String newStructureId, boolean autoStructureId) throws java.rmi.RemoteException;
    public void deleteStructure(long groupId, java.lang.String structureId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalStructureSoap getStructure(long groupId, java.lang.String structureId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalStructureSoap updateStructure(long groupId, java.lang.String structureId, java.lang.String parentStructureId, java.lang.String name, java.lang.String description, java.lang.String xsd, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
