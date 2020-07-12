package cn.qzl.www.Excetion_6.InnerClass.demo_1;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 16:44
 */
public class OuterTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.MethodOuter_1();
        outer.MethodOuter_2();

        System.out.println("-------------------------");
        //外面访问内部类成员需要借助外部类对象
//     外部类.内部类  内部类对象 = new 外部类构造器.new 内部类构造器
        Outer.Inner inner = new Outer().new Inner();
        inner.MethodInner_1();
        System.out.println(inner.getInner());
    }
}
