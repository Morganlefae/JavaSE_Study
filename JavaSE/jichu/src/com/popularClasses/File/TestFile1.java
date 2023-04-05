package com.popularClasses.File;

import java.io.File;
import java.util.Date;

/*
可以实现获取文件和目录属性的功能
 */
public class TestFile1 {
    public static void main(String[] args) {
        //创建File对象
        File f = new File("C:\\Users\\lenovo\\Desktop\\gitcode");
        System.out.println(f.getName());
        System.out.println(f.exists());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.canExecute());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.isHidden());
        //使用File对象获取文件或文件夹属性
        //String []files = f.list();
        //System.out.println(files.length);
        File[] files = f.listFiles();
        for (File i : files){
            //时间
            Date d = new Date(i.lastModified());
            System.out.print(d + "\t");
            //类型
            if (i.isDirectory()){
                System.out.print("<DIR>\t");
            } else {
                System.out.print("\t\t");
            }
            //文件长度
            if (i.isFile()){
                System.out.print(f.length()+"\t");
            }else {
                System.out.println(" \t");
            }
            //名称
            System.out.println(f.getName());
        }

    }
}
