package com.OOP.demo05;

public class Person {
    protected String name = "ZZZ";
    public void print(){
        System.out.println("Person");
    }

    public Person() {
        System.out.println("Person无参执行了");
    }
    //私有的东西无法被继承
}
