package cn.qzl.www.Core_2.IO.ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @description: 输入流
 * java.io.InputStream抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。它定义了字节输入流的基本共性功能方法。
 *
 * - public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
 * - public abstract int read()： 从输入流读取数据的下一个字节。
 * - public int read(byte[] b)： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。
 *
 * @author: qzl
 * @created: 2020/05/22 08:08
 */

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        //java.io.FileInputStream类是文件输入流，从文件中读取字节。
        //- FileInputStream(File file)： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
        //- FileInputStream(String name)： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。

        //用File对象创建输入流
        File file = new File("src/cn/qzl/www/Core_2/IO/ByteStream/InputTestA.txt");
        FileInputStream input = new FileInputStream(file);

        //使用文件名创建输入流
        //FileInputStream inputStream = new FileInputStream("cn/qzl/www/Core_2/IO/ByteStream/InputTestA.txt");

        //读取字节：read方法，每次可以读取一个字节的数据，提升为int类型，读取到文件末尾，返回-1
        for(int i = 0;i < 20;++i){
            int read = input.read();
            if (read == -1) System.out.println("已读取到文件尾!");
            System.out.print((char) read);
        }
        System.out.println();
        System.out.println("----------------------------------");

        //read(byte[] b)，每次读取b的长度个字节到数组中，返回读取到的有效字节个数，读取到末尾时，返回-1
        int len;
        byte[] buffer = new byte[10];
        while ((len = input.read(buffer)) != -1){

            System.out.println(new String(buffer,0,len));   //使用字符串打印,使用len标记有效字节数

        }
        //关闭流
        input.close();
    }
}
