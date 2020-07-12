package cn.qzl.www.Excetion_6.Interface.demo_1;

import javax.swing.*;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-27 20:21
 */
public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String Eat() {
        return "猫吃猫粮";
    }

    @Override
    public String Run() {
        return "猫会跑";
    }

    @Override
    public String Say() {
        return "喵喵喵";
    }

    @Override
    public String toString() {
        return "我叫"+this.name+" 我是一只猫 "+Eat()+" "+Run()+" "+Say();
    }
    public void CatchMouse(){
        System.out.println("猫捉老鼠");
    }
}
