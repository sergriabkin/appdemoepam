package com.company.lessons.lesson7.example2;

public abstract class Figure {
    private String name;
    protected int size;

    public Figure() {
    }

    public Figure(int size) {
        this.size = size;
    }

    public Figure(String name) {
        this.name = name;
    }

    public abstract int perimeter();

    public abstract int area();
}
