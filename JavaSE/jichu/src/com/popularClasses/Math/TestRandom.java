package com.popularClasses.Math;

import java.sql.Time;
import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        //Random r = new Random();
        //
        for (int i = 0; i < 10; i++) {
            System.out.println(10 + r.nextInt(11));
            System.out.println(10 + (int)(r.nextDouble())*11);

        }
    }
}
