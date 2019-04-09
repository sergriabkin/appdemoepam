package com.company.lessons.lesson5.example2;

public interface MyInterfaceA {

    public static final int USER_AGE = 10;

    //abstract
    public abstract void print(String  message);

    //default
    public default void print(String message, int number){
        for (int i = 0; i < number; i++) {
            print(message);
        }
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
