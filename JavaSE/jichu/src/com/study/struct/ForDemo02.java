package com.study.struct;

public class ForDemo02 {//从1 到100 的奇数和偶数的和
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                oddSum += i;
            } else {
                evenSum += i;
            }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}