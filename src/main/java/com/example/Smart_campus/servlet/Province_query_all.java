package com.example.Smart_campus.servlet;

import com.example.Smart_campus.bean.Province_bean;
import com.example.Smart_campus.dao.impl.ProvinceDaoImpl;
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
 * @date 2021/6/7 16:32 星期一
 */

/**
 * 查询所有省
 */
@WebServlet(name = "province_query_all",value = "/province_query_all")
public class Province_query_all extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        List<Province_bean> province_beans = new ProvinceDaoImpl().query();
        JSONObject jsonObject = new JSONObject();
        if (province_beans != null) {
            jsonObject.put("data",new JSONArray(province_beans));
        }
        ServletUtils.isOk(jsonObject,province_beans != null);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
