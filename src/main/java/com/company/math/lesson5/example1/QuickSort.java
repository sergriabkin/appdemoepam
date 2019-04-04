package com.company.math.lesson5.example1;

public class QuickSort implements Sort{
    @Override
    public void sort(int[] array) {
        //TODO
        swap(array, 1, 2);
        System.out.println("quick");
    }

    @Override
    public void print(int[] array) {
        throw new UnsupportedOperationException();
    }
}
