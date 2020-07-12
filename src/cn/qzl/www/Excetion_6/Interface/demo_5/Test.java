package cn.qzl.www.Excetion_6.Interface.demo_5;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 11:39
 */
public class Test {
    public static void main(String[] args) {
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();

        Computer computer = new Computer();
        computer.Start();

        computer.User(mouse);
        computer.User(keyboard);

        computer.End();

        System.out.println();
    }
}
