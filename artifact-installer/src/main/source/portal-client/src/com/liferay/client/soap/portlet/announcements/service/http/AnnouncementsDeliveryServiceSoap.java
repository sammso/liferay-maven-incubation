/**
 * AnnouncementsDeliveryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.announcements.service.http;

public interface AnnouncementsDeliveryServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.announcements.model.AnnouncementsDeliverySoap updateDelivery(long userId, java.lang.String type, boolean email, boolean sms, boolean website) throws java.rmi.RemoteException;
}
