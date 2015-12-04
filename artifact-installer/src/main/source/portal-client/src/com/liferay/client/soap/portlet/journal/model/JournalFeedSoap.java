/**
 * JournalFeedSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.journal.model;

public class JournalFeedSoap  implements java.io.Serializable {
    private long companyId;

    private java.lang.String contentField;

    private java.util.Calendar createDate;

    private int delta;

    private java.lang.String description;

    private java.lang.String feedId;

    private java.lang.String feedType;

    private double feedVersion;

    private long groupId;

    private long id;

    private java.util.Calendar modifiedDate;

    private java.lang.String name;

    private java.lang.String orderByCol;

    private java.lang.String orderByType;

    private long primaryKey;

    private java.lang.String rendererTemplateId;

    private java.lang.String structureId;

    private java.lang.String targetLayoutFriendlyUrl;

    private java.lang.String targetPortletId;

    private java.lang.String templateId;

    private java.lang.String type;

    private long userId;

    private java.lang.String userName;

    private java.lang.String uuid;

    public JournalFeedSoap() {
    }

    public JournalFeedSoap(
           long companyId,
           java.lang.String contentField,
           java.util.Calendar createDate,
           int delta,
           java.lang.String description,
           java.lang.String feedId,
           java.lang.String feedType,
           double feedVersion,
           long groupId,
           long id,
           java.util.Calendar modifiedDate,
           java.lang.String name,
           java.lang.String orderByCol,
           java.lang.String orderByType,
           long primaryKey,
           java.lang.String rendererTemplateId,
           java.lang.String structureId,
           java.lang.String targetLayoutFriendlyUrl,
           java.lang.String targetPortletId,
           java.lang.String templateId,
           java.lang.String type,
           long userId,
           java.lang.String userName,
           java.lang.String uuid) {
           this.companyId = companyId;
           this.contentField = contentField;
           this.createDate = createDate;
           this.delta = delta;
           this.description = description;
           this.feedId = feedId;
           this.feedType = feedType;
           this.feedVersion = feedVersion;
           this.groupId = groupId;
           this.id = id;
           this.modifiedDate = modifiedDate;
           this.name = name;
           this.orderByCol = orderByCol;
           this.orderByType = orderByType;
           this.primaryKey = primaryKey;
           this.rendererTemplateId = rendererTemplateId;
           this.structureId = structureId;
           this.targetLayoutFriendlyUrl = targetLayoutFriendlyUrl;
           this.targetPortletId = targetPortletId;
           this.templateId = templateId;
           this.type = type;
           this.userId = userId;
           this.userName = userName;
           this.uuid = uuid;
    }


    /**
     * Gets the companyId value for this JournalFeedSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this JournalFeedSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the contentField value for this JournalFeedSoap.
     * 
     * @return contentField
     */
    public java.lang.String getContentField() {
        return contentField;
    }


    /**
     * Sets the contentField value for this JournalFeedSoap.
     * 
     * @param contentField
     */
    public void setContentField(java.lang.String contentField) {
        this.contentField = contentField;
    }


    /**
     * Gets the createDate value for this JournalFeedSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this JournalFeedSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the delta value for this JournalFeedSoap.
     * 
     * @return delta
     */
    public int getDelta() {
        return delta;
    }


    /**
     * Sets the delta value for this JournalFeedSoap.
     * 
     * @param delta
     */
    public void setDelta(int delta) {
        this.delta = delta;
    }


    /**
     * Gets the description value for this JournalFeedSoap.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this JournalFeedSoap.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the feedId value for this JournalFeedSoap.
     * 
     * @return feedId
     */
    public java.lang.String getFeedId() {
        return feedId;
    }


    /**
     * Sets the feedId value for this JournalFeedSoap.
     * 
     * @param feedId
     */
    public void setFeedId(java.lang.String feedId) {
        this.feedId = feedId;
    }


    /**
     * Gets the feedType value for this JournalFeedSoap.
     * 
     * @return feedType
     */
    public java.lang.String getFeedType() {
        return feedType;
    }


    /**
     * Sets the feedType value for this JournalFeedSoap.
     * 
     * @param feedType
     */
    public void setFeedType(java.lang.String feedType) {
        this.feedType = feedType;
    }


    /**
     * Gets the feedVersion value for this JournalFeedSoap.
     * 
     * @return feedVersion
     */
    public double getFeedVersion() {
        return feedVersion;
    }


    /**
     * Sets the feedVersion value for this JournalFeedSoap.
     * 
     * @param feedVersion
     */
    public void setFeedVersion(double feedVersion) {
        this.feedVersion = feedVersion;
    }


    /**
     * Gets the groupId value for this JournalFeedSoap.
     * 
     * @return groupId
     */
    public long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this JournalFeedSoap.
     * 
     * @param groupId
     */
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the id value for this JournalFeedSoap.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this JournalFeedSoap.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the modifiedDate value for this JournalFeedSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this JournalFeedSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the name value for this JournalFeedSoap.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this JournalFeedSoap.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the orderByCol value for this JournalFeedSoap.
     * 
     * @return orderByCol
     */
    public java.lang.String getOrderByCol() {
        return orderByCol;
    }


    /**
     * Sets the orderByCol value for this JournalFeedSoap.
     * 
     * @param orderByCol
     */
    public void setOrderByCol(java.lang.String orderByCol) {
        this.orderByCol = orderByCol;
    }


    /**
     * Gets the orderByType value for this JournalFeedSoap.
     * 
     * @return orderByType
     */
    public java.lang.String getOrderByType() {
        return orderByType;
    }


    /**
     * Sets the orderByType value for this JournalFeedSoap.
     * 
     * @param orderByType
     */
    public void setOrderByType(java.lang.String orderByType) {
        this.orderByType = orderByType;
    }


    /**
     * Gets the primaryKey value for this JournalFeedSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this JournalFeedSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the rendererTemplateId value for this JournalFeedSoap.
     * 
     * @return rendererTemplateId
     */
    public java.lang.String getRendererTemplateId() {
        return rendererTemplateId;
    }


    /**
     * Sets the rendererTemplateId value for this JournalFeedSoap.
     * 
     * @param rendererTemplateId
     */
    public void setRendererTemplateId(java.lang.String rendererTemplateId) {
        this.rendererTemplateId = rendererTemplateId;
    }


    /**
     * Gets the structureId value for this JournalFeedSoap.
     * 
     * @return structureId
     */
    public java.lang.String getStructureId() {
        return structureId;
    }


    /**
     * Sets the structureId value for this JournalFeedSoap.
     * 
     * @param structureId
     */
    public void setStructureId(java.lang.String structureId) {
        this.structureId = structureId;
    }


    /**
     * Gets the targetLayoutFriendlyUrl value for this JournalFeedSoap.
     * 
     * @return targetLayoutFriendlyUrl
     */
    public java.lang.String getTargetLayoutFriendlyUrl() {
        return targetLayoutFriendlyUrl;
    }


    /**
     * Sets the targetLayoutFriendlyUrl value for this JournalFeedSoap.
     * 
     * @param targetLayoutFriendlyUrl
     */
    public void setTargetLayoutFriendlyUrl(java.lang.String targetLayoutFriendlyUrl) {
        this.targetLayoutFriendlyUrl = targetLayoutFriendlyUrl;
    }


    /**
     * Gets the targetPortletId value for this JournalFeedSoap.
     * 
     * @return targetPortletId
     */
    public java.lang.String getTargetPortletId() {
        return targetPortletId;
    }


    /**
     * Sets the targetPortletId value for this JournalFeedSoap.
     * 
     * @param targetPortletId
     */
    public void setTargetPortletId(java.lang.String targetPortletId) {
        this.targetPortletId = targetPortletId;
    }


    /**
     * Gets the templateId value for this JournalFeedSoap.
     * 
     * @return templateId
     */
    public java.lang.String getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this JournalFeedSoap.
     * 
     * @param templateId
     */
    public void setTemplateId(java.lang.String templateId) {
        this.templateId = templateId;
    }


    /**
     * Gets the type value for this JournalFeedSoap.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this JournalFeedSoap.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the userId value for this JournalFeedSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this JournalFeedSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this JournalFeedSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this JournalFeedSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the uuid value for this JournalFeedSoap.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this JournalFeedSoap.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JournalFeedSoap)) return false;
        JournalFeedSoap other = (JournalFeedSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.companyId == other.getCompanyId() &&
            ((this.contentField==null && other.getContentField()==null) || 
             (this.contentField!=null &&
              this.contentField.equals(other.getContentField()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            this.delta == other.getDelta() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.feedId==null && other.getFeedId()==null) || 
             (this.feedId!=null &&
              this.feedId.equals(other.getFeedId()))) &&
            ((this.feedType==null && other.getFeedType()==null) || 
             (this.feedType!=null &&
              this.feedType.equals(other.getFeedType()))) &&
            this.feedVersion == other.getFeedVersion() &&
            this.groupId == other.getGroupId() &&
            this.id == other.getId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.orderByCol==null && other.getOrderByCol()==null) || 
             (this.orderByCol!=null &&
              this.orderByCol.equals(other.getOrderByCol()))) &&
            ((this.orderByType==null && other.getOrderByType()==null) || 
             (this.orderByType!=null &&
              this.orderByType.equals(other.getOrderByType()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            ((this.rendererTemplateId==null && other.getRendererTemplateId()==null) || 
             (this.rendererTemplateId!=null &&
              this.rendererTemplateId.equals(other.getRendererTemplateId()))) &&
            ((this.structureId==null && other.getStructureId()==null) || 
             (this.structureId!=null &&
              this.structureId.equals(other.getStructureId()))) &&
            ((this.targetLayoutFriendlyUrl==null && other.getTargetLayoutFriendlyUrl()==null) || 
             (this.targetLayoutFriendlyUrl!=null &&
              this.targetLayoutFriendlyUrl.equals(other.getTargetLayoutFriendlyUrl()))) &&
            ((this.targetPortletId==null && other.getTargetPortletId()==null) || 
             (this.targetPortletId!=null &&
              this.targetPortletId.equals(other.getTargetPortletId()))) &&
            ((this.templateId==null && other.getTemplateId()==null) || 
             (this.templateId!=null &&
              this.templateId.equals(other.getTemplateId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid())));
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
        if (getContentField() != null) {
            _hashCode += getContentField().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        _hashCode += getDelta();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFeedId() != null) {
            _hashCode += getFeedId().hashCode();
        }
        if (getFeedType() != null) {
            _hashCode += getFeedType().hashCode();
        }
        _hashCode += new Double(getFeedVersion()).hashCode();
        _hashCode += new Long(getGroupId()).hashCode();
        _hashCode += new Long(getId()).hashCode();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOrderByCol() != null) {
            _hashCode += getOrderByCol().hashCode();
        }
        if (getOrderByType() != null) {
            _hashCode += getOrderByType().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        if (getRendererTemplateId() != null) {
            _hashCode += getRendererTemplateId().hashCode();
        }
        if (getStructureId() != null) {
            _hashCode += getStructureId().hashCode();
        }
        if (getTargetLayoutFriendlyUrl() != null) {
            _hashCode += getTargetLayoutFriendlyUrl().hashCode();
        }
        if (getTargetPortletId() != null) {
            _hashCode += getTargetPortletId().hashCode();
        }
        if (getTemplateId() != null) {
            _hashCode += getTemplateId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JournalFeedSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.journal.portlet.liferay.com", "JournalFeedSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentField"));
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
        elemField.setFieldName("delta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderByCol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderByCol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderByType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderByType"));
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
        elemField.setFieldName("rendererTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rendererTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("structureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "structureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetLayoutFriendlyUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetLayoutFriendlyUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPortletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetPortletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
