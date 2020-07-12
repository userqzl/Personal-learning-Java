package cn.qzl.www.Core_2.JDBC.Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @description:删除张三信息
 * +--------+--------+-----+------+------+---------+
 * | stu_id | name   | age | addr | math | english |
 * +--------+--------+-----+------+------+---------+
 * |   1001 | 马云   |  25 | 杭州 |   51 |      85 |
 * |   1002 | 马化腾 |  22 | 深圳 |   86 |      92 |
 * |   1003 | 张三   |  20 | 南昌 |   80 |      69 |
 * |   1004 | 老六   |  23 | 武汉 |   71 |      79 |
 * |   1005 | 丁磊   |  22 | 南京 |   74 |      89 |
 * |   1006 | 刘能   |  25 | 沈阳 |   74 |      59 |
 * |   1007 | 张一鸣 |  23 | 上海 |   88 |      85 |
 * +--------+--------+-----+------+------+---------+
 * @author: qzl
 * @created: 2020/07/11 21:01
 */

public class JDBC_4_delete {
    public static void main(String[] args) {
        Connection con = null;
        Statement state = null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库连接对象
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_3?serverTimezone=GMT%2B8","root","0502xsga230114");
            //获取sql执行对象
            state = con.createStatement();
            //定义sql语句
            String sql = "delete from student where stu_id = 1003";
            //执行sql
            int count = state.executeUpdate(sql);  //获取影响行数
            if(count > 0){
                System.out.println("数据已删除，共影响"+count+"行数据。");
            }
            else{
                System.out.println("数据删除失败。");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            //释放资源
            if(state != null){
                try {
                    state.close();
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
}
