package com.example.Smart_campus.dao;

import com.example.Smart_campus.bean.Student_bean;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/6/8 15:36 星期二
 */

public interface StudentDao {

    /**
     *
     * @return 学生表的所有内容
     */
    public List<Student_bean> query();

}
