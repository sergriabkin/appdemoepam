package com.company.lessons.lesson5.example8;

public class Runner {
    public static void main(String[] args) {
        A.i = 1;
        B.i = 2;

        A a = new A();
        A b = new B();

        System.out.println(a.getI());
        System.out.println(b.getI());

        //bad:
        System.out.println(a.i);
        System.out.println(b.i);

        MyInterface myInterface = null;
        myInterface.print();
    }
}
