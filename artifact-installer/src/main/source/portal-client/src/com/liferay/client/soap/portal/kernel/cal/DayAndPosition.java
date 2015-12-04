/**
 * DayAndPosition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.kernel.cal;

public class DayAndPosition  implements java.io.Serializable {
    private int dayOfWeek;

    private int dayPosition;

    public DayAndPosition() {
    }

    public DayAndPosition(
           int dayOfWeek,
           int dayPosition) {
           this.dayOfWeek = dayOfWeek;
           this.dayPosition = dayPosition;
    }


    /**
     * Gets the dayOfWeek value for this DayAndPosition.
     * 
     * @return dayOfWeek
     */
    public int getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this DayAndPosition.
     * 
     * @param dayOfWeek
     */
    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the dayPosition value for this DayAndPosition.
     * 
     * @return dayPosition
     */
    public int getDayPosition() {
        return dayPosition;
    }


    /**
     * Sets the dayPosition value for this DayAndPosition.
     * 
     * @param dayPosition
     */
    public void setDayPosition(int dayPosition) {
        this.dayPosition = dayPosition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DayAndPosition)) return false;
        DayAndPosition other = (DayAndPosition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dayOfWeek == other.getDayOfWeek() &&
            this.dayPosition == other.getDayPosition();
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
        _hashCode += getDayOfWeek();
        _hashCode += getDayPosition();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DayAndPosition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cal.kernel.portal.liferay.com", "DayAndPosition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
