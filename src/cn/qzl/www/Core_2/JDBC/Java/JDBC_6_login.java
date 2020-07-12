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
        Scanner in = new Scanner(System.in);
        System.out.println("请输入账号：");
        String user = in.next();
        System.out.println("请输入密码：");
        String pwd = in.next();

        JDBC_6_login login = new JDBC_6_login();
        boolean islogin = login.login(user,pwd);
        if(islogin){
            System.out.println("登录成功！");
        }
        else{
            System.out.println("登录失败，用户名或密码错误！");
        }
    }
    public boolean login (String user,String pwd){
        Connection con = null;
        Statement state = null;
        ResultSet resultSet = null;
        try {
            con = JDBCUtil.getConnect();
            //获取数据库执行对象
            state = con.createStatement();

            //定义sql语句
            String sql = "select * from user_login where user = "+"'"+user+"' and password = '"+pwd+"'";
            //执行sql语句
            resultSet = state.executeQuery(sql);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.close(resultSet,state,con);
        }
        return false;
    }
}
