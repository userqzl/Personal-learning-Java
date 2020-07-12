package cn.qzl.www.Excetion_9.Collection.List;

import java.util.ArrayList;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-29 13:16
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        //- boolean add(E e)    //在数组列表添加一个元素，永远返回true
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);

        //- int size()      //返回列表中元素数量
        System.out.println("当前数组列表大小是"+arrayList.size());

        //- void set(int index,E obj)   //设置数组列表指定位置的值，将覆盖原来的值
        arrayList.set(2,7);
        System.out.println(arrayList);

        //- E get()     //获取指定位置元素的值
        int num = arrayList.get(4);
        System.out.println("位置4的元素是"+num);

        //- void add(int index,E obj)       //在指定位置插入元素，后面的元素往后移动
        arrayList.add(2,3);
        System.out.println(arrayList);

        //- E remove(int index)     //删除一个元素，并讲之后的元素往前移，返回删除的元素
        int delNum = arrayList.remove(3);
        System.out.println("删除了第3位置的元素"+delNum);
        System.out.println(arrayList);
    }

}
