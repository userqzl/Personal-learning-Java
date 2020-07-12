package cn.qzl.www.Core_2.Internet.FileTranfer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: 服务端
 * @author: qzl
 * @created: 2020/07/05 14:41
 */

public class Server {
    public static void main(String[] args) throws IOException {
        //创建文件输出对象
        FileOutputStream out = new FileOutputStream("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\Internet\\FileTranfer\\up\\up.mp4");

        //创建监听套接字，接收客户端连接
        ServerSocket listen = new ServerSocket(12345);

        Socket server = listen.accept();

        //获取套接字对象输入流
        InputStream recv = server.getInputStream();

        //循环接收数据，并写入硬盘
        int len = 0;
        byte[]buf = new byte[1024];

        while((len = recv.read(buf)) != -1){
            //写入硬盘
            out.write(buf,0,len);
        }


        //创建网络输出流
        OutputStream send = server.getOutputStream();

        //向客户端发送文件上传成功响应
        send.write("文件上传成功！".getBytes());

        //释放资源
        out.close();
        server.close();
        listen.close();
    }
}
