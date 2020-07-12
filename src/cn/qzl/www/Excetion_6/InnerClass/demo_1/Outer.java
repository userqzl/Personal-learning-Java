package cn.qzl.www.Excetion_6.InnerClass.demo_1;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 16:38
 */
public class Outer {  //外部类
    private int Outer;
    public void MethodOuter_1(){
        //外部类方法
        System.out.println("这是外部类方法");
    }
    public void MethodOuter_2(){
        //外部类访问内部类，需要创建内部类对象
        Inner inner = new Inner();
        inner.MethodInner_1();
    }

    public class Inner{//成员内部类
        private int Inner = 20;

        public void MethodInner_1(){
            System.out.println("这是内部类方法");
        }
        public void MethodInner_2(){
            Outer = 10;    //内部类可以随意访问外部类成员和方法
            System.out.println(Outer);
            MethodOuter_1();
        }

        public int getInner() {
            return Inner;
        }
    }
}
