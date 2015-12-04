/**
 * TasksReviewSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.tasks.model;

public class TasksReviewSoap  implements java.io.Serializable {
    private long assignedByUserId;

    private java.lang.String assignedByUserName;

    private long companyId;

    private boolean completed;

    private java.util.Calendar createDate;

    private long groupId;

    private java.util.Calendar modifiedDate;

    private long primaryKey;

    private long proposalId;

    private boolean rejected;

    private long reviewId;

    private int stage;

    private long userId;

    private java.lang.String userName;

    public TasksReviewSoap() {
    }

    public TasksReviewSoap(
           long assignedByUserId,
           java.lang.String assignedByUserName,
           long companyId,
           boolean completed,
           java.util.Calendar createDate,
           long groupId,
           java.util.Calendar modifiedDate,
           long primaryKey,
           long proposalId,
           boolean rejected,
           long reviewId,
           int stage,
           long userId,
           java.lang.String userName) {
           this.assignedByUserId = assignedByUserId;
           this.assignedByUserName = assignedByUserName;
           this.companyId = companyId;
           this.completed = completed;
           this.createDate = createDate;
           this.groupId = groupId;
           this.modifiedDate = modifiedDate;
           this.primaryKey = primaryKey;
           this.proposalId = proposalId;
           this.rejected = rejected;
           this.reviewId = reviewId;
           this.stage = stage;
           this.userId = userId;
           this.userName = userName;
    }


    /**
     * Gets the assignedByUserId value for this TasksReviewSoap.
     * 
     * @return assignedByUserId
     */
    public long getAssignedByUserId() {
        return assignedByUserId;
    }


    /**
     * Sets the assignedByUserId value for this TasksReviewSoap.
     * 
     * @param assignedByUserId
     */
    public void setAssignedByUserId(long assignedByUserId) {
        this.assignedByUserId = assignedByUserId;
    }


    /**
     * Gets the assignedByUserName value for this TasksReviewSoap.
     * 
     * @return assignedByUserName
     */
    public java.lang.String getAssignedByUserName() {
        return assignedByUserName;
    }


    /**
     * Sets the assignedByUserName value for this TasksReviewSoap.
     * 
     * @param assignedByUserName
     */
    public void setAssignedByUserName(java.lang.String assignedByUserName) {
        this.assignedByUserName = assignedByUserName;
    }


    /**
     * Gets the companyId value for this TasksReviewSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this TasksReviewSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the completed value for this TasksReviewSoap.
     * 
     * @return completed
     */
    public boolean isCompleted() {
        return completed;
    }


    /**
     * Sets the completed value for this TasksReviewSoap.
     * 
     * @param completed
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    /**
     * Gets the createDate value for this TasksReviewSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this TasksReviewSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the groupId value for this TasksReviewSoap.
     * 
     * @return groupId
     */
    public long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this TasksReviewSoap.
     * 
     * @param groupId
     */
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the modifiedDate value for this TasksReviewSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this TasksReviewSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the primaryKey value for this TasksReviewSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this TasksReviewSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the proposalId value for this TasksReviewSoap.
     * 
     * @return proposalId
     */
    public long getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this TasksReviewSoap.
     * 
     * @param proposalId
     */
    public void setProposalId(long proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the rejected value for this TasksReviewSoap.
     * 
     * @return rejected
     */
    public boolean isRejected() {
        return rejected;
    }


    /**
     * Sets the rejected value for this TasksReviewSoap.
     * 
     * @param rejected
     */
    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }


    /**
     * Gets the reviewId value for this TasksReviewSoap.
     * 
     * @return reviewId
     */
    public long getReviewId() {
        return reviewId;
    }


    /**
     * Sets the reviewId value for this TasksReviewSoap.
     * 
     * @param reviewId
     */
    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
    }


    /**
     * Gets the stage value for this TasksReviewSoap.
     * 
     * @return stage
     */
    public int getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this TasksReviewSoap.
     * 
     * @param stage
     */
    public void setStage(int stage) {
        this.stage = stage;
    }


    /**
     * Gets the userId value for this TasksReviewSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this TasksReviewSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this TasksReviewSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this TasksReviewSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TasksReviewSoap)) return false;
        TasksReviewSoap other = (TasksReviewSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.assignedByUserId == other.getAssignedByUserId() &&
            ((this.assignedByUserName==null && other.getAssignedByUserName()==null) || 
             (this.assignedByUserName!=null &&
              this.assignedByUserName.equals(other.getAssignedByUserName()))) &&
            this.companyId == other.getCompanyId() &&
            this.completed == other.isCompleted() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            this.groupId == other.getGroupId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            this.proposalId == other.getProposalId() &&
            this.rejected == other.isRejected() &&
            this.reviewId == other.getReviewId() &&
            this.stage == other.getStage() &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        _hashCode += new Long(getAssignedByUserId()).hashCode();
        if (getAssignedByUserName() != null) {
            _hashCode += getAssignedByUserName().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        _hashCode += (isCompleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        _hashCode += new Long(getGroupId()).hashCode();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += new Long(getProposalId()).hashCode();
        _hashCode += (isRejected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getReviewId()).hashCode();
        _hashCode += getStage();
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TasksReviewSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.tasks.portlet.liferay.com", "TasksReviewSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedByUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedByUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedByUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedByUserName"));
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
        elemField.setFieldName("completed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rejected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reviewId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
