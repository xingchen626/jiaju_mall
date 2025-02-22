package com.xingchen.furns.test;

import com.xingchen.furns.entity.Furn;
import com.xingchen.furns.service.impl.FurnService;
import com.xingchen.furns.service.impl.FurnServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class FurnServiceTest {
    private FurnService furnService = new FurnServiceImpl();

    @Test
    public void queryFurns() {
        List<Furn> furns = furnService.queryFurns();
      for (Furn furn : furns) {
          System.out.println(furn);
      }
    }

    @Test
    public void addFurn() {
        Furn furn = new Furn(null, "小沙发", "顺平家居", new BigDecimal(999.9), 100, 10, "assets/images/product-image/16.jpg");
        furnService.add(furn);
    }

    @Test
    public void deleteFurnById() {
        System.out.println(furnService.deleteFurnById(9));
    }
    @Test
    public void queryFurnById() {
        System.out.println(furnService.queryFurnById(1));
    }

    @Test
    public void updateFurn() {
        Furn furn = new Furn(4, "小沙发", "顺平家居", new BigDecimal(999.9), 100, 10, "assets/images/product-image/16.jpg");
        System.out.println(furnService.updateFurn(furn));
    }
}
