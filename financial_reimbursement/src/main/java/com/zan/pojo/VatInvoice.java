package com.zan.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class VatInvoice {
    private Integer invoiceId;

    private Integer reimbursementId;

    private String reimbursementCategory;

    private String reimbursementContent;

    private String invoiceName;

    private String invoiceCode;

    private BigDecimal invoicePrice;

    private Date invoiceDate;

    private String vatInvoicePayerName;

    private String varInvoiceGoodsList;

    private String vatInvoiceRatePayerId;

    private String vatInvoiceSellerName;

    private String vatInvoiceSellerBankAccount;

    private Integer authenticity;

    private Integer existInvoiceSeal;

    private Integer existStample;

    private String vatInvoiceHaoma;

    private String vatInvoiceCorrectCode;

    private String vatInvoiceSellerId;

    private String vatInvoiceZhuanYongFlag;

    private String groups;

    private String remarks;

    private Date createTime;

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(Integer reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public String getReimbursementCategory() {
        return reimbursementCategory;
    }

    public void setReimbursementCategory(String reimbursementCategory) {
        this.reimbursementCategory = reimbursementCategory == null ? null : reimbursementCategory.trim();
    }

    public String getReimbursementContent() {
        return reimbursementContent;
    }

    public void setReimbursementContent(String reimbursementContent) {
        this.reimbursementContent = reimbursementContent == null ? null : reimbursementContent.trim();
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName == null ? null : invoiceName.trim();
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode == null ? null : invoiceCode.trim();
    }

    public BigDecimal getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(BigDecimal invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getVatInvoicePayerName() {
        return vatInvoicePayerName;
    }

    public void setVatInvoicePayerName(String vatInvoicePayerName) {
        this.vatInvoicePayerName = vatInvoicePayerName == null ? null : vatInvoicePayerName.trim();
    }

    public String getVarInvoiceGoodsList() {
        return varInvoiceGoodsList;
    }

    public void setVarInvoiceGoodsList(String varInvoiceGoodsList) {
        this.varInvoiceGoodsList = varInvoiceGoodsList == null ? null : varInvoiceGoodsList.trim();
    }

    public String getVatInvoiceRatePayerId() {
        return vatInvoiceRatePayerId;
    }

    public void setVatInvoiceRatePayerId(String vatInvoiceRatePayerId) {
        this.vatInvoiceRatePayerId = vatInvoiceRatePayerId == null ? null : vatInvoiceRatePayerId.trim();
    }

    public String getVatInvoiceSellerName() {
        return vatInvoiceSellerName;
    }

    public void setVatInvoiceSellerName(String vatInvoiceSellerName) {
        this.vatInvoiceSellerName = vatInvoiceSellerName == null ? null : vatInvoiceSellerName.trim();
    }

    public String getVatInvoiceSellerBankAccount() {
        return vatInvoiceSellerBankAccount;
    }

    public void setVatInvoiceSellerBankAccount(String vatInvoiceSellerBankAccount) {
        this.vatInvoiceSellerBankAccount = vatInvoiceSellerBankAccount == null ? null : vatInvoiceSellerBankAccount.trim();
    }

    public Integer getAuthenticity() {
        return authenticity;
    }

    public void setAuthenticity(Integer authenticity) {
        this.authenticity = authenticity;
    }

    public Integer getExistInvoiceSeal() {
        return existInvoiceSeal;
    }

    public void setExistInvoiceSeal(Integer existInvoiceSeal) {
        this.existInvoiceSeal = existInvoiceSeal;
    }

    public Integer getExistStample() {
        return existStample;
    }

    public void setExistStample(Integer existStample) {
        this.existStample = existStample;
    }

    public String getVatInvoiceHaoma() {
        return vatInvoiceHaoma;
    }

    public void setVatInvoiceHaoma(String vatInvoiceHaoma) {
        this.vatInvoiceHaoma = vatInvoiceHaoma == null ? null : vatInvoiceHaoma.trim();
    }

    public String getVatInvoiceCorrectCode() {
        return vatInvoiceCorrectCode;
    }

    public void setVatInvoiceCorrectCode(String vatInvoiceCorrectCode) {
        this.vatInvoiceCorrectCode = vatInvoiceCorrectCode == null ? null : vatInvoiceCorrectCode.trim();
    }

    public String getVatInvoiceSellerId() {
        return vatInvoiceSellerId;
    }

    public void setVatInvoiceSellerId(String vatInvoiceSellerId) {
        this.vatInvoiceSellerId = vatInvoiceSellerId == null ? null : vatInvoiceSellerId.trim();
    }

    public String getVatInvoiceZhuanYongFlag() {
        return vatInvoiceZhuanYongFlag;
    }

    public void setVatInvoiceZhuanYongFlag(String vatInvoiceZhuanYongFlag) {
        this.vatInvoiceZhuanYongFlag = vatInvoiceZhuanYongFlag == null ? null : vatInvoiceZhuanYongFlag.trim();
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups == null ? null : groups.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}