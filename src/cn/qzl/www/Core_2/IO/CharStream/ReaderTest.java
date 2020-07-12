package cn.qzl.www.Core_2.IO.CharStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description: 字符输入流【Reader】
 * java.io.Reader抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。
 * 字符流类，以字符为单位读写数据，专门用于处理文本文件。
 *
 * - public void close() ：关闭此流并释放与此流相关联的任何系统资源。
 * - public int read()： 从输入流读取一个字符。
 * - public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。
 * @author: qzl
 * @created: 2020/05/22 14:40
 */

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        //java.io.FileReader类是读取字符文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。
        //构造方法
        //
        //- FileReader(File file)： 创建一个新的 FileReader ，给定要读取的File对象。
        //- FileReader(String fileName)： 创建一个新的 FileReader ，给定要读取的文件的名称。

        //用File对象构造
        File file = new File("src/cn/qzl/www/Core_2/IO/CharStream/ReaderTest.txt");
        FileReader reader = new FileReader(file);

        //使用文件名称构建
        //FileReader reader1 = new FileReader("src/cn/qzl/www/Core_2/IO/CharStream/ReaderTest.txt");

        //read方法，每次可以读取一个字符的数据，提升为int类型，读取到文件末尾，返回-1

        //循环读取
//        int read;
//        while ((read = reader.read()) != -1){
//            System.out.print((char)read);
//        }

        //read(char[] buf)，每次读取b的长度个字符到数组中，返回读取到的有效字符个数，读取到末尾时，返回-1
        char[] buf = new char[2];  //缓冲区
        int len;
        while((len = reader.read(buf))!= -1){
            System.out.println(new String(buf,0,len));
        }


        //关闭流
        reader.close();
    }
}
