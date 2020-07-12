package cn.qzl.www.Core_2.IO.CharStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @description: 字符输出流【Writer】
 *  * java.io.Writer抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地。它定义了字节输出流的基本共性功能方法。
 *  *
 *  * - void write(int c) 写入单个字符。
 *  * - void write(char[] buf)写入字符数组。
 *  * - abstract  void write(char[] buf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 *  * - void write(String str)写入字符串。
 *  * - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 *  * - void flush()刷新该流的缓冲。
 *  * - void close() 关闭此流，但要先刷新它。
 *
 * 字符流，只能操作文本文件，不能操作图片，视频等非文本文件
 * @author: qzl
 * @created: 2020/05/22 15:02
 */

public class WriterTest {
    public static void main(String[] args) throws IOException {
        //java.io.FileWriter类是写出字符到文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。
        //
        //构造方法
        //
        //- FileWriter(File file)： 创建一个新的 FileWriter，给定要读取的File对象。
        //- FileWriter(String fileName)： 创建一个新的 FileWriter，给定要读取的文件的名称。

        File file = new File("src/cn/qzl/www/Core_2/IO/CharStream/WriterTest.txt");
        FileWriter writer = new FileWriter(file);

        //FileWriter writer = new FileWriter("WriterTest.txt");

        //write(int b) 方法，每次可以写出一个字符数据
        //write(String str) 和 write(String str, int off, int len) ，每次可以写出字符串中的数据
        writer.write((int)'马');
        writer.write((int)'的');
        writer.write("哈");
        writer.write("hhh");
        writer.write("卧槽");


        //因为内置缓冲区的原因，如果不关闭输出流，无法写出字符到文件中。但是关闭的流对象，是无法继续写出数据的。如果我们既想写出数据，又想继续使用流，就需要flush 方法了。
        //
        //- flush ：刷新缓冲区，流对象可以继续使用。
        //- close:先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。
        writer.flush();

        //写出字符数组 ：write(char[] cbuf) 和 write(char[] cbuf, int off, int len) ，
        // 每次可以写出字符数组中的数据，用法类似FileOutputStream
        char[] buf = "一二三四五".toCharArray();
        writer.write(buf,2,3);
        writer.flush();

        //关闭流
        //如果不关闭,数据只是保存到缓冲区，并未保存到文件。
        writer.close();
    }
}
