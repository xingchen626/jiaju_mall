package com.xingchen.furns.entity;

import java.util.List;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */


//Page是一个JavaBean 是一个分页的数据模型(包含分页的各种信息)
//T表示泛型，因为将来分页模型对应的数据类型是不确定的
public class Page<T> {
     public static final Integer PAGE_SIZE = 3;

    //表示每页显示几条记录
     private Integer pageSize = PAGE_SIZE;
     //显示第几页
     private Integer pageNo;
     //表示共有多少页 由计算得到
     private Integer PageTotalCount;
     //表示的是共有多少条记录
     private Integer totalRow;
     //当前页要显示的数据
     private List<T> items;
     //分页导航的字符串
     private String url;


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageTotalCount() {
        return PageTotalCount;
    }

    public void setPageTotalCount(Integer pageTotalCount) {
        PageTotalCount = pageTotalCount;
    }

    public Integer getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(Integer totalRow) {
        this.totalRow = totalRow;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
