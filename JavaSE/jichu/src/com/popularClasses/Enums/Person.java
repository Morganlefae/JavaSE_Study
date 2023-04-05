package com.popularClasses.Enums;

public class Person {
    private String name;
    private Sex sex;
    //private String sex;
    private int age;
/*
1.什么是枚举：
性别：男女
星期：1-7
季节：春夏秋冬
jdk1.5
2.如何定义枚举
public enum Sex {
    男,女;
}
3.如何使用枚举
private Sex sex;
p.sex = Sex.男;
 */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "zzz";
        p.sex = Sex.男;
        p.age = 22;
        System.out.println(p);
    }
}
