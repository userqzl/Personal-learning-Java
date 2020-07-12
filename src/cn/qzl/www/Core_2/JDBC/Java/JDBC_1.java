package cn.qzl.www.Core_2.JDBC.Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @description:
 * @author: qzl
 * @created: 2020/07/11 11:55
 */

public class JDBC_1 {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取数据库连接对象
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_3?serverTimezone=GMT%2B8","root","0502xsga230114");
        //定义sql语句
        String sql = "update student set math = 100 where stu_id = 1001";
        //获取执行sql对象
        Statement stmt = con.createStatement();
        int count =stmt.executeUpdate(sql);
        //处理结果
        System.out.println(count);
        //释放资源
        stmt.close();
        con.close();
    }
}
