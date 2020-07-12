package cn.qzl.www.Excetion_9.Collection.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author qzl
 * @Description 两个链表合并
 * 第二个链表每隔一个元素删除
 * @Since 2020-04-29 18:03
 */
public class LinkedListMerge {
    public static void main(String[] args) {
        List<String> listA = new LinkedList<>();
        listA.add("A");
        listA.add("C");
        listA.add("E");
        listA.add("G");
        listA.add("I");

        List<String> listB = new LinkedList<>();
        listB.add("B");
        listB.add("D");
        listB.add("F");
        listB.add("H");
        listB.add("J");

        System.out.println(listA);
        System.out.println(listB);

        //创建两个迭代器
        ListIterator<String> iterA = listA.listIterator();
        Iterator<String> iterB = listB.iterator();
        while(iterA.hasNext()){
            //if(iterA.hasNext())
            iterA.next();
            iterA.add(iterB.next());
        }
        System.out.println(listA);
        System.out.println(listB);

        //第二个链表每隔一个元素删除
        iterB = listB.iterator();
        while(iterB.hasNext()){
            iterB.next();
            if(iterB.hasNext()){
                iterB.next();
                iterB.remove();
            }
        }
        System.out.println(listA);
        System.out.println(listB);

        listA.removeAll(listB);
        System.out.println(listA);
        System.out.println(listB);
    }
}
