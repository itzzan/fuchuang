package com.zan.mapper;

import com.zan.pojo.Budget;
import com.zan.vo.BudgetVo;

import java.util.List;

public interface BudgetMapper {
    int deleteByPrimaryKey(Integer budgetId);

    int insert(Budget record);

    int insertSelective(Budget record);

    Budget selectByPrimaryKey(Integer budgetId);

    int updateByPrimaryKeySelective(Budget record);

    int updateByPrimaryKey(Budget record);

    List<BudgetVo> selectByProjectId(Integer projectId);
}