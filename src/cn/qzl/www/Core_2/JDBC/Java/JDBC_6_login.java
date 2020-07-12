package cn.qzl.www.Core_2.JDBC.Java;

import cn.qzl.www.Core_2.JDBC.util.JDBCUtil;

import java.sql.*;
import java.util.Scanner;

/**
 * @description: 数据库登录案例
 * @author: qzl
 * @created: 2020/07/12 12:16
 */

public class JDBC_6_login {
    public static void main(String[] args) {
        Connection con = null;
        Statement state = null;
        try {
            con = JDBCUtil.getConnect();
            //获取数据库执行对象
            state = con.createStatement();
            //用户输入账号密码
            String user = null;
            String pwd = null;
            Scanner in = new Scanner(System.in);
            System.out.println("请输入账号：");
            user = in.next();
            System.out.println("请输入密码：");
            pwd = in.next();

            //定义sql语句
            String sql = "select password from user_login where user = "+"'"+user+"'";
            //执行sql语句
            ResultSet resultSet = state.executeQuery(sql);
            while(resultSet.next()){
                if(resultSet.getString("password").equals(pwd)){
                    System.out.println("登录成功！");
                }
                else{
                    System.out.println("登录失败，用户名或密码错误！");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.close(state,con);
        }
        //
    }
}
