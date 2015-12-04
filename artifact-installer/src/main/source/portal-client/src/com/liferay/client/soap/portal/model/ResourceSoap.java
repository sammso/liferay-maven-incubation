/**
 * ResourceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.model;

public class ResourceSoap  implements java.io.Serializable {
    private long codeId;

    private java.lang.String primKey;

    private long primaryKey;

    private long resourceId;

    public ResourceSoap() {
    }

    public ResourceSoap(
           long codeId,
           java.lang.String primKey,
           long primaryKey,
           long resourceId) {
           this.codeId = codeId;
           this.primKey = primKey;
           this.primaryKey = primaryKey;
           this.resourceId = resourceId;
    }


    /**
     * Gets the codeId value for this ResourceSoap.
     * 
     * @return codeId
     */
    public long getCodeId() {
        return codeId;
    }


    /**
     * Sets the codeId value for this ResourceSoap.
     * 
     * @param codeId
     */
    public void setCodeId(long codeId) {
        this.codeId = codeId;
    }


    /**
     * Gets the primKey value for this ResourceSoap.
     * 
     * @return primKey
     */
    public java.lang.String getPrimKey() {
        return primKey;
    }


    /**
     * Sets the primKey value for this ResourceSoap.
     * 
     * @param primKey
     */
    public void setPrimKey(java.lang.String primKey) {
        this.primKey = primKey;
    }


    /**
     * Gets the primaryKey value for this ResourceSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this ResourceSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the resourceId value for this ResourceSoap.
     * 
     * @return resourceId
     */
    public long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this ResourceSoap.
     * 
     * @param resourceId
     */
    public void setResourceId(long resourceId) {
        this.resourceId = resourceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceSoap)) return false;
        ResourceSoap other = (ResourceSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codeId == other.getCodeId() &&
            ((this.primKey==null && other.getPrimKey()==null) || 
             (this.primKey!=null &&
              this.primKey.equals(other.getPrimKey()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            this.resourceId == other.getResourceId();
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
        _hashCode += new Long(getCodeId()).hashCode();
        if (getPrimKey() != null) {
            _hashCode += getPrimKey().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += new Long(getResourceId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.portal.liferay.com", "ResourceSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primKey"));
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
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
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
