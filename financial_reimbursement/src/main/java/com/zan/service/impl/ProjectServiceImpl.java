package com.zan.service.impl;

import com.zan.enums.ResponseEnum;
import com.zan.mapper.BudgetMapper;
import com.zan.mapper.ProjectMapper;
import com.zan.pojo.Project;
import com.zan.service.ProjectService;
import com.zan.vo.BudgetVo;
import com.zan.vo.ProjectListVo;
import com.zan.vo.ProjectVo;
import com.zan.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Autowired
    private BudgetMapper budgetMapper;

    //显示详细信息
    @Override
    public ResponseVo<ProjectVo> projectDetail(String projectCode) {
        Project project = projectMapper.selectByProjectCode(projectCode);
        if (project == null) {
            //没有该项目
            ResponseVo.error(ResponseEnum.PROJECT_NOT_EXIST);
        }

        ProjectVo projectVo = new ProjectVo();

        BeanUtils.copyProperties(project, projectVo);

        //查找预算余额具体情况
        List<BudgetVo> budgetVoList = budgetMapper.selectByProjectId(project.getProjectId());
        projectVo.setBudgetVoList(budgetVoList);

        return ResponseVo.success(projectVo);
    }

    //显示项目记录
    @Override
    public ResponseVo<List<ProjectListVo>> projectList() {
        //查找整个数据库，获取数据
        //将其降序输出成list集合
        List<Project> projectList = projectMapper.selectAllDescByTime();

        List<ProjectListVo> projectListVoList = new ArrayList<>();

        //将数据存储到projectRecordVoList中，变成项目记录
        for (Project project : projectList) {
            ProjectListVo projectListVo = new ProjectListVo();
            BeanUtils.copyProperties(project, projectListVo);
            //存储到projectRecordVoList集合中
            projectListVoList.add(projectListVo);
        }

        return ResponseVo.success(projectListVoList);
    }
}
