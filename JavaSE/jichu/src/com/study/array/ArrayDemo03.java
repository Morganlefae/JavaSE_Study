package com.study.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5,6}, {7,8},{9,0}};
        printArray(array[4]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                System.out.printf(array[i][j]+ "\t");
            }
            System.out.println();
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

}
