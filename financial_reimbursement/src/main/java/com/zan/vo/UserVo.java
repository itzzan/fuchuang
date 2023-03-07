package com.zan.vo;

import lombok.Data;

@Data
public class UserVo {
    private Integer userId;

    private String username;

    private String password;

    private String number;

    private String phone;

    private String email;

    private Integer role;

    private String position;

    private String school;

    private String college;

    private String city;

    private Integer status;
}
