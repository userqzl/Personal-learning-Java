
***成员内部类的性质***

一、定义格式

修饰符 class 外部类名称{
    修饰符 class 内部类名称{
    //...
    }
    //...
}

二、性质

1、内部类可以随意访问外部类；
2、外部类访问内部类，需要内部类对象
3、只有内部类可以是私有的

内部类编译后文件名为  外部类$内部类.class   Outer$Inner.class