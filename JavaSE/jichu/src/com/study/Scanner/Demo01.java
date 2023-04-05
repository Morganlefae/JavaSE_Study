package com.study.Scanner;
import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("使用next方法接收：");
        //判断有没有输入字符串
        if (scan.hasNext()){
            String str = scan.next();
            System.out.println("输出的内容为：" + str);
        }
        scan.close();//IO用完关掉节省资源
    }
}
