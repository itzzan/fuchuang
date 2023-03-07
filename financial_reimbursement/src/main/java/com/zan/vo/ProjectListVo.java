package com.zan.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

//项目记录
@Data
public class ProjectListVo {
    private String projectName;

    private String projectCode;

    private BigDecimal projectBudgetBalance;

    private Date startTime;

}
