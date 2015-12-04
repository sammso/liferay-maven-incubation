/**
 * ShoppingOrderSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.client.soap.portlet.shopping.model;

public class ShoppingOrderSoap  implements java.io.Serializable {
    private java.lang.String altShipping;

    private java.lang.String billingCity;

    private java.lang.String billingCompany;

    private java.lang.String billingCountry;

    private java.lang.String billingEmailAddress;

    private java.lang.String billingFirstName;

    private java.lang.String billingLastName;

    private java.lang.String billingPhone;

    private java.lang.String billingState;

    private java.lang.String billingStreet;

    private java.lang.String billingZip;

    private int ccExpMonth;

    private int ccExpYear;

    private java.lang.String ccName;

    private java.lang.String ccNumber;

    private java.lang.String ccType;

    private java.lang.String ccVerNumber;

    private java.lang.String comments;

    private long companyId;

    private java.lang.String couponCodes;

    private double couponDiscount;

    private java.util.Calendar createDate;

    private long groupId;

    private double insurance;

    private boolean insure;

    private java.util.Calendar modifiedDate;

    private java.lang.String number;

    private long orderId;

    private java.lang.String ppPayerEmail;

    private double ppPaymentGross;

    private java.lang.String ppPaymentStatus;

    private java.lang.String ppReceiverEmail;

    private java.lang.String ppTxnId;

    private long primaryKey;

    private boolean requiresShipping;

    private boolean sendOrderEmail;

    private boolean sendShippingEmail;

    private boolean shipToBilling;

    private double shipping;

    private java.lang.String shippingCity;

    private java.lang.String shippingCompany;

    private java.lang.String shippingCountry;

    private java.lang.String shippingEmailAddress;

    private java.lang.String shippingFirstName;

    private java.lang.String shippingLastName;

    private java.lang.String shippingPhone;

    private java.lang.String shippingState;

    private java.lang.String shippingStreet;

    private java.lang.String shippingZip;

    private double tax;

    private long userId;

    private java.lang.String userName;

    public ShoppingOrderSoap() {
    }

    public ShoppingOrderSoap(
           java.lang.String altShipping,
           java.lang.String billingCity,
           java.lang.String billingCompany,
           java.lang.String billingCountry,
           java.lang.String billingEmailAddress,
           java.lang.String billingFirstName,
           java.lang.String billingLastName,
           java.lang.String billingPhone,
           java.lang.String billingState,
           java.lang.String billingStreet,
           java.lang.String billingZip,
           int ccExpMonth,
           int ccExpYear,
           java.lang.String ccName,
           java.lang.String ccNumber,
           java.lang.String ccType,
           java.lang.String ccVerNumber,
           java.lang.String comments,
           long companyId,
           java.lang.String couponCodes,
           double couponDiscount,
           java.util.Calendar createDate,
           long groupId,
           double insurance,
           boolean insure,
           java.util.Calendar modifiedDate,
           java.lang.String number,
           long orderId,
           java.lang.String ppPayerEmail,
           double ppPaymentGross,
           java.lang.String ppPaymentStatus,
           java.lang.String ppReceiverEmail,
           java.lang.String ppTxnId,
           long primaryKey,
           boolean requiresShipping,
           boolean sendOrderEmail,
           boolean sendShippingEmail,
           boolean shipToBilling,
           double shipping,
           java.lang.String shippingCity,
           java.lang.String shippingCompany,
           java.lang.String shippingCountry,
           java.lang.String shippingEmailAddress,
           java.lang.String shippingFirstName,
           java.lang.String shippingLastName,
           java.lang.String shippingPhone,
           java.lang.String shippingState,
           java.lang.String shippingStreet,
           java.lang.String shippingZip,
           double tax,
           long userId,
           java.lang.String userName) {
           this.altShipping = altShipping;
           this.billingCity = billingCity;
           this.billingCompany = billingCompany;
           this.billingCountry = billingCountry;
           this.billingEmailAddress = billingEmailAddress;
           this.billingFirstName = billingFirstName;
           this.billingLastName = billingLastName;
           this.billingPhone = billingPhone;
           this.billingState = billingState;
           this.billingStreet = billingStreet;
           this.billingZip = billingZip;
           this.ccExpMonth = ccExpMonth;
           this.ccExpYear = ccExpYear;
           this.ccName = ccName;
           this.ccNumber = ccNumber;
           this.ccType = ccType;
           this.ccVerNumber = ccVerNumber;
           this.comments = comments;
           this.companyId = companyId;
           this.couponCodes = couponCodes;
           this.couponDiscount = couponDiscount;
           this.createDate = createDate;
           this.groupId = groupId;
           this.insurance = insurance;
           this.insure = insure;
           this.modifiedDate = modifiedDate;
           this.number = number;
           this.orderId = orderId;
           this.ppPayerEmail = ppPayerEmail;
           this.ppPaymentGross = ppPaymentGross;
           this.ppPaymentStatus = ppPaymentStatus;
           this.ppReceiverEmail = ppReceiverEmail;
           this.ppTxnId = ppTxnId;
           this.primaryKey = primaryKey;
           this.requiresShipping = requiresShipping;
           this.sendOrderEmail = sendOrderEmail;
           this.sendShippingEmail = sendShippingEmail;
           this.shipToBilling = shipToBilling;
           this.shipping = shipping;
           this.shippingCity = shippingCity;
           this.shippingCompany = shippingCompany;
           this.shippingCountry = shippingCountry;
           this.shippingEmailAddress = shippingEmailAddress;
           this.shippingFirstName = shippingFirstName;
           this.shippingLastName = shippingLastName;
           this.shippingPhone = shippingPhone;
           this.shippingState = shippingState;
           this.shippingStreet = shippingStreet;
           this.shippingZip = shippingZip;
           this.tax = tax;
           this.userId = userId;
           this.userName = userName;
    }


    /**
     * Gets the altShipping value for this ShoppingOrderSoap.
     * 
     * @return altShipping
     */
    public java.lang.String getAltShipping() {
        return altShipping;
    }


    /**
     * Sets the altShipping value for this ShoppingOrderSoap.
     * 
     * @param altShipping
     */
    public void setAltShipping(java.lang.String altShipping) {
        this.altShipping = altShipping;
    }


    /**
     * Gets the billingCity value for this ShoppingOrderSoap.
     * 
     * @return billingCity
     */
    public java.lang.String getBillingCity() {
        return billingCity;
    }


    /**
     * Sets the billingCity value for this ShoppingOrderSoap.
     * 
     * @param billingCity
     */
    public void setBillingCity(java.lang.String billingCity) {
        this.billingCity = billingCity;
    }


    /**
     * Gets the billingCompany value for this ShoppingOrderSoap.
     * 
     * @return billingCompany
     */
    public java.lang.String getBillingCompany() {
        return billingCompany;
    }


    /**
     * Sets the billingCompany value for this ShoppingOrderSoap.
     * 
     * @param billingCompany
     */
    public void setBillingCompany(java.lang.String billingCompany) {
        this.billingCompany = billingCompany;
    }


    /**
     * Gets the billingCountry value for this ShoppingOrderSoap.
     * 
     * @return billingCountry
     */
    public java.lang.String getBillingCountry() {
        return billingCountry;
    }


    /**
     * Sets the billingCountry value for this ShoppingOrderSoap.
     * 
     * @param billingCountry
     */
    public void setBillingCountry(java.lang.String billingCountry) {
        this.billingCountry = billingCountry;
    }


    /**
     * Gets the billingEmailAddress value for this ShoppingOrderSoap.
     * 
     * @return billingEmailAddress
     */
    public java.lang.String getBillingEmailAddress() {
        return billingEmailAddress;
    }


    /**
     * Sets the billingEmailAddress value for this ShoppingOrderSoap.
     * 
     * @param billingEmailAddress
     */
    public void setBillingEmailAddress(java.lang.String billingEmailAddress) {
        this.billingEmailAddress = billingEmailAddress;
    }


    /**
     * Gets the billingFirstName value for this ShoppingOrderSoap.
     * 
     * @return billingFirstName
     */
    public java.lang.String getBillingFirstName() {
        return billingFirstName;
    }


    /**
     * Sets the billingFirstName value for this ShoppingOrderSoap.
     * 
     * @param billingFirstName
     */
    public void setBillingFirstName(java.lang.String billingFirstName) {
        this.billingFirstName = billingFirstName;
    }


    /**
     * Gets the billingLastName value for this ShoppingOrderSoap.
     * 
     * @return billingLastName
     */
    public java.lang.String getBillingLastName() {
        return billingLastName;
    }


    /**
     * Sets the billingLastName value for this ShoppingOrderSoap.
     * 
     * @param billingLastName
     */
    public void setBillingLastName(java.lang.String billingLastName) {
        this.billingLastName = billingLastName;
    }


    /**
     * Gets the billingPhone value for this ShoppingOrderSoap.
     * 
     * @return billingPhone
     */
    public java.lang.String getBillingPhone() {
        return billingPhone;
    }


    /**
     * Sets the billingPhone value for this ShoppingOrderSoap.
     * 
     * @param billingPhone
     */
    public void setBillingPhone(java.lang.String billingPhone) {
        this.billingPhone = billingPhone;
    }


    /**
     * Gets the billingState value for this ShoppingOrderSoap.
     * 
     * @return billingState
     */
    public java.lang.String getBillingState() {
        return billingState;
    }


    /**
     * Sets the billingState value for this ShoppingOrderSoap.
     * 
     * @param billingState
     */
    public void setBillingState(java.lang.String billingState) {
        this.billingState = billingState;
    }


    /**
     * Gets the billingStreet value for this ShoppingOrderSoap.
     * 
     * @return billingStreet
     */
    public java.lang.String getBillingStreet() {
        return billingStreet;
    }


    /**
     * Sets the billingStreet value for this ShoppingOrderSoap.
     * 
     * @param billingStreet
     */
    public void setBillingStreet(java.lang.String billingStreet) {
        this.billingStreet = billingStreet;
    }


    /**
     * Gets the billingZip value for this ShoppingOrderSoap.
     * 
     * @return billingZip
     */
    public java.lang.String getBillingZip() {
        return billingZip;
    }


    /**
     * Sets the billingZip value for this ShoppingOrderSoap.
     * 
     * @param billingZip
     */
    public void setBillingZip(java.lang.String billingZip) {
        this.billingZip = billingZip;
    }


    /**
     * Gets the ccExpMonth value for this ShoppingOrderSoap.
     * 
     * @return ccExpMonth
     */
    public int getCcExpMonth() {
        return ccExpMonth;
    }


    /**
     * Sets the ccExpMonth value for this ShoppingOrderSoap.
     * 
     * @param ccExpMonth
     */
    public void setCcExpMonth(int ccExpMonth) {
        this.ccExpMonth = ccExpMonth;
    }


    /**
     * Gets the ccExpYear value for this ShoppingOrderSoap.
     * 
     * @return ccExpYear
     */
    public int getCcExpYear() {
        return ccExpYear;
    }


    /**
     * Sets the ccExpYear value for this ShoppingOrderSoap.
     * 
     * @param ccExpYear
     */
    public void setCcExpYear(int ccExpYear) {
        this.ccExpYear = ccExpYear;
    }


    /**
     * Gets the ccName value for this ShoppingOrderSoap.
     * 
     * @return ccName
     */
    public java.lang.String getCcName() {
        return ccName;
    }


    /**
     * Sets the ccName value for this ShoppingOrderSoap.
     * 
     * @param ccName
     */
    public void setCcName(java.lang.String ccName) {
        this.ccName = ccName;
    }


    /**
     * Gets the ccNumber value for this ShoppingOrderSoap.
     * 
     * @return ccNumber
     */
    public java.lang.String getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this ShoppingOrderSoap.
     * 
     * @param ccNumber
     */
    public void setCcNumber(java.lang.String ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the ccType value for this ShoppingOrderSoap.
     * 
     * @return ccType
     */
    public java.lang.String getCcType() {
        return ccType;
    }


    /**
     * Sets the ccType value for this ShoppingOrderSoap.
     * 
     * @param ccType
     */
    public void setCcType(java.lang.String ccType) {
        this.ccType = ccType;
    }


    /**
     * Gets the ccVerNumber value for this ShoppingOrderSoap.
     * 
     * @return ccVerNumber
     */
    public java.lang.String getCcVerNumber() {
        return ccVerNumber;
    }


    /**
     * Sets the ccVerNumber value for this ShoppingOrderSoap.
     * 
     * @param ccVerNumber
     */
    public void setCcVerNumber(java.lang.String ccVerNumber) {
        this.ccVerNumber = ccVerNumber;
    }


    /**
     * Gets the comments value for this ShoppingOrderSoap.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this ShoppingOrderSoap.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the companyId value for this ShoppingOrderSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ShoppingOrderSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the couponCodes value for this ShoppingOrderSoap.
     * 
     * @return couponCodes
     */
    public java.lang.String getCouponCodes() {
        return couponCodes;
    }


    /**
     * Sets the couponCodes value for this ShoppingOrderSoap.
     * 
     * @param couponCodes
     */
    public void setCouponCodes(java.lang.String couponCodes) {
        this.couponCodes = couponCodes;
    }


    /**
     * Gets the couponDiscount value for this ShoppingOrderSoap.
     * 
     * @return couponDiscount
     */
    public double getCouponDiscount() {
        return couponDiscount;
    }


    /**
     * Sets the couponDiscount value for this ShoppingOrderSoap.
     * 
     * @param couponDiscount
     */
    public void setCouponDiscount(double couponDiscount) {
        this.couponDiscount = couponDiscount;
    }


    /**
     * Gets the createDate value for this ShoppingOrderSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ShoppingOrderSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the groupId value for this ShoppingOrderSoap.
     * 
     * @return groupId
     */
    public long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this ShoppingOrderSoap.
     * 
     * @param groupId
     */
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the insurance value for this ShoppingOrderSoap.
     * 
     * @return insurance
     */
    public double getInsurance() {
        return insurance;
    }


    /**
     * Sets the insurance value for this ShoppingOrderSoap.
     * 
     * @param insurance
     */
    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }


    /**
     * Gets the insure value for this ShoppingOrderSoap.
     * 
     * @return insure
     */
    public boolean isInsure() {
        return insure;
    }


    /**
     * Sets the insure value for this ShoppingOrderSoap.
     * 
     * @param insure
     */
    public void setInsure(boolean insure) {
        this.insure = insure;
    }


    /**
     * Gets the modifiedDate value for this ShoppingOrderSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this ShoppingOrderSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the number value for this ShoppingOrderSoap.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this ShoppingOrderSoap.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the orderId value for this ShoppingOrderSoap.
     * 
     * @return orderId
     */
    public long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this ShoppingOrderSoap.
     * 
     * @param orderId
     */
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the ppPayerEmail value for this ShoppingOrderSoap.
     * 
     * @return ppPayerEmail
     */
    public java.lang.String getPpPayerEmail() {
        return ppPayerEmail;
    }


    /**
     * Sets the ppPayerEmail value for this ShoppingOrderSoap.
     * 
     * @param ppPayerEmail
     */
    public void setPpPayerEmail(java.lang.String ppPayerEmail) {
        this.ppPayerEmail = ppPayerEmail;
    }


    /**
     * Gets the ppPaymentGross value for this ShoppingOrderSoap.
     * 
     * @return ppPaymentGross
     */
    public double getPpPaymentGross() {
        return ppPaymentGross;
    }


    /**
     * Sets the ppPaymentGross value for this ShoppingOrderSoap.
     * 
     * @param ppPaymentGross
     */
    public void setPpPaymentGross(double ppPaymentGross) {
        this.ppPaymentGross = ppPaymentGross;
    }


    /**
     * Gets the ppPaymentStatus value for this ShoppingOrderSoap.
     * 
     * @return ppPaymentStatus
     */
    public java.lang.String getPpPaymentStatus() {
        return ppPaymentStatus;
    }


    /**
     * Sets the ppPaymentStatus value for this ShoppingOrderSoap.
     * 
     * @param ppPaymentStatus
     */
    public void setPpPaymentStatus(java.lang.String ppPaymentStatus) {
        this.ppPaymentStatus = ppPaymentStatus;
    }


    /**
     * Gets the ppReceiverEmail value for this ShoppingOrderSoap.
     * 
     * @return ppReceiverEmail
     */
    public java.lang.String getPpReceiverEmail() {
        return ppReceiverEmail;
    }


    /**
     * Sets the ppReceiverEmail value for this ShoppingOrderSoap.
     * 
     * @param ppReceiverEmail
     */
    public void setPpReceiverEmail(java.lang.String ppReceiverEmail) {
        this.ppReceiverEmail = ppReceiverEmail;
    }


    /**
     * Gets the ppTxnId value for this ShoppingOrderSoap.
     * 
     * @return ppTxnId
     */
    public java.lang.String getPpTxnId() {
        return ppTxnId;
    }


    /**
     * Sets the ppTxnId value for this ShoppingOrderSoap.
     * 
     * @param ppTxnId
     */
    public void setPpTxnId(java.lang.String ppTxnId) {
        this.ppTxnId = ppTxnId;
    }


    /**
     * Gets the primaryKey value for this ShoppingOrderSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this ShoppingOrderSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the requiresShipping value for this ShoppingOrderSoap.
     * 
     * @return requiresShipping
     */
    public boolean isRequiresShipping() {
        return requiresShipping;
    }


    /**
     * Sets the requiresShipping value for this ShoppingOrderSoap.
     * 
     * @param requiresShipping
     */
    public void setRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }


    /**
     * Gets the sendOrderEmail value for this ShoppingOrderSoap.
     * 
     * @return sendOrderEmail
     */
    public boolean isSendOrderEmail() {
        return sendOrderEmail;
    }


    /**
     * Sets the sendOrderEmail value for this ShoppingOrderSoap.
     * 
     * @param sendOrderEmail
     */
    public void setSendOrderEmail(boolean sendOrderEmail) {
        this.sendOrderEmail = sendOrderEmail;
    }


    /**
     * Gets the sendShippingEmail value for this ShoppingOrderSoap.
     * 
     * @return sendShippingEmail
     */
    public boolean isSendShippingEmail() {
        return sendShippingEmail;
    }


    /**
     * Sets the sendShippingEmail value for this ShoppingOrderSoap.
     * 
     * @param sendShippingEmail
     */
    public void setSendShippingEmail(boolean sendShippingEmail) {
        this.sendShippingEmail = sendShippingEmail;
    }


    /**
     * Gets the shipToBilling value for this ShoppingOrderSoap.
     * 
     * @return shipToBilling
     */
    public boolean isShipToBilling() {
        return shipToBilling;
    }


    /**
     * Sets the shipToBilling value for this ShoppingOrderSoap.
     * 
     * @param shipToBilling
     */
    public void setShipToBilling(boolean shipToBilling) {
        this.shipToBilling = shipToBilling;
    }


    /**
     * Gets the shipping value for this ShoppingOrderSoap.
     * 
     * @return shipping
     */
    public double getShipping() {
        return shipping;
    }


    /**
     * Sets the shipping value for this ShoppingOrderSoap.
     * 
     * @param shipping
     */
    public void setShipping(double shipping) {
        this.shipping = shipping;
    }


    /**
     * Gets the shippingCity value for this ShoppingOrderSoap.
     * 
     * @return shippingCity
     */
    public java.lang.String getShippingCity() {
        return shippingCity;
    }


    /**
     * Sets the shippingCity value for this ShoppingOrderSoap.
     * 
     * @param shippingCity
     */
    public void setShippingCity(java.lang.String shippingCity) {
        this.shippingCity = shippingCity;
    }


    /**
     * Gets the shippingCompany value for this ShoppingOrderSoap.
     * 
     * @return shippingCompany
     */
    public java.lang.String getShippingCompany() {
        return shippingCompany;
    }


    /**
     * Sets the shippingCompany value for this ShoppingOrderSoap.
     * 
     * @param shippingCompany
     */
    public void setShippingCompany(java.lang.String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }


    /**
     * Gets the shippingCountry value for this ShoppingOrderSoap.
     * 
     * @return shippingCountry
     */
    public java.lang.String getShippingCountry() {
        return shippingCountry;
    }


    /**
     * Sets the shippingCountry value for this ShoppingOrderSoap.
     * 
     * @param shippingCountry
     */
    public void setShippingCountry(java.lang.String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }


    /**
     * Gets the shippingEmailAddress value for this ShoppingOrderSoap.
     * 
     * @return shippingEmailAddress
     */
    public java.lang.String getShippingEmailAddress() {
        return shippingEmailAddress;
    }


    /**
     * Sets the shippingEmailAddress value for this ShoppingOrderSoap.
     * 
     * @param shippingEmailAddress
     */
    public void setShippingEmailAddress(java.lang.String shippingEmailAddress) {
        this.shippingEmailAddress = shippingEmailAddress;
    }


    /**
     * Gets the shippingFirstName value for this ShoppingOrderSoap.
     * 
     * @return shippingFirstName
     */
    public java.lang.String getShippingFirstName() {
        return shippingFirstName;
    }


    /**
     * Sets the shippingFirstName value for this ShoppingOrderSoap.
     * 
     * @param shippingFirstName
     */
    public void setShippingFirstName(java.lang.String shippingFirstName) {
        this.shippingFirstName = shippingFirstName;
    }


    /**
     * Gets the shippingLastName value for this ShoppingOrderSoap.
     * 
     * @return shippingLastName
     */
    public java.lang.String getShippingLastName() {
        return shippingLastName;
    }


    /**
     * Sets the shippingLastName value for this ShoppingOrderSoap.
     * 
     * @param shippingLastName
     */
    public void setShippingLastName(java.lang.String shippingLastName) {
        this.shippingLastName = shippingLastName;
    }


    /**
     * Gets the shippingPhone value for this ShoppingOrderSoap.
     * 
     * @return shippingPhone
     */
    public java.lang.String getShippingPhone() {
        return shippingPhone;
    }


    /**
     * Sets the shippingPhone value for this ShoppingOrderSoap.
     * 
     * @param shippingPhone
     */
    public void setShippingPhone(java.lang.String shippingPhone) {
        this.shippingPhone = shippingPhone;
    }


    /**
     * Gets the shippingState value for this ShoppingOrderSoap.
     * 
     * @return shippingState
     */
    public java.lang.String getShippingState() {
        return shippingState;
    }


    /**
     * Sets the shippingState value for this ShoppingOrderSoap.
     * 
     * @param shippingState
     */
    public void setShippingState(java.lang.String shippingState) {
        this.shippingState = shippingState;
    }


    /**
     * Gets the shippingStreet value for this ShoppingOrderSoap.
     * 
     * @return shippingStreet
     */
    public java.lang.String getShippingStreet() {
        return shippingStreet;
    }


    /**
     * Sets the shippingStreet value for this ShoppingOrderSoap.
     * 
     * @param shippingStreet
     */
    public void setShippingStreet(java.lang.String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }


    /**
     * Gets the shippingZip value for this ShoppingOrderSoap.
     * 
     * @return shippingZip
     */
    public java.lang.String getShippingZip() {
        return shippingZip;
    }


    /**
     * Sets the shippingZip value for this ShoppingOrderSoap.
     * 
     * @param shippingZip
     */
    public void setShippingZip(java.lang.String shippingZip) {
        this.shippingZip = shippingZip;
    }


    /**
     * Gets the tax value for this ShoppingOrderSoap.
     * 
     * @return tax
     */
    public double getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this ShoppingOrderSoap.
     * 
     * @param tax
     */
    public void setTax(double tax) {
        this.tax = tax;
    }


    /**
     * Gets the userId value for this ShoppingOrderSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ShoppingOrderSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this ShoppingOrderSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ShoppingOrderSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingOrderSoap)) return false;
        ShoppingOrderSoap other = (ShoppingOrderSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.altShipping==null && other.getAltShipping()==null) || 
             (this.altShipping!=null &&
              this.altShipping.equals(other.getAltShipping()))) &&
            ((this.billingCity==null && other.getBillingCity()==null) || 
             (this.billingCity!=null &&
              this.billingCity.equals(other.getBillingCity()))) &&
            ((this.billingCompany==null && other.getBillingCompany()==null) || 
             (this.billingCompany!=null &&
              this.billingCompany.equals(other.getBillingCompany()))) &&
            ((this.billingCountry==null && other.getBillingCountry()==null) || 
             (this.billingCountry!=null &&
              this.billingCountry.equals(other.getBillingCountry()))) &&
            ((this.billingEmailAddress==null && other.getBillingEmailAddress()==null) || 
             (this.billingEmailAddress!=null &&
              this.billingEmailAddress.equals(other.getBillingEmailAddress()))) &&
            ((this.billingFirstName==null && other.getBillingFirstName()==null) || 
             (this.billingFirstName!=null &&
              this.billingFirstName.equals(other.getBillingFirstName()))) &&
            ((this.billingLastName==null && other.getBillingLastName()==null) || 
             (this.billingLastName!=null &&
              this.billingLastName.equals(other.getBillingLastName()))) &&
            ((this.billingPhone==null && other.getBillingPhone()==null) || 
             (this.billingPhone!=null &&
              this.billingPhone.equals(other.getBillingPhone()))) &&
            ((this.billingState==null && other.getBillingState()==null) || 
             (this.billingState!=null &&
              this.billingState.equals(other.getBillingState()))) &&
            ((this.billingStreet==null && other.getBillingStreet()==null) || 
             (this.billingStreet!=null &&
              this.billingStreet.equals(other.getBillingStreet()))) &&
            ((this.billingZip==null && other.getBillingZip()==null) || 
             (this.billingZip!=null &&
              this.billingZip.equals(other.getBillingZip()))) &&
            this.ccExpMonth == other.getCcExpMonth() &&
            this.ccExpYear == other.getCcExpYear() &&
            ((this.ccName==null && other.getCcName()==null) || 
             (this.ccName!=null &&
              this.ccName.equals(other.getCcName()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this.ccType==null && other.getCcType()==null) || 
             (this.ccType!=null &&
              this.ccType.equals(other.getCcType()))) &&
            ((this.ccVerNumber==null && other.getCcVerNumber()==null) || 
             (this.ccVerNumber!=null &&
              this.ccVerNumber.equals(other.getCcVerNumber()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.couponCodes==null && other.getCouponCodes()==null) || 
             (this.couponCodes!=null &&
              this.couponCodes.equals(other.getCouponCodes()))) &&
            this.couponDiscount == other.getCouponDiscount() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            this.groupId == other.getGroupId() &&
            this.insurance == other.getInsurance() &&
            this.insure == other.isInsure() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            this.orderId == other.getOrderId() &&
            ((this.ppPayerEmail==null && other.getPpPayerEmail()==null) || 
             (this.ppPayerEmail!=null &&
              this.ppPayerEmail.equals(other.getPpPayerEmail()))) &&
            this.ppPaymentGross == other.getPpPaymentGross() &&
            ((this.ppPaymentStatus==null && other.getPpPaymentStatus()==null) || 
             (this.ppPaymentStatus!=null &&
              this.ppPaymentStatus.equals(other.getPpPaymentStatus()))) &&
            ((this.ppReceiverEmail==null && other.getPpReceiverEmail()==null) || 
             (this.ppReceiverEmail!=null &&
              this.ppReceiverEmail.equals(other.getPpReceiverEmail()))) &&
            ((this.ppTxnId==null && other.getPpTxnId()==null) || 
             (this.ppTxnId!=null &&
              this.ppTxnId.equals(other.getPpTxnId()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            this.requiresShipping == other.isRequiresShipping() &&
            this.sendOrderEmail == other.isSendOrderEmail() &&
            this.sendShippingEmail == other.isSendShippingEmail() &&
            this.shipToBilling == other.isShipToBilling() &&
            this.shipping == other.getShipping() &&
            ((this.shippingCity==null && other.getShippingCity()==null) || 
             (this.shippingCity!=null &&
              this.shippingCity.equals(other.getShippingCity()))) &&
            ((this.shippingCompany==null && other.getShippingCompany()==null) || 
             (this.shippingCompany!=null &&
              this.shippingCompany.equals(other.getShippingCompany()))) &&
            ((this.shippingCountry==null && other.getShippingCountry()==null) || 
             (this.shippingCountry!=null &&
              this.shippingCountry.equals(other.getShippingCountry()))) &&
            ((this.shippingEmailAddress==null && other.getShippingEmailAddress()==null) || 
             (this.shippingEmailAddress!=null &&
              this.shippingEmailAddress.equals(other.getShippingEmailAddress()))) &&
            ((this.shippingFirstName==null && other.getShippingFirstName()==null) || 
             (this.shippingFirstName!=null &&
              this.shippingFirstName.equals(other.getShippingFirstName()))) &&
            ((this.shippingLastName==null && other.getShippingLastName()==null) || 
             (this.shippingLastName!=null &&
              this.shippingLastName.equals(other.getShippingLastName()))) &&
            ((this.shippingPhone==null && other.getShippingPhone()==null) || 
             (this.shippingPhone!=null &&
              this.shippingPhone.equals(other.getShippingPhone()))) &&
            ((this.shippingState==null && other.getShippingState()==null) || 
             (this.shippingState!=null &&
              this.shippingState.equals(other.getShippingState()))) &&
            ((this.shippingStreet==null && other.getShippingStreet()==null) || 
             (this.shippingStreet!=null &&
              this.shippingStreet.equals(other.getShippingStreet()))) &&
            ((this.shippingZip==null && other.getShippingZip()==null) || 
             (this.shippingZip!=null &&
              this.shippingZip.equals(other.getShippingZip()))) &&
            this.tax == other.getTax() &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        if (getAltShipping() != null) {
            _hashCode += getAltShipping().hashCode();
        }
        if (getBillingCity() != null) {
            _hashCode += getBillingCity().hashCode();
        }
        if (getBillingCompany() != null) {
            _hashCode += getBillingCompany().hashCode();
        }
        if (getBillingCountry() != null) {
            _hashCode += getBillingCountry().hashCode();
        }
        if (getBillingEmailAddress() != null) {
            _hashCode += getBillingEmailAddress().hashCode();
        }
        if (getBillingFirstName() != null) {
            _hashCode += getBillingFirstName().hashCode();
        }
        if (getBillingLastName() != null) {
            _hashCode += getBillingLastName().hashCode();
        }
        if (getBillingPhone() != null) {
            _hashCode += getBillingPhone().hashCode();
        }
        if (getBillingState() != null) {
            _hashCode += getBillingState().hashCode();
        }
        if (getBillingStreet() != null) {
            _hashCode += getBillingStreet().hashCode();
        }
        if (getBillingZip() != null) {
            _hashCode += getBillingZip().hashCode();
        }
        _hashCode += getCcExpMonth();
        _hashCode += getCcExpYear();
        if (getCcName() != null) {
            _hashCode += getCcName().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (getCcType() != null) {
            _hashCode += getCcType().hashCode();
        }
        if (getCcVerNumber() != null) {
            _hashCode += getCcVerNumber().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCouponCodes() != null) {
            _hashCode += getCouponCodes().hashCode();
        }
        _hashCode += new Double(getCouponDiscount()).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        _hashCode += new Long(getGroupId()).hashCode();
        _hashCode += new Double(getInsurance()).hashCode();
        _hashCode += (isInsure() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        _hashCode += new Long(getOrderId()).hashCode();
        if (getPpPayerEmail() != null) {
            _hashCode += getPpPayerEmail().hashCode();
        }
        _hashCode += new Double(getPpPaymentGross()).hashCode();
        if (getPpPaymentStatus() != null) {
            _hashCode += getPpPaymentStatus().hashCode();
        }
        if (getPpReceiverEmail() != null) {
            _hashCode += getPpReceiverEmail().hashCode();
        }
        if (getPpTxnId() != null) {
            _hashCode += getPpTxnId().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += (isRequiresShipping() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSendOrderEmail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSendShippingEmail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShipToBilling() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getShipping()).hashCode();
        if (getShippingCity() != null) {
            _hashCode += getShippingCity().hashCode();
        }
        if (getShippingCompany() != null) {
            _hashCode += getShippingCompany().hashCode();
        }
        if (getShippingCountry() != null) {
            _hashCode += getShippingCountry().hashCode();
        }
        if (getShippingEmailAddress() != null) {
            _hashCode += getShippingEmailAddress().hashCode();
        }
        if (getShippingFirstName() != null) {
            _hashCode += getShippingFirstName().hashCode();
        }
        if (getShippingLastName() != null) {
            _hashCode += getShippingLastName().hashCode();
        }
        if (getShippingPhone() != null) {
            _hashCode += getShippingPhone().hashCode();
        }
        if (getShippingState() != null) {
            _hashCode += getShippingState().hashCode();
        }
        if (getShippingStreet() != null) {
            _hashCode += getShippingStreet().hashCode();
        }
        if (getShippingZip() != null) {
            _hashCode += getShippingZip().hashCode();
        }
        _hashCode += new Double(getTax()).hashCode();
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingOrderSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.shopping.portlet.liferay.com", "ShoppingOrderSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingZip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccExpMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccExpYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccVerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccVerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "couponCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "couponDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insurance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insurance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppPayerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppPayerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppPaymentGross");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppPaymentGross"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppPaymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppPaymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppReceiverEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppReceiverEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppTxnId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppTxnId"));
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
        elemField.setFieldName("requiresShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requiresShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendOrderEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendOrderEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendShippingEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendShippingEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipToBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingZip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
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
