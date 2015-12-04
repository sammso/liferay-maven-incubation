/**
 * LayoutReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.model;

public class LayoutReference  implements java.io.Serializable {
    private com.liferay.client.soap.portal.model.LayoutSoap layoutSoap;

    private java.lang.String portletId;

    public LayoutReference() {
    }

    public LayoutReference(
           com.liferay.client.soap.portal.model.LayoutSoap layoutSoap,
           java.lang.String portletId) {
           this.layoutSoap = layoutSoap;
           this.portletId = portletId;
    }


    /**
     * Gets the layoutSoap value for this LayoutReference.
     * 
     * @return layoutSoap
     */
    public com.liferay.client.soap.portal.model.LayoutSoap getLayoutSoap() {
        return layoutSoap;
    }


    /**
     * Sets the layoutSoap value for this LayoutReference.
     * 
     * @param layoutSoap
     */
    public void setLayoutSoap(com.liferay.client.soap.portal.model.LayoutSoap layoutSoap) {
        this.layoutSoap = layoutSoap;
    }


    /**
     * Gets the portletId value for this LayoutReference.
     * 
     * @return portletId
     */
    public java.lang.String getPortletId() {
        return portletId;
    }


    /**
     * Sets the portletId value for this LayoutReference.
     * 
     * @param portletId
     */
    public void setPortletId(java.lang.String portletId) {
        this.portletId = portletId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LayoutReference)) return false;
        LayoutReference other = (LayoutReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.layoutSoap==null && other.getLayoutSoap()==null) || 
             (this.layoutSoap!=null &&
              this.layoutSoap.equals(other.getLayoutSoap()))) &&
            ((this.portletId==null && other.getPortletId()==null) || 
             (this.portletId!=null &&
              this.portletId.equals(other.getPortletId())));
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
        if (getLayoutSoap() != null) {
            _hashCode += getLayoutSoap().hashCode();
        }
        if (getPortletId() != null) {
            _hashCode += getPortletId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LayoutReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.portal.liferay.com", "LayoutReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutSoap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layoutSoap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.portal.liferay.com", "LayoutSoap"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portletId"));
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
