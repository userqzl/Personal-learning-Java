package cn.qzl.www.Core_2.Internet.ConnectServer;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @description:
 * @author: qzl
 * @created: 2020/07/05 11:44
 */

public class ThreadedEchoHandler implements Runnable{
    private Socket incoming;

    public ThreadedEchoHandler(Socket incomingSocket){
        incoming = incomingSocket;
    }

    @Override
    public void run() {
        try (InputStream inStream = incoming.getInputStream();
             OutputStream outStream = incoming.getOutputStream()){
            Scanner in = new Scanner(inStream,"UTF-8");
            PrintWriter out = new PrintWriter(
                    new OutputStreamWriter(outStream,"UTF-8"),
                    true);
            out.println("Hello! Enter BYE to exit.");

            //回射客户端输入
            boolean done = false;
            while(!done && in.hasNextLine()){
                String line = in.nextLine();
                System.out.println("客户端发来消息："+line);
                out.println("Echo:"+line);
                if(line.trim().equals("BYE")) done = true;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
