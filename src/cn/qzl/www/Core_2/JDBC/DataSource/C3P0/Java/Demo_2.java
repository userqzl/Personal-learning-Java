package cn.qzl.www.Core_2.JDBC.DataSource.C3P0.Java;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @description: 验证配置文件中的数据库连接池参数
 * @author: qzl
 * @created: 2020/07/17 18:41
 */

public class Demo_2 {
    public static void main(String[] args) throws SQLException {
        //获取数据库连接池对象
        // ds = new ComboPooledDataSource();
        DataSource ds = new ComboPooledDataSource("otherc3p0");  //指定名称配置

        //获取连接对象
        for (int i = 0;i < 20;i++){
            Connection con = ds.getConnection();
            System.out.println("第"+(i+1)+" 次---"+con);
            //if(i == 9) con.close();
        }
    }
}
