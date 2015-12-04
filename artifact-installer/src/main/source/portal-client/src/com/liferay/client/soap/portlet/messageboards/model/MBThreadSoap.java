/**
 * MBThreadSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.messageboards.model;

public class MBThreadSoap  implements java.io.Serializable {
    private long categoryId;

    private long groupId;

    private long lastPostByUserId;

    private java.util.Calendar lastPostDate;

    private int messageCount;

    private long primaryKey;

    private double priority;

    private long rootMessageId;

    private long threadId;

    private int viewCount;

    public MBThreadSoap() {
    }

    public MBThreadSoap(
           long categoryId,
           long groupId,
           long lastPostByUserId,
           java.util.Calendar lastPostDate,
           int messageCount,
           long primaryKey,
           double priority,
           long rootMessageId,
           long threadId,
           int viewCount) {
           this.categoryId = categoryId;
           this.groupId = groupId;
           this.lastPostByUserId = lastPostByUserId;
           this.lastPostDate = lastPostDate;
           this.messageCount = messageCount;
           this.primaryKey = primaryKey;
           this.priority = priority;
           this.rootMessageId = rootMessageId;
           this.threadId = threadId;
           this.viewCount = viewCount;
    }


    /**
     * Gets the categoryId value for this MBThreadSoap.
     * 
     * @return categoryId
     */
    public long getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this MBThreadSoap.
     * 
     * @param categoryId
     */
    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the groupId value for this MBThreadSoap.
     * 
     * @return groupId
     */
    public long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this MBThreadSoap.
     * 
     * @param groupId
     */
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the lastPostByUserId value for this MBThreadSoap.
     * 
     * @return lastPostByUserId
     */
    public long getLastPostByUserId() {
        return lastPostByUserId;
    }


    /**
     * Sets the lastPostByUserId value for this MBThreadSoap.
     * 
     * @param lastPostByUserId
     */
    public void setLastPostByUserId(long lastPostByUserId) {
        this.lastPostByUserId = lastPostByUserId;
    }


    /**
     * Gets the lastPostDate value for this MBThreadSoap.
     * 
     * @return lastPostDate
     */
    public java.util.Calendar getLastPostDate() {
        return lastPostDate;
    }


    /**
     * Sets the lastPostDate value for this MBThreadSoap.
     * 
     * @param lastPostDate
     */
    public void setLastPostDate(java.util.Calendar lastPostDate) {
        this.lastPostDate = lastPostDate;
    }


    /**
     * Gets the messageCount value for this MBThreadSoap.
     * 
     * @return messageCount
     */
    public int getMessageCount() {
        return messageCount;
    }


    /**
     * Sets the messageCount value for this MBThreadSoap.
     * 
     * @param messageCount
     */
    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }


    /**
     * Gets the primaryKey value for this MBThreadSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this MBThreadSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the priority value for this MBThreadSoap.
     * 
     * @return priority
     */
    public double getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this MBThreadSoap.
     * 
     * @param priority
     */
    public void setPriority(double priority) {
        this.priority = priority;
    }


    /**
     * Gets the rootMessageId value for this MBThreadSoap.
     * 
     * @return rootMessageId
     */
    public long getRootMessageId() {
        return rootMessageId;
    }


    /**
     * Sets the rootMessageId value for this MBThreadSoap.
     * 
     * @param rootMessageId
     */
    public void setRootMessageId(long rootMessageId) {
        this.rootMessageId = rootMessageId;
    }


    /**
     * Gets the threadId value for this MBThreadSoap.
     * 
     * @return threadId
     */
    public long getThreadId() {
        return threadId;
    }


    /**
     * Sets the threadId value for this MBThreadSoap.
     * 
     * @param threadId
     */
    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }


    /**
     * Gets the viewCount value for this MBThreadSoap.
     * 
     * @return viewCount
     */
    public int getViewCount() {
        return viewCount;
    }


    /**
     * Sets the viewCount value for this MBThreadSoap.
     * 
     * @param viewCount
     */
    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MBThreadSoap)) return false;
        MBThreadSoap other = (MBThreadSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.categoryId == other.getCategoryId() &&
            this.groupId == other.getGroupId() &&
            this.lastPostByUserId == other.getLastPostByUserId() &&
            ((this.lastPostDate==null && other.getLastPostDate()==null) || 
             (this.lastPostDate!=null &&
              this.lastPostDate.equals(other.getLastPostDate()))) &&
            this.messageCount == other.getMessageCount() &&
            this.primaryKey == other.getPrimaryKey() &&
            this.priority == other.getPriority() &&
            this.rootMessageId == other.getRootMessageId() &&
            this.threadId == other.getThreadId() &&
            this.viewCount == other.getViewCount();
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
        _hashCode += new Long(getCategoryId()).hashCode();
        _hashCode += new Long(getGroupId()).hashCode();
        _hashCode += new Long(getLastPostByUserId()).hashCode();
        if (getLastPostDate() != null) {
            _hashCode += getLastPostDate().hashCode();
        }
        _hashCode += getMessageCount();
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += new Double(getPriority()).hashCode();
        _hashCode += new Long(getRootMessageId()).hashCode();
        _hashCode += new Long(getThreadId()).hashCode();
        _hashCode += getViewCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MBThreadSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.messageboards.portlet.liferay.com", "MBThreadSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPostByUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastPostByUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPostDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastPostDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rootMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threadId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
