package com.Exception;

public class Test2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            if (b == 0) {
                throw new ArithmeticException();//主动抛出异常
            }
            System.out.println("a/b");
        } catch (Exception e) {
            System.exit(0);
            throw new RuntimeException(e);
        } finally {
        }
    }
}
