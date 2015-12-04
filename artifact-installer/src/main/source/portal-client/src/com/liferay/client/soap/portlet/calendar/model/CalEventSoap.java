/**
 * CalEventSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.calendar.model;

public class CalEventSoap  implements java.io.Serializable {
    private boolean allDay;

    private long companyId;

    private java.util.Calendar createDate;

    private java.lang.String description;

    private int durationHour;

    private int durationMinute;

    private java.util.Calendar endDate;

    private long eventId;

    private int firstReminder;

    private long groupId;

    private java.util.Calendar modifiedDate;

    private long primaryKey;

    private java.lang.String recurrence;

    private int remindBy;

    private boolean repeating;

    private int secondReminder;

    private java.util.Calendar startDate;

    private boolean timeZoneSensitive;

    private java.lang.String title;

    private java.lang.String type;

    private long userId;

    private java.lang.String userName;

    private java.lang.String uuid;

    public CalEventSoap() {
    }

    public CalEventSoap(
           boolean allDay,
           long companyId,
           java.util.Calendar createDate,
           java.lang.String description,
           int durationHour,
           int durationMinute,
           java.util.Calendar endDate,
           long eventId,
           int firstReminder,
           long groupId,
           java.util.Calendar modifiedDate,
           long primaryKey,
           java.lang.String recurrence,
           int remindBy,
           boolean repeating,
           int secondReminder,
           java.util.Calendar startDate,
           boolean timeZoneSensitive,
           java.lang.String title,
           java.lang.String type,
           long userId,
           java.lang.String userName,
           java.lang.String uuid) {
           this.allDay = allDay;
           this.companyId = companyId;
           this.createDate = createDate;
           this.description = description;
           this.durationHour = durationHour;
           this.durationMinute = durationMinute;
           this.endDate = endDate;
           this.eventId = eventId;
           this.firstReminder = firstReminder;
           this.groupId = groupId;
           this.modifiedDate = modifiedDate;
           this.primaryKey = primaryKey;
           this.recurrence = recurrence;
           this.remindBy = remindBy;
           this.repeating = repeating;
           this.secondReminder = secondReminder;
           this.startDate = startDate;
           this.timeZoneSensitive = timeZoneSensitive;
           this.title = title;
           this.type = type;
           this.userId = userId;
           this.userName = userName;
           this.uuid = uuid;
    }


    /**
     * Gets the allDay value for this CalEventSoap.
     * 
     * @return allDay
     */
    public boolean isAllDay() {
        return allDay;
    }


    /**
     * Sets the allDay value for this CalEventSoap.
     * 
     * @param allDay
     */
    public void setAllDay(boolean allDay) {
        this.allDay = allDay;
    }


    /**
     * Gets the companyId value for this CalEventSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this CalEventSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the createDate value for this CalEventSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this CalEventSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the description value for this CalEventSoap.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CalEventSoap.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the durationHour value for this CalEventSoap.
     * 
     * @return durationHour
     */
    public int getDurationHour() {
        return durationHour;
    }


    /**
     * Sets the durationHour value for this CalEventSoap.
     * 
     * @param durationHour
     */
    public void setDurationHour(int durationHour) {
        this.durationHour = durationHour;
    }


    /**
     * Gets the durationMinute value for this CalEventSoap.
     * 
     * @return durationMinute
     */
    public int getDurationMinute() {
        return durationMinute;
    }


    /**
     * Sets the durationMinute value for this CalEventSoap.
     * 
     * @param durationMinute
     */
    public void setDurationMinute(int durationMinute) {
        this.durationMinute = durationMinute;
    }


    /**
     * Gets the endDate value for this CalEventSoap.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CalEventSoap.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the eventId value for this CalEventSoap.
     * 
     * @return eventId
     */
    public long getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this CalEventSoap.
     * 
     * @param eventId
     */
    public void setEventId(long eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the firstReminder value for this CalEventSoap.
     * 
     * @return firstReminder
     */
    public int getFirstReminder() {
        return firstReminder;
    }


    /**
     * Sets the firstReminder value for this CalEventSoap.
     * 
     * @param firstReminder
     */
    public void setFirstReminder(int firstReminder) {
        this.firstReminder = firstReminder;
    }


    /**
     * Gets the groupId value for this CalEventSoap.
     * 
     * @return groupId
     */
    public long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this CalEventSoap.
     * 
     * @param groupId
     */
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the modifiedDate value for this CalEventSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this CalEventSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the primaryKey value for this CalEventSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this CalEventSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the recurrence value for this CalEventSoap.
     * 
     * @return recurrence
     */
    public java.lang.String getRecurrence() {
        return recurrence;
    }


    /**
     * Sets the recurrence value for this CalEventSoap.
     * 
     * @param recurrence
     */
    public void setRecurrence(java.lang.String recurrence) {
        this.recurrence = recurrence;
    }


    /**
     * Gets the remindBy value for this CalEventSoap.
     * 
     * @return remindBy
     */
    public int getRemindBy() {
        return remindBy;
    }


    /**
     * Sets the remindBy value for this CalEventSoap.
     * 
     * @param remindBy
     */
    public void setRemindBy(int remindBy) {
        this.remindBy = remindBy;
    }


    /**
     * Gets the repeating value for this CalEventSoap.
     * 
     * @return repeating
     */
    public boolean isRepeating() {
        return repeating;
    }


    /**
     * Sets the repeating value for this CalEventSoap.
     * 
     * @param repeating
     */
    public void setRepeating(boolean repeating) {
        this.repeating = repeating;
    }


    /**
     * Gets the secondReminder value for this CalEventSoap.
     * 
     * @return secondReminder
     */
    public int getSecondReminder() {
        return secondReminder;
    }


    /**
     * Sets the secondReminder value for this CalEventSoap.
     * 
     * @param secondReminder
     */
    public void setSecondReminder(int secondReminder) {
        this.secondReminder = secondReminder;
    }


    /**
     * Gets the startDate value for this CalEventSoap.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CalEventSoap.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the timeZoneSensitive value for this CalEventSoap.
     * 
     * @return timeZoneSensitive
     */
    public boolean isTimeZoneSensitive() {
        return timeZoneSensitive;
    }


    /**
     * Sets the timeZoneSensitive value for this CalEventSoap.
     * 
     * @param timeZoneSensitive
     */
    public void setTimeZoneSensitive(boolean timeZoneSensitive) {
        this.timeZoneSensitive = timeZoneSensitive;
    }


    /**
     * Gets the title value for this CalEventSoap.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CalEventSoap.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this CalEventSoap.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CalEventSoap.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the userId value for this CalEventSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this CalEventSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this CalEventSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this CalEventSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the uuid value for this CalEventSoap.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this CalEventSoap.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalEventSoap)) return false;
        CalEventSoap other = (CalEventSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allDay == other.isAllDay() &&
            this.companyId == other.getCompanyId() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.durationHour == other.getDurationHour() &&
            this.durationMinute == other.getDurationMinute() &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            this.eventId == other.getEventId() &&
            this.firstReminder == other.getFirstReminder() &&
            this.groupId == other.getGroupId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            ((this.recurrence==null && other.getRecurrence()==null) || 
             (this.recurrence!=null &&
              this.recurrence.equals(other.getRecurrence()))) &&
            this.remindBy == other.getRemindBy() &&
            this.repeating == other.isRepeating() &&
            this.secondReminder == other.getSecondReminder() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            this.timeZoneSensitive == other.isTimeZoneSensitive() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid())));
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
        _hashCode += (isAllDay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getDurationHour();
        _hashCode += getDurationMinute();
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        _hashCode += new Long(getEventId()).hashCode();
        _hashCode += getFirstReminder();
        _hashCode += new Long(getGroupId()).hashCode();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        if (getRecurrence() != null) {
            _hashCode += getRecurrence().hashCode();
        }
        _hashCode += getRemindBy();
        _hashCode += (isRepeating() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getSecondReminder();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        _hashCode += (isTimeZoneSensitive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalEventSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.calendar.portlet.liferay.com", "CalEventSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allDay"));
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
        elemField.setFieldName("durationHour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "durationHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "durationMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstReminder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstReminder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("recurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remindBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remindBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeating");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondReminder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondReminder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneSensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZoneSensitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
