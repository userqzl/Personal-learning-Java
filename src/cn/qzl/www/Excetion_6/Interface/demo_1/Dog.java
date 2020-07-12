package cn.qzl.www.Excetion_6.Interface.demo_1;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-27 20:14
 */
public class Dog implements Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String Eat(){
        return "狗吃shit";
    }
    @Override
    public String Run(){
        return "狗会跑";
    }
    @Override
    public String Say(){
        return "汪汪汪";
    }
    @Override
    public String toString(){
        return "我叫"+this.name+" 我是一只狗 "+Eat()+" "+Run()+" "+Say();
    }
    public void LookHome(){
        System.out.println("狗看家");
    }
}
