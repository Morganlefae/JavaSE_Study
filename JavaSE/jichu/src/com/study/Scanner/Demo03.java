package com.study.Scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("使用next方法接收：");
        String str = scan.nextLine();
        System.out.println(str);
        scan.close();//IO用完关掉节省资源
    }
}
