package com.study.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[10];
        nums[0] = 1;
        System.out.println(nums[0]);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
