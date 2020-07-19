package cn.qzl.www.Core_2.JDBC.DataSource.JDBCTemplate;

import cn.qzl.www.Core_2.JDBC.DataSource.DataSourceUtil.DataSourceUtil;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;

/**
 * @description:
 * @author: qzl
 * @created: 2020/07/18 21:38
 */

public class JDBCTemplateDemo_1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource());
        //定义sql
        String sql = "update account set money = ?";
        //执行sql
        int update = template.update(sql, 10000);
        System.out.println("更新成功，共影响"+update+"条数据.");
    }
}
