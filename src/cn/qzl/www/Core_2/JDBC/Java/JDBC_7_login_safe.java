package cn.qzl.www.Core_2.JDBC.Java;

import cn.qzl.www.Core_2.JDBC.util.JDBCUtil;

import java.sql.*;
import java.util.Scanner;

/**
 * @description: 使用PreparedStatement实现防sql注入登录案例
 * @author: qzl
 * @created: 2020/07/12 18:39
 */

public class JDBC_7_login_safe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入账号：");
        String user = in.nextLine();
        System.out.println("请输入密码：");
        String pwd = in.nextLine();

        JDBC_7_login_safe login = new JDBC_7_login_safe();
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
        PreparedStatement state = null;
        ResultSet resultSet = null;
        try {
            con = JDBCUtil.getConnect();

            //定义sql语句
            String sql = "select * from user_login where user = ? and password = ?";
            //获取数据库执行对象
            state = con.prepareStatement(sql);
            //给？赋值
            state.setString(1,user);
            state.setString(2,pwd);
            //执行查询
            resultSet = state.executeQuery();
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
