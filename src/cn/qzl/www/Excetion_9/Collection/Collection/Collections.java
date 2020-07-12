package cn.qzl.www.Excetion_9.Collection.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-29 9:48
 */
public class Collections {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        //public boolean add(E e)：  把给定的对象添加到当前集合中
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("田七");
        coll.add("阿猫");
        coll.add("阿狗");

        //public int size(): 返回集合中元素的个数
        System.out.println(coll);
        System.out.println("当前有"+coll.size()+"个元素");
        System.out.println("---------------------------");

        //public boolean remove(E e): 把给定的对象在当前集合中删除。
        if(coll.remove("阿猫")) System.out.println("阿猫已删除");

        //public boolean contains(E e): 判断当前集合中是否包含给定的对象。

        if(coll.contains("阿猫")) System.out.println("阿猫存在");
        else System.out.println("阿猫不存在");

        if(coll.contains("王五")) System.out.println("王五存在");
        System.out.println(coll);

        System.out.println("---------------------------");
        //public Object[] toArray(): 把集合中的元素，存储到数组中。
        Object []objects = coll.toArray();
        for(int i = 0;i < objects.length;++i)
            System.out.print(objects[i]+" ");
        System.out.println();
        System.out.println("--------------------------");

        // public boolean isEmpty(): 判断当前集合是否为空。
        //public void clear() :清空集合中所有的元素。
        if(!coll.isEmpty()) coll.clear();
        System.out.println(coll);
    }
}
