package com.study.Method;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println(f(114));
    }
    public static int f(int n){
        if (n == 1) return 1;
        return  n * f(n - 1);
    }
}
