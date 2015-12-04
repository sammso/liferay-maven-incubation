/**
 * PasswordPolicyServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.service.http;

public interface PasswordPolicyServiceSoap extends java.rmi.Remote {
    public com.liferay.client.soap.portal.model.PasswordPolicySoap addPasswordPolicy(java.lang.String name, java.lang.String description, boolean changeable, boolean changeRequired, long minAge, boolean checkSyntax, boolean allowDictionaryWords, int minLength, boolean history, int historyCount, boolean expireable, long maxAge, long warningTime, int graceLimit, boolean lockout, int maxFailure, long lockoutDuration, long resetFailureCount) throws java.rmi.RemoteException;
    public void deletePasswordPolicy(long passwordPolicyId) throws java.rmi.RemoteException;
    public com.liferay.client.soap.portal.model.PasswordPolicySoap updatePasswordPolicy(long passwordPolicyId, java.lang.String name, java.lang.String description, boolean changeable, boolean changeRequired, long minAge, boolean checkSyntax, boolean allowDictionaryWords, int minLength, boolean history, int historyCount, boolean expireable, long maxAge, long warningTime, int graceLimit, boolean lockout, int maxFailure, long lockoutDuration, long resetFailureCount) throws java.rmi.RemoteException;
}
