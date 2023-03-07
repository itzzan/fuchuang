package com.zan.service.impl;

import com.zan.enums.ResponseEnum;
import com.zan.mapper.UserMapper;
import com.zan.pojo.User;
import com.zan.service.UserService;
import com.zan.vo.ResponseVo;
import com.zan.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //登录
    @Override
    public ResponseVo<UserVo> login(String username, String password) {
        //通过用户名查询数据
        User user = userMapper.selectByUsername(username);
        if (user == null) {
            //用户不存在，登录失败【用户名或密码错误】安全措施，不能让用户知道哪个错
            //返回：用户名或密码错误
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }
        //判断密码是否正确(将密码进行md5加密后在进行比较)
        if (!user.getPassword().equalsIgnoreCase(DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8)))) {
            //密码错误(返回：用户名或密码错误)
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }

        UserVo userVo = new UserVo();

        BeanUtils.copyProperties(user, userVo);

        //为了返回的json数据中不显示密码，将密码置空
        user.setPassword("");
        return ResponseVo.success(userVo);
    }
}
