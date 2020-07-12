package cn.qzl.www.Core_2.Internet.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @description: TCP通信客户端
 * @author: qzl
 * @created: 2020/07/05 13:09
 */

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket,绑定服务器ip地址和端口号
        Socket client =new Socket("127.0.0.1",23333);


        //获取网络输出流对象
        Runnable r1 = new SendThread(client);
        Thread t1 = new Thread(r1);

        //读取服务器发来的数据
        //接收服务端端数据
        Runnable r2 = new RecvThread(client);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        //关闭套接字
        //client.close();
    }
}
