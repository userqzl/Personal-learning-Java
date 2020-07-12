
Iterator接口的常用方法如下：

- public E next():越过下一个元素，并返回它的引用
- public boolean hasNext():如果仍有元素可以迭代，则返回 true。
- public void remove(): 删除刚刚next越过的那个元素

Collection接口中包含了Iterator接口

public Interface Collection{
    ...

    Iterator<E> iterator();

    ...

}

