/**
 * SCProductVersionSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.softwarecatalog.model;

public class SCProductVersionSoap  implements java.io.Serializable {
    private java.lang.String changeLog;

    private long companyId;

    private java.util.Calendar createDate;

    private java.lang.String directDownloadURL;

    private java.lang.String downloadPageURL;

    private java.util.Calendar modifiedDate;

    private long primaryKey;

    private long productEntryId;

    private long productVersionId;

    private boolean repoStoreArtifact;

    private long userId;

    private java.lang.String userName;

    private java.lang.String version;

    public SCProductVersionSoap() {
    }

    public SCProductVersionSoap(
           java.lang.String changeLog,
           long companyId,
           java.util.Calendar createDate,
           java.lang.String directDownloadURL,
           java.lang.String downloadPageURL,
           java.util.Calendar modifiedDate,
           long primaryKey,
           long productEntryId,
           long productVersionId,
           boolean repoStoreArtifact,
           long userId,
           java.lang.String userName,
           java.lang.String version) {
           this.changeLog = changeLog;
           this.companyId = companyId;
           this.createDate = createDate;
           this.directDownloadURL = directDownloadURL;
           this.downloadPageURL = downloadPageURL;
           this.modifiedDate = modifiedDate;
           this.primaryKey = primaryKey;
           this.productEntryId = productEntryId;
           this.productVersionId = productVersionId;
           this.repoStoreArtifact = repoStoreArtifact;
           this.userId = userId;
           this.userName = userName;
           this.version = version;
    }


    /**
     * Gets the changeLog value for this SCProductVersionSoap.
     * 
     * @return changeLog
     */
    public java.lang.String getChangeLog() {
        return changeLog;
    }


    /**
     * Sets the changeLog value for this SCProductVersionSoap.
     * 
     * @param changeLog
     */
    public void setChangeLog(java.lang.String changeLog) {
        this.changeLog = changeLog;
    }


    /**
     * Gets the companyId value for this SCProductVersionSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this SCProductVersionSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the createDate value for this SCProductVersionSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SCProductVersionSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the directDownloadURL value for this SCProductVersionSoap.
     * 
     * @return directDownloadURL
     */
    public java.lang.String getDirectDownloadURL() {
        return directDownloadURL;
    }


    /**
     * Sets the directDownloadURL value for this SCProductVersionSoap.
     * 
     * @param directDownloadURL
     */
    public void setDirectDownloadURL(java.lang.String directDownloadURL) {
        this.directDownloadURL = directDownloadURL;
    }


    /**
     * Gets the downloadPageURL value for this SCProductVersionSoap.
     * 
     * @return downloadPageURL
     */
    public java.lang.String getDownloadPageURL() {
        return downloadPageURL;
    }


    /**
     * Sets the downloadPageURL value for this SCProductVersionSoap.
     * 
     * @param downloadPageURL
     */
    public void setDownloadPageURL(java.lang.String downloadPageURL) {
        this.downloadPageURL = downloadPageURL;
    }


    /**
     * Gets the modifiedDate value for this SCProductVersionSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this SCProductVersionSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the primaryKey value for this SCProductVersionSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this SCProductVersionSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the productEntryId value for this SCProductVersionSoap.
     * 
     * @return productEntryId
     */
    public long getProductEntryId() {
        return productEntryId;
    }


    /**
     * Sets the productEntryId value for this SCProductVersionSoap.
     * 
     * @param productEntryId
     */
    public void setProductEntryId(long productEntryId) {
        this.productEntryId = productEntryId;
    }


    /**
     * Gets the productVersionId value for this SCProductVersionSoap.
     * 
     * @return productVersionId
     */
    public long getProductVersionId() {
        return productVersionId;
    }


    /**
     * Sets the productVersionId value for this SCProductVersionSoap.
     * 
     * @param productVersionId
     */
    public void setProductVersionId(long productVersionId) {
        this.productVersionId = productVersionId;
    }


    /**
     * Gets the repoStoreArtifact value for this SCProductVersionSoap.
     * 
     * @return repoStoreArtifact
     */
    public boolean isRepoStoreArtifact() {
        return repoStoreArtifact;
    }


    /**
     * Sets the repoStoreArtifact value for this SCProductVersionSoap.
     * 
     * @param repoStoreArtifact
     */
    public void setRepoStoreArtifact(boolean repoStoreArtifact) {
        this.repoStoreArtifact = repoStoreArtifact;
    }


    /**
     * Gets the userId value for this SCProductVersionSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SCProductVersionSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this SCProductVersionSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this SCProductVersionSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the version value for this SCProductVersionSoap.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SCProductVersionSoap.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCProductVersionSoap)) return false;
        SCProductVersionSoap other = (SCProductVersionSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeLog==null && other.getChangeLog()==null) || 
             (this.changeLog!=null &&
              this.changeLog.equals(other.getChangeLog()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.directDownloadURL==null && other.getDirectDownloadURL()==null) || 
             (this.directDownloadURL!=null &&
              this.directDownloadURL.equals(other.getDirectDownloadURL()))) &&
            ((this.downloadPageURL==null && other.getDownloadPageURL()==null) || 
             (this.downloadPageURL!=null &&
              this.downloadPageURL.equals(other.getDownloadPageURL()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            this.productEntryId == other.getProductEntryId() &&
            this.productVersionId == other.getProductVersionId() &&
            this.repoStoreArtifact == other.isRepoStoreArtifact() &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getChangeLog() != null) {
            _hashCode += getChangeLog().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDirectDownloadURL() != null) {
            _hashCode += getDirectDownloadURL().hashCode();
        }
        if (getDownloadPageURL() != null) {
            _hashCode += getDownloadPageURL().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += new Long(getProductEntryId()).hashCode();
        _hashCode += new Long(getProductVersionId()).hashCode();
        _hashCode += (isRepoStoreArtifact() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCProductVersionSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.softwarecatalog.portlet.liferay.com", "SCProductVersionSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
        elemField.setFieldName("directDownloadURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directDownloadURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadPageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downloadPageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productEntryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productEntryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productVersionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repoStoreArtifact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repoStoreArtifact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
