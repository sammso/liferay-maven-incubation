/**
 * PollsVoteSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.polls.model;

public class PollsVoteSoap  implements java.io.Serializable {
    private long choiceId;

    private long primaryKey;

    private long questionId;

    private long userId;

    private java.util.Calendar voteDate;

    private long voteId;

    public PollsVoteSoap() {
    }

    public PollsVoteSoap(
           long choiceId,
           long primaryKey,
           long questionId,
           long userId,
           java.util.Calendar voteDate,
           long voteId) {
           this.choiceId = choiceId;
           this.primaryKey = primaryKey;
           this.questionId = questionId;
           this.userId = userId;
           this.voteDate = voteDate;
           this.voteId = voteId;
    }


    /**
     * Gets the choiceId value for this PollsVoteSoap.
     * 
     * @return choiceId
     */
    public long getChoiceId() {
        return choiceId;
    }


    /**
     * Sets the choiceId value for this PollsVoteSoap.
     * 
     * @param choiceId
     */
    public void setChoiceId(long choiceId) {
        this.choiceId = choiceId;
    }


    /**
     * Gets the primaryKey value for this PollsVoteSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this PollsVoteSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the questionId value for this PollsVoteSoap.
     * 
     * @return questionId
     */
    public long getQuestionId() {
        return questionId;
    }


    /**
     * Sets the questionId value for this PollsVoteSoap.
     * 
     * @param questionId
     */
    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }


    /**
     * Gets the userId value for this PollsVoteSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this PollsVoteSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the voteDate value for this PollsVoteSoap.
     * 
     * @return voteDate
     */
    public java.util.Calendar getVoteDate() {
        return voteDate;
    }


    /**
     * Sets the voteDate value for this PollsVoteSoap.
     * 
     * @param voteDate
     */
    public void setVoteDate(java.util.Calendar voteDate) {
        this.voteDate = voteDate;
    }


    /**
     * Gets the voteId value for this PollsVoteSoap.
     * 
     * @return voteId
     */
    public long getVoteId() {
        return voteId;
    }


    /**
     * Sets the voteId value for this PollsVoteSoap.
     * 
     * @param voteId
     */
    public void setVoteId(long voteId) {
        this.voteId = voteId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PollsVoteSoap)) return false;
        PollsVoteSoap other = (PollsVoteSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.choiceId == other.getChoiceId() &&
            this.primaryKey == other.getPrimaryKey() &&
            this.questionId == other.getQuestionId() &&
            this.userId == other.getUserId() &&
            ((this.voteDate==null && other.getVoteDate()==null) || 
             (this.voteDate!=null &&
              this.voteDate.equals(other.getVoteDate()))) &&
            this.voteId == other.getVoteId();
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
        _hashCode += new Long(getChoiceId()).hashCode();
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += new Long(getQuestionId()).hashCode();
        _hashCode += new Long(getUserId()).hashCode();
        if (getVoteDate() != null) {
            _hashCode += getVoteDate().hashCode();
        }
        _hashCode += new Long(getVoteId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PollsVoteSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.polls.portlet.liferay.com", "PollsVoteSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "choiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "questionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voteId"));
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
