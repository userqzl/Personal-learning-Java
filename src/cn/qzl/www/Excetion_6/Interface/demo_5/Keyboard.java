package cn.qzl.www.Excetion_6.Interface.demo_5;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 11:37
 */
public class Keyboard implements USB{
    @Override
    public void Open() {
        System.out.println("键盘启动了");
    }

    @Override
    public void Close() {
        System.out.println("键盘关闭了");
    }
    public void type(){
        System.out.println("使用键盘打字");
    }
}
