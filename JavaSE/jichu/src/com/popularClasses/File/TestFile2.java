package com.popularClasses.File;

import java.io.File;
import java.io.IOException;

/*
实现对文件的创建删除
 */
public class TestFile2 {
    public static void main(String[] args) {
        //创建File对象
        File file = new File("C:\\Users\\lenovo\\Desktop\\gitcode\\Hello.txt");
        //如果存在就删除
        if (file.exists()) {
            file.delete();
        }//如果不存在就创造一个新的文件
        //判断上级文件夹是否存在，如果不存在就创建
        else {
            File dir = file.getParentFile();
            if (!dir.exists()){
                //dir.mkdir();//创建文件夹
                dir.mkdirs();//创建多层文件夹
            }
            try {
                file.createNewFile();//创建文件
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
