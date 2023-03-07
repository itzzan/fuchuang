package com.zan.mapper;

import com.zan.pojo.TravelReimbursement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TravelReimbursementMapper {
    int deleteByPrimaryKey(Integer reimbursementId);

    int insert(TravelReimbursement record);

    int insertSelective(TravelReimbursement record);

    TravelReimbursement selectByPrimaryKey(Integer reimbursementId);

    int updateByPrimaryKeySelective(TravelReimbursement record);

    int updateByPrimaryKey(TravelReimbursement record);

    List<TravelReimbursement> selectByUserId(@Param("userId") Integer userId);
}