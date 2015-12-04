/**
 * TZSRecurrence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.kernel.cal;

public class TZSRecurrence  extends com.liferay.client.soap.portal.kernel.cal.Recurrence  implements java.io.Serializable {
    private java.lang.Object timeZone;

    public TZSRecurrence() {
    }

    public TZSRecurrence(
           com.liferay.client.soap.portal.kernel.cal.DayAndPosition[] byDay,
           int[] byMonth,
           int[] byMonthDay,
           int[] byWeekNo,
           int[] byYearDay,
           java.util.Calendar dtEnd,
           java.util.Calendar dtStart,
           com.liferay.client.soap.portal.kernel.cal.Duration duration,
           int frequency,
           int interval,
           int occurrence,
           java.util.Calendar until,
           int weekStart,
           java.lang.Object timeZone) {
        super(
            byDay,
            byMonth,
            byMonthDay,
            byWeekNo,
            byYearDay,
            dtEnd,
            dtStart,
            duration,
            frequency,
            interval,
            occurrence,
            until,
            weekStart);
        this.timeZone = timeZone;
    }


    /**
     * Gets the timeZone value for this TZSRecurrence.
     * 
     * @return timeZone
     */
    public java.lang.Object getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this TZSRecurrence.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.Object timeZone) {
        this.timeZone = timeZone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TZSRecurrence)) return false;
        TZSRecurrence other = (TZSRecurrence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TZSRecurrence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cal.kernel.portal.liferay.com", "TZSRecurrence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
