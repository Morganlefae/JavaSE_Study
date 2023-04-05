package com.OOP;
import com.OOP.demo09.*;

public class Application {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            for (int j = 0; j < 3; j++) {
                System.out.println("j:" + j);
                if (j == 2) break;
            }
            System.out.println(i);
        }
    }
}
