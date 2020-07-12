package cn.qzl.www.Core_2.Internet.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @description: 发送消息线程
 * @author: qzl
 * @created: 2020/07/05 13:46
 */

public class SendThread implements Runnable{

    private Socket socket;        //通信用的套接字

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while(true){
            OutputStream outputStream = null;
            try {
                outputStream = socket.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //使用write方法写数据
            Scanner in = new Scanner(System.in);
            System.out.print("请输入消息：");
            String message = in.nextLine();
            try {
                outputStream.write(message.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
