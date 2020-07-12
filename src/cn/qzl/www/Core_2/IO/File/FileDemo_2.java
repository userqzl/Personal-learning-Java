package cn.qzl.www.Core_2.IO.File;

import java.io.File;

public class FileDemo_2 {
    public static void main(String[] args) {
        //判断功能的方法
        //
        //- public boolean exists() ：此File表示的文件或目录是否实际存在。
        //- public boolean isDirectory() ：此File表示的是否为目录。
        //- public boolean isFile() ：此File表示的是否为文件。

        File file1 = new File("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\IOStream\\Test.txt");
        File file2 = new File("D:\\file2");
        File file3 = new File("D:\\Java\\jdk-9.0.1");

        System.out.println("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\IOStream\\Test.txt 文件或目录是否存在："+file1.exists());
        System.out.println("D:\\file2 文件或目录是否存在："+file2.exists());
        System.out.println("D:\\Java\\jdk-9.0.1 文件或目录是否存在："+file3.exists());

        System.out.println("----------------------------");

        System.out.println("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\IOStream\\Test.txt 是否为目录："+file1.isDirectory());
        System.out.println("D:\\file2 是否为目录："+file2.isDirectory());
        System.out.println("D:\\Java\\jdk-9.0.1 是否为目录："+file3.isDirectory());

        System.out.println("----------------------------");

        System.out.println("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\IOStream\\Test.txt 是否为文件："+file1.isFile());
        System.out.println("D:\\file2 是否为文件："+file2.isFile());
        System.out.println("D:\\Java\\jdk-9.0.1 是否为文件："+file3.isFile());
    }
}
