package com.popularClasses.String;

public class TestString3 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello2");

        //compareTo
        int n = str2.compareTo(str1);
        System.out.println(n);
        //字符数组
        String str = "helloworld";
        char[] c = str.toCharArray();
        char[] c2 = {'a', 'b', 'c', 'd'};
        String str3 = new String(c2);
        String str4 = new String(c2, 2,3);
        //StringBuffer、StringBuilder
        String str5 = new String("abc");
//        str5 = str5.concat("de");
//        str5 = str5.concat("fgh");
//        str5 = str5.concat("ijk");
        str5.concat("de").concat("fgh").concat("ijk"); //浪费空间效率低下
        //string 为不可变字符串不能直接追加

    }
}
