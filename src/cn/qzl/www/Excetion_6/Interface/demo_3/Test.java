package cn.qzl.www.Excetion_6.Interface.demo_3;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 10:04
 */
public class Test {
    public static void main(String[] args) {
        Student stu_1 = new Student("打篮球");
        Student stu_2 = new Student("玩游戏");
        stu_1.setData("小明","男","2001-03-15");
        stu_2.setData("小红","女","2002-06-18");

        System.out.println(stu_1.getData());
        System.out.println(stu_2.getData());

    }
}
