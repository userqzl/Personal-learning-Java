package cn.qzl.www.Excetion_9.Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-29 11:33
 */
public class LinkListTest {
    public static void main(String[] args) {
        //java.util.ListIterator<E>
        List<Integer>link = new LinkedList<>();
        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
        System.out.println(link);
        //使用迭代器添加元素
        ListIterator<Integer> iter = link.listIterator();
        System.out.println("下次调用next的索引是："+iter.nextIndex());
        iter.next();
        iter.add(10);
        System.out.println("下次调用next的索引是："+iter.nextIndex());
        iter.add(20);
        System.out.println("下次调用next的索引是："+iter.nextIndex());
        System.out.println(link);
        iter.next();

        // - void set(E e)   //用新元素取代next或previous上次访问的元素

        iter.set(30);
        System.out.println(link);

        // - int nextIndex()     //返回下一次调用next时将返回的元素索引
        System.out.println("下次调用next的索引是："+iter.nextIndex());

        System.out.println("****************************************");
        //***********************************************************
        //- java.util.LinkedList<E>

        //- LinkedList()    //构建一个空链表
        LinkedList<Integer>staff = new LinkedList<>();
        staff.add(1);
        staff.add(2);
        staff.add(3);
        staff.add(4);
        staff.add(5);
        System.out.println(staff);

        //- void addFirst(E e)      //将某个元素添加到头部
        // - void addLast(E e)       //将某个元素添加到尾部
        staff.addFirst(6);
        staff.addLast(7);
        System.out.println(staff);

        // - E getFirst()    //返回头部元素
        // - E getLast()     //返回尾部元素
        int first = staff.getFirst();
        int last = staff.getLast();
        System.out.println("头部元素是"+first);
        System.out.println("尾部元素是"+last);

        // - E removeFirst()     //删除并返回头部元素
        // - E removeLast()     //删除并返回尾部元素
        int del_first = staff.removeFirst();
        int del_last = staff.removeLast();
        System.out.println("删除头部元素"+del_first);
        System.out.println("删除尾部元素"+del_last);
        System.out.println(staff);
    }
}
