package com.company.lessons.lesson7.example3;

public class Main {
    public static void main(String[] args) {
        int a = 1; // final
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print() {
                System.out.println("print" + a);
            }

            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        myInterface.print();
        myInterface.print("some message");
    }
}
