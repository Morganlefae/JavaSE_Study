package com.study.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4,5};
        for (int i : arrays) {
            System.out.println(i);
        }
        printArray(arrays);
        printArray(reverse(arrays));
    }
    //打印数组元素
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    //反转数组
    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0, j = result.length - 1; i < arr.length; i++, j--) {
            result[j] = arr[i];
        }
        return result;
    }
}
