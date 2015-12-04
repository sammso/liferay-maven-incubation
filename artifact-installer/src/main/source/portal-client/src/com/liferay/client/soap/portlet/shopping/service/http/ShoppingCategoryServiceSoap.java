/**
 * ShoppingCategoryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.shopping.service.http;

public interface ShoppingCategoryServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portlet.shopping.model.ShoppingCategorySoap getCategory(long categoryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.shopping.model.ShoppingCategorySoap addCategory(long parentCategoryId, java.lang.String name, java.lang.String description, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteCategory(long categoryId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portlet.shopping.model.ShoppingCategorySoap updateCategory(long categoryId, long parentCategoryId, java.lang.String name, java.lang.String description, boolean mergeWithParentCategory, com.liferay.client.soap.portal.service.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
