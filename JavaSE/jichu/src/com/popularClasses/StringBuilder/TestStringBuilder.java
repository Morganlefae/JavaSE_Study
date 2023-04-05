package com.popularClasses.StringBuilder;

public class TestStringBuilder {
    public static void main(String[] args) {
        String str5 = new String("abc");

        //创建一个StringBuiler
//       StringBuilder str = new StringBuilder("abc");
        StringBuffer str = new StringBuffer("abc");
        //向最后追加
//        str5 = str5.concat("de");
//        str5 = str5.concat("fgh");
//        str5 = str5.concat("ijk");
        str.append("de");
        str.append("fgh");
        str.append("ijk");
        //向中间追加
        str.insert(3,3.14);
        //删除
        str.delete(3,7);
        //修改
        str.setCharAt(0,'A');
        str.replace(2,5, "HELLO");
        //字符串翻转
        str.reverse();
        //转变为String
        String st = str.toString();
        System.out.println(str);
    }
}
