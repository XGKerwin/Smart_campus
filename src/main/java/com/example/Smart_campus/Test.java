package com.example.Smart_campus;

import com.example.Smart_campus.bean.College_bean;
import com.example.Smart_campus.dao.impl.CollegeDaoImpl;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/6/7 15:23 星期一
 */

public class Test {

    public static void main(String[] args) {
        List<College_bean> college = new CollegeDaoImpl().query();
        for (College_bean college_bean : college) {
            System.out.print(college_bean.getCollegeId());
            System.out.println(college_bean.getCollegeName());
        }
    }

}
