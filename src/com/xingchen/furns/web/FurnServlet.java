package com.xingchen.furns.web;

import com.xingchen.furns.entity.Furn;
import com.xingchen.furns.entity.Page;
import com.xingchen.furns.service.impl.FurnService;
import com.xingchen.furns.service.impl.FurnServiceImpl;
import com.xingchen.furns.utils.DataUtils;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class FurnServlet extends BasicServlet {
    private FurnService furnService = new FurnServiceImpl();


    /**
     * 处理分页请求
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pageNo = DataUtils.parseInt(req.getParameter("pageNo"), 1);
        int pageSize = DataUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);

        Page<Furn> page = furnService.page(pageNo, pageSize);
         req.setAttribute("page", page);

         req.getRequestDispatcher("/views/manage/furn_manage.jsp").forward(req, resp);

    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Furn furn = DataUtils.copyParamToBean(req.getParameterMap(), new Furn());
        furnService.updateFurn(furn);
        resp.sendRedirect(req.getContextPath() +
                "/manage/furnServlet?action=page&pageNo=" + req.getParameter("pageNo"));
    }


    protected void showFurn(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = DataUtils.parseInt(req.getParameter("id"), 0);
        Furn furn = furnService.queryFurnById(id);

        req.setAttribute("furn", furn);
        req.getRequestDispatcher("/views/manage/furn_update.jsp").forward(req, resp);
    }




    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Furn> furns = furnService.queryFurns();
        req.setAttribute("furns", furns);
        req.getRequestDispatcher("/views/manage/furn_manage.jsp").forward(req, resp);

    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String maker = req.getParameter("maker");
//        String price = req.getParameter("price");
//        String sales = req.getParameter("sales");
//        String stock = req.getParameter("stock");

//        后端的数据校验
//        Furn furn = null;
//        try {
//            furn = new Furn(null,name,maker,new BigDecimal(price),new Integer(sales),new Integer(stock),"assets/images/product-image/default.jpg");
//
//        } catch (NumberFormatException e) {
//            req.setAttribute("mes","添加数据格式有误");
//            req.getRequestDispatcher("/views/manage/furn_add.jsp").forward(req, resp);
//            return;
//        }

//       Furn furn = new Furn(null,name,maker,new BigDecimal(price),new Integer(sales),new Integer(stock),"assets/images/product-image/default.jpg");
//       furnService.add(furn);



//          请求转发到家具显示页面 会产生bug
//        req.getRequestDispatcher("/manage/furnServlet?action=list").forward(req, resp);


//        //使用BeanUtils完成javabean对象的自动封装
//        Furn furn = new Furn();
//        try {
//            BeanUtils.populate(furn,req.getParameterMap());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        furnService.add(furn);


        Furn furn = DataUtils.copyParamToBean(req.getParameterMap(), new Furn());
         furnService.add(furn);
        //所以使用重定向
        resp.sendRedirect(req.getContextPath() + "/manage/furnServlet?action=page&pageNo=" + req.getParameter("pageNo"));
    }

    protected void del(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = DataUtils.parseInt(req.getParameter("id") , 0);
        furnService.deleteFurnById(id);

        resp.sendRedirect(req.getContextPath() + "/manage/furnServlet?action=page&pageNo=" + req.getParameter("pageNo"));
    }



}
