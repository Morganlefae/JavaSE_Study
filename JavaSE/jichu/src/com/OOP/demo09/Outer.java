package com.OOP.demo09;

public class Outer {
    private int id;
    public void out(){
        System.out.println("this is outer");
    }
    public class Inner{
        public void in(){
            System.out.println("this is in");
        }

    }
}
