package com.popularClasses.WrapperClass;

public class TestWrapper2 {
    public static void main(String[] args) {
        Integer i2 = new Integer(44); //自动装箱
        int i4 = i2.intValue(); //手动拆箱
        int i3 = i2; //自动拆箱
        int i5 = Integer.parseInt("77");
        Integer i6 = new Integer(5);
        Integer i7 = new Integer(5);
        System.out.println(i6 == i7); // 引用地址 false
        System.out.println(i6.equals(i7)); //比较内容 true
        Integer i8 = 5000;
        Integer i9 = 5000;
        System.out.println(i8 == i9); // 引用地址 5: true  5000: false
        System.out.println(i8.equals(i9)); //比较内容 true true
/*   public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }

 */
    }
}
