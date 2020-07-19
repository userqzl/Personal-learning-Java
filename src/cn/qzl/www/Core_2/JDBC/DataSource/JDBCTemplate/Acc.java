package cn.qzl.www.Core_2.JDBC.DataSource.JDBCTemplate;

import java.sql.Date;
import java.time.LocalDate;

/**
 * @description:
 * @author: qzl
 * @created: 2020/07/19 10:49
 */

public class Acc {
    private Integer id;
    private String name;
    private String sex;
    private String phone;
    private Integer money;
    private LocalDate date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Acc{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", money=" + money +
                ", date=" + date +
                '}';
    }
}
