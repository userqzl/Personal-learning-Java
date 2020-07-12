package cn.qzl.www.Core_2.Internet.ConnectServer;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @description: 获取主机所有ip
 * @author: qzl
 * @created: 2020/07/05 11:37
 */

public class getAllIp {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入你要查询的主机[exit退出]:");
        Scanner in = new Scanner(System.in);
        while(true){
            String host = in.nextLine();
            if(host.equals("exit")) break;
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for(InetAddress a : addresses)
                System.out.println(a);
        }
    }
}
