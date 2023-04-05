package com.study.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4,5};
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println("sum = " + sum);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i]>max){
                max = arrays[i];
            }
        }
        System.out.println("max = "+ max);
    }
}
