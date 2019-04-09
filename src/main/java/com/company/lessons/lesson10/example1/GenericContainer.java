package com.company.lessons.lesson10.example1;

public class GenericContainer<T> {
    private T a;

    public GenericContainer(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }
}
