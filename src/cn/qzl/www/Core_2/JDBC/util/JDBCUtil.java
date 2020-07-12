package cn.qzl.www.Core_2.JDBC.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @description: JDBC工具类
 * 负责注册数据库驱动，释放资源
 * @author: qzl
 * @created: 2020/07/12 16:10
 */

public class JDBCUtil {

    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    public static void main(String[] args) {

    }

    //读取配置文件，初始化url、user、password、driver
    static {
        try {
            //读取资源文件
            Properties pro = new Properties();
            //加载文件
            ClassLoader classLoader = JDBCUtil.class.getClassLoader();
            URL res = classLoader.getResource("jdbc.properties");
            String path = res.getPath();
            System.out.println(path);
            pro.load(new FileReader(path));
            //读取配置文件的值，赋值给实例域
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
//            System.out.println(url);
//            System.out.println(user);
//            System.out.println(password);
//            System.out.println(driver);

            //注册驱动
            Class.forName(driver);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //注册数据库驱动，返回数据库连接对象
    public static Connection getConnect() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    //释放资源
    public static void close(Statement statement,Connection con){
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
