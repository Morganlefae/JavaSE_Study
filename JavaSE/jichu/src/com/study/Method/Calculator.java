package com.study.Method;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true){
            System.out.println("First number:");
            Scanner scan = new Scanner(System.in);
            char []operators = {'+', '-', '*','/'};
            double n1 = scan.nextDouble();
            System.out.println("Operator:");
            String str = scan.next();
            char op = str.charAt(str.length()-1);
            System.out.println("Second number:");
            double n2 = scan.nextDouble();
            switch (op){
                case '+':{
                    System.out.println(Double.toString(n1) + op + Double.toString(n2) + "=" + add(n1, n2));
                    break;
                }
                case '-':{
                    System.out.println(Double.toString(n1) + op + Double.toString(n2) + "=" + minus(n1, n2));
                    break;
                }
                case '*':{
                    System.out.println(Double.toString(n1) + op + Double.toString(n2) + "=" + times(n1, n2));
                    break;
                }
                case '/':{
                    System.out.println(Double.toString(n1) + op + Double.toString(n2) + "=" + divides(n1, n2));
                    break;
                }
                default: {
                    System.out.println("Wrong input, please retry!");
                    break;
                }
            }
            scan.close();
        }

    }

    public  static double add(double num1, double num2){
        return num1 + num2;
    }
    public  static double minus(double num1, double num2){
        return num1 - num2;
    }
    public  static double times(double num1, double num2){
        return num1 * num2;
    }
    public  static double divides(double num1, double num2){
        return num1 / num2;
    }
}
