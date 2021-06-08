package com.example.Smart_campus.dao;

import com.example.Smart_campus.bean.Municipal_bean;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/6/7 16:49 星期一
 */

public interface MunicipalDao {

    /**
     * @param provinceId 省级id
     * @return 通过省级id查询市
     */
    public List<Municipal_bean> query_provinceId(String provinceId);

    public List<Municipal_bean> query();

}
