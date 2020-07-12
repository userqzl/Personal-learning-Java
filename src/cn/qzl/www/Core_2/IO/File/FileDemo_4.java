package cn.qzl.www.Core_2.IO.File;

import java.io.File;

public class FileDemo_4 {
    public static void main(String[] args) {
        // 目录的遍历
        //
        //- public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        //
        //- public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。

        File dir = new File("d:\\Java");

        //获取当前目录下的文件以及文件夹的名称。
        String[] names = dir.list();
        System.out.println(dir.getAbsolutePath()+"目录下的文件和文件夹如下:");
        System.out.println("-----------------------------------");
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("-----------------------------------");

        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
        System.out.println("文件对象如下：");
        System.out.println("-----------------------------------");
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);

            //对File对象做更多操作
        }
    }
}
