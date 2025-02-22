package com.xingchen.furns.service.impl;

import com.xingchen.furns.dao.FurnDAO;
import com.xingchen.furns.dao.impl.FurnDAOImpl;
import com.xingchen.furns.entity.Furn;

import java.util.List;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class FurnServiceImpl implements FurnService {
    private FurnDAO furnDAO  = new FurnDAOImpl();

    @Override
    public List<Furn> queryFurns() {
        return furnDAO.queryFurns();
    }

    @Override
    public int add(Furn furn) {
        return furnDAO.addFurn(furn);
    }

    @Override
    public int deleteFurnById(int id) {
        return furnDAO.deleteFurnById(id);
    }

    @Override
    public int updateFurn(Furn furn) {
        return furnDAO.updateFurn(furn);
    }

    @Override
    public Furn queryFurnById(int id) {
        return furnDAO.queryFurnById(id);
    }


}
