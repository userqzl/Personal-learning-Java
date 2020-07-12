package cn.qzl.www.Core_2.IO.TXT_IO;

import java.time.LocalDate;

/**
 * @description: 员工类
 * @author: qzl
 * @created: 2020/05/24 12:57
 */

public class Employee {
    private String name; //姓名
    private double Salary;     //薪水
    LocalDate birthday;     //生日

    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        Salary = salary;
        birthday = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getBirthday() {
        return birthday.toString();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return "姓名："+this.getName()+" 薪水："+this.getSalary()+" 生日："+this.getBirthday();
    }

}
