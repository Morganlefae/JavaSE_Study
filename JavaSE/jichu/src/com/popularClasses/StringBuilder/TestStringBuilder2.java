package com.popularClasses.StringBuilder;

public class TestStringBuilder2 {
    public static void main(String[] args) {
        //字面常量拼接，编译的时候直接优化，直接拼成一个字符串
        String str = "abc" + "123";
        String str1 = "cba";
        String str2 = "123";
        String str3 = "xyz";
        //虚拟机中转变成了StringBuiler的append
        String str4 = str1 + str2 + str3;
        System.out.println();//println 将对象格式化为String
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i < 1000; i++) {
            str = str + i;
//            StringBuilder builer = new StringBuilder(str);
//            builder.append(i);
//            builder.toString(); 每循环一次创建一个builder 对象
        }
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
        }
        System.out.println(str);
        System.out.println(builder);

    }
}
