package cn.qzl.www.Excetion_9.Collection.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-30 11:39
 */
public class HashSet_test {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        System.out.println("1 添加结果："+s.add(1));
        System.out.println("65 添加结果："+s.add(65));
        System.out.println("2 添加结果："+ s.add(2));
        System.out.println("1 添加结果："+s.add(1));
        System.out.println("12 添加结果："+s.add(12));
        System.out.println("0 添加结果："+s.add(0));
        System.out.println("2 添加结果："+s.add(2));
        System.out.println("80 添加结果："+s.add(80));

        //元素不能重复，打印结果与加入结果不一致
        System.out.println(s);
    }

}
