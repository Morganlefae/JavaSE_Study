package com.popularClasses.StringBuilder;

import java.util.Scanner;

public class testCheck {
    public static void main(String[] args) {
        //从键盘输入用户名
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        String str = scan.nextLine();
        //用户名不能为空
        if (str == null|str.isEmpty()){
            System.out.println("用户名不能为空");return;
        }
        //长度大于6
       if (str.length() <= 6){
           System.out.println("用户名长度必须>6");return;
       }
       //验证用户名中不能有数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c <= '9' && c >= '0'){
                System.out.println("不能有数字");return;
            }
        }
        System.out.println("用户名格式正确");
        return;
    }
}
