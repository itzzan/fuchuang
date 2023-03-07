package com.zan.mapper;

import com.zan.pojo.DailyReimbursement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DailyReimbursementMapper {
    int deleteByPrimaryKey(Integer reimbursementId);

    int insert(DailyReimbursement record);

    int insertSelective(DailyReimbursement record);

    DailyReimbursement selectByPrimaryKey(Integer reimbursementId);

    int updateByPrimaryKeySelective(DailyReimbursement record);

    int updateByPrimaryKey(DailyReimbursement record);

    List<DailyReimbursement> selectByUserId(@Param("userId") Integer userId);
}