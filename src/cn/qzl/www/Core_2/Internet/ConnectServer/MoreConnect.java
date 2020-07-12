package cn.qzl.www.Core_2.Internet.ConnectServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: 接收多个客户端连接
 * @author: qzl
 * @created: 2020/07/05 11:43
 */

public class MoreConnect {
    public static void main(String[] args) {
        try(ServerSocket s = new ServerSocket(8189)){
            int i = 0;
            while(true){
                Socket incoming = s.accept();
                System.out.println("connecting client num: "+i);
                Runnable r = new ThreadedEchoHandler(incoming);
                Thread t = new Thread(r);
                t.start();
                i++;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
