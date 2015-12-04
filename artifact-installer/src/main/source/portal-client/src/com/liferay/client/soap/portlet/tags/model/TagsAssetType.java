/**
 * TagsAssetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.tags.model;

public class TagsAssetType  implements java.io.Serializable {
    private java.lang.String className;

    private long classNameId;

    private java.lang.String portletId;

    private java.lang.String portletTitle;

    public TagsAssetType() {
    }

    public TagsAssetType(
           java.lang.String className,
           long classNameId,
           java.lang.String portletId,
           java.lang.String portletTitle) {
           this.className = className;
           this.classNameId = classNameId;
           this.portletId = portletId;
           this.portletTitle = portletTitle;
    }


    /**
     * Gets the className value for this TagsAssetType.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this TagsAssetType.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the classNameId value for this TagsAssetType.
     * 
     * @return classNameId
     */
    public long getClassNameId() {
        return classNameId;
    }


    /**
     * Sets the classNameId value for this TagsAssetType.
     * 
     * @param classNameId
     */
    public void setClassNameId(long classNameId) {
        this.classNameId = classNameId;
    }


    /**
     * Gets the portletId value for this TagsAssetType.
     * 
     * @return portletId
     */
    public java.lang.String getPortletId() {
        return portletId;
    }


    /**
     * Sets the portletId value for this TagsAssetType.
     * 
     * @param portletId
     */
    public void setPortletId(java.lang.String portletId) {
        this.portletId = portletId;
    }


    /**
     * Gets the portletTitle value for this TagsAssetType.
     * 
     * @return portletTitle
     */
    public java.lang.String getPortletTitle() {
        return portletTitle;
    }


    /**
     * Sets the portletTitle value for this TagsAssetType.
     * 
     * @param portletTitle
     */
    public void setPortletTitle(java.lang.String portletTitle) {
        this.portletTitle = portletTitle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TagsAssetType)) return false;
        TagsAssetType other = (TagsAssetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.className==null && other.getClassName()==null) || 
             (this.className!=null &&
              this.className.equals(other.getClassName()))) &&
            this.classNameId == other.getClassNameId() &&
            ((this.portletId==null && other.getPortletId()==null) || 
             (this.portletId!=null &&
              this.portletId.equals(other.getPortletId()))) &&
            ((this.portletTitle==null && other.getPortletTitle()==null) || 
             (this.portletTitle!=null &&
              this.portletTitle.equals(other.getPortletTitle())));
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
        if (getClassName() != null) {
            _hashCode += getClassName().hashCode();
        }
        _hashCode += new Long(getClassNameId()).hashCode();
        if (getPortletId() != null) {
            _hashCode += getPortletId().hashCode();
        }
        if (getPortletTitle() != null) {
            _hashCode += getPortletTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TagsAssetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.tags.portlet.liferay.com", "TagsAssetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("className");
        elemField.setXmlName(new javax.xml.namespace.QName("", "className"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classNameId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classNameId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portletTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portletTitle"));
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
