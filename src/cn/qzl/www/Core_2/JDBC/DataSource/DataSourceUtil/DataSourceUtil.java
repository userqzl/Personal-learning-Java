package cn.qzl.www.Core_2.JDBC.DataSource.DataSourceUtil;

import cn.qzl.www.Core_2.JDBC.DataSource.Druid.Demo_1;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @description: DataSuorceUtil工具类
 * @author: qzl
 * @created: 2020/07/18 21:41
 */

public class DataSourceUtil {
    private static Properties properties;
    private static DataSource dataSource = null;

    //加载配置文件
    static {
        //加载配置文件
        properties = new Properties();
        InputStream resourceAsStream = Demo_1.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            properties.load(resourceAsStream);
            //获取数据库连接池对象

            dataSource =  DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取数据库连接池对象
    public static DataSource getDataSource(){
        return dataSource;
    }

    //获取数据库连接对象
    public static Connection getConnection(){
        Connection con = null;
        try {
            con =  dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    //释放资源/归还连接
    public static void close(ResultSet resultSet, Statement statement,Connection con){
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //归还连接
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(ResultSet resultSet, PreparedStatement statement, Connection con){
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //归还连接
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement statement, Connection con) {
        close(null, statement, con);
    }
    public static void close(Statement statement, Connection con) {
        close(null, statement, con);
    }
}
