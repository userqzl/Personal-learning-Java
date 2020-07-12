package cn.qzl.www.Excetion_9.Collection.Set;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author qzl
 * @Description
 * 树集是一个有序集合，可以将任何顺序的元素添加到集合中，遍历他将会按顺序输出
 * 树集用红黑树实现
 * 使用树集必须实现Comparable接口
 * @Since 2020-05-01 18:43
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Integer> tree = new TreeSet<>();
        tree.add(5);
        tree.add(6);
        tree.add(1);
        tree.add(4);
        tree.add(0);
        tree.add(1);

        //遍历输出
        System.out.println(tree);
        //[0, 1, 4, 5, 6]


    }
}
