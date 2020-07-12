package cn.qzl.www.Core_2.IO.ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description: IO练习之图片的复制
 * @author: qzl
 * @created: 2020/05/22 08:37
 */

public class IODemo {
    public static void main(String[] args) throws IOException {
        //创建输入流，读取图片
        FileInputStream input = new FileInputStream("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\ByteStream\\Jpg\\Test.jpg");

        //创建输出流，用于输出复制后的图片
        FileOutputStream output = new FileOutputStream("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\ByteStream\\Jpg\\TestCopy.jpg");

        int len;        //实际读取字节
        byte[] bytes = new byte[1024];   //缓冲区
        while((len = input.read(bytes)) != -1){
            //循环读取

            //写出数据
            output.write(bytes,0,len);
        }

        System.out.println("复制完成！");

        //关闭流
        output.close();
        input.close();
    }
}
