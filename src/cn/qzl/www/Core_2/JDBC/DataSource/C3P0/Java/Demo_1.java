package cn.qzl.www.Core_2.JDBC.DataSource.C3P0.Java;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @description: 数据库连接池从c3p0案例1
 * @author: qzl
 * @created: 2020/07/17 16:35
 */

public class Demo_1 {
    public static void main(String[] args) throws SQLException {
        //创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();
        //获取连接对象
        Connection con = ds.getConnection();

        System.out.println(con);
    }
}
