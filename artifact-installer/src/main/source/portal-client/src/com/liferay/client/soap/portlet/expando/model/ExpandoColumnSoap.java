/**
 * ExpandoColumnSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.expando.model;

public class ExpandoColumnSoap  implements java.io.Serializable {
    private long columnId;

    private long companyId;

    private java.lang.String defaultData;

    private java.lang.String name;

    private long primaryKey;

    private long tableId;

    private int type;

    private java.lang.String typeSettings;

    public ExpandoColumnSoap() {
    }

    public ExpandoColumnSoap(
           long columnId,
           long companyId,
           java.lang.String defaultData,
           java.lang.String name,
           long primaryKey,
           long tableId,
           int type,
           java.lang.String typeSettings) {
           this.columnId = columnId;
           this.companyId = companyId;
           this.defaultData = defaultData;
           this.name = name;
           this.primaryKey = primaryKey;
           this.tableId = tableId;
           this.type = type;
           this.typeSettings = typeSettings;
    }


    /**
     * Gets the columnId value for this ExpandoColumnSoap.
     * 
     * @return columnId
     */
    public long getColumnId() {
        return columnId;
    }


    /**
     * Sets the columnId value for this ExpandoColumnSoap.
     * 
     * @param columnId
     */
    public void setColumnId(long columnId) {
        this.columnId = columnId;
    }


    /**
     * Gets the companyId value for this ExpandoColumnSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ExpandoColumnSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the defaultData value for this ExpandoColumnSoap.
     * 
     * @return defaultData
     */
    public java.lang.String getDefaultData() {
        return defaultData;
    }


    /**
     * Sets the defaultData value for this ExpandoColumnSoap.
     * 
     * @param defaultData
     */
    public void setDefaultData(java.lang.String defaultData) {
        this.defaultData = defaultData;
    }


    /**
     * Gets the name value for this ExpandoColumnSoap.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ExpandoColumnSoap.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the primaryKey value for this ExpandoColumnSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this ExpandoColumnSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the tableId value for this ExpandoColumnSoap.
     * 
     * @return tableId
     */
    public long getTableId() {
        return tableId;
    }


    /**
     * Sets the tableId value for this ExpandoColumnSoap.
     * 
     * @param tableId
     */
    public void setTableId(long tableId) {
        this.tableId = tableId;
    }


    /**
     * Gets the type value for this ExpandoColumnSoap.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this ExpandoColumnSoap.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the typeSettings value for this ExpandoColumnSoap.
     * 
     * @return typeSettings
     */
    public java.lang.String getTypeSettings() {
        return typeSettings;
    }


    /**
     * Sets the typeSettings value for this ExpandoColumnSoap.
     * 
     * @param typeSettings
     */
    public void setTypeSettings(java.lang.String typeSettings) {
        this.typeSettings = typeSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpandoColumnSoap)) return false;
        ExpandoColumnSoap other = (ExpandoColumnSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.columnId == other.getColumnId() &&
            this.companyId == other.getCompanyId() &&
            ((this.defaultData==null && other.getDefaultData()==null) || 
             (this.defaultData!=null &&
              this.defaultData.equals(other.getDefaultData()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            this.tableId == other.getTableId() &&
            this.type == other.getType() &&
            ((this.typeSettings==null && other.getTypeSettings()==null) || 
             (this.typeSettings!=null &&
              this.typeSettings.equals(other.getTypeSettings())));
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
        _hashCode += new Long(getColumnId()).hashCode();
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getDefaultData() != null) {
            _hashCode += getDefaultData().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += new Long(getTableId()).hashCode();
        _hashCode += getType();
        if (getTypeSettings() != null) {
            _hashCode += getTypeSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpandoColumnSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.expando.portlet.liferay.com", "ExpandoColumnSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnId"));
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
        elemField.setFieldName("defaultData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
        elemField.setFieldName("tableId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeSettings"));
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
