package cn.qzl.www.Excetion_6.Interface.demo_5;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 11:36
 */
public class Mouse implements USB{
    @Override
    public void Open() {
        System.out.println("鼠标开启了");
    }

    @Override
    public void Close() {
        System.out.println("鼠标关闭了");
    }

    public void click(){
        System.out.println("点击鼠标");
    }
}
