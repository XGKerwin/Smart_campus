package com.example.Smart_campus.dao.impl;

import com.example.Smart_campus.bean.Municipal_bean;
import com.example.Smart_campus.dao.MunicipalDao;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/6/7 16:43 星期一
 */

public class Municipal_DaoImpl extends BaseDao implements MunicipalDao {

    /**
     *  通过省级id查询市
     * @param provinceId 省级id
     * @return
     */
    @Override
    public List<Municipal_bean> query_provinceId(String provinceId) {
        String sql = "select * from municipal where provinceId = ?";
        return queryForList(Municipal_bean.class,sql,provinceId);
    }

    @Override
    public List<Municipal_bean> query() {
        String sql = "select * from municipal";
        return queryForList(Municipal_bean.class,sql);
    }
}
