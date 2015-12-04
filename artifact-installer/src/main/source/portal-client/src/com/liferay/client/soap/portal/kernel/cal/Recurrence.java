/**
 * Recurrence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portal.kernel.cal;

public class Recurrence  implements java.io.Serializable {
    private com.liferay.client.soap.portal.kernel.cal.DayAndPosition[] byDay;

    private int[] byMonth;

    private int[] byMonthDay;

    private int[] byWeekNo;

    private int[] byYearDay;

    private java.util.Calendar dtEnd;

    private java.util.Calendar dtStart;

    private com.liferay.client.soap.portal.kernel.cal.Duration duration;

    private int frequency;

    private int interval;

    private int occurrence;

    private java.util.Calendar until;

    private int weekStart;

    public Recurrence() {
    }

    public Recurrence(
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
           int weekStart) {
           this.byDay = byDay;
           this.byMonth = byMonth;
           this.byMonthDay = byMonthDay;
           this.byWeekNo = byWeekNo;
           this.byYearDay = byYearDay;
           this.dtEnd = dtEnd;
           this.dtStart = dtStart;
           this.duration = duration;
           this.frequency = frequency;
           this.interval = interval;
           this.occurrence = occurrence;
           this.until = until;
           this.weekStart = weekStart;
    }


    /**
     * Gets the byDay value for this Recurrence.
     * 
     * @return byDay
     */
    public com.liferay.client.soap.portal.kernel.cal.DayAndPosition[] getByDay() {
        return byDay;
    }


    /**
     * Sets the byDay value for this Recurrence.
     * 
     * @param byDay
     */
    public void setByDay(com.liferay.client.soap.portal.kernel.cal.DayAndPosition[] byDay) {
        this.byDay = byDay;
    }


    /**
     * Gets the byMonth value for this Recurrence.
     * 
     * @return byMonth
     */
    public int[] getByMonth() {
        return byMonth;
    }


    /**
     * Sets the byMonth value for this Recurrence.
     * 
     * @param byMonth
     */
    public void setByMonth(int[] byMonth) {
        this.byMonth = byMonth;
    }


    /**
     * Gets the byMonthDay value for this Recurrence.
     * 
     * @return byMonthDay
     */
    public int[] getByMonthDay() {
        return byMonthDay;
    }


    /**
     * Sets the byMonthDay value for this Recurrence.
     * 
     * @param byMonthDay
     */
    public void setByMonthDay(int[] byMonthDay) {
        this.byMonthDay = byMonthDay;
    }


    /**
     * Gets the byWeekNo value for this Recurrence.
     * 
     * @return byWeekNo
     */
    public int[] getByWeekNo() {
        return byWeekNo;
    }


    /**
     * Sets the byWeekNo value for this Recurrence.
     * 
     * @param byWeekNo
     */
    public void setByWeekNo(int[] byWeekNo) {
        this.byWeekNo = byWeekNo;
    }


    /**
     * Gets the byYearDay value for this Recurrence.
     * 
     * @return byYearDay
     */
    public int[] getByYearDay() {
        return byYearDay;
    }


    /**
     * Sets the byYearDay value for this Recurrence.
     * 
     * @param byYearDay
     */
    public void setByYearDay(int[] byYearDay) {
        this.byYearDay = byYearDay;
    }


    /**
     * Gets the dtEnd value for this Recurrence.
     * 
     * @return dtEnd
     */
    public java.util.Calendar getDtEnd() {
        return dtEnd;
    }


    /**
     * Sets the dtEnd value for this Recurrence.
     * 
     * @param dtEnd
     */
    public void setDtEnd(java.util.Calendar dtEnd) {
        this.dtEnd = dtEnd;
    }


    /**
     * Gets the dtStart value for this Recurrence.
     * 
     * @return dtStart
     */
    public java.util.Calendar getDtStart() {
        return dtStart;
    }


    /**
     * Sets the dtStart value for this Recurrence.
     * 
     * @param dtStart
     */
    public void setDtStart(java.util.Calendar dtStart) {
        this.dtStart = dtStart;
    }


    /**
     * Gets the duration value for this Recurrence.
     * 
     * @return duration
     */
    public com.liferay.client.soap.portal.kernel.cal.Duration getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this Recurrence.
     * 
     * @param duration
     */
    public void setDuration(com.liferay.client.soap.portal.kernel.cal.Duration duration) {
        this.duration = duration;
    }


    /**
     * Gets the frequency value for this Recurrence.
     * 
     * @return frequency
     */
    public int getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this Recurrence.
     * 
     * @param frequency
     */
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the interval value for this Recurrence.
     * 
     * @return interval
     */
    public int getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this Recurrence.
     * 
     * @param interval
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }


    /**
     * Gets the occurrence value for this Recurrence.
     * 
     * @return occurrence
     */
    public int getOccurrence() {
        return occurrence;
    }


    /**
     * Sets the occurrence value for this Recurrence.
     * 
     * @param occurrence
     */
    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }


    /**
     * Gets the until value for this Recurrence.
     * 
     * @return until
     */
    public java.util.Calendar getUntil() {
        return until;
    }


    /**
     * Sets the until value for this Recurrence.
     * 
     * @param until
     */
    public void setUntil(java.util.Calendar until) {
        this.until = until;
    }


    /**
     * Gets the weekStart value for this Recurrence.
     * 
     * @return weekStart
     */
    public int getWeekStart() {
        return weekStart;
    }


    /**
     * Sets the weekStart value for this Recurrence.
     * 
     * @param weekStart
     */
    public void setWeekStart(int weekStart) {
        this.weekStart = weekStart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Recurrence)) return false;
        Recurrence other = (Recurrence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.byDay==null && other.getByDay()==null) || 
             (this.byDay!=null &&
              java.util.Arrays.equals(this.byDay, other.getByDay()))) &&
            ((this.byMonth==null && other.getByMonth()==null) || 
             (this.byMonth!=null &&
              java.util.Arrays.equals(this.byMonth, other.getByMonth()))) &&
            ((this.byMonthDay==null && other.getByMonthDay()==null) || 
             (this.byMonthDay!=null &&
              java.util.Arrays.equals(this.byMonthDay, other.getByMonthDay()))) &&
            ((this.byWeekNo==null && other.getByWeekNo()==null) || 
             (this.byWeekNo!=null &&
              java.util.Arrays.equals(this.byWeekNo, other.getByWeekNo()))) &&
            ((this.byYearDay==null && other.getByYearDay()==null) || 
             (this.byYearDay!=null &&
              java.util.Arrays.equals(this.byYearDay, other.getByYearDay()))) &&
            ((this.dtEnd==null && other.getDtEnd()==null) || 
             (this.dtEnd!=null &&
              this.dtEnd.equals(other.getDtEnd()))) &&
            ((this.dtStart==null && other.getDtStart()==null) || 
             (this.dtStart!=null &&
              this.dtStart.equals(other.getDtStart()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            this.frequency == other.getFrequency() &&
            this.interval == other.getInterval() &&
            this.occurrence == other.getOccurrence() &&
            ((this.until==null && other.getUntil()==null) || 
             (this.until!=null &&
              this.until.equals(other.getUntil()))) &&
            this.weekStart == other.getWeekStart();
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
        if (getByDay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getByDay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getByDay(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getByMonth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getByMonth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getByMonth(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getByMonthDay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getByMonthDay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getByMonthDay(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getByWeekNo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getByWeekNo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getByWeekNo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getByYearDay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getByYearDay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getByYearDay(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDtEnd() != null) {
            _hashCode += getDtEnd().hashCode();
        }
        if (getDtStart() != null) {
            _hashCode += getDtStart().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        _hashCode += getFrequency();
        _hashCode += getInterval();
        _hashCode += getOccurrence();
        if (getUntil() != null) {
            _hashCode += getUntil().hashCode();
        }
        _hashCode += getWeekStart();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Recurrence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cal.kernel.portal.liferay.com", "Recurrence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cal.kernel.portal.liferay.com", "DayAndPosition"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byMonthDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byMonthDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byWeekNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byWeekNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byYearDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byYearDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cal.kernel.portal.liferay.com", "Duration"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "occurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("until");
        elemField.setXmlName(new javax.xml.namespace.QName("", "until"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weekStart"));
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
