package com.zan.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DailyReimbursement {
    private Integer reimbursementId;

    private Integer userId;

    private Integer projectId;

    private String fundNo;

    private String reimbursementNo;

    private String reimbursementInitiator;

    private Integer billQuantity;

    private Integer appendix;

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