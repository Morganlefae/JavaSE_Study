package com.study.Scanner;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scan = new Scanner(System.in);
        System.out.println("使用nextline方法接收：");
        if (scan.hasNextLine()){
            String str = scan.nextLine();
            System.out.println("输出： "+ str);
        }
        scan.close();
    }
}
