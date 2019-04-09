package com.company.lessons.lesson10.generic_methods;

public class A/*<K>*/ {

//    private /*static - not allowed*/ K k;
    private static Object k;

    public A() {
    }

    public <S> A(S s) {

    }

    public <T, E> T method(T o, E e, int a){
        System.out.println(o);
        //
//        K k = null;
        return o;
    }

    public <K> K method1(K k) {
        return null;
    }


    public static <P> void methodStatic(P p){

    }

    public static <P> P methodStatic2(){
        return null;
    }

    public static void main(String[] args) {
        A a = new A();
//        a.method1("string");
        String string = a.<String>method1("string");
        a.method1(1);
    }



}
