package com.xingchen.furns.web;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QDecoderStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public abstract class BasicServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String action = req.getParameter("action");
//        如果使用了模板模式+反射+动态绑定，要满足action的value和方法名一致
        //使用反射,获取当前对象的方法
        //1.this就是请求的ServLet
        //2.declaredMethod方法对象就是当前请求的servlet对应的action名字的方法
        try {
            Method declaredMethod = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            //使用方法对象，进行反射调用
            declaredMethod.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
