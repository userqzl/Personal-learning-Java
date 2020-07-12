package cn.qzl.www.Excetion_6.Interface.demo_5;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 11:33
 */
public class Computer {

    //开机
    public void Start(){
        System.out.println("笔记本开机了");
    }
    //关机
    public void End(){
        System.out.println("笔记本关机了");
    }
    //使用USB设备
    public void User(USB usb){
        usb.Open();
        //使用独特功能，需要向下转型
        if(usb instanceof Mouse)  ((Mouse) usb).click();
        if(usb instanceof Keyboard)  ((Keyboard) usb).type();
        usb.Close();
    }
}
