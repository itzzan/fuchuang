package com.zan.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

//项目详细信息
@Data
public class ProjectVo {
    private Integer projectId;

    private String projectName;

    private String projectCode;

    private String projectLeader;

    private Integer projectStatus;

    private BigDecimal projectBudget;

    private BigDecimal projectBudgetBalance;

    private Date startTime;

    private List<BudgetVo> budgetVoList;

}
