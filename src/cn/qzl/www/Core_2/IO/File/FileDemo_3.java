package cn.qzl.www.Core_2.IO.File;

import java.io.File;
import java.io.IOException;

public class FileDemo_3 {
    public static void main(String[] args) throws IOException {
        //创建删除功能的方法
        //
        //- public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        //- public boolean delete() ：删除由此File表示的文件或目录。
        //- public boolean mkdir() ：创建由此File表示的目录。
        //- public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。

        File file1 = new File("D:\\Java\\code\\练习\\src\\cn\\qzl\\www\\Core_2\\IO\\File\\file1.txt");
        File file2 = new File("D:\\file2");
        File file3 = new File("D:\\Java\\file3.txt");
        File file4 = new File("\\newdir\\dis");

        //创建 file1.txt、file2、file3.txt
        if(file1.createNewFile()) System.out.println("file1.txt创建成功！ 路径：" + file1.getAbsolutePath());
        if(file2.mkdir()) System.out.println("file2创建成功！ 路径：" + file2.getAbsolutePath());
        if(file3.createNewFile()) System.out.println("file3.txt创建成功！ 路径：" + file3.getAbsolutePath());
        if(file4.mkdirs()) System.out.println("\\newdir\\dis创建成功！路径：" + file4.getAbsolutePath());
        System.out.println("--------------------------------");

        //检查 file1.txt、file2、file3.txt 是否存在
        System.out.println("file1.txt 文件或目录是否存在："+file1.exists());
        System.out.println("file2 文件或目录是否存在："+file2.exists());
        System.out.println("file3.txt 文件或目录是否存在："+file3.exists());
        System.out.println("--------------------------------");

        //删除 file1.txt、file2、file3.txt
        if(file1.delete()) System.out.println("file1.txt已删除！");
        if(file2.delete()) System.out.println("file2已删除！");
        if(file3.delete()) System.out.println("file3.txt已删除！");
        System.out.println("--------------------------------");

        //检查 file1.txt、file2、file3.txt 是否存在
        System.out.println("file1.txt 文件或目录是否存在："+file1.exists());
        System.out.println("file2 文件或目录是否存在："+file2.exists());
        System.out.println("file3.txt 文件或目录是否存在："+file3.exists());
        System.out.println("--------------------------------");
    }
}
