/**
 * JournalArticleSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.journal.model;

public class JournalArticleSoap  implements java.io.Serializable {
    private boolean approved;

    private long approvedByUserId;

    private java.lang.String approvedByUserName;

    private java.util.Calendar approvedDate;

    private java.lang.String articleId;

    private long companyId;

    private java.lang.String content;

    private java.util.Calendar createDate;

    private java.lang.String description;

    private java.util.Calendar displayDate;

    private java.util.Calendar expirationDate;

    private boolean expired;

    private long groupId;

    private long id;

    private boolean indexable;

    private java.util.Calendar modifiedDate;

    private long primaryKey;

    private long resourcePrimKey;

    private java.util.Calendar reviewDate;

    private boolean smallImage;

    private long smallImageId;

    private java.lang.String smallImageURL;

    private java.lang.String structureId;

    private java.lang.String templateId;

    private java.lang.String title;

    private java.lang.String type;

    private java.lang.String urlTitle;

    private long userId;

    private java.lang.String userName;

    private java.lang.String uuid;

    private double version;

    public JournalArticleSoap() {
    }

    public JournalArticleSoap(
           boolean approved,
           long approvedByUserId,
           java.lang.String approvedByUserName,
           java.util.Calendar approvedDate,
           java.lang.String articleId,
           long companyId,
           java.lang.String content,
           java.util.Calendar createDate,
           java.lang.String description,
           java.util.Calendar displayDate,
           java.util.Calendar expirationDate,
           boolean expired,
           long groupId,
           long id,
           boolean indexable,
           java.util.Calendar modifiedDate,
           long primaryKey,
           long resourcePrimKey,
           java.util.Calendar reviewDate,
           boolean smallImage,
           long smallImageId,
           java.lang.String smallImageURL,
           java.lang.String structureId,
           java.lang.String templateId,
           java.lang.String title,
           java.lang.String type,
           java.lang.String urlTitle,
           long userId,
           java.lang.String userName,
           java.lang.String uuid,
           double version) {
           this.approved = approved;
           this.approvedByUserId = approvedByUserId;
           this.approvedByUserName = approvedByUserName;
           this.approvedDate = approvedDate;
           this.articleId = articleId;
           this.companyId = companyId;
           this.content = content;
           this.createDate = createDate;
           this.description = description;
           this.displayDate = displayDate;
           this.expirationDate = expirationDate;
           this.expired = expired;
           this.groupId = groupId;
           this.id = id;
           this.indexable = indexable;
           this.modifiedDate = modifiedDate;
           this.primaryKey = primaryKey;
           this.resourcePrimKey = resourcePrimKey;
           this.reviewDate = reviewDate;
           this.smallImage = smallImage;
           this.smallImageId = smallImageId;
           this.smallImageURL = smallImageURL;
           this.structureId = structureId;
           this.templateId = templateId;
           this.title = title;
           this.type = type;
           this.urlTitle = urlTitle;
           this.userId = userId;
           this.userName = userName;
           this.uuid = uuid;
           this.version = version;
    }


    /**
     * Gets the approved value for this JournalArticleSoap.
     * 
     * @return approved
     */
    public boolean isApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this JournalArticleSoap.
     * 
     * @param approved
     */
    public void setApproved(boolean approved) {
        this.approved = approved;
    }


    /**
     * Gets the approvedByUserId value for this JournalArticleSoap.
     * 
     * @return approvedByUserId
     */
    public long getApprovedByUserId() {
        return approvedByUserId;
    }


    /**
     * Sets the approvedByUserId value for this JournalArticleSoap.
     * 
     * @param approvedByUserId
     */
    public void setApprovedByUserId(long approvedByUserId) {
        this.approvedByUserId = approvedByUserId;
    }


    /**
     * Gets the approvedByUserName value for this JournalArticleSoap.
     * 
     * @return approvedByUserName
     */
    public java.lang.String getApprovedByUserName() {
        return approvedByUserName;
    }


    /**
     * Sets the approvedByUserName value for this JournalArticleSoap.
     * 
     * @param approvedByUserName
     */
    public void setApprovedByUserName(java.lang.String approvedByUserName) {
        this.approvedByUserName = approvedByUserName;
    }


    /**
     * Gets the approvedDate value for this JournalArticleSoap.
     * 
     * @return approvedDate
     */
    public java.util.Calendar getApprovedDate() {
        return approvedDate;
    }


    /**
     * Sets the approvedDate value for this JournalArticleSoap.
     * 
     * @param approvedDate
     */
    public void setApprovedDate(java.util.Calendar approvedDate) {
        this.approvedDate = approvedDate;
    }


    /**
     * Gets the articleId value for this JournalArticleSoap.
     * 
     * @return articleId
     */
    public java.lang.String getArticleId() {
        return articleId;
    }


    /**
     * Sets the articleId value for this JournalArticleSoap.
     * 
     * @param articleId
     */
    public void setArticleId(java.lang.String articleId) {
        this.articleId = articleId;
    }


    /**
     * Gets the companyId value for this JournalArticleSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this JournalArticleSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the content value for this JournalArticleSoap.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this JournalArticleSoap.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the createDate value for this JournalArticleSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this JournalArticleSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the description value for this JournalArticleSoap.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this JournalArticleSoap.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayDate value for this JournalArticleSoap.
     * 
     * @return displayDate
     */
    public java.util.Calendar getDisplayDate() {
        return displayDate;
    }


    /**
     * Sets the displayDate value for this JournalArticleSoap.
     * 
     * @param displayDate
     */
    public void setDisplayDate(java.util.Calendar displayDate) {
        this.displayDate = displayDate;
    }


    /**
     * Gets the expirationDate value for this JournalArticleSoap.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this JournalArticleSoap.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the expired value for this JournalArticleSoap.
     * 
     * @return expired
     */
    public boolean isExpired() {
        return expired;
    }


    /**
     * Sets the expired value for this JournalArticleSoap.
     * 
     * @param expired
     */
    public void setExpired(boolean expired) {
        this.expired = expired;
    }


    /**
     * Gets the groupId value for this JournalArticleSoap.
     * 
     * @return groupId
     */
    public long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this JournalArticleSoap.
     * 
     * @param groupId
     */
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the id value for this JournalArticleSoap.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this JournalArticleSoap.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the indexable value for this JournalArticleSoap.
     * 
     * @return indexable
     */
    public boolean isIndexable() {
        return indexable;
    }


    /**
     * Sets the indexable value for this JournalArticleSoap.
     * 
     * @param indexable
     */
    public void setIndexable(boolean indexable) {
        this.indexable = indexable;
    }


    /**
     * Gets the modifiedDate value for this JournalArticleSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this JournalArticleSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the primaryKey value for this JournalArticleSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this JournalArticleSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the resourcePrimKey value for this JournalArticleSoap.
     * 
     * @return resourcePrimKey
     */
    public long getResourcePrimKey() {
        return resourcePrimKey;
    }


    /**
     * Sets the resourcePrimKey value for this JournalArticleSoap.
     * 
     * @param resourcePrimKey
     */
    public void setResourcePrimKey(long resourcePrimKey) {
        this.resourcePrimKey = resourcePrimKey;
    }


    /**
     * Gets the reviewDate value for this JournalArticleSoap.
     * 
     * @return reviewDate
     */
    public java.util.Calendar getReviewDate() {
        return reviewDate;
    }


    /**
     * Sets the reviewDate value for this JournalArticleSoap.
     * 
     * @param reviewDate
     */
    public void setReviewDate(java.util.Calendar reviewDate) {
        this.reviewDate = reviewDate;
    }


    /**
     * Gets the smallImage value for this JournalArticleSoap.
     * 
     * @return smallImage
     */
    public boolean isSmallImage() {
        return smallImage;
    }


    /**
     * Sets the smallImage value for this JournalArticleSoap.
     * 
     * @param smallImage
     */
    public void setSmallImage(boolean smallImage) {
        this.smallImage = smallImage;
    }


    /**
     * Gets the smallImageId value for this JournalArticleSoap.
     * 
     * @return smallImageId
     */
    public long getSmallImageId() {
        return smallImageId;
    }


    /**
     * Sets the smallImageId value for this JournalArticleSoap.
     * 
     * @param smallImageId
     */
    public void setSmallImageId(long smallImageId) {
        this.smallImageId = smallImageId;
    }


    /**
     * Gets the smallImageURL value for this JournalArticleSoap.
     * 
     * @return smallImageURL
     */
    public java.lang.String getSmallImageURL() {
        return smallImageURL;
    }


    /**
     * Sets the smallImageURL value for this JournalArticleSoap.
     * 
     * @param smallImageURL
     */
    public void setSmallImageURL(java.lang.String smallImageURL) {
        this.smallImageURL = smallImageURL;
    }


    /**
     * Gets the structureId value for this JournalArticleSoap.
     * 
     * @return structureId
     */
    public java.lang.String getStructureId() {
        return structureId;
    }


    /**
     * Sets the structureId value for this JournalArticleSoap.
     * 
     * @param structureId
     */
    public void setStructureId(java.lang.String structureId) {
        this.structureId = structureId;
    }


    /**
     * Gets the templateId value for this JournalArticleSoap.
     * 
     * @return templateId
     */
    public java.lang.String getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this JournalArticleSoap.
     * 
     * @param templateId
     */
    public void setTemplateId(java.lang.String templateId) {
        this.templateId = templateId;
    }


    /**
     * Gets the title value for this JournalArticleSoap.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this JournalArticleSoap.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this JournalArticleSoap.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this JournalArticleSoap.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the urlTitle value for this JournalArticleSoap.
     * 
     * @return urlTitle
     */
    public java.lang.String getUrlTitle() {
        return urlTitle;
    }


    /**
     * Sets the urlTitle value for this JournalArticleSoap.
     * 
     * @param urlTitle
     */
    public void setUrlTitle(java.lang.String urlTitle) {
        this.urlTitle = urlTitle;
    }


    /**
     * Gets the userId value for this JournalArticleSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this JournalArticleSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this JournalArticleSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this JournalArticleSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the uuid value for this JournalArticleSoap.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this JournalArticleSoap.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the version value for this JournalArticleSoap.
     * 
     * @return version
     */
    public double getVersion() {
        return version;
    }


    /**
     * Sets the version value for this JournalArticleSoap.
     * 
     * @param version
     */
    public void setVersion(double version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JournalArticleSoap)) return false;
        JournalArticleSoap other = (JournalArticleSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.approved == other.isApproved() &&
            this.approvedByUserId == other.getApprovedByUserId() &&
            ((this.approvedByUserName==null && other.getApprovedByUserName()==null) || 
             (this.approvedByUserName!=null &&
              this.approvedByUserName.equals(other.getApprovedByUserName()))) &&
            ((this.approvedDate==null && other.getApprovedDate()==null) || 
             (this.approvedDate!=null &&
              this.approvedDate.equals(other.getApprovedDate()))) &&
            ((this.articleId==null && other.getArticleId()==null) || 
             (this.articleId!=null &&
              this.articleId.equals(other.getArticleId()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displayDate==null && other.getDisplayDate()==null) || 
             (this.displayDate!=null &&
              this.displayDate.equals(other.getDisplayDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            this.expired == other.isExpired() &&
            this.groupId == other.getGroupId() &&
            this.id == other.getId() &&
            this.indexable == other.isIndexable() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            this.resourcePrimKey == other.getResourcePrimKey() &&
            ((this.reviewDate==null && other.getReviewDate()==null) || 
             (this.reviewDate!=null &&
              this.reviewDate.equals(other.getReviewDate()))) &&
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
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.urlTitle==null && other.getUrlTitle()==null) || 
             (this.urlTitle!=null &&
              this.urlTitle.equals(other.getUrlTitle()))) &&
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
        _hashCode += (isApproved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getApprovedByUserId()).hashCode();
        if (getApprovedByUserName() != null) {
            _hashCode += getApprovedByUserName().hashCode();
        }
        if (getApprovedDate() != null) {
            _hashCode += getApprovedDate().hashCode();
        }
        if (getArticleId() != null) {
            _hashCode += getArticleId().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplayDate() != null) {
            _hashCode += getDisplayDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        _hashCode += (isExpired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getGroupId()).hashCode();
        _hashCode += new Long(getId()).hashCode();
        _hashCode += (isIndexable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += new Long(getResourcePrimKey()).hashCode();
        if (getReviewDate() != null) {
            _hashCode += getReviewDate().hashCode();
        }
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUrlTitle() != null) {
            _hashCode += getUrlTitle().hashCode();
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
        new org.apache.axis.description.TypeDesc(JournalArticleSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.journal.portlet.liferay.com", "JournalArticleSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedByUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvedByUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedByUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvedByUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "articleId"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("indexable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indexable"));
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
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePrimKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourcePrimKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reviewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
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
        elemField.setFieldName("urlTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlTitle"));
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
