package cn.qzl.www.Core_2.IO.File;

import java.io.File;

/**
 * @description: 递归查询目录
 * 多级目录的打印，就是当目录的嵌套。遍历之前，无从知道到底有多少级目录，
 * 所以我们还是要使用递归实现。
 * @author: qzl
 * @created: 2020/05/20 15:30
 */

public class FileDemo_5 {
    public static void main(String[] args) {
        // 创建File对象
        File dir  = new File("d:\\");
        // 调用打印目录方法
        printDir(dir);
    }

    public static void printDir(File dir) {

        //获取文件列表
        File[] files = dir.listFiles();

        /*
        * 遍历文件列表files，
        * 如果是目录，打印目录名并递归
        * 如果是文件名，打印文件名
        * */
        for(File f : files){
            if(f.isFile()) System.out.println("文件："+f.getAbsolutePath()+" 文件大小："+f.length());

            if(f.isDirectory()) {
                System.out.println("文件夹：" + f.getAbsolutePath());
                System.out.println("-------------------------------");
                System.out.println(f.getName()+"文件夹下：");
                printDir(f);
            }
        }
    }
}
