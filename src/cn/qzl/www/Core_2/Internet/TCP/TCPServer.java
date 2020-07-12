package cn.qzl.www.Core_2.Internet.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: TCP通信服务端
 * @author: qzl
 * @created: 2020/07/05 13:08
 */

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建监听套接字
        ServerSocket listen = new ServerSocket(23333);

        //接收客户端连接
        Socket server = listen.accept();

        //获取网络输出流对象
        Runnable r1 = new SendThread(server);
        Thread t1 = new Thread(r1);

        //读取服务器发来的数据
        //接收服务端端数据
        Runnable r2 = new RecvThread(server);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

//        server.close();
//        listen.close();
    }
}
