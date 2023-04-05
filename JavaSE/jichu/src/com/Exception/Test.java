package com.Exception;

import sun.security.mscapi.CPublicKey;

public class Test {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e){
            System.out.println("除数不能为0");
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable t){
            System.out.println("Throwable");
        }  finally {
            System.out.println("Finished");
        }
    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }

}
