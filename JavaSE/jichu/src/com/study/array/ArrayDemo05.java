package com.study.array;

import java.util.Arrays;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3,4,5,6,34134,-234,323}; //[I@1b6d3586 hash code
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        printArray(a);
        Arrays.sort(a);
        Arrays.fill(a,2,4,0);


    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i == 0) System.out.print("[");
            if (i != array.length - 1){
                System.out.print(array[i]+",");
            } else {
                System.out.print(array[i]+"]");
            }
        }
        System.out.println();
    }
}
