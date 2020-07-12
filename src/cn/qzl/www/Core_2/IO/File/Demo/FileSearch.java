package cn.qzl.www.Core_2.IO.File.Demo;

import java.io.File;
import java.util.Scanner;

/**
 * @description: 在指定的文件目录中搜索指定文件
 * @author: qzl
 * @created: 2020/05/20 16:06
 */

public class FileSearch {
    public static void main(String[] args) {
        //用户输入被搜索的目录和文件
        Scanner in = new Scanner(System.in);
        System.out.println("请输入在哪搜索？");
        String Dir = in.next();
        System.out.println("1请输入要搜索的文件或目录名称：");
        String search = in.next();
        File file = new File(Dir);

        long startTime = System.currentTimeMillis();    //获取开始时间

        search(file,search);

        long endTime = System.currentTimeMillis();    //获取结束时间

        System.out.println("搜索耗时：" + (endTime - startTime) + "ms");    //输出程序运行时间

    }

    public static boolean search(File file,String search){
        //在Dir中搜索文件，如果不存在，且还有目录，就往下递归
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isFile()) {
                if(f.getName().equals(search)) {
                    System.out.println("文件已找到！ 路径：" + f.getAbsolutePath());
                    return true;
                }
            }
            if(f.isDirectory()) {
                search(f,search);
            }
        }
        return true;
    }
}
