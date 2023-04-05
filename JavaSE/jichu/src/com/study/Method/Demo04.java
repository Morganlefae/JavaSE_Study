package com.study.Method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.printMax(1,2,3,4,1.2);
    }
    public void printMax(double... nums){
        if (nums.length == 0) {
            System.out.println("no argument passed");
            return;
        }
        double result = Double.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > result) {
                result = nums[i];
            }
        }
        System.out.println("The max value is: " + result);
    }
}
