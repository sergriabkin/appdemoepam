package com.company.math.lesson5.example1;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] array) {
        //TODO
        swap(array, 1, 2);
        System.out.println("bubble");
    }

    @Override
    public void swap(int[] array, int i, int j) {
        array[i] = array[j] + array[i];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }

    @Override
    public void print(int[] array) {
        throw new  UnsupportedOperationException();
    }
}
