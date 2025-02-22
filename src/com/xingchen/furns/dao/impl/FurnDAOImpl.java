package com.xingchen.furns.dao.impl;

import com.xingchen.furns.entity.Furn;

import java.util.Collections;
import java.util.List;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class FurnDAOImpl extends BasicDAO<Furn> implements FurnDAO{

    @Override
    public List<Furn> queryFurns() {
        String sql = "SELECT `id`, `name` , `maker`, `price`, `sales`, `stock`, `img_path` imgPath FROM furn";
        return queryMulti(sql, Furn.class);
    }

    @Override
    public int addFurn(Furn furn) {
        String sql = "INSERT INTO furn(`id` , `name` , `maker` , `price` , `sales` , `stock` , `img_path`) " +
                "VALUES(NULL , ? , ? , ?, ? , ? , ?)";
        return update(sql, furn.getName(),furn.getMaker(),furn.getPrice(),furn.getSales(),
                furn.getStock(),furn.getImgPath());
    }


}
