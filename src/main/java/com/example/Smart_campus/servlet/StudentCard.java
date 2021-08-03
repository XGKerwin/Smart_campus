package com.example.Smart_campus.servlet;

import com.example.Smart_campus.bean.Student;
import com.example.Smart_campus.dao.impl.StudentDaoImpl;
import com.example.Smart_campus.utils.ServletUtils;
import org.json.JSONObject;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 关鑫
 * @date 2021/8/3 15:07 星期二
 */
@WebServlet(name = "getStudentCard", value = "/getStudentCard")
public class StudentCard extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        Student card = new StudentDaoImpl().queryStudentCard(jsonObject.optString("card"));
        String password = card.getPassword();
        if ("".equals(password)){
            System.out.println("123");
        }else {
            System.out.println("456");
        }
        System.out.println(password);
        JSONObject jsonObject1 = new JSONObject(card);
        ServletUtils.isOk(jsonObject1, card != null);
        resp.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
