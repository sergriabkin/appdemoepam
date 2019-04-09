package com.company.lessons.lesson5.example4;

public abstract class Figure {

    private String name;  // main difference  -> contains states (not only constants)

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int perimeter();
}
