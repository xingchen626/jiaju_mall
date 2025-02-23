package com.xingchen.furns.service.impl;

import com.xingchen.furns.entity.Furn;
import com.xingchen.furns.entity.Page;

import java.util.List;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public interface FurnService {
    /**
     * 返回家具信息
     * @return
     */
    public List<Furn> queryFurns();

    public int add(Furn furn);

    public int deleteFurnById(int id);

    public int updateFurn(Furn furn);

    public Furn queryFurnById(int id);


    /**
     * 根据传入的pageNo 和pageSize 返回对应的page对象
     * @param pageNo
     * @param pageSize
     * @return
     */
    public Page<Furn> page(int pageNo, int pageSize);
}
