package com.study.struct;

import java.util.Scanner;

public class ifDemo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = scan.nextInt();
        if (score > 60){
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        scan.close();
    }
}
