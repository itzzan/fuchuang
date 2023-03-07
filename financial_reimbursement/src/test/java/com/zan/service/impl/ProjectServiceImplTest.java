package com.zan.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zan.service.ProjectService;
import com.zan.vo.ProjectListVo;
import com.zan.vo.ProjectVo;
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
class ProjectServiceImplTest {

    @Autowired
    private ProjectService projectService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    void projectMessage() {
        ResponseVo<ProjectVo> responseVo = projectService.projectDetail("20230307001");
        log.info("responseVo={}", gson.toJson(responseVo));
    }

    @Test
    public void projectRecord() {
        ResponseVo<List<ProjectListVo>> responseVo = projectService.projectList();
        log.info("responseVo={}", gson.toJson(responseVo));
    }
}