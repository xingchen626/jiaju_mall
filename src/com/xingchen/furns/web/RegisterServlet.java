package com.xingchen.furns.web;

import com.xingchen.furns.entity.Member;
import com.xingchen.furns.service.impl.MemberService;
import com.xingchen.furns.service.impl.MemberServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class RegisterServlet extends HttpServlet{
    private MemberService memberService = new MemberServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



   // 接收用户接收信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        if(!memberService.isExistMember(username)){
            Member member = new Member(null, username, password, email);
            if (memberService.registerMember(member)){
                req.getRequestDispatcher("/views/member/register_ok.html").forward(req, resp);
            }else{
                req.getRequestDispatcher("/views/member/register_fail.html").forward(req, resp);
            }
        }else {
            req.getRequestDispatcher("/views/member/register_login.html").forward(req, resp);

        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
