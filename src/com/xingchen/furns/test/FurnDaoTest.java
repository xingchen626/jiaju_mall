package com.xingchen.furns.test;

import com.xingchen.furns.dao.FurnDAO;
import com.xingchen.furns.dao.impl.FurnDAOImpl;
import com.xingchen.furns.entity.Furn;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */

public class FurnDaoTest {
      private FurnDAO furnDao = new FurnDAOImpl();
      @Test
      public  void  queryFurns(){
          List<Furn> furns = furnDao.queryFurns();
          for(Furn furn : furns){
              System.out.println(furn);
          }
      }
      @Test
      public  void  add(){
          Furn furn = new Furn(null, "小沙发", "顺平家居", new BigDecimal(999.9), 100, 10, "assets/images/product-image/16.jpg");
          System.out.println(furnDao.addFurn(furn));
      }

      @Test
      public  void  getTotalRow(){
          System.out.println(furnDao.getTotalRow());
      }

      @Test
      public void getPageItems(){
          List<Furn> pageItems = furnDao.getPageItems(0, 3);
          for(Furn furn : pageItems){
              System.out.println(furn);
          }
      }
}
