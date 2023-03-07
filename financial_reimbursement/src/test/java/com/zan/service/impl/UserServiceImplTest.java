package com.zan.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zan.service.UserService;
import com.zan.vo.ResponseVo;
import com.zan.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Slf4j
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();


    @Test
    void login() {
        ResponseVo<UserVo> responseVo = userService.login("admin", "admin");
        log.info("responseVo={}", gson.toJson(responseVo));
    }
}