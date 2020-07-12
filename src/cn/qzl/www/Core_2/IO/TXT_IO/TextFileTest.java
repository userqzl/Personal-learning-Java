package cn.qzl.www.Core_2.IO.TXT_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @description: 处理文本输入输出
 * @author: qzl
 * @created: 2020/05/24 12:56
 */

public class TextFileTest {

    //写记录，将将Employee对象以文本形式写入文件中
    public static void writeEmployee(PrintWriter out, Employee e){
        out.println(e.getName()+"|"+e.getSalary()+"|"+e.getBirthday());
    }

    //读记录，从文件中读取记录，每次读入一行，然后分离字段，返回构建的对象
    public static Employee readEmployee(Scanner in){
        //每次读取一行，遇到“|”就分割
        String line = in.nextLine();
        String[] tokens = line.split("\\|");

        //将分离的字段储存到构建的对象
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);    //返回一个新的 double初始化为指定的 String所代表的值，通过类的方法进行 Double valueOf
        LocalDate hireDate = LocalDate.parse(tokens[2]);  //parse(CharSequence text)  获得 LocalDate实例从一个文本字符串，如 2007-12-03。
        int year = hireDate.getYear();
        int month = hireDate.getMonthValue();
        int day = hireDate.getDayOfMonth();

        //返回构建的对象
        return new Employee(name,salary,year,month,day);
    }

    //写出数组长度，然后写出每条记录
    public static void writeDate(Employee[] employees,PrintWriter out) throws IOException{
        //写出employees长度
        out.println(employees.length);

        //写出每条记录
        for(Employee e : employees)
            writeEmployee(out,e);
    }

    //从流中读取数据，然后返回Employee[]
    public static Employee[] readDate(Scanner in){
        //读数组长度
        int n = in.nextInt();
        in.nextLine();

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = readEmployee(in);
        }
        return employees;
    }

    public static void main(String[] args) throws IOException{

        Employee[] staff = new Employee[8];

        staff[0] = new Employee("小王",7859.24,2001,2,6);
        staff[1] = new Employee("小红",8897.33,2002,2,15);
        staff[2] = new Employee("小黄",12547.24,1999,6,16);
        staff[3] = new Employee("小蓝",17859.24,2001,2,26);
        staff[4] = new Employee("小二",28897.33,2002,2,5);
        staff[5] = new Employee("小三",12547.24,1999,6,5);
        staff[6] = new Employee("小四",9859.24,2001,5,6);
        staff[7] = new Employee("小五",18897.33,2002,8,15);


        //将所有对象以文本保存到Employee.dat
        try(PrintWriter out = new PrintWriter("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\TXT_IO\\Employee.dat","UTF-8")){
            writeDate(staff,out);
        }

        try(Scanner in = new Scanner(
                new FileInputStream("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\TXT_IO\\Employee.dat"),"UTF-8"
        )){
            Employee[] newStaff = readDate(in);

            //打印新的employee信息
            for(Employee e : newStaff)
                System.out.println(e);
        }

    }
}
