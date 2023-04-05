package com.study.array;

import java.util.Arrays;

public class ArrayDemo08 {
    public static void main(String[] args) {
        //1.创建一个11*11数组 0 没有棋子 1 黑 2 白
        int[][] array1 = new int[11][11];

        array1[7][7] = 1;
        array1[7][8] = 2;
        dispay(array1);
        //转换为稀疏数组
        //获取有效值的个数 sum
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if(array1[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println(sum);
        //遍历二维数组将非0的数存入数组中
        int count = 0;
        int[][] array2 = new int[sum+1][3];
        array2[0][0] = array1.length;
        array2[0][1] = array1[0].length;
        array2[0][2] = sum;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if(array1[i][j] != 0){
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }
        System.out.println("稀疏数组：");
        dispay(array2);
        //读取稀疏数组
        System.out.println("还原的数组");
        int[][] array3 =new int[array2[0][0]][array2[0][1]];
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        dispay(array3);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(Arrays.equals(array3[i], array1[i]));
        }
        System.out.println("hash code for Array1");
        System.out.println(array1);
        System.out.println("hash code for Array3");
        System.out.println(array3);

    }
    public static void dispay(int [][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
