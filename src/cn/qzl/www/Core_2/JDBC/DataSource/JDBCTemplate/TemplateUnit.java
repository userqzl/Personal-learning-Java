package cn.qzl.www.Core_2.JDBC.DataSource.JDBCTemplate;

import cn.qzl.www.Core_2.JDBC.DataSource.DataSourceUtil.DataSourceUtil;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * @description: Template单元测试
 * @author: qzl
 * @created: 2020/07/18 22:07
 */

public class TemplateUnit {
    //1.卡号为10001的数据设置money为20000
    @Test
    public void test_01(){
        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource());
        String sql = "update account set money = 20000 where id = ?";
        int update = template.update(sql, 10001);
        System.out.println(update);
    }
    //2.添加一条记录
    @Test
    public void test_02(){
        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource());
        String sql = "insert into account (id,name,sex,phone,money,start_card) values(?,?,?,?,?,?)";
        int update = template.update(sql,10007,"笑哈哈","男","12345698747",0, LocalDate.now());
        System.out.println(update);
    }
    //3.删除刚刚添加的记录
    @Test
    public void test_03(){
        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource());
        String sql = "delete from account where id = ?";
        int update = template.update(sql,10007);
        System.out.println(update);
    }
    //4.查询id为10002的记录，将其封装为map集合
    @Test
    public void test_04(){
        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource());
        String sql = "select * from account where id = ?";
        Map<String,Object> map = template.queryForMap(sql,10002);
        System.out.println(map);
    }
    //4.查询所有记录，将其封装为List
    @Test
    public void test_05(){
        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource());
        String sql = "select * from account";
         List<Map<String,Object>> list= template.queryForList(sql);
        for(Map<String,Object> map : list){
            System.out.println(map);
        }
    }
    //5.查询所有记录，将其封装为acc的list
    @Test
    public void test_06(){
        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource());
        String sql = "select * from account";
        List<Acc>list = template.query(sql,new BeanPropertyRowMapper<>(Acc.class));
        for(Acc a : list)
            System.out.println(a);
    }

    //6.查询所有记录，返回总记录数
    @Test
    public void test_07(){
        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource());
        String sql = "select count(id) from account";
        Long aLong = template.queryForObject(sql, Long.class);
        System.out.println("共有"+aLong+"条记录.");
    }
}
