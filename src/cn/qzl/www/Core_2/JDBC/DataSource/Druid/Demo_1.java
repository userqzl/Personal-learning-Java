package cn.qzl.www.Core_2.JDBC.DataSource.Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @description: druid数据库连接池案例1
 * @author: qzl
 * @created: 2020/07/17 19:05
 */

public class Demo_1 {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Properties properties = new Properties();
        InputStream resourceAsStream = Demo_1.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(resourceAsStream);

        //获取数据库连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //获取连接
        Connection con = dataSource.getConnection();

        System.out.println(con);
    }
}
