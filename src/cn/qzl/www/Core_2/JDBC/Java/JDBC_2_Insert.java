package cn.qzl.www.Core_2.JDBC.Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @description: 数据库db_3表student用insert语句添加记录
 * +--------+--------+-----+------+------+---------+
 *  *  * | stu_id | name   | age | addr | math | english |
 *  *  * +--------+--------+-----+------+------+---------+
 *  *  * |   1002 | 马化腾 |  22 | 深圳 |   86 |      92 |
 *  *  * |   1003 | 张三   |  20 | 南昌 |   80 |      69 |
 *  *  * |   1004 | 老六   |  23 | 武汉 |   66 |      79 |
 *  *  * |   1005 | 丁磊   |  22 | 南京 |   69 |      89 |
 *  *  * |   1006 | 刘能   |  25 | 沈阳 |   69 |      59 |
 *  *  * +--------+--------+-----+------+------+---------+
 * @author: qzl
 * @created: 2020/07/11 19:16
 */

public class JDBC_2_Insert {
    public static void main(String[] args) {
        Connection con = null;  //保存数据库连接对象
        Statement state = null;  //保存执行sql对象
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库连接对象
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_3?serverTimezone=GMT%2B8","root","0502xsga230114");
            //定义sql语句
            String sql = "insert into student values(1007,'张一鸣',23,'上海',88,85)";
            //获取执行sql对象
            state = con.createStatement();
            //执行sql语句
            int count = state.executeUpdate(sql);   //接收影响行数
            if(count > 0){
                System.out.println("插入数据成功！，共影响"+count+"条数据。");
            }
            else {
                System.out.println("插入数据失败!");
            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
