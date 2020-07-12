package cn.qzl.www.Excetion_6.InnerClass.demo_2;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 17:03
 */
public class Outer {
    private int num_1 = 10;
    private final int num_2 = 20;
    public void OuterMethod_1(){

        int num_3 = 30;
        //num_3 = 300;  //局部变量发送改变，局部内部类将不能访问它
                        //如果依然要使用它，需要将它先拷贝到副本中,然后使用副本
        final int num_4 = 40;
        class PartInner{
            private int Inner = 50;
            public void InnerMethod(){
                    //局部内部类方法
                    System.out.println("num_1 = "+num_1);   //局部内部类依然可以无限制的访问外部类成员
                    System.out.println("num_2 = "+num_2);
                    System.out.println("num_3 = "+num_3);
                    System.out.println("num_4 = "+num_4);
            }
        }
        new PartInner().InnerMethod();
    }
}
