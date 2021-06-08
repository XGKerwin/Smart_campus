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
 * @date 2021/6/7 16:01 星期一
 */

/**
 * 通过所在系查询专业
 */
@WebServlet(name = "getMajor_query_collegeId",value = "/getMajor_query_collegeId")
public class Major_query_collegeId extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Major_bean> major_beans = new MajorDaoImpl().query_collegeId(jsonObject.optString("collegeId"));
        JSONObject jsonObject1 = new JSONObject();
        if (major_beans != null){
            jsonObject1.put("data",new JSONArray(major_beans));
        }
        ServletUtils.isOk(jsonObject1,major_beans != null);
        resp.getWriter().write(jsonObject1.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
