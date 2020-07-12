package cn.qzl.www.Excetion_9.Collection.Set;

import java.util.*;

/**
 * @Author qzl
 * @Description
 * @Since 2020-05-01 18:52
 */
//必须实现Employee_tree接口
public class Employee_tree implements Comparable<Employee_tree>{
    private String name;
    private int age;

    public Employee_tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee_tree other){
        int diff = Integer.compare(this.age,other.age);
        return diff;
    }

    @Override
    public String toString() {
        return "[ [职工信息]:" + " 姓名：" + name + " 年龄：" + age + " ]";
    }

    public static void main(String[] args) {
        SortedSet<Employee_tree> staff = new TreeSet<>();
        staff.add(new Employee_tree("小明", 15));
        staff.add(new Employee_tree("小王", 25));
        staff.add(new Employee_tree("小明", 15));
        staff.add(new Employee_tree("小红", 18));
        for (Employee_tree a : staff) {
            System.out.println(a);
            /*
            [ [职工信息]: 姓名：小明 年龄：15 ]
            [ [职工信息]: 姓名：小红 年龄：18 ]
            [ [职工信息]: 姓名：小王 年龄：25 ]
             */
        }
    }
}
