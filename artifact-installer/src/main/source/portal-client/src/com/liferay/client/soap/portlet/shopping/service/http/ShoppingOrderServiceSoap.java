/**
 * ShoppingOrderServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.shopping.service.http;

public interface ShoppingOrderServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.shopping.model.ShoppingOrderSoap getOrder(long groupId, long orderId) throws java.rmi.RemoteException;
    public void completeOrder(long groupId, java.lang.String number, java.lang.String ppTxnId, java.lang.String ppPaymentStatus, double ppPaymentGross, java.lang.String ppReceiverEmail, java.lang.String ppPayerEmail) throws java.rmi.RemoteException;
    public void deleteOrder(long groupId, long orderId) throws java.rmi.RemoteException;
    public void sendEmail(long groupId, long orderId, java.lang.String emailType) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.shopping.model.ShoppingOrderSoap updateOrder(long groupId, long orderId, java.lang.String billingFirstName, java.lang.String billingLastName, java.lang.String billingEmailAddress, java.lang.String billingCompany, java.lang.String billingStreet, java.lang.String billingCity, java.lang.String billingState, java.lang.String billingZip, java.lang.String billingCountry, java.lang.String billingPhone, boolean shipToBilling, java.lang.String shippingFirstName, java.lang.String shippingLastName, java.lang.String shippingEmailAddress, java.lang.String shippingCompany, java.lang.String shippingStreet, java.lang.String shippingCity, java.lang.String shippingState, java.lang.String shippingZip, java.lang.String shippingCountry, java.lang.String shippingPhone, java.lang.String ccName, java.lang.String ccType, java.lang.String ccNumber, int ccExpMonth, int ccExpYear, java.lang.String ccVerNumber, java.lang.String comments) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.shopping.model.ShoppingOrderSoap updateOrder(long groupId, long orderId, java.lang.String ppTxnId, java.lang.String ppPaymentStatus, double ppPaymentGross, java.lang.String ppReceiverEmail, java.lang.String ppPayerEmail) throws java.rmi.RemoteException;
}
