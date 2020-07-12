package cn.qzl.www.Excetion_9.Collection.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-29 10:03
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection<String>strings = new ArrayList<>();
        strings.add("小明");
        strings.add("小红");
        strings.add("小王");
        strings.add("小绿");
        strings.add("小黄");


        Iterator<String> iterator = strings.iterator();
        //remove将会删除上次next越过返回的那个元素
        iterator.next();
        iterator.remove();
        //使用迭代器遍历集合
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println(strings);

        Iterator<String>iter = strings.iterator();
      //iter.remove();  //调用remove前没有调用next方法，将会抛出异常java.lang.IllegalStateException
        iter.next();
        iter.remove();
        System.out.println(strings);
    }
}
