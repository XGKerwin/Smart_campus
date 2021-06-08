package com.example.Smart_campus.dao.impl;

import com.example.Smart_campus.bean.Work_nature_bean;
import com.example.Smart_campus.dao.Work_natureDao;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/6/7 17:23 星期一
 */

public class Work_natureDaoImpL extends BaseDao implements Work_natureDao {

    /**
     * 从查询就业类型
     * @return
     */
    @Override
    public List<Work_nature_bean> query() {
        String sql = "select * from work_nature";
        return queryForList(Work_nature_bean.class,sql);
    }
}
