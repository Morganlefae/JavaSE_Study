package com.popularClasses.String;

public class TestString1 {
    public static void main(String[] args) {
        //创建一个对象
//        String str = "Hello_world";
//        String str2 = new String("Hello");
//        //字符串的长度，大小写转换 判断起始字符串
//        System.out.println(str.length());//10
//        str.toUpperCase();
//        System.out.println(str); //Hello_world
//        str = str.toUpperCase();
//        System.out.println(str);//HELLO_WORLD
//        System.out.println(str.startsWith("h"));//false
//        System.out.println(str.endsWith("d"));//false
//        System.out.println(str.contains("o"));//false

        //根据索引找到字符串
        String str2 = new String("aaifwlefDSjer");
        char ch = str2.charAt(3);
        System.out.println(ch); //f
        String subStr = str2.substring(7);
        System.out.println(subStr); //fDSjer
        String subStr2 = str2.substring(6,9);
        System.out.println(subStr2); //efD
        //根据字串找到索引
        int ind  = str2.indexOf("S");
        System.out.println(ind);//9
        ind = str2.indexOf("fwl");
        System.out.println(ind);//3
        ind = str2.lastIndexOf("e");//11
        System.out.println(ind);
        //其他方法
        str2 = str2.concat("123").concat("jaioj").concat("abc");
        System.out.println(str2);//aaifwlefDSjer123jaiojabc
        System.out.println(str2.isEmpty());
//        str2 = "";
//        System.out.println(str2.isEmpty());
//        str2 = null;
        //System.out.println(str2.isEmpty());
        System.out.println(str2.replace("ab", "AB"));
        String str3 = " ad   dre  ";
        System.out.println(str3.length());
        str3 = str3.trim();//去除两端空格
        System.out.println(str3);

    }
}
