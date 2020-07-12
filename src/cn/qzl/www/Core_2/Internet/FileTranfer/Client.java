package cn.qzl.www.Core_2.Internet.FileTranfer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @description: 服务端
 * @author: qzl
 * @created: 2020/07/05 14:41
 */

public class Client {
    public static void main(String[] args) throws IOException {
        //创建文件输入流对象，从硬盘读取文件
        FileInputStream fileInputStream = new FileInputStream("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\Internet\\FileTranfer\\file\\ftp.mp4");

        //创建客户端套接字，与服务器通信
        Socket client = new Socket("127.0.0.1",12345);

        //获取客户端套接字的输出流对象
        OutputStream sendStream = client.getOutputStream();

        //读取本地文件
        int len = 0;
        byte[] buf = new byte[1024];
        System.out.println("文件上传中...");
        while((len = fileInputStream.read(buf)) != -1){
            //将读取的数据发送给服务器
            sendStream.write(buf,0,len);
        }
        client.shutdownOutput();
        //接收服务器响应，是否上传成功
        InputStream recv = client.getInputStream();

        byte[]replay = new byte[1024];
        int recvlen = recv.read(replay);
        System.out.println(new String(replay,0,recvlen));

        //释放资源
        fileInputStream.close();

        client.close();
    }
}
