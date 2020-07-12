package cn.qzl.www.Excetion_6.InnerClass.demo_3;

import java.util.ArrayList;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 17:34
 */
public class Test {
    public static void main(String[] args) {

        //匿名内部类，匿名的是类名称，不是对象名称，使用匿名对象，直接new就行了
        Interface inter = new Interface() {

            //private static int num;   匿名内部类不能定义静态变量和方法
            @Override
            public void myInterface() {
                System.out.println("匿名内部类实现接口Interface");
            }
        };
        inter.myInterface();
    }
}
