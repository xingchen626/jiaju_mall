package com.xingchen.furns.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class AdminServlet extends BasicServlet {

    protected void login (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //验证管理员的身份

        req.getRequestDispatcher("/views/manage/manage_menu.jsp").forward(req, resp);
    }


}
