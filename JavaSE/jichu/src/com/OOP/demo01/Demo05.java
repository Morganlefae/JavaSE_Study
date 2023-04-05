package com.OOP.demo01;

import java.time.Period;

public class Demo05 {
    //引用传递，对象，本质还是值传递
    //对象，内存
    public static void main(String[] args) {
        person per = new person();
        System.out.println(per.name);
        Demo05.change(per);
        System.out.println(per.name);
    }

    public static void change(person p){
        //p是一个对象：指向--->per；这是一个具体的人，可以改变属性
        p.name = "zzz";
    }
}
class person{
    String name;
}
