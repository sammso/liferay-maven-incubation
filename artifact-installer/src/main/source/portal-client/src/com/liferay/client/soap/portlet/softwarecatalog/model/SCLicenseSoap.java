/**
 * SCLicenseSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.softwarecatalog.model;

public class SCLicenseSoap  implements java.io.Serializable {
    private boolean active;

    private long licenseId;

    private java.lang.String name;

    private boolean openSource;

    private long primaryKey;

    private boolean recommended;

    private java.lang.String url;

    public SCLicenseSoap() {
    }

    public SCLicenseSoap(
           boolean active,
           long licenseId,
           java.lang.String name,
           boolean openSource,
           long primaryKey,
           boolean recommended,
           java.lang.String url) {
           this.active = active;
           this.licenseId = licenseId;
           this.name = name;
           this.openSource = openSource;
           this.primaryKey = primaryKey;
           this.recommended = recommended;
           this.url = url;
    }


    /**
     * Gets the active value for this SCLicenseSoap.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this SCLicenseSoap.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the licenseId value for this SCLicenseSoap.
     * 
     * @return licenseId
     */
    public long getLicenseId() {
        return licenseId;
    }


    /**
     * Sets the licenseId value for this SCLicenseSoap.
     * 
     * @param licenseId
     */
    public void setLicenseId(long licenseId) {
        this.licenseId = licenseId;
    }


    /**
     * Gets the name value for this SCLicenseSoap.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SCLicenseSoap.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the openSource value for this SCLicenseSoap.
     * 
     * @return openSource
     */
    public boolean isOpenSource() {
        return openSource;
    }


    /**
     * Sets the openSource value for this SCLicenseSoap.
     * 
     * @param openSource
     */
    public void setOpenSource(boolean openSource) {
        this.openSource = openSource;
    }


    /**
     * Gets the primaryKey value for this SCLicenseSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this SCLicenseSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the recommended value for this SCLicenseSoap.
     * 
     * @return recommended
     */
    public boolean isRecommended() {
        return recommended;
    }


    /**
     * Sets the recommended value for this SCLicenseSoap.
     * 
     * @param recommended
     */
    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }


    /**
     * Gets the url value for this SCLicenseSoap.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this SCLicenseSoap.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCLicenseSoap)) return false;
        SCLicenseSoap other = (SCLicenseSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            this.licenseId == other.getLicenseId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.openSource == other.isOpenSource() &&
            this.primaryKey == other.getPrimaryKey() &&
            this.recommended == other.isRecommended() &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getLicenseId()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isOpenSource() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += (isRecommended() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCLicenseSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.softwarecatalog.portlet.liferay.com", "SCLicenseSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "licenseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommended");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recommended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
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
