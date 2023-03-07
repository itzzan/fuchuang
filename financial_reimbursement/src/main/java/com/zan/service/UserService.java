package com.zan.service;

import com.zan.vo.ResponseVo;
import com.zan.vo.UserVo;

public interface UserService {

    //登录
    ResponseVo<UserVo> login(String username, String password);


}
