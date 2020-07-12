package cn.qzl.www.Core_2.Internet.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @description: 接收消息线程
 * @author: qzl
 * @created: 2020/07/05 13:54
 */

public class RecvThread implements Runnable{
    private Socket socket;        //通信用的套接字

    public RecvThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while(true) {
            InputStream inputStream = null;
            try {
                inputStream = socket.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] buf = new byte[1024];
            int len = 0;
            try {
                len = inputStream.read(buf);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("收到消息："+new String(buf,0,len));
        }
    }
}
