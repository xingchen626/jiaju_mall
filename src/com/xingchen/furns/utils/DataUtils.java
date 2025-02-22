package com.xingchen.furns.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class DataUtils {
    public static <T> T copyParamToBean(Map value, T bean){
        try {
            BeanUtils.populate(bean,value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return bean;
    }

    public static int parseInt(String value, int defaultValue) {
        try {
             return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println( value + "格式不正确");
        }

        return defaultValue;
    }
}
