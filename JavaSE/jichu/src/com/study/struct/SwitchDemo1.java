package com.study.struct;

public class SwitchDemo1 {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("不及格");
            default: System.out.println("成绩不合法");
                break;
        }
    }
}
