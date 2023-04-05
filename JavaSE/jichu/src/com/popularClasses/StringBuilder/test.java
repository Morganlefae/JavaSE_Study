package com.popularClasses.StringBuilder;

public class test {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("A");
        StringBuilder b = new StringBuilder("B");
        my_operation(a, b);
        System.out.println(a + " " + b); //AB B
    }
    public static void my_operation(StringBuilder a, StringBuilder b){
        a.append(b);
        b = a;
    }
}
