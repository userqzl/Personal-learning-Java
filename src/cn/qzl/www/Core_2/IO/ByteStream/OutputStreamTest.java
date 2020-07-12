package cn.qzl.www.Core_2.IO.ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description: 字节输出流
 * java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。它定义了字节输出流的基本共性功能方法。
 *
 * - public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
 * - public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
 * - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
 * - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 * - public abstract void write(int b) ：将指定的字节输出流。
 * @author: qzl
 * @created: 2020/05/21 10:23
 */

public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        //java.io.FileOutputStream类是文件输出流，用于将数据写出到文件。,是OutputStream的子类

        //构造方法
        //
        //- public FileOutputStream(File file)：创建文件输出流以写入由指定的 File对象表示的文件。
        //- public FileOutputStream(String name)： 创建文件输出流以指定的名称写入文件。

        //当你创建一个流对象时，必须传入一个文件路径。该路径下，如果没有这个文件，会创建该文件。如果有这个文件，会清空这个文件的数据。

        //使用file对象构造文件输出流
        File file = new File("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\ByteStream\\outPutTestA.txt");
        FileOutputStream outputStream1 = new FileOutputStream(file);

        // 使用文件名称创建流对象
        FileOutputStream outputStream2 = new FileOutputStream("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\ByteStream\\outPutTestB.txt");

        //write(int b) 方法，每次可以写出一个字节数据

        outputStream1.write(85);
        outputStream1.write(86);
        outputStream1.write(87);

        outputStream2.write(88);
        outputStream2.write(89);
        outputStream2.write(90);

        //write(byte[] b)，每次可以写出数组中的数据
        byte[] bytes = "\r\n卧槽，哈哈哈哈哈哈哈哈".getBytes();
        outputStream1.write(bytes);
        outputStream2.write(bytes);

        //write(byte[] b, int off, int len) ,每次写出从off索引开始，len个字节：
        byte[] bytes1 = "0123456789".getBytes();
        outputStream1.write(bytes1,2,3);  //写入2，3，4
        outputStream2.write(bytes1,5,4);  //写入5，6，7，8

        //关闭流
        outputStream1.close();
        outputStream2.close();

        //- public FileOutputStream(File file, boolean append)： 创建文件输出流以写入由指定的 File对象表示的文件。
        //- public FileOutputStream(String name, boolean append)： 创建文件输出流以指定的名称写入文件。
        //
        //这两个构造方法，参数中都需要传入一个boolean类型的值，true 表示追加数据，false 表示清空原有数据。这样创建的输出流对象，就可以指定是否追加续写了
        FileOutputStream fileOutputStream = new FileOutputStream("src\\cn\\qzl\\www\\Core_2\\IO\\ByteStream\\outPutTestB.txt",true);

        //向outPutTestB.txt中追加读写数据
        byte[] bytes2 = "\r\n 这是追加的数据".getBytes();
        fileOutputStream.write(bytes2);

    }
}
