package com.example.Smart_campus.dao.impl;

import com.example.Smart_campus.bean.Province_bean;
import com.example.Smart_campus.dao.ProvinceDao;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/6/7 16:29 星期一
 */

public class ProvinceDaoImpl extends BaseDao implements ProvinceDao {

    /**
     * 查询所有省
     * @return
     */
    @Override
    public List<Province_bean> query() {
        String sql = "select * from province";
        return queryForList(Province_bean.class,sql);
    }

}
