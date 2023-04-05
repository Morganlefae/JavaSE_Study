package com.OOP.demo05;

public class Student extends Person{


    private String name = "zzz";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }
    public void print(){
        System.out.println("Student");
    }

    public Student() {
        // 调用了父类的无参构造，必须在第一行
        System.out.println("Students无参执行了");
    }
}
