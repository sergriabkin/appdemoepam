package com.company.lessons.lesson7.example4;

@FunctionalInterface
public interface MyInterface {
    void print();

    default void print(String name){}
}
