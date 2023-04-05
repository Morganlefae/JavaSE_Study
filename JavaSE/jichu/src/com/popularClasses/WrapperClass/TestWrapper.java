package com.popularClasses.WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class TestWrapper {
    public static void main(String[] args) {
        //1.某些方法的参数必须是对象，为了让基本数据类型，作为参数提供包装类
        List list = new ArrayList();
        list.add(new Integer(99));
        list.add(new Double(100.1));
        //2.更多功能
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toOctalString(13));
        System.out.println(Integer.toHexString(13));
        //3.实现字符串和基本数据类型的转换
        String str = "11234";
        //int i = (int) str;
        int i = Integer.parseInt(str); //网上注册 年龄分数都是字符串需要转换
        double d = Double.parseDouble("998.5");
        //1.包装类的对象需要占用栈内存和堆内存，而基本数据类型的变量只占用栈内存
        int i2 =5;
        int i3 = new Integer(5);
        System.out.println(i2 == i3);


    }
}
