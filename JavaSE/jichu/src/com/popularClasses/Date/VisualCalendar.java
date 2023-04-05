package com.popularClasses.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class VisualCalendar {
    public static void main(String[] args) {
        System.out.println("请输入日期（yyyy-MM-dd):");
        Scanner scan = new Scanner(System.in);
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String input = scan.nextLine();
        Date date = null;
        try{
            date = sdf.parse(input);
            Calendar cal = new GregorianCalendar();
            cal.setTime(date);
            int n = cal.get(Calendar.DATE);
            int day = cal.get(Calendar.DATE);
            cal.set(Calendar.DATE, 1);
            System.out.println("\t\tSun.\t\tMon.\t\tTue.\t\tWed.\t\tThu.\t\tFri.\t\tSat.");
            for (int i = 1; i < cal.get(Calendar.DAY_OF_WEEK); i++) {
                System.out.printf("\t\t\t");
            }
            int max_date = cal.getActualMaximum(Calendar.DATE);
            int j = 1;
            for (int i = 1; i <= max_date; i++) {
                cal.set(Calendar.DATE,j++);
                System.out.printf("\t\t");
                if (day == i)  System.out.printf(String.format("%-4s","*"+ i));
                else System.out.print(String.format("%-4s",i));
                int w = cal.get(Calendar.DAY_OF_WEEK);
                if (w % 7 == 0) System.out.println();
            }
        } catch (ParseException e){
            e.printStackTrace();
        }

    }
}
