package com.zan.service;

import com.zan.vo.ProjectListVo;
import com.zan.vo.ProjectVo;
import com.zan.vo.ResponseVo;

import java.util.List;

public interface ProjectService {

    //项目详情
    ResponseVo<ProjectVo> projectDetail(String projectCode);

    //项目记录
    ResponseVo<List<ProjectListVo>> projectList();
}
