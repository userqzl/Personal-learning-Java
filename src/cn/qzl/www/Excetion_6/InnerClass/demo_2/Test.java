package cn.qzl.www.Excetion_6.InnerClass.demo_2;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 17:08
 */
public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.OuterMethod_1();


        //外面不能访问局部内部类
        //Outer.PartInner inner = new Outer().new PartInner();   //ERROR

        /*
        Error:(15, 14) java: 找不到符号
        符号:   类 PartInner
        位置: 类 cn.qzl.www.Excetion_6.InnerClass.demo_2.Outer

        Error:(15, 49) java: 找不到符号
        符号:   类 PartInner
        位置: 类 cn.qzl.www.Excetion_6.InnerClass.demo_2.Outer
        */
    }
}
