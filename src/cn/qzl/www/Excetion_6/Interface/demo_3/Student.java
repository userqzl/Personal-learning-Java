package cn.qzl.www.Excetion_6.Interface.demo_3;

/**
 * @Author qzl
 * @Description
 * @Since 2020-04-28 10:07
 */
public class Student implements Person{
    private int sID;
    private static int ID = 1000;
    private String speciality;   //特长
    private String name;
    private String sex;
    private String birthday;

    public Student(String speciality) {
        this.sID = ++ID;
        this.speciality = speciality;
        name = "张三";
        sex = "男";
        birthday = "2001-02-05";

    }
    @Override
    public void setData(String name, String sex, String birthday){
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }
    @Override
    public String getData(){
        return "我叫 "+this.name+" 性别 "+this.sex+" 生日是 "+this.birthday+" 学号："+sID+" 特长："+this.speciality;
    }
}
