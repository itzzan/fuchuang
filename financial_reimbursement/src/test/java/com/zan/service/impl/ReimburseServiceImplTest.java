package com.zan.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zan.service.ReimburseService;
import com.zan.vo.ReimburseAllVo;
import com.zan.vo.ReimburseListVo;
import com.zan.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
@Slf4j
class ReimburseServiceImplTest {

    @Autowired
    private ReimburseService reimburseService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    void addReimburse() {
    }

    @Test
    void reimburseDetail() {
        ResponseVo<ReimburseAllVo> responseVo = reimburseService.reimburseDetail(1, "2023030303");
        log.info("responseVo={}", gson.toJson(responseVo));
    }

    //报销记录
    @Test
    void reimburseList() {
        ResponseVo<List<ReimburseListVo>> responseVo = reimburseService.reimburseList(1);
        log.info("responseVo={}", gson.toJson(responseVo));
    }
}