package com.study.base;

public class Demo2 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f == d);
        System.out.println("f: "+ f);
        System.out.println("d: "+ d);
        //=================================================
        //float 有限，离散 舍入误差
        //最好完全避免浮点数进行比较，用BigDecimal类比较
        float d1 = 2123432423f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);
        //=================================================
        char c1 = 'a';
        char c2 = '中';
        System.out.println((double) c1 +"\n"+ (double)c2);
        //=================================================
        String sa = new String("hello world");
        String sb = new String("hello world");
        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sa == sb);
        System.out.println( sc == sd);
        //=================================================
        //byte, short, char -> int -> long -> float -> double
        //高到低->强制转换；低到高->自动转换
        int i = 128;
        byte b = (byte) i;
        //可以用下划线分割数字
        int money = 10_000_000;


    }
}
