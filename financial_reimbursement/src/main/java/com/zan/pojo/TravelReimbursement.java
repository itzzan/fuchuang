package com.zan.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TravelReimbursement {
    private Integer reimbursementId;

    private Integer userId;

    private Integer projectId;

    private String fundNo;

    private String reimbursementNo;

    private String reimbursementInitiator;

    private Integer businessNumber;

    private String businessLocation;

    private String businessData;

    private String businessReason;

    private Integer billQuantity;

    private Integer appendix;

    private BigDecimal carCost;

    private BigDecimal trainCost;

    private BigDecimal airplaneCost;

    private BigDecimal steamerCost;

    private BigDecimal hotelCost;

    private BigDecimal conferenceCost;

    private BigDecimal otherCost;

    private BigDecimal travelAllowance;

    private BigDecimal foodAllowance;

    private BigDecimal money;

    private BigDecimal reimbursementAmount;

    private String checker;

    private String checkerNumber;

    private Integer status;

    private Date createTime;

    public Integer getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(Integer reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getFundNo() {
        return fundNo;
    }

    public void setFundNo(String fundNo) {
        this.fundNo = fundNo == null ? null : fundNo.trim();
    }

    public String getReimbursementNo() {
        return reimbursementNo;
    }

    public void setReimbursementNo(String reimbursementNo) {
        this.reimbursementNo = reimbursementNo == null ? null : reimbursementNo.trim();
    }

    public String getReimbursementInitiator() {
        return reimbursementInitiator;
    }

    public void setReimbursementInitiator(String reimbursementInitiator) {
        this.reimbursementInitiator = reimbursementInitiator == null ? null : reimbursementInitiator.trim();
    }

    public Integer getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(Integer businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getBusinessLocation() {
        return businessLocation;
    }

    public void setBusinessLocation(String businessLocation) {
        this.businessLocation = businessLocation == null ? null : businessLocation.trim();
    }

    public String getBusinessData() {
        return businessData;
    }

    public void setBusinessData(String businessData) {
        this.businessData = businessData == null ? null : businessData.trim();
    }

    public String getBusinessReason() {
        return businessReason;
    }

    public void setBusinessReason(String businessReason) {
        this.businessReason = businessReason == null ? null : businessReason.trim();
    }

    public Integer getBillQuantity() {
        return billQuantity;
    }

    public void setBillQuantity(Integer billQuantity) {
        this.billQuantity = billQuantity;
    }

    public Integer getAppendix() {
        return appendix;
    }

    public void setAppendix(Integer appendix) {
        this.appendix = appendix;
    }

    public BigDecimal getCarCost() {
        return carCost;
    }

    public void setCarCost(BigDecimal carCost) {
        this.carCost = carCost;
    }

    public BigDecimal getTrainCost() {
        return trainCost;
    }

    public void setTrainCost(BigDecimal trainCost) {
        this.trainCost = trainCost;
    }

    public BigDecimal getAirplaneCost() {
        return airplaneCost;
    }

    public void setAirplaneCost(BigDecimal airplaneCost) {
        this.airplaneCost = airplaneCost;
    }

    public BigDecimal getSteamerCost() {
        return steamerCost;
    }

    public void setSteamerCost(BigDecimal steamerCost) {
        this.steamerCost = steamerCost;
    }

    public BigDecimal getHotelCost() {
        return hotelCost;
    }

    public void setHotelCost(BigDecimal hotelCost) {
        this.hotelCost = hotelCost;
    }

    public BigDecimal getConferenceCost() {
        return conferenceCost;
    }

    public void setConferenceCost(BigDecimal conferenceCost) {
        this.conferenceCost = conferenceCost;
    }

    public BigDecimal getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(BigDecimal otherCost) {
        this.otherCost = otherCost;
    }

    public BigDecimal getTravelAllowance() {
        return travelAllowance;
    }

    public void setTravelAllowance(BigDecimal travelAllowance) {
        this.travelAllowance = travelAllowance;
    }

    public BigDecimal getFoodAllowance() {
        return foodAllowance;
    }

    public void setFoodAllowance(BigDecimal foodAllowance) {
        this.foodAllowance = foodAllowance;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getReimbursementAmount() {
        return reimbursementAmount;
    }

    public void setReimbursementAmount(BigDecimal reimbursementAmount) {
        this.reimbursementAmount = reimbursementAmount;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public String getCheckerNumber() {
        return checkerNumber;
    }

    public void setCheckerNumber(String checkerNumber) {
        this.checkerNumber = checkerNumber == null ? null : checkerNumber.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}