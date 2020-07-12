package cn.qzl.www.Core_2.Internet.ConnectServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @description: 回送服务器
 * @author: qzl
 * @created: 2020/07/05 11:11
 */

public class EchoServer {
    public static void main(String[] args) throws IOException {
        //创建监听套接字，使用端口8189
        try(ServerSocket listen = new ServerSocket(8189)){
            //等待客户端连接
            try(Socket client = listen.accept()){
                InputStream input = client.getInputStream();
                OutputStream outputStream = client.getOutputStream();

                try(Scanner in = new Scanner(input,"UTF-8")){
                    PrintWriter out = new PrintWriter(
                            new OutputStreamWriter(outputStream,"UTF-8"),
                            true/* autoFlush */);
                    out.println("Hello!Enter BYE to exit.");

                    //回射客户端输入
                    boolean done = false;
                    while(!done && in.hasNextLine()){
                        String line = in.nextLine();
                        System.out.println("客户端发来消息："+line);
                        out.println("Echo:"+line);
                        if(line.trim().equals("BYE")) done = true;
                    }
                }
            }
        }
    }
}
