package com.Exception;

public class TestMyEx {
    static void test(int a) throws MyException {
        if (a > 10){
            throw new MyException(a);
        }
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            test(123);
        } catch (Exception e){
            System.out.println("This exception " + e);
        }
    }
}
