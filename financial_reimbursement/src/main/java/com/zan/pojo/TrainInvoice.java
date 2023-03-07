package com.zan.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TrainInvoice {
    private Integer invoiceId;

    private Integer reimbursementId;

    private String reimbursementCategory;

    private String reimbursementContent;

    private String invoiceName;

    private String invoiceCode;

    private BigDecimal invoicePrice;

    private Date invoiceData;

    private String passengerName;

    private String passengerId;

    private Date dapartureDate;

    private String departureStation;

    private String arrivalStation;

    private String ticketType;

    private Integer authenticity;

    private Integer existInvoiceSeal;

    private Integer existStample;

    private String invoiceNumber;

    private String trainNumber;

    private String seatNumber;

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

    public Date getInvoiceData() {
        return invoiceData;
    }

    public void setInvoiceData(Date invoiceData) {
        this.invoiceData = invoiceData;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName == null ? null : passengerName.trim();
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId == null ? null : passengerId.trim();
    }

    public Date getDapartureDate() {
        return dapartureDate;
    }

    public void setDapartureDate(Date dapartureDate) {
        this.dapartureDate = dapartureDate;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation == null ? null : departureStation.trim();
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation == null ? null : arrivalStation.trim();
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType == null ? null : ticketType.trim();
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

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber == null ? null : invoiceNumber.trim();
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber == null ? null : trainNumber.trim();
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber == null ? null : seatNumber.trim();
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