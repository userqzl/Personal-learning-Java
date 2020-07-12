package cn.qzl.www.Excetion_9.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Author qzl
 * @Description
 * @Since 2020-05-02 12:20
 */
public class TreeMap_test {
            public static void main(String[] args) {
                Map<Integer,Employee_map> staff = new TreeMap<>();
                //put将键与对应的值插入映射中，如果这个键已存在，将替代他，返回旧的值
                staff.put(1006,new Employee_map("小明",20));
                staff.put(1002,new Employee_map("小红",25));
                staff.put(1007,new Employee_map("小芳",22));
                staff.put(1001,new Employee_map("小黄",18));
                staff.put(1006,new Employee_map("小绿",26));
                staff.put(1009,new Employee_map("小紫",23));

        System.out.println(staff);
        System.out.println("1002是:"+staff.get(1002));


        //boolean containsValue(Object value)
        //如果有这个值，返回true
        System.out.println(staff.containsValue(new Employee_map("小红",25)));

        //boolean containsKey(Object key)
        //如果有这个键，返回true
        Scanner in = new Scanner(System.in);
        int i = 0;
        while(i++<5){
            System.out.println("请输入要查找的键值");
            int key = in.nextInt();
            if(staff.containsKey(key)) System.out.println(key+"存在："+staff.get(key));
            else System.out.println(key+"不存在！");
        }
        staff.forEach((k,v)-> System.out.println("key = " + k +" value = "+ v));
        /*
        * key = 1001 value = [ [职工信息]: 姓名：小黄 年龄：18 ]
        * key = 1002 value = [ [职工信息]: 姓名：小红 年龄：25 ]
        * key = 1006 value = [ [职工信息]: 姓名：小绿 年龄：26 ]
        * key = 1007 value = [ [职工信息]: 姓名：小芳 年龄：22 ]
        * key = 1009 value = [ [职工信息]: 姓名：小紫 年龄：23 ]
        * */
    }
}
