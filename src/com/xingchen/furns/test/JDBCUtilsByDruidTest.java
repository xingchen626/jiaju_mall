package com.xingchen.furns.test;

import com.xingchen.furns.utils.JDBCUtilsByDruid;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class JDBCUtilsByDruidTest {

    @Test
    public void getConnection() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        System.out.println(connection);
        JDBCUtilsByDruid.close(null,null,connection);
    }
}
