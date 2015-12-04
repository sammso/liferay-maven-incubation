/**
 * ShoppingItemSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.shopping.model;

public class ShoppingItemSoap  implements java.io.Serializable {
    private long categoryId;

    private long companyId;

    private java.util.Calendar createDate;

    private java.lang.String description;

    private double discount;

    private boolean featured;

    private boolean fields;

    private java.lang.String fieldsQuantities;

    private long itemId;

    private boolean largeImage;

    private long largeImageId;

    private java.lang.String largeImageURL;

    private int maxQuantity;

    private boolean mediumImage;

    private long mediumImageId;

    private java.lang.String mediumImageURL;

    private int minQuantity;

    private java.util.Calendar modifiedDate;

    private java.lang.String name;

    private double price;

    private long primaryKey;

    private java.lang.String properties;

    private boolean requiresShipping;

    private boolean sale;

    private double shipping;

    private java.lang.String sku;

    private boolean smallImage;

    private long smallImageId;

    private java.lang.String smallImageURL;

    private int stockQuantity;

    private boolean taxable;

    private boolean useShippingFormula;

    private long userId;

    private java.lang.String userName;

    public ShoppingItemSoap() {
    }

    public ShoppingItemSoap(
           long categoryId,
           long companyId,
           java.util.Calendar createDate,
           java.lang.String description,
           double discount,
           boolean featured,
           boolean fields,
           java.lang.String fieldsQuantities,
           long itemId,
           boolean largeImage,
           long largeImageId,
           java.lang.String largeImageURL,
           int maxQuantity,
           boolean mediumImage,
           long mediumImageId,
           java.lang.String mediumImageURL,
           int minQuantity,
           java.util.Calendar modifiedDate,
           java.lang.String name,
           double price,
           long primaryKey,
           java.lang.String properties,
           boolean requiresShipping,
           boolean sale,
           double shipping,
           java.lang.String sku,
           boolean smallImage,
           long smallImageId,
           java.lang.String smallImageURL,
           int stockQuantity,
           boolean taxable,
           boolean useShippingFormula,
           long userId,
           java.lang.String userName) {
           this.categoryId = categoryId;
           this.companyId = companyId;
           this.createDate = createDate;
           this.description = description;
           this.discount = discount;
           this.featured = featured;
           this.fields = fields;
           this.fieldsQuantities = fieldsQuantities;
           this.itemId = itemId;
           this.largeImage = largeImage;
           this.largeImageId = largeImageId;
           this.largeImageURL = largeImageURL;
           this.maxQuantity = maxQuantity;
           this.mediumImage = mediumImage;
           this.mediumImageId = mediumImageId;
           this.mediumImageURL = mediumImageURL;
           this.minQuantity = minQuantity;
           this.modifiedDate = modifiedDate;
           this.name = name;
           this.price = price;
           this.primaryKey = primaryKey;
           this.properties = properties;
           this.requiresShipping = requiresShipping;
           this.sale = sale;
           this.shipping = shipping;
           this.sku = sku;
           this.smallImage = smallImage;
           this.smallImageId = smallImageId;
           this.smallImageURL = smallImageURL;
           this.stockQuantity = stockQuantity;
           this.taxable = taxable;
           this.useShippingFormula = useShippingFormula;
           this.userId = userId;
           this.userName = userName;
    }


    /**
     * Gets the categoryId value for this ShoppingItemSoap.
     * 
     * @return categoryId
     */
    public long getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this ShoppingItemSoap.
     * 
     * @param categoryId
     */
    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the companyId value for this ShoppingItemSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ShoppingItemSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the createDate value for this ShoppingItemSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ShoppingItemSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the description value for this ShoppingItemSoap.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ShoppingItemSoap.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the discount value for this ShoppingItemSoap.
     * 
     * @return discount
     */
    public double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this ShoppingItemSoap.
     * 
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }


    /**
     * Gets the featured value for this ShoppingItemSoap.
     * 
     * @return featured
     */
    public boolean isFeatured() {
        return featured;
    }


    /**
     * Sets the featured value for this ShoppingItemSoap.
     * 
     * @param featured
     */
    public void setFeatured(boolean featured) {
        this.featured = featured;
    }


    /**
     * Gets the fields value for this ShoppingItemSoap.
     * 
     * @return fields
     */
    public boolean isFields() {
        return fields;
    }


    /**
     * Sets the fields value for this ShoppingItemSoap.
     * 
     * @param fields
     */
    public void setFields(boolean fields) {
        this.fields = fields;
    }


    /**
     * Gets the fieldsQuantities value for this ShoppingItemSoap.
     * 
     * @return fieldsQuantities
     */
    public java.lang.String getFieldsQuantities() {
        return fieldsQuantities;
    }


    /**
     * Sets the fieldsQuantities value for this ShoppingItemSoap.
     * 
     * @param fieldsQuantities
     */
    public void setFieldsQuantities(java.lang.String fieldsQuantities) {
        this.fieldsQuantities = fieldsQuantities;
    }


    /**
     * Gets the itemId value for this ShoppingItemSoap.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ShoppingItemSoap.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the largeImage value for this ShoppingItemSoap.
     * 
     * @return largeImage
     */
    public boolean isLargeImage() {
        return largeImage;
    }


    /**
     * Sets the largeImage value for this ShoppingItemSoap.
     * 
     * @param largeImage
     */
    public void setLargeImage(boolean largeImage) {
        this.largeImage = largeImage;
    }


    /**
     * Gets the largeImageId value for this ShoppingItemSoap.
     * 
     * @return largeImageId
     */
    public long getLargeImageId() {
        return largeImageId;
    }


    /**
     * Sets the largeImageId value for this ShoppingItemSoap.
     * 
     * @param largeImageId
     */
    public void setLargeImageId(long largeImageId) {
        this.largeImageId = largeImageId;
    }


    /**
     * Gets the largeImageURL value for this ShoppingItemSoap.
     * 
     * @return largeImageURL
     */
    public java.lang.String getLargeImageURL() {
        return largeImageURL;
    }


    /**
     * Sets the largeImageURL value for this ShoppingItemSoap.
     * 
     * @param largeImageURL
     */
    public void setLargeImageURL(java.lang.String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }


    /**
     * Gets the maxQuantity value for this ShoppingItemSoap.
     * 
     * @return maxQuantity
     */
    public int getMaxQuantity() {
        return maxQuantity;
    }


    /**
     * Sets the maxQuantity value for this ShoppingItemSoap.
     * 
     * @param maxQuantity
     */
    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }


    /**
     * Gets the mediumImage value for this ShoppingItemSoap.
     * 
     * @return mediumImage
     */
    public boolean isMediumImage() {
        return mediumImage;
    }


    /**
     * Sets the mediumImage value for this ShoppingItemSoap.
     * 
     * @param mediumImage
     */
    public void setMediumImage(boolean mediumImage) {
        this.mediumImage = mediumImage;
    }


    /**
     * Gets the mediumImageId value for this ShoppingItemSoap.
     * 
     * @return mediumImageId
     */
    public long getMediumImageId() {
        return mediumImageId;
    }


    /**
     * Sets the mediumImageId value for this ShoppingItemSoap.
     * 
     * @param mediumImageId
     */
    public void setMediumImageId(long mediumImageId) {
        this.mediumImageId = mediumImageId;
    }


    /**
     * Gets the mediumImageURL value for this ShoppingItemSoap.
     * 
     * @return mediumImageURL
     */
    public java.lang.String getMediumImageURL() {
        return mediumImageURL;
    }


    /**
     * Sets the mediumImageURL value for this ShoppingItemSoap.
     * 
     * @param mediumImageURL
     */
    public void setMediumImageURL(java.lang.String mediumImageURL) {
        this.mediumImageURL = mediumImageURL;
    }


    /**
     * Gets the minQuantity value for this ShoppingItemSoap.
     * 
     * @return minQuantity
     */
    public int getMinQuantity() {
        return minQuantity;
    }


    /**
     * Sets the minQuantity value for this ShoppingItemSoap.
     * 
     * @param minQuantity
     */
    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }


    /**
     * Gets the modifiedDate value for this ShoppingItemSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this ShoppingItemSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the name value for this ShoppingItemSoap.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ShoppingItemSoap.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the price value for this ShoppingItemSoap.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ShoppingItemSoap.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Gets the primaryKey value for this ShoppingItemSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this ShoppingItemSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the properties value for this ShoppingItemSoap.
     * 
     * @return properties
     */
    public java.lang.String getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this ShoppingItemSoap.
     * 
     * @param properties
     */
    public void setProperties(java.lang.String properties) {
        this.properties = properties;
    }


    /**
     * Gets the requiresShipping value for this ShoppingItemSoap.
     * 
     * @return requiresShipping
     */
    public boolean isRequiresShipping() {
        return requiresShipping;
    }


    /**
     * Sets the requiresShipping value for this ShoppingItemSoap.
     * 
     * @param requiresShipping
     */
    public void setRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }


    /**
     * Gets the sale value for this ShoppingItemSoap.
     * 
     * @return sale
     */
    public boolean isSale() {
        return sale;
    }


    /**
     * Sets the sale value for this ShoppingItemSoap.
     * 
     * @param sale
     */
    public void setSale(boolean sale) {
        this.sale = sale;
    }


    /**
     * Gets the shipping value for this ShoppingItemSoap.
     * 
     * @return shipping
     */
    public double getShipping() {
        return shipping;
    }


    /**
     * Sets the shipping value for this ShoppingItemSoap.
     * 
     * @param shipping
     */
    public void setShipping(double shipping) {
        this.shipping = shipping;
    }


    /**
     * Gets the sku value for this ShoppingItemSoap.
     * 
     * @return sku
     */
    public java.lang.String getSku() {
        return sku;
    }


    /**
     * Sets the sku value for this ShoppingItemSoap.
     * 
     * @param sku
     */
    public void setSku(java.lang.String sku) {
        this.sku = sku;
    }


    /**
     * Gets the smallImage value for this ShoppingItemSoap.
     * 
     * @return smallImage
     */
    public boolean isSmallImage() {
        return smallImage;
    }


    /**
     * Sets the smallImage value for this ShoppingItemSoap.
     * 
     * @param smallImage
     */
    public void setSmallImage(boolean smallImage) {
        this.smallImage = smallImage;
    }


    /**
     * Gets the smallImageId value for this ShoppingItemSoap.
     * 
     * @return smallImageId
     */
    public long getSmallImageId() {
        return smallImageId;
    }


    /**
     * Sets the smallImageId value for this ShoppingItemSoap.
     * 
     * @param smallImageId
     */
    public void setSmallImageId(long smallImageId) {
        this.smallImageId = smallImageId;
    }


    /**
     * Gets the smallImageURL value for this ShoppingItemSoap.
     * 
     * @return smallImageURL
     */
    public java.lang.String getSmallImageURL() {
        return smallImageURL;
    }


    /**
     * Sets the smallImageURL value for this ShoppingItemSoap.
     * 
     * @param smallImageURL
     */
    public void setSmallImageURL(java.lang.String smallImageURL) {
        this.smallImageURL = smallImageURL;
    }


    /**
     * Gets the stockQuantity value for this ShoppingItemSoap.
     * 
     * @return stockQuantity
     */
    public int getStockQuantity() {
        return stockQuantity;
    }


    /**
     * Sets the stockQuantity value for this ShoppingItemSoap.
     * 
     * @param stockQuantity
     */
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }


    /**
     * Gets the taxable value for this ShoppingItemSoap.
     * 
     * @return taxable
     */
    public boolean isTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this ShoppingItemSoap.
     * 
     * @param taxable
     */
    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }


    /**
     * Gets the useShippingFormula value for this ShoppingItemSoap.
     * 
     * @return useShippingFormula
     */
    public boolean isUseShippingFormula() {
        return useShippingFormula;
    }


    /**
     * Sets the useShippingFormula value for this ShoppingItemSoap.
     * 
     * @param useShippingFormula
     */
    public void setUseShippingFormula(boolean useShippingFormula) {
        this.useShippingFormula = useShippingFormula;
    }


    /**
     * Gets the userId value for this ShoppingItemSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ShoppingItemSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this ShoppingItemSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ShoppingItemSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingItemSoap)) return false;
        ShoppingItemSoap other = (ShoppingItemSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.categoryId == other.getCategoryId() &&
            this.companyId == other.getCompanyId() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.discount == other.getDiscount() &&
            this.featured == other.isFeatured() &&
            this.fields == other.isFields() &&
            ((this.fieldsQuantities==null && other.getFieldsQuantities()==null) || 
             (this.fieldsQuantities!=null &&
              this.fieldsQuantities.equals(other.getFieldsQuantities()))) &&
            this.itemId == other.getItemId() &&
            this.largeImage == other.isLargeImage() &&
            this.largeImageId == other.getLargeImageId() &&
            ((this.largeImageURL==null && other.getLargeImageURL()==null) || 
             (this.largeImageURL!=null &&
              this.largeImageURL.equals(other.getLargeImageURL()))) &&
            this.maxQuantity == other.getMaxQuantity() &&
            this.mediumImage == other.isMediumImage() &&
            this.mediumImageId == other.getMediumImageId() &&
            ((this.mediumImageURL==null && other.getMediumImageURL()==null) || 
             (this.mediumImageURL!=null &&
              this.mediumImageURL.equals(other.getMediumImageURL()))) &&
            this.minQuantity == other.getMinQuantity() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.price == other.getPrice() &&
            this.primaryKey == other.getPrimaryKey() &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              this.properties.equals(other.getProperties()))) &&
            this.requiresShipping == other.isRequiresShipping() &&
            this.sale == other.isSale() &&
            this.shipping == other.getShipping() &&
            ((this.sku==null && other.getSku()==null) || 
             (this.sku!=null &&
              this.sku.equals(other.getSku()))) &&
            this.smallImage == other.isSmallImage() &&
            this.smallImageId == other.getSmallImageId() &&
            ((this.smallImageURL==null && other.getSmallImageURL()==null) || 
             (this.smallImageURL!=null &&
              this.smallImageURL.equals(other.getSmallImageURL()))) &&
            this.stockQuantity == other.getStockQuantity() &&
            this.taxable == other.isTaxable() &&
            this.useShippingFormula == other.isUseShippingFormula() &&
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
        _hashCode += new Long(getCategoryId()).hashCode();
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Double(getDiscount()).hashCode();
        _hashCode += (isFeatured() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFields() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFieldsQuantities() != null) {
            _hashCode += getFieldsQuantities().hashCode();
        }
        _hashCode += new Long(getItemId()).hashCode();
        _hashCode += (isLargeImage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getLargeImageId()).hashCode();
        if (getLargeImageURL() != null) {
            _hashCode += getLargeImageURL().hashCode();
        }
        _hashCode += getMaxQuantity();
        _hashCode += (isMediumImage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getMediumImageId()).hashCode();
        if (getMediumImageURL() != null) {
            _hashCode += getMediumImageURL().hashCode();
        }
        _hashCode += getMinQuantity();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Double(getPrice()).hashCode();
        _hashCode += new Long(getPrimaryKey()).hashCode();
        if (getProperties() != null) {
            _hashCode += getProperties().hashCode();
        }
        _hashCode += (isRequiresShipping() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSale() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getShipping()).hashCode();
        if (getSku() != null) {
            _hashCode += getSku().hashCode();
        }
        _hashCode += (isSmallImage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getSmallImageId()).hashCode();
        if (getSmallImageURL() != null) {
            _hashCode += getSmallImageURL().hashCode();
        }
        _hashCode += getStockQuantity();
        _hashCode += (isTaxable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUseShippingFormula() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingItemSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.shopping.portlet.liferay.com", "ShoppingItemSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featured");
        elemField.setXmlName(new javax.xml.namespace.QName("", "featured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldsQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldsQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "largeImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeImageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "largeImageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeImageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "largeImageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediumImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediumImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediumImageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediumImageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediumImageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediumImageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minQuantity"));
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
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiresShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requiresShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sku");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sku"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("stockQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stockQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useShippingFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useShippingFormula"));
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
