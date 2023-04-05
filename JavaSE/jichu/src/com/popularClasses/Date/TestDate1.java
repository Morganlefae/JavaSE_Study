package com.popularClasses.Date;

import java.util.Date;

/*
日期类
功能：获取下单的时间
 */
public class TestDate1 {
    public static void main(String[] args) {
        //获取当前时间 过时的方法
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.toLocaleString());//2023-4-4 14:16:25
        //其他过时的方法
        System.out.println(now.getDate());//4号
        System.out.println(now.getDay());//星期2星期日：0
        System.out.println(now.getHours());//小时14
        System.out.println(now.getMinutes());//16
        System.out.println(now.getYear()); //123 2023 - 1900
        //没有过时的方法
        long time = now.getTime();
        //Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Timestamp object.
        System.out.println(time);
    }
}
