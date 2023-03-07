package com.zan.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

//报销记录Vo
@Data
public class ReimburseListVo {
    //报销单号
    private String reimbursementNo;

    //报销金额
    private BigDecimal money;

    //报销状态
    private Integer status;

    //报销时间
    private Date createTime;

}
