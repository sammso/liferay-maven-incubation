/**
 * WikiPageSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.wiki.model;

public class WikiPageSoap  implements java.io.Serializable {
    private long companyId;

    private java.lang.String content;

    private java.util.Calendar createDate;

    private java.lang.String format;

    private long groupId;

    private boolean head;

    private boolean minorEdit;

    private java.util.Calendar modifiedDate;

    private long nodeId;

    private long pageId;

    private java.lang.String parentTitle;

    private long primaryKey;

    private java.lang.String redirectTitle;

    private long resourcePrimKey;

    private java.lang.String summary;

    private java.lang.String title;

    private long userId;

    private java.lang.String userName;

    private java.lang.String uuid;

    private double version;

    public WikiPageSoap() {
    }

    public WikiPageSoap(
           long companyId,
           java.lang.String content,
           java.util.Calendar createDate,
           java.lang.String format,
           long groupId,
           boolean head,
           boolean minorEdit,
           java.util.Calendar modifiedDate,
           long nodeId,
           long pageId,
           java.lang.String parentTitle,
           long primaryKey,
           java.lang.String redirectTitle,
           long resourcePrimKey,
           java.lang.String summary,
           java.lang.String title,
           long userId,
           java.lang.String userName,
           java.lang.String uuid,
           double version) {
           this.companyId = companyId;
           this.content = content;
           this.createDate = createDate;
           this.format = format;
           this.groupId = groupId;
           this.head = head;
           this.minorEdit = minorEdit;
           this.modifiedDate = modifiedDate;
           this.nodeId = nodeId;
           this.pageId = pageId;
           this.parentTitle = parentTitle;
           this.primaryKey = primaryKey;
           this.redirectTitle = redirectTitle;
           this.resourcePrimKey = resourcePrimKey;
           this.summary = summary;
           this.title = title;
           this.userId = userId;
           this.userName = userName;
           this.uuid = uuid;
           this.version = version;
    }


    /**
     * Gets the companyId value for this WikiPageSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this WikiPageSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the content value for this WikiPageSoap.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this WikiPageSoap.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the createDate value for this WikiPageSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this WikiPageSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the format value for this WikiPageSoap.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this WikiPageSoap.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the groupId value for this WikiPageSoap.
     * 
     * @return groupId
     */
    public long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this WikiPageSoap.
     * 
     * @param groupId
     */
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the head value for this WikiPageSoap.
     * 
     * @return head
     */
    public boolean isHead() {
        return head;
    }


    /**
     * Sets the head value for this WikiPageSoap.
     * 
     * @param head
     */
    public void setHead(boolean head) {
        this.head = head;
    }


    /**
     * Gets the minorEdit value for this WikiPageSoap.
     * 
     * @return minorEdit
     */
    public boolean isMinorEdit() {
        return minorEdit;
    }


    /**
     * Sets the minorEdit value for this WikiPageSoap.
     * 
     * @param minorEdit
     */
    public void setMinorEdit(boolean minorEdit) {
        this.minorEdit = minorEdit;
    }


    /**
     * Gets the modifiedDate value for this WikiPageSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this WikiPageSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the nodeId value for this WikiPageSoap.
     * 
     * @return nodeId
     */
    public long getNodeId() {
        return nodeId;
    }


    /**
     * Sets the nodeId value for this WikiPageSoap.
     * 
     * @param nodeId
     */
    public void setNodeId(long nodeId) {
        this.nodeId = nodeId;
    }


    /**
     * Gets the pageId value for this WikiPageSoap.
     * 
     * @return pageId
     */
    public long getPageId() {
        return pageId;
    }


    /**
     * Sets the pageId value for this WikiPageSoap.
     * 
     * @param pageId
     */
    public void setPageId(long pageId) {
        this.pageId = pageId;
    }


    /**
     * Gets the parentTitle value for this WikiPageSoap.
     * 
     * @return parentTitle
     */
    public java.lang.String getParentTitle() {
        return parentTitle;
    }


    /**
     * Sets the parentTitle value for this WikiPageSoap.
     * 
     * @param parentTitle
     */
    public void setParentTitle(java.lang.String parentTitle) {
        this.parentTitle = parentTitle;
    }


    /**
     * Gets the primaryKey value for this WikiPageSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this WikiPageSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the redirectTitle value for this WikiPageSoap.
     * 
     * @return redirectTitle
     */
    public java.lang.String getRedirectTitle() {
        return redirectTitle;
    }


    /**
     * Sets the redirectTitle value for this WikiPageSoap.
     * 
     * @param redirectTitle
     */
    public void setRedirectTitle(java.lang.String redirectTitle) {
        this.redirectTitle = redirectTitle;
    }


    /**
     * Gets the resourcePrimKey value for this WikiPageSoap.
     * 
     * @return resourcePrimKey
     */
    public long getResourcePrimKey() {
        return resourcePrimKey;
    }


    /**
     * Sets the resourcePrimKey value for this WikiPageSoap.
     * 
     * @param resourcePrimKey
     */
    public void setResourcePrimKey(long resourcePrimKey) {
        this.resourcePrimKey = resourcePrimKey;
    }


    /**
     * Gets the summary value for this WikiPageSoap.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this WikiPageSoap.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the title value for this WikiPageSoap.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this WikiPageSoap.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the userId value for this WikiPageSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this WikiPageSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this WikiPageSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this WikiPageSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the uuid value for this WikiPageSoap.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this WikiPageSoap.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the version value for this WikiPageSoap.
     * 
     * @return version
     */
    public double getVersion() {
        return version;
    }


    /**
     * Sets the version value for this WikiPageSoap.
     * 
     * @param version
     */
    public void setVersion(double version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WikiPageSoap)) return false;
        WikiPageSoap other = (WikiPageSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.companyId == other.getCompanyId() &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            this.groupId == other.getGroupId() &&
            this.head == other.isHead() &&
            this.minorEdit == other.isMinorEdit() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.nodeId == other.getNodeId() &&
            this.pageId == other.getPageId() &&
            ((this.parentTitle==null && other.getParentTitle()==null) || 
             (this.parentTitle!=null &&
              this.parentTitle.equals(other.getParentTitle()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            ((this.redirectTitle==null && other.getRedirectTitle()==null) || 
             (this.redirectTitle!=null &&
              this.redirectTitle.equals(other.getRedirectTitle()))) &&
            this.resourcePrimKey == other.getResourcePrimKey() &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            this.version == other.getVersion();
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
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        _hashCode += new Long(getGroupId()).hashCode();
        _hashCode += (isHead() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMinorEdit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += new Long(getNodeId()).hashCode();
        _hashCode += new Long(getPageId()).hashCode();
        if (getParentTitle() != null) {
            _hashCode += getParentTitle().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        if (getRedirectTitle() != null) {
            _hashCode += getRedirectTitle().hashCode();
        }
        _hashCode += new Long(getResourcePrimKey()).hashCode();
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        _hashCode += new Double(getVersion()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WikiPageSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.wiki.portlet.liferay.com", "WikiPageSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("head");
        elemField.setXmlName(new javax.xml.namespace.QName("", "head"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirectTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePrimKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourcePrimKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
