package cn.qzl.www.Excetion_9.Collection.Map;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author qzl
 * @Description
 * @Since 2020-05-02 12:01
 */
public class Employee_map {

    private String name;
    private int age;

    public Employee_map(String name, int age) {
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
        Employee_map e = (Employee_map)o;
        return ((Employee_map) o).age == this.age && Objects.equals(name,((Employee_map) o).name);
    }
    @Override
    public String toString(){
        return "[ [职工信息]:"+" 姓名："+name+" 年龄："+age+" ]";
    }

}


