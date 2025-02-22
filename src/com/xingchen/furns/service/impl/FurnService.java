package com.xingchen.furns.service.impl;

import com.xingchen.furns.entity.Furn;

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
}
