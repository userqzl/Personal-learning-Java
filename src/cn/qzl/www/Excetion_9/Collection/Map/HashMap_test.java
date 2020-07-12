package cn.qzl.www.Excetion_9.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author qzl
 * @Description
 * 散列映射（HashMap）对键进行散列
 * @Since 2020-05-02 12:05
 */
public class HashMap_test {
    public static void main(String[] args) {
        Map<Integer,Employee_map> staff = new HashMap<>();
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
        while(true){
            System.out.println("请输入要查找的键值");
            int key = in.nextInt();
            if(staff.containsKey(key)) System.out.println(key+"存在："+staff.get(key));
            else System.out.println(key+"不存在！");
        }
    }
}
