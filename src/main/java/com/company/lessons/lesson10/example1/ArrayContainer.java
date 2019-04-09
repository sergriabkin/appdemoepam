package com.company.lessons.lesson10.example1;

public class ArrayContainer<T extends Number /*& Cloneable*//*, E*/> {
    private  T[] array;
    /*private E e;*/

    public ArrayContainer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public double sum(){
        double sum = 0;

        for (int i = 0; i < array.length ; i++) {
            array[i].doubleValue();
        }
        return sum;
    }

    public boolean isEquals(ArrayContainer<? extends T> arrayContainer){
        return this.sum() == arrayContainer.sum();
    }
}
