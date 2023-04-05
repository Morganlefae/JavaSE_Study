package com.study.base;

public class Demo3 {
    //实例变量：从属于对象 不初始化则为0， non-primitive 为null
    String name;
    int age;
    //类变量
    static double salary = 2500;
    //修饰符不存在先后顺序
    static final double PI = 3.14159;
    public static void main(String[] args) {
        //局部变量；必须声明和初始化
        int i = 10;
        Demo3 demo03 = new Demo3();
        System.out.println(demo03.name);//需要对象
        System.out.println(salary); //不需要创建对象
    }
    //其他方法
}
