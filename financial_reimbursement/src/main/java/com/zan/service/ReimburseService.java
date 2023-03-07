package com.zan.service;

import com.zan.vo.ReimburseAllVo;
import com.zan.vo.ReimburseListVo;
import com.zan.vo.ResponseVo;

import java.util.List;

public interface ReimburseService {

    //发起报销
    void addReimburse();

    //报销详情
    ResponseVo<ReimburseAllVo> reimburseDetail(Integer userId, String reimbursementNo);

    //报销记录
    ResponseVo<List<ReimburseListVo>> reimburseList(Integer userId);

}
