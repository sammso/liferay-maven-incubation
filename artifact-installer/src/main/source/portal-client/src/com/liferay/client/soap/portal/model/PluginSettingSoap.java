/**
 * PluginSettingSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.model;

public class PluginSettingSoap  implements java.io.Serializable {
    private boolean active;

    private long companyId;

    private java.lang.String pluginId;

    private long pluginSettingId;

    private java.lang.String pluginType;

    private long primaryKey;

    private java.lang.String roles;

    public PluginSettingSoap() {
    }

    public PluginSettingSoap(
           boolean active,
           long companyId,
           java.lang.String pluginId,
           long pluginSettingId,
           java.lang.String pluginType,
           long primaryKey,
           java.lang.String roles) {
           this.active = active;
           this.companyId = companyId;
           this.pluginId = pluginId;
           this.pluginSettingId = pluginSettingId;
           this.pluginType = pluginType;
           this.primaryKey = primaryKey;
           this.roles = roles;
    }


    /**
     * Gets the active value for this PluginSettingSoap.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this PluginSettingSoap.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the companyId value for this PluginSettingSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this PluginSettingSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the pluginId value for this PluginSettingSoap.
     * 
     * @return pluginId
     */
    public java.lang.String getPluginId() {
        return pluginId;
    }


    /**
     * Sets the pluginId value for this PluginSettingSoap.
     * 
     * @param pluginId
     */
    public void setPluginId(java.lang.String pluginId) {
        this.pluginId = pluginId;
    }


    /**
     * Gets the pluginSettingId value for this PluginSettingSoap.
     * 
     * @return pluginSettingId
     */
    public long getPluginSettingId() {
        return pluginSettingId;
    }


    /**
     * Sets the pluginSettingId value for this PluginSettingSoap.
     * 
     * @param pluginSettingId
     */
    public void setPluginSettingId(long pluginSettingId) {
        this.pluginSettingId = pluginSettingId;
    }


    /**
     * Gets the pluginType value for this PluginSettingSoap.
     * 
     * @return pluginType
     */
    public java.lang.String getPluginType() {
        return pluginType;
    }


    /**
     * Sets the pluginType value for this PluginSettingSoap.
     * 
     * @param pluginType
     */
    public void setPluginType(java.lang.String pluginType) {
        this.pluginType = pluginType;
    }


    /**
     * Gets the primaryKey value for this PluginSettingSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this PluginSettingSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the roles value for this PluginSettingSoap.
     * 
     * @return roles
     */
    public java.lang.String getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this PluginSettingSoap.
     * 
     * @param roles
     */
    public void setRoles(java.lang.String roles) {
        this.roles = roles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PluginSettingSoap)) return false;
        PluginSettingSoap other = (PluginSettingSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            this.companyId == other.getCompanyId() &&
            ((this.pluginId==null && other.getPluginId()==null) || 
             (this.pluginId!=null &&
              this.pluginId.equals(other.getPluginId()))) &&
            this.pluginSettingId == other.getPluginSettingId() &&
            ((this.pluginType==null && other.getPluginType()==null) || 
             (this.pluginType!=null &&
              this.pluginType.equals(other.getPluginType()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              this.roles.equals(other.getRoles())));
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
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getPluginId() != null) {
            _hashCode += getPluginId().hashCode();
        }
        _hashCode += new Long(getPluginSettingId()).hashCode();
        if (getPluginType() != null) {
            _hashCode += getPluginType().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        if (getRoles() != null) {
            _hashCode += getRoles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PluginSettingSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.portal.liferay.com", "PluginSettingSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
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
        elemField.setFieldName("pluginId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pluginId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginSettingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pluginSettingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pluginType"));
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
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roles"));
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
