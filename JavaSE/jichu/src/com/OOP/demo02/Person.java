package com.OOP.demo02;

public class Person {
    String name;


    //一个类什么都不写也能存在构造方法
    //无参构造
//    public Person(){
//        this.name = "zzz";
//    }
//    //有参构造,一旦定义有参构造，无参就必须显示定义
//    public Person(String name){
//        this.name = name;
//    }
// Alt + insert 一键生成
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
}
