/**
 * JournalTemplateSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.journal.model;

public class JournalTemplateSoap  implements java.io.Serializable {
    private boolean cacheable;

    private long companyId;

    private java.util.Calendar createDate;

    private java.lang.String description;

    private long groupId;

    private long id;

    private java.lang.String langType;

    private java.util.Calendar modifiedDate;

    private java.lang.String name;

    private long primaryKey;

    private boolean smallImage;

    private long smallImageId;

    private java.lang.String smallImageURL;

    private java.lang.String structureId;

    private java.lang.String templateId;

    private long userId;

    private java.lang.String userName;

    private java.lang.String uuid;

    private java.lang.String xsl;

    public JournalTemplateSoap() {
    }

    public JournalTemplateSoap(
           boolean cacheable,
           long companyId,
           java.util.Calendar createDate,
           java.lang.String description,
           long groupId,
           long id,
           java.lang.String langType,
           java.util.Calendar modifiedDate,
           java.lang.String name,
           long primaryKey,
           boolean smallImage,
           long smallImageId,
           java.lang.String smallImageURL,
           java.lang.String structureId,
           java.lang.String templateId,
           long userId,
           java.lang.String userName,
           java.lang.String uuid,
           java.lang.String xsl) {
           this.cacheable = cacheable;
           this.companyId = companyId;
           this.createDate = createDate;
           this.description = description;
           this.groupId = groupId;
           this.id = id;
           this.langType = langType;
           this.modifiedDate = modifiedDate;
           this.name = name;
           this.primaryKey = primaryKey;
           this.smallImage = smallImage;
           this.smallImageId = smallImageId;
           this.smallImageURL = smallImageURL;
           this.structureId = structureId;
           this.templateId = templateId;
           this.userId = userId;
           this.userName = userName;
           this.uuid = uuid;
           this.xsl = xsl;
    }


    /**
     * Gets the cacheable value for this JournalTemplateSoap.
     * 
     * @return cacheable
     */
    public boolean isCacheable() {
        return cacheable;
    }


    /**
     * Sets the cacheable value for this JournalTemplateSoap.
     * 
     * @param cacheable
     */
    public void setCacheable(boolean cacheable) {
        this.cacheable = cacheable;
    }


    /**
     * Gets the companyId value for this JournalTemplateSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this JournalTemplateSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the createDate value for this JournalTemplateSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this JournalTemplateSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the description value for this JournalTemplateSoap.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this JournalTemplateSoap.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the groupId value for this JournalTemplateSoap.
     * 
     * @return groupId
     */
    public long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this JournalTemplateSoap.
     * 
     * @param groupId
     */
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the id value for this JournalTemplateSoap.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this JournalTemplateSoap.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the langType value for this JournalTemplateSoap.
     * 
     * @return langType
     */
    public java.lang.String getLangType() {
        return langType;
    }


    /**
     * Sets the langType value for this JournalTemplateSoap.
     * 
     * @param langType
     */
    public void setLangType(java.lang.String langType) {
        this.langType = langType;
    }


    /**
     * Gets the modifiedDate value for this JournalTemplateSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this JournalTemplateSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the name value for this JournalTemplateSoap.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this JournalTemplateSoap.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the primaryKey value for this JournalTemplateSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this JournalTemplateSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the smallImage value for this JournalTemplateSoap.
     * 
     * @return smallImage
     */
    public boolean isSmallImage() {
        return smallImage;
    }


    /**
     * Sets the smallImage value for this JournalTemplateSoap.
     * 
     * @param smallImage
     */
    public void setSmallImage(boolean smallImage) {
        this.smallImage = smallImage;
    }


    /**
     * Gets the smallImageId value for this JournalTemplateSoap.
     * 
     * @return smallImageId
     */
    public long getSmallImageId() {
        return smallImageId;
    }


    /**
     * Sets the smallImageId value for this JournalTemplateSoap.
     * 
     * @param smallImageId
     */
    public void setSmallImageId(long smallImageId) {
        this.smallImageId = smallImageId;
    }


    /**
     * Gets the smallImageURL value for this JournalTemplateSoap.
     * 
     * @return smallImageURL
     */
    public java.lang.String getSmallImageURL() {
        return smallImageURL;
    }


    /**
     * Sets the smallImageURL value for this JournalTemplateSoap.
     * 
     * @param smallImageURL
     */
    public void setSmallImageURL(java.lang.String smallImageURL) {
        this.smallImageURL = smallImageURL;
    }


    /**
     * Gets the structureId value for this JournalTemplateSoap.
     * 
     * @return structureId
     */
    public java.lang.String getStructureId() {
        return structureId;
    }


    /**
     * Sets the structureId value for this JournalTemplateSoap.
     * 
     * @param structureId
     */
    public void setStructureId(java.lang.String structureId) {
        this.structureId = structureId;
    }


    /**
     * Gets the templateId value for this JournalTemplateSoap.
     * 
     * @return templateId
     */
    public java.lang.String getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this JournalTemplateSoap.
     * 
     * @param templateId
     */
    public void setTemplateId(java.lang.String templateId) {
        this.templateId = templateId;
    }


    /**
     * Gets the userId value for this JournalTemplateSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this JournalTemplateSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this JournalTemplateSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this JournalTemplateSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the uuid value for this JournalTemplateSoap.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this JournalTemplateSoap.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the xsl value for this JournalTemplateSoap.
     * 
     * @return xsl
     */
    public java.lang.String getXsl() {
        return xsl;
    }


    /**
     * Sets the xsl value for this JournalTemplateSoap.
     * 
     * @param xsl
     */
    public void setXsl(java.lang.String xsl) {
        this.xsl = xsl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JournalTemplateSoap)) return false;
        JournalTemplateSoap other = (JournalTemplateSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cacheable == other.isCacheable() &&
            this.companyId == other.getCompanyId() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.groupId == other.getGroupId() &&
            this.id == other.getId() &&
            ((this.langType==null && other.getLangType()==null) || 
             (this.langType!=null &&
              this.langType.equals(other.getLangType()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            this.smallImage == other.isSmallImage() &&
            this.smallImageId == other.getSmallImageId() &&
            ((this.smallImageURL==null && other.getSmallImageURL()==null) || 
             (this.smallImageURL!=null &&
              this.smallImageURL.equals(other.getSmallImageURL()))) &&
            ((this.structureId==null && other.getStructureId()==null) || 
             (this.structureId!=null &&
              this.structureId.equals(other.getStructureId()))) &&
            ((this.templateId==null && other.getTemplateId()==null) || 
             (this.templateId!=null &&
              this.templateId.equals(other.getTemplateId()))) &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.xsl==null && other.getXsl()==null) || 
             (this.xsl!=null &&
              this.xsl.equals(other.getXsl())));
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
        _hashCode += (isCacheable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Long(getGroupId()).hashCode();
        _hashCode += new Long(getId()).hashCode();
        if (getLangType() != null) {
            _hashCode += getLangType().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += (isSmallImage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getSmallImageId()).hashCode();
        if (getSmallImageURL() != null) {
            _hashCode += getSmallImageURL().hashCode();
        }
        if (getStructureId() != null) {
            _hashCode += getStructureId().hashCode();
        }
        if (getTemplateId() != null) {
            _hashCode += getTemplateId().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getXsl() != null) {
            _hashCode += getXsl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JournalTemplateSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.journal.portlet.liferay.com", "JournalTemplateSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheable"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("langType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "langType"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
        elemField.setFieldName("smallImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smallImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallImageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smallImageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallImageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smallImageURL"));
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
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateId"));
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
        elemField.setFieldName("xsl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xsl"));
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
