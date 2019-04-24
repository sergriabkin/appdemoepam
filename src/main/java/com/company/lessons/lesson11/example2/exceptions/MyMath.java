package com.company.lessons.lesson11.example2.exceptions;

public class MyMath {

    static int div(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception();
        }
        return a / b;
    }


    static void method1()throws Exception{
        throw new Exception();
    }

    static void method1Wrapper(){
        try {
            method1();
        } catch (Exception ignored) {

        }finally {

        }
    }


    static int divWrapper(int a, int b){
        try {
            return div(a,b);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        int result = 0;
        try {
            result = div(1, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
