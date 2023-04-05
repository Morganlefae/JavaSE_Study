package com.popularClasses.Date;

import java.sql.Date;
import java.text.*;

/*
1.网页注册 需要输入时间
网页输入的所有内容传送到后台接收到都是字符串
需要将字符串转换为日期

2.注册成功后显示日期，可以以不同的格式来显示“YYYY-MM-DD" /, 年月日
日期时间模式字符

 */


public class TestDateFormat {
    public static void main(String[] args) {
        //方法一：java.sql.date 功能太弱只支持-
        Date date = Date.valueOf("1999-2-13");
        System.out.println(date);
        //"23" -> 23
//        String str = "23";
//        int age = Integer.parseInt(str);
        //创建一个DateFormat对象
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将字符串转换成日期
        String str = "1999-12-02 12:23:34";
        java.util.Date d = null;
        try{
             d = sdf.parse(str);
        }  catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println(d);
        //将日期转换成字符串
        DateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
        String str2 = sdf2.format(d);
        System.out.println(str2);
    }
}
