package cn.qzl.www.Excetion_9.Collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-29 11:20
 */
public class ListTest {
    public static void main(String[] args) {

        //数组列表实现list接口
        List<String> list = new ArrayList<>();
        list.add("小一");
        list.add("小二");
        list.add("小三");
        list.add("小四");
        list.add("小五");
        System.out.println(list);
        //- void add(int index, E e)  在指定索引添加一个元素
        list.add(2,"小二十");
        System.out.println(list);

        // - E remove(int index)   删除指定索引的元素并返回
        String del = list.remove(2);
        System.out.println("删除了"+del);
        System.out.println(list);

        //- boolean remove(Object e)    删除某个元素
        if(list.remove("小三"))
            System.out.println("小三成功删除");
        System.out.println(list);

        //- E get(int index)    获取指定索引的元素
        String get = list.get(2);
        System.out.println("第2个位置是"+get);
        System.out.println(list);

        //- E set(int index,E element)   用新元素取代原来那个位置的元素，并返回被取代的那个元素
        String set = list.set(1,"小三");
        System.out.println(set+"被小三取代了");
        System.out.println(list);
    }
}
