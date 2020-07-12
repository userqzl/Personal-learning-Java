package cn.qzl.www.Core_2.IO.Serializable;

import java.io.*;

/**
 * @description: 学生类
 * @author: qzl
 * @created: 2020/06/01 19:23
 */

public class Student implements Serializable {
    private static final long serialVersionUID = 4545454545454545454L;

    private String name;
    private String sex;
    private int age;
    private transient String password;   //用transient修饰的实例不会被序列化
    private long StudentId;

    public Student() {
        name = "张三";
        sex = "男";
        age = 18;
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", password=" + password +
                ", StudentId=" + StudentId +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象，并序列化输出到students.txt中
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(
                        new File("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\Serializable\\student.txt"))
        );
        Student stu1 = new Student("王五","男",20);
        stu1.setPassword("123456");
        //Student stu2 = new Student("老六","女",19);
        out.writeObject(stu1);
        //out.writeObject(stu2);
        out.close();
        System.out.println("对象已序列化");

        System.out.println("-----------------------------------");

        //反序列化
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(
                        new File("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\Serializable\\student.txt")
                )
        );
        System.out.println("对象反序列化输出如下:");
        Student stu3 = (Student)in.readObject();
        //Student stu4 = (Student)in.readObject();
        System.out.println("反序列结果为：");
        System.out.println(stu3);
        //System.out.println(stu4);
    }
}
