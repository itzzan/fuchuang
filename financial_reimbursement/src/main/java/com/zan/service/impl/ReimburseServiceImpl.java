package com.zan.service.impl;

import com.zan.enums.ResponseEnum;
import com.zan.mapper.DailyReimbursementMapper;
import com.zan.mapper.TravelReimbursementMapper;
import com.zan.pojo.DailyReimbursement;
import com.zan.pojo.TravelReimbursement;
import com.zan.service.ReimburseService;
import com.zan.vo.ReimburseAllVo;
import com.zan.vo.ReimburseListVo;
import com.zan.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReimburseServiceImpl implements ReimburseService {

    @Autowired
    private DailyReimbursementMapper dailyReimbursementMapper;

    @Autowired
    private TravelReimbursementMapper travelReimbursementMapper;

    @Override
    public void addReimburse() {

    }

    @Override
    public ResponseVo<ReimburseAllVo> reimburseDetail(Integer userId, String reimbursementNo) {
        ReimburseAllVo reimburseAllVo = new ReimburseAllVo();
        //根据报销单号去查找这次报销的详情
        List<ReimburseAllVo> reimburseAllListVoList = selectAll(userId);
        for (ReimburseAllVo reimburseAllListVo : reimburseAllListVoList) {
            //查找该报销，用报销单号去查找
            if (reimburseAllListVo.getReimbursementNo().equals(reimbursementNo)) {
                //找到了
                BeanUtils.copyProperties(reimburseAllListVo, reimburseAllVo);
                return ResponseVo.success(reimburseAllVo);
            }
        }
        return ResponseVo.error(ResponseEnum.ERROR);
    }

    //报销记录
    @Override
    public ResponseVo<List<ReimburseListVo>> reimburseList(Integer userId) {
        //查找总的
        List<ReimburseAllVo> reimburseAllListVoList = selectAll(userId);

        List<ReimburseListVo> reimburseListVoList = new ArrayList<>();

        //遍历总的
        for (ReimburseAllVo reimburseAllVo : reimburseAllListVoList) {
            ReimburseListVo reimburseListVo = new ReimburseListVo();
            BeanUtils.copyProperties(reimburseAllVo, reimburseListVo);
            reimburseListVoList.add(reimburseListVo);
        }

        return ResponseVo.success(reimburseListVoList);
    }

    //将日常报销和差旅报销两个查找出来并汇总
    public List<ReimburseAllVo> selectAll(Integer userId) {
        //根据userId查找这个人所有的报销记录
        //日常报销
        List<DailyReimbursement> dailyReimbursementList = dailyReimbursementMapper.selectByUserId(userId);
        //差旅报销
        List<TravelReimbursement> travelReimbursementList = travelReimbursementMapper.selectByUserId(userId);

        //将两个报销记录查出来后放在一起，按照时间降序排列
        List<ReimburseAllVo> reimburseAllListVoList = new ArrayList<>();

        for (DailyReimbursement dailyReimbursement : dailyReimbursementList) {
            //遍历日常报销，存到总的里面去
            ReimburseAllVo reimburseAllVo = new ReimburseAllVo();
            BeanUtils.copyProperties(dailyReimbursement, reimburseAllVo);
            reimburseAllVo.setReimburseType("日常报销");
            reimburseAllListVoList.add(reimburseAllVo);
        }

        //同样遍历差旅报销
        for (TravelReimbursement travelReimbursement : travelReimbursementList) {
            ReimburseAllVo reimburseAllVo = new ReimburseAllVo();
            BeanUtils.copyProperties(travelReimbursement, reimburseAllVo);
            reimburseAllVo.setReimburseType("差旅报销");
            reimburseAllListVoList.add(reimburseAllVo);
        }

        return reimburseAllListVoList;
    }
}
