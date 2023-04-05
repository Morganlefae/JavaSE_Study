package com.popularClasses.Date;


import java.sql.Date;

public class TestDate2 {
    public static void main(String[] args) {
        //创建一个sql.Date对象 sql.date类没有无参数的构造方法
        Date now = new Date(System.currentTimeMillis());
        System.out.println("now: "+ now);
        Date date2 = Date.valueOf("2022-12-2");
        //sql.Date -> util.Date
        Date now2 = new Date(System.currentTimeMillis());
        System.out.println(now2);
        //java.util.Date udate = now2;//子类的对象赋给父类的引用
        //多态：父类引用调用方法，如果子类重写，调用子类的方法
        java.util.Date udate = new java.util.Date(now2.getTime());
        System.out.println(udate);
        //util.Date -> sql.Date
        java.util.Date now3 = new java.util.Date();
        System.out.println(now3);
        Date sdate = new Date(now3.getTime());
        System.out.println(sdate);
    }
}
