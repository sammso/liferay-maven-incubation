/**
 * PasswordPolicySoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.model;

public class PasswordPolicySoap  implements java.io.Serializable {
    private boolean allowDictionaryWords;

    private boolean changeRequired;

    private boolean changeable;

    private boolean checkSyntax;

    private long companyId;

    private java.util.Calendar createDate;

    private boolean defaultPolicy;

    private java.lang.String description;

    private boolean expireable;

    private int graceLimit;

    private boolean history;

    private int historyCount;

    private boolean lockout;

    private long lockoutDuration;

    private long maxAge;

    private int maxFailure;

    private long minAge;

    private int minLength;

    private java.util.Calendar modifiedDate;

    private java.lang.String name;

    private long passwordPolicyId;

    private long primaryKey;

    private boolean requireUnlock;

    private long resetFailureCount;

    private long userId;

    private java.lang.String userName;

    private long warningTime;

    public PasswordPolicySoap() {
    }

    public PasswordPolicySoap(
           boolean allowDictionaryWords,
           boolean changeRequired,
           boolean changeable,
           boolean checkSyntax,
           long companyId,
           java.util.Calendar createDate,
           boolean defaultPolicy,
           java.lang.String description,
           boolean expireable,
           int graceLimit,
           boolean history,
           int historyCount,
           boolean lockout,
           long lockoutDuration,
           long maxAge,
           int maxFailure,
           long minAge,
           int minLength,
           java.util.Calendar modifiedDate,
           java.lang.String name,
           long passwordPolicyId,
           long primaryKey,
           boolean requireUnlock,
           long resetFailureCount,
           long userId,
           java.lang.String userName,
           long warningTime) {
           this.allowDictionaryWords = allowDictionaryWords;
           this.changeRequired = changeRequired;
           this.changeable = changeable;
           this.checkSyntax = checkSyntax;
           this.companyId = companyId;
           this.createDate = createDate;
           this.defaultPolicy = defaultPolicy;
           this.description = description;
           this.expireable = expireable;
           this.graceLimit = graceLimit;
           this.history = history;
           this.historyCount = historyCount;
           this.lockout = lockout;
           this.lockoutDuration = lockoutDuration;
           this.maxAge = maxAge;
           this.maxFailure = maxFailure;
           this.minAge = minAge;
           this.minLength = minLength;
           this.modifiedDate = modifiedDate;
           this.name = name;
           this.passwordPolicyId = passwordPolicyId;
           this.primaryKey = primaryKey;
           this.requireUnlock = requireUnlock;
           this.resetFailureCount = resetFailureCount;
           this.userId = userId;
           this.userName = userName;
           this.warningTime = warningTime;
    }


    /**
     * Gets the allowDictionaryWords value for this PasswordPolicySoap.
     * 
     * @return allowDictionaryWords
     */
    public boolean isAllowDictionaryWords() {
        return allowDictionaryWords;
    }


    /**
     * Sets the allowDictionaryWords value for this PasswordPolicySoap.
     * 
     * @param allowDictionaryWords
     */
    public void setAllowDictionaryWords(boolean allowDictionaryWords) {
        this.allowDictionaryWords = allowDictionaryWords;
    }


    /**
     * Gets the changeRequired value for this PasswordPolicySoap.
     * 
     * @return changeRequired
     */
    public boolean isChangeRequired() {
        return changeRequired;
    }


    /**
     * Sets the changeRequired value for this PasswordPolicySoap.
     * 
     * @param changeRequired
     */
    public void setChangeRequired(boolean changeRequired) {
        this.changeRequired = changeRequired;
    }


    /**
     * Gets the changeable value for this PasswordPolicySoap.
     * 
     * @return changeable
     */
    public boolean isChangeable() {
        return changeable;
    }


    /**
     * Sets the changeable value for this PasswordPolicySoap.
     * 
     * @param changeable
     */
    public void setChangeable(boolean changeable) {
        this.changeable = changeable;
    }


    /**
     * Gets the checkSyntax value for this PasswordPolicySoap.
     * 
     * @return checkSyntax
     */
    public boolean isCheckSyntax() {
        return checkSyntax;
    }


    /**
     * Sets the checkSyntax value for this PasswordPolicySoap.
     * 
     * @param checkSyntax
     */
    public void setCheckSyntax(boolean checkSyntax) {
        this.checkSyntax = checkSyntax;
    }


    /**
     * Gets the companyId value for this PasswordPolicySoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this PasswordPolicySoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the createDate value for this PasswordPolicySoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this PasswordPolicySoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the defaultPolicy value for this PasswordPolicySoap.
     * 
     * @return defaultPolicy
     */
    public boolean isDefaultPolicy() {
        return defaultPolicy;
    }


    /**
     * Sets the defaultPolicy value for this PasswordPolicySoap.
     * 
     * @param defaultPolicy
     */
    public void setDefaultPolicy(boolean defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }


    /**
     * Gets the description value for this PasswordPolicySoap.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PasswordPolicySoap.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the expireable value for this PasswordPolicySoap.
     * 
     * @return expireable
     */
    public boolean isExpireable() {
        return expireable;
    }


    /**
     * Sets the expireable value for this PasswordPolicySoap.
     * 
     * @param expireable
     */
    public void setExpireable(boolean expireable) {
        this.expireable = expireable;
    }


    /**
     * Gets the graceLimit value for this PasswordPolicySoap.
     * 
     * @return graceLimit
     */
    public int getGraceLimit() {
        return graceLimit;
    }


    /**
     * Sets the graceLimit value for this PasswordPolicySoap.
     * 
     * @param graceLimit
     */
    public void setGraceLimit(int graceLimit) {
        this.graceLimit = graceLimit;
    }


    /**
     * Gets the history value for this PasswordPolicySoap.
     * 
     * @return history
     */
    public boolean isHistory() {
        return history;
    }


    /**
     * Sets the history value for this PasswordPolicySoap.
     * 
     * @param history
     */
    public void setHistory(boolean history) {
        this.history = history;
    }


    /**
     * Gets the historyCount value for this PasswordPolicySoap.
     * 
     * @return historyCount
     */
    public int getHistoryCount() {
        return historyCount;
    }


    /**
     * Sets the historyCount value for this PasswordPolicySoap.
     * 
     * @param historyCount
     */
    public void setHistoryCount(int historyCount) {
        this.historyCount = historyCount;
    }


    /**
     * Gets the lockout value for this PasswordPolicySoap.
     * 
     * @return lockout
     */
    public boolean isLockout() {
        return lockout;
    }


    /**
     * Sets the lockout value for this PasswordPolicySoap.
     * 
     * @param lockout
     */
    public void setLockout(boolean lockout) {
        this.lockout = lockout;
    }


    /**
     * Gets the lockoutDuration value for this PasswordPolicySoap.
     * 
     * @return lockoutDuration
     */
    public long getLockoutDuration() {
        return lockoutDuration;
    }


    /**
     * Sets the lockoutDuration value for this PasswordPolicySoap.
     * 
     * @param lockoutDuration
     */
    public void setLockoutDuration(long lockoutDuration) {
        this.lockoutDuration = lockoutDuration;
    }


    /**
     * Gets the maxAge value for this PasswordPolicySoap.
     * 
     * @return maxAge
     */
    public long getMaxAge() {
        return maxAge;
    }


    /**
     * Sets the maxAge value for this PasswordPolicySoap.
     * 
     * @param maxAge
     */
    public void setMaxAge(long maxAge) {
        this.maxAge = maxAge;
    }


    /**
     * Gets the maxFailure value for this PasswordPolicySoap.
     * 
     * @return maxFailure
     */
    public int getMaxFailure() {
        return maxFailure;
    }


    /**
     * Sets the maxFailure value for this PasswordPolicySoap.
     * 
     * @param maxFailure
     */
    public void setMaxFailure(int maxFailure) {
        this.maxFailure = maxFailure;
    }


    /**
     * Gets the minAge value for this PasswordPolicySoap.
     * 
     * @return minAge
     */
    public long getMinAge() {
        return minAge;
    }


    /**
     * Sets the minAge value for this PasswordPolicySoap.
     * 
     * @param minAge
     */
    public void setMinAge(long minAge) {
        this.minAge = minAge;
    }


    /**
     * Gets the minLength value for this PasswordPolicySoap.
     * 
     * @return minLength
     */
    public int getMinLength() {
        return minLength;
    }


    /**
     * Sets the minLength value for this PasswordPolicySoap.
     * 
     * @param minLength
     */
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }


    /**
     * Gets the modifiedDate value for this PasswordPolicySoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this PasswordPolicySoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the name value for this PasswordPolicySoap.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PasswordPolicySoap.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the passwordPolicyId value for this PasswordPolicySoap.
     * 
     * @return passwordPolicyId
     */
    public long getPasswordPolicyId() {
        return passwordPolicyId;
    }


    /**
     * Sets the passwordPolicyId value for this PasswordPolicySoap.
     * 
     * @param passwordPolicyId
     */
    public void setPasswordPolicyId(long passwordPolicyId) {
        this.passwordPolicyId = passwordPolicyId;
    }


    /**
     * Gets the primaryKey value for this PasswordPolicySoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this PasswordPolicySoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the requireUnlock value for this PasswordPolicySoap.
     * 
     * @return requireUnlock
     */
    public boolean isRequireUnlock() {
        return requireUnlock;
    }


    /**
     * Sets the requireUnlock value for this PasswordPolicySoap.
     * 
     * @param requireUnlock
     */
    public void setRequireUnlock(boolean requireUnlock) {
        this.requireUnlock = requireUnlock;
    }


    /**
     * Gets the resetFailureCount value for this PasswordPolicySoap.
     * 
     * @return resetFailureCount
     */
    public long getResetFailureCount() {
        return resetFailureCount;
    }


    /**
     * Sets the resetFailureCount value for this PasswordPolicySoap.
     * 
     * @param resetFailureCount
     */
    public void setResetFailureCount(long resetFailureCount) {
        this.resetFailureCount = resetFailureCount;
    }


    /**
     * Gets the userId value for this PasswordPolicySoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this PasswordPolicySoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this PasswordPolicySoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this PasswordPolicySoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the warningTime value for this PasswordPolicySoap.
     * 
     * @return warningTime
     */
    public long getWarningTime() {
        return warningTime;
    }


    /**
     * Sets the warningTime value for this PasswordPolicySoap.
     * 
     * @param warningTime
     */
    public void setWarningTime(long warningTime) {
        this.warningTime = warningTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PasswordPolicySoap)) return false;
        PasswordPolicySoap other = (PasswordPolicySoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allowDictionaryWords == other.isAllowDictionaryWords() &&
            this.changeRequired == other.isChangeRequired() &&
            this.changeable == other.isChangeable() &&
            this.checkSyntax == other.isCheckSyntax() &&
            this.companyId == other.getCompanyId() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            this.defaultPolicy == other.isDefaultPolicy() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.expireable == other.isExpireable() &&
            this.graceLimit == other.getGraceLimit() &&
            this.history == other.isHistory() &&
            this.historyCount == other.getHistoryCount() &&
            this.lockout == other.isLockout() &&
            this.lockoutDuration == other.getLockoutDuration() &&
            this.maxAge == other.getMaxAge() &&
            this.maxFailure == other.getMaxFailure() &&
            this.minAge == other.getMinAge() &&
            this.minLength == other.getMinLength() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.passwordPolicyId == other.getPasswordPolicyId() &&
            this.primaryKey == other.getPrimaryKey() &&
            this.requireUnlock == other.isRequireUnlock() &&
            this.resetFailureCount == other.getResetFailureCount() &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            this.warningTime == other.getWarningTime();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isAllowDictionaryWords() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isChangeRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isChangeable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCheckSyntax() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        _hashCode += (isDefaultPolicy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isExpireable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getGraceLimit();
        _hashCode += (isHistory() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getHistoryCount();
        _hashCode += (isLockout() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getLockoutDuration()).hashCode();
        _hashCode += new Long(getMaxAge()).hashCode();
        _hashCode += getMaxFailure();
        _hashCode += new Long(getMinAge()).hashCode();
        _hashCode += getMinLength();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Long(getPasswordPolicyId()).hashCode();
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += (isRequireUnlock() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getResetFailureCount()).hashCode();
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        _hashCode += new Long(getWarningTime()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PasswordPolicySoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.portal.liferay.com", "PasswordPolicySoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDictionaryWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowDictionaryWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkSyntax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkSyntax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graceLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "graceLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("", "history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historyCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockoutDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockoutDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordPolicyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordPolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireUnlock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requireUnlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetFailureCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resetFailureCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warningTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
