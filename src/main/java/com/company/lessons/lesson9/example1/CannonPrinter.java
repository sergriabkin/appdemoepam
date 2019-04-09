package com.company.lessons.lesson9.example1;

public class CannonPrinter implements Printable {
    @Override
    public void print() {
        System.out.println("Print A4");
    }

    // Fax interface - not ok;
//    @Override
//    public void scan() {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public void phone() {
//        throw new UnsupportedOperationException();
//    }
}
