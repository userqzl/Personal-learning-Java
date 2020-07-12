package cn.qzl.www.Excetion_6.Interface.demo_1;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-27 20:23
 */
public class Bird implements Animal{
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String Eat(){
        return "鸟吃虫子";
    }
    @Override
    public String Run(){
        return "鸟会飞";
    }
    @Override
    public String Say(){
        return "叽叽叽";
    }
    @Override
    public String toString(){
        return "我叫"+this.name+" 我是一只鸟 "+ Eat()+" "+Run()+" "+Say();
    }
    public void CatchWorm(){
        System.out.println("鸟捉虫子");
    }
}
