package com.example.Smart_campus.servlet;

import com.example.Smart_campus.bean.Major_bean;
import com.example.Smart_campus.dao.impl.MajorDaoImpl;
import com.example.Smart_campus.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 关鑫
 * @date 2021/6/7 16:16 星期一
 */

/**
 * 查询所有专业
 */
@WebServlet(name = "getMajor_query_all",value = "/getMajor_query_all")
public class Major_query_all extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Major_bean> major_beans = new MajorDaoImpl().query_college();
        JSONObject jsonObject = new JSONObject();
        if (major_beans != null){
            jsonObject.put("data",new JSONArray(major_beans));
        }
        ServletUtils.isOk(jsonObject,major_beans != null);
        resp.getWriter().write(jsonObject.toString());
    }
}
