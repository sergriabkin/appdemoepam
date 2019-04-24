package com.company.lessons.lesson11.example2;

public class A {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method(){
        try {
//            return 1;
            throw new IllegalArgumentException("try");
        } finally {
//            return 2;
//            throw new NullPointerException("finally");
            throw null;
        }
    }
}
