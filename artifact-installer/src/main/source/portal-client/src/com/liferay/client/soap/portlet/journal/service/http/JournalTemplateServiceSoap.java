/**
 * JournalTemplateServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.journal.service.http;

public interface JournalTemplateServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.journal.model.JournalTemplateSoap addTemplate(long groupId, java.lang.String templateId, boolean autoTemplateId, java.lang.String structureId, java.lang.String name, java.lang.String description, java.lang.String xsl, boolean formatXsl, java.lang.String langType, boolean cacheable, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalTemplateSoap copyTemplate(long groupId, java.lang.String oldTemplateId, java.lang.String newTemplateId, boolean autoTemplateId) throws java.rmi.RemoteException;
    public void deleteTemplate(long groupId, java.lang.String templateId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalTemplateSoap[] getStructureTemplates(long groupId, java.lang.String structureId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalTemplateSoap getTemplate(long groupId, java.lang.String templateId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.journal.model.JournalTemplateSoap updateTemplate(long groupId, java.lang.String templateId, java.lang.String structureId, java.lang.String name, java.lang.String description, java.lang.String xsl, boolean formatXsl, java.lang.String langType, boolean cacheable, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
