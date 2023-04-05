package com.study.Scanner;
import java.util.*;
public class Demo05 {
    //输入多个数字并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出结果
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (scan.hasNextDouble()){
            double x = scan.nextDouble();
    //
            m++;
            sum += x;
        }
        System.out.println(m + "个数的和是："+sum);
        System.out.println(m + "个数的平均值是：" + (sum/m));
    }
}
