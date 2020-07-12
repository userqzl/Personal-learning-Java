package cn.qzl.www.Core_2.IO.File.Demo;

import java.io.File;
import java.io.FileFilter;

/**
 * @description: 文件过滤
 * @author: qzl
 * @created: 2020/05/20 16:40
 */

public class FileFilters {
    public static void main(String[] args) {
        File dir = new File("D:");
        printDir2(dir);
    }

    public static void printDir2(File dir) {
        // 匿名内部类方式,创建过滤器子类对象
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });
        // 循环打印
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getAbsolutePath());
            } else {
                printDir2(file);
            }
        }
    }
}
