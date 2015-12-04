/**
 * ShoppingCouponServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.shopping.service.http;

public interface ShoppingCouponServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.shopping.model.ShoppingCouponSoap[] search(long groupId, long companyId, java.lang.String code, boolean active, java.lang.String discountType, boolean andOperator, int start, int end) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.shopping.model.ShoppingCouponSoap addCoupon(java.lang.String code, boolean autoCode, java.lang.String name, java.lang.String description, int startDateMonth, int startDateDay, int startDateYear, int startDateHour, int startDateMinute, int endDateMonth, int endDateDay, int endDateYear, int endDateHour, int endDateMinute, boolean neverExpire, boolean active, java.lang.String limitCategories, java.lang.String limitSkus, double minOrder, double discount, java.lang.String discountType, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteCoupon(long groupId, long couponId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.shopping.model.ShoppingCouponSoap getCoupon(long groupId, long couponId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.shopping.model.ShoppingCouponSoap updateCoupon(long couponId, java.lang.String name, java.lang.String description, int startDateMonth, int startDateDay, int startDateYear, int startDateHour, int startDateMinute, int endDateMonth, int endDateDay, int endDateYear, int endDateHour, int endDateMinute, boolean neverExpire, boolean active, java.lang.String limitCategories, java.lang.String limitSkus, double minOrder, double discount, java.lang.String discountType, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
