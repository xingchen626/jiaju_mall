package com.xingchen.furns.dao.impl;

import com.xingchen.furns.dao.BasicDAO;
import com.xingchen.furns.dao.FurnDAO;
import com.xingchen.furns.entity.Furn;

import java.util.Collections;
import java.util.List;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class FurnDAOImpl extends BasicDAO<Furn> implements FurnDAO {

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

    @Override
    public int deleteFurnById(int id) {
        String sql = "DELETE FROM furn WHERE `id` = ?";
        return update(sql, id);
    }

    @Override
    public int updateFurn(Furn furn) {
          String sql = "UPDATE `furn` SET `name` =?, `maker` =?, `price` =?," +
                  " `sales` =?, `stock` =?, `img_path` = ? " +
                  "WHERE id =?";
        return update(sql, furn.getName(),furn.getMaker(),furn.getPrice(),furn.getSales(),furn.getStock(),furn.getImgPath(),furn.getId());
    }

    @Override
    public Furn queryFurnById(int id) {
        String sql = "SELECT `id`, `name` , `maker`, `price`, `sales`, `stock`, `img_path` imgPath FROM furn WHERE `id` = ?";
        return querySingle(sql,Furn.class,id);
    }

    @Override
    public int getTotalRow() {
        String sql = "SELECT COUNT(*) FROM `furn`";
        return ((Number)queryScalar(sql)).intValue();
    }

    @Override
    public List<Furn> getPageItems(int begin,int pageSize) {
        String sql = "SELECT `id`, `name` , `maker`, `price`, `sales`, `stock`, `img_path` imgPath FROM furn LIMIT ?,? ";
        return queryMulti(sql,Furn.class,begin,pageSize);
    }


}
