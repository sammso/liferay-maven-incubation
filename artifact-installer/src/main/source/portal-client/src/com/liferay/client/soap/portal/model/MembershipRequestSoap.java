/**
 * MembershipRequestSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.model;

public class MembershipRequestSoap  implements java.io.Serializable {
    private java.lang.String comments;

    private long companyId;

    private java.util.Calendar createDate;

    private long groupId;

    private long membershipRequestId;

    private long primaryKey;

    private long replierUserId;

    private java.lang.String replyComments;

    private java.util.Calendar replyDate;

    private int statusId;

    private long userId;

    public MembershipRequestSoap() {
    }

    public MembershipRequestSoap(
           java.lang.String comments,
           long companyId,
           java.util.Calendar createDate,
           long groupId,
           long membershipRequestId,
           long primaryKey,
           long replierUserId,
           java.lang.String replyComments,
           java.util.Calendar replyDate,
           int statusId,
           long userId) {
           this.comments = comments;
           this.companyId = companyId;
           this.createDate = createDate;
           this.groupId = groupId;
           this.membershipRequestId = membershipRequestId;
           this.primaryKey = primaryKey;
           this.replierUserId = replierUserId;
           this.replyComments = replyComments;
           this.replyDate = replyDate;
           this.statusId = statusId;
           this.userId = userId;
    }


    /**
     * Gets the comments value for this MembershipRequestSoap.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this MembershipRequestSoap.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the companyId value for this MembershipRequestSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this MembershipRequestSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the createDate value for this MembershipRequestSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this MembershipRequestSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the groupId value for this MembershipRequestSoap.
     * 
     * @return groupId
     */
    public long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this MembershipRequestSoap.
     * 
     * @param groupId
     */
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the membershipRequestId value for this MembershipRequestSoap.
     * 
     * @return membershipRequestId
     */
    public long getMembershipRequestId() {
        return membershipRequestId;
    }


    /**
     * Sets the membershipRequestId value for this MembershipRequestSoap.
     * 
     * @param membershipRequestId
     */
    public void setMembershipRequestId(long membershipRequestId) {
        this.membershipRequestId = membershipRequestId;
    }


    /**
     * Gets the primaryKey value for this MembershipRequestSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this MembershipRequestSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the replierUserId value for this MembershipRequestSoap.
     * 
     * @return replierUserId
     */
    public long getReplierUserId() {
        return replierUserId;
    }


    /**
     * Sets the replierUserId value for this MembershipRequestSoap.
     * 
     * @param replierUserId
     */
    public void setReplierUserId(long replierUserId) {
        this.replierUserId = replierUserId;
    }


    /**
     * Gets the replyComments value for this MembershipRequestSoap.
     * 
     * @return replyComments
     */
    public java.lang.String getReplyComments() {
        return replyComments;
    }


    /**
     * Sets the replyComments value for this MembershipRequestSoap.
     * 
     * @param replyComments
     */
    public void setReplyComments(java.lang.String replyComments) {
        this.replyComments = replyComments;
    }


    /**
     * Gets the replyDate value for this MembershipRequestSoap.
     * 
     * @return replyDate
     */
    public java.util.Calendar getReplyDate() {
        return replyDate;
    }


    /**
     * Sets the replyDate value for this MembershipRequestSoap.
     * 
     * @param replyDate
     */
    public void setReplyDate(java.util.Calendar replyDate) {
        this.replyDate = replyDate;
    }


    /**
     * Gets the statusId value for this MembershipRequestSoap.
     * 
     * @return statusId
     */
    public int getStatusId() {
        return statusId;
    }


    /**
     * Sets the statusId value for this MembershipRequestSoap.
     * 
     * @param statusId
     */
    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }


    /**
     * Gets the userId value for this MembershipRequestSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this MembershipRequestSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MembershipRequestSoap)) return false;
        MembershipRequestSoap other = (MembershipRequestSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            this.groupId == other.getGroupId() &&
            this.membershipRequestId == other.getMembershipRequestId() &&
            this.primaryKey == other.getPrimaryKey() &&
            this.replierUserId == other.getReplierUserId() &&
            ((this.replyComments==null && other.getReplyComments()==null) || 
             (this.replyComments!=null &&
              this.replyComments.equals(other.getReplyComments()))) &&
            ((this.replyDate==null && other.getReplyDate()==null) || 
             (this.replyDate!=null &&
              this.replyDate.equals(other.getReplyDate()))) &&
            this.statusId == other.getStatusId() &&
            this.userId == other.getUserId();
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
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        _hashCode += new Long(getGroupId()).hashCode();
        _hashCode += new Long(getMembershipRequestId()).hashCode();
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += new Long(getReplierUserId()).hashCode();
        if (getReplyComments() != null) {
            _hashCode += getReplyComments().hashCode();
        }
        if (getReplyDate() != null) {
            _hashCode += getReplyDate().hashCode();
        }
        _hashCode += getStatusId();
        _hashCode += new Long(getUserId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MembershipRequestSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.portal.liferay.com", "MembershipRequestSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
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
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membershipRequestId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "membershipRequestId"));
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
        elemField.setFieldName("replierUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replierUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyComments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replyComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
