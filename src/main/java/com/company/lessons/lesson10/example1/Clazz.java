package com.company.lessons.lesson10.example1;

public class Clazz <T> {
    public boolean isEquals(Clazz<? super T> clazz){
        return false;
    }

    public static void main(String[] args) {
        Clazz<String> clazz = new Clazz<>();

        Clazz<Object> clazz2 = new Clazz<>();
        Clazz clazz3 = new Clazz<>();
    }
}
