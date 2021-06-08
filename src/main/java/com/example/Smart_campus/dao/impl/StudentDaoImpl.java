package com.example.Smart_campus.dao.impl;

import com.example.Smart_campus.bean.Student_bean;
import com.example.Smart_campus.dao.StudentDao;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/6/8 15:37 星期二
 */

public class StudentDaoImpl extends BaseDao implements StudentDao {


    /**
     * 查询学生表的所有内容
     * @return
     */
    @Override
    public List<Student_bean> query() {
        String sql = "select * from student";
        return queryForList(Student_bean.class,sql);
    }
}
