在集合类中，List是最基础的一种集合：它是一种有序列表。

List的行为和数组几乎完全相同：List内部按照放入元素的先后顺序存放，每个元素都可以通过索引确定自己的位置，List的索引和数组一样，从0开始。

List<E>接口，可以看到几个主要的接口方法：

 - void add(E e)   在末尾添加一个元素
 - void add(int index, E e)  在指定索引添加一个元素
 - E remove(int index)   删除指定索引的元素并返回
 - boolean remove(Object e)    删除某个元素
 - E get(int index)    获取指定索引的元素
 - E set(int index,E element)   用新元素取代原来那个位置的元素，并返回被取代的那个元素
 - int size()  获取链表大小（包含元素的个数）

但是，实现List接口并非只能通过数组（即ArrayList的实现方式）来实现，另一种LinkedList通过“链表”也实现了List接口。在LinkedList中，它的内部每个元素都指向下一个元素：