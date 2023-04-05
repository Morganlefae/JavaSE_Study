package com.study.struct;
// 1000 以内 5 的倍数逢三换行
public class ForDemo03 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0){
                System.out.print(i + "\t");
            }
            if (i % 15 == 0) System.out.print("\n");
        }
    }
}
