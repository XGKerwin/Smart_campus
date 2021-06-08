package com.example.Smart_campus.dao.impl;

import com.example.Smart_campus.bean.College_bean;
import com.example.Smart_campus.dao.CollegeDao;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/6/7 15:14 星期一
 */

public class CollegeDaoImpl extends BaseDao implements CollegeDao {


    /**
     * 查询学习奥所有系
     * @return
     */
    @Override
    public List<College_bean> query() {
        String sql = "select * from college";
        return queryForList(College_bean.class,sql);
    }

}


