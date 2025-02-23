package com.xingchen.furns.dao;

import com.xingchen.furns.entity.Furn;

import java.util.List;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public interface FurnDAO {
    public List<Furn> queryFurns();


    /**
     * int 是受影响的行数
     * @param furn
     * @return
     */
    public int addFurn(Furn furn);

    public int deleteFurnById(int id);

    public int updateFurn(Furn furn);

    public Furn queryFurnById(int id);


    //Page的哪些属性是可以直接从数据库中获取 就把这个任务放在DAO
    public int getTotalRow();
    //获取当前页要显示的数据
    //begin：表示从第几条记录开始获取，从0开始计算
    //pageSize:表示要取出多少条记录
    public List<Furn> getPageItems(int begin,int pageSize);

}
