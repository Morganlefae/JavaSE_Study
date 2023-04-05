package com.study.struct;

import java.util.Scanner;

public class ifDemo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入： ");
        String s = scan.nextLine();
        if (s.equals("Hello")){
            System.out.println(s);
        }
        System.out.println("end");
        scan.close();
    }
}
