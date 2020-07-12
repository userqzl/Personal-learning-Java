package cn.qzl.www.Excetion_9.Collection.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author qzl
 * @Description
 *      自定义对象使用Set接口重写hashcode 和 equals 方法
 * @Since 2020-04-30 11:52
 */
public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
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
    //重写hashcode 和 equals 方法
    @Override
    public int hashCode(){
        return Objects.hash(name,age);
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Employee e = (Employee)o;
        return ((Employee) o).age == this.age && Objects.equals(name,((Employee) o).name);
    }
    @Override
    public String toString(){
        return "[ [职工信息]:"+" 姓名："+name+" 年龄："+age+" ]";
    }

    public static void main(String[] args) {
        Set<Employee> staff = new HashSet<>();
        staff.add(new Employee("小明",15));
        staff.add(new Employee("小王",25));
        staff.add(new Employee("小明",15));
        staff.add(new Employee("小红",18));
        for (Employee a: staff) {
            System.out.println(a);
        }
        /*
        *输出结果
        *[职工信息]: 姓名：小明 年龄：15
        *[职工信息]: 姓名：小红 年龄：18
        *[职工信息]: 姓名：小王 年龄：25
        * */

    }
}
