package Operator;

public class Demo06 {
    public static void main(String[] args) {
        //位运算
        byte A = 0b00111100;
        byte B = 0b00001101;
        System.out.println(Integer.toBinaryString(A & B));
        System.out.println(Integer.toBinaryString(A | B));
        System.out.println(Integer.toBinaryString(A ^ B));
        System.out.println(~B);
        int a = 10;
        int b = 20;
        System.out.println("a+b: " + a + b);// a + b: 1020
        System.out.println( a + b + "");//30

    }

}
