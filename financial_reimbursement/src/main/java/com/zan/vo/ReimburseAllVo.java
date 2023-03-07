package com.zan.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ReimburseAllVo {

    private String reimburseType;//报销类别，这个要自己设置

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

    private BigDecimal carCost;

    private BigDecimal trainCost;

    private BigDecimal airplaneCost;

    private BigDecimal steamerCost;

    private BigDecimal hotelCost;

    private BigDecimal conferenceCost;

    private BigDecimal otherCost;

    private BigDecimal travelAllowance;

    private BigDecimal foodAllowance;

    private Integer billQuantity;

    private Integer appendix;

    private BigDecimal money;

    private BigDecimal reimbursementAmount;

    private String checker;

    private String checkerNumber;

    private Integer status;

    private Date createTime;

}
