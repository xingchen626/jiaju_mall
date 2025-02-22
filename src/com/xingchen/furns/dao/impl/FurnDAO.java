package com.xingchen.furns.dao.impl;

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
}
