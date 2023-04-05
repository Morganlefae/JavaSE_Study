package com.study.struct;

import java.util.Scanner;

public class ifDemo03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = scan.nextInt();
        if (score == 100){
            System.out.println("恭喜满分");
        } else if (score < 100 && score >= 90){
            System.out.println("A");
        }else if (score < 90 && score >= 70){
            System.out.println("B");
        }else if (score < 70 && score >= 60){
            System.out.println("及格");
        } else if (score < 60){
            System.out.println("不及格");
        } else {
            System.out.println("成绩不合法");
        }
        scan.close();
    }
}
