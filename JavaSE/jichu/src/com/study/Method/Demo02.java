package com.study.Method;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println(max(2,2));
    }
    public static int max(int num1, int num2){
        if (num1 == num2) return 0;
        return num1 > num2 ? num1 : num2;
    }
    public static double max(double num1, double num2){
        if (num1 == num2) return 0;
        return num1 > num2 ? num1 : num2;
    }

}
