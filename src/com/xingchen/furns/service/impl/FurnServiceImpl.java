package com.xingchen.furns.service.impl;

import com.xingchen.furns.dao.FurnDAO;
import com.xingchen.furns.dao.impl.FurnDAOImpl;
import com.xingchen.furns.entity.Furn;
import com.xingchen.furns.entity.Page;

import java.util.List;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class FurnServiceImpl implements FurnService {
    private FurnDAO furnDAO = new FurnDAOImpl();

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

    @Override
    public Page<Furn> page(int pageNo, int pageSize) {
        Page<Furn> page = new Page<>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);

        int totalRow = furnDAO.getTotalRow();
        page.setTotalRow(totalRow);

        int pageTotalCount = totalRow / pageSize;
        if (totalRow % pageSize > 0) {
            pageTotalCount += 1;
        }
        page.setPageTotalCount(pageTotalCount);

        int begin = (pageNo - 1) * pageSize;
        List<Furn> pageItems = furnDAO.getPageItems(begin, pageSize);
        page.setItems(pageItems);

        return page;

    }


}
