package com.OOP.demo02;

public class Application {
    public static void main(String[] args) {
        //new 实例化了一个对象

        Person person = new Person();
        System.out.println(person.name);
        Person p = new Person("ZZZ");
        System.out.println(p.name);
    }

}
