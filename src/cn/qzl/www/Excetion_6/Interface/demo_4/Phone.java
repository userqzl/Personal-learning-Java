package cn.qzl.www.Excetion_6.Interface.demo_4;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 11:00
 */
public class Phone implements User{
    private String model;   //型号
    private double price;   //价格

    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public void Send(){
        System.out.println("发送短信功能");
    }
    @Override
    public void Call(){
        System.out.println("打电话功能");
    }

    @Override
    public void Music() {
        System.out.println("听音乐功能");
    }

    @Override
    public void Video() {
        System.out.println("看视频功能");
    }

    @Override
    public void Photo() {
        System.out.println("拍照功能");
    }

    @Override
    public void Internet() {
        System.out.println("上网功能");
    }

    public static void main(String[] args) {
        Phone apple = new Phone("iPhone 11",12888);
        Phone HUAWEI = new Phone("HUAWEI MATE 30 Pro",5999);
        System.out.println(apple.model+" 价格 "+apple.price);
        apple.Send();
        apple.Call();
        apple.Music();
        apple.Video();
        apple.Photo();
        apple.Internet();
        System.out.println("-----------------------------------");
        System.out.println(HUAWEI.model+" 价格 "+HUAWEI.price);
        HUAWEI.Send();
        HUAWEI.Call();
        HUAWEI.Music();
        HUAWEI.Video();
        HUAWEI.Photo();
        HUAWEI.Internet();
    }
}
