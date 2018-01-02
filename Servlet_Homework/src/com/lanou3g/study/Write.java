package com.lanou3g.study;

import com.mysql.Database;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class Write extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String gender = req.getParameter("gender");
        try {
            int i = Database.add(username, gender);
            resp.getWriter().write("success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
