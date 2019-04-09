package com.company.lessons.lesson10.example1;

public class Main {
    public static void main(String[] args) {
        IntContainer intContainer = new IntContainer(1);
        int intValue = intContainer.getA();
        StringContainer stringContainer = new StringContainer("aa");
        String stringValue = stringContainer.getA();
        AContainer aContainer = new AContainer(new A());
        A aValue = aContainer.getA();

        ObjContainer intobjectContainer = new ObjContainer( 1);
        Integer intObjValue = (Integer) intContainer.getA();

        ObjContainer stringobjectContainer = new ObjContainer("str");
        String stringObjValue = (String) stringobjectContainer.getA();
//        Integer stringObjValueFake = (Integer) stringobjectContainer.getA(); // exception in runtime

//        GenericContainer genericContainer = new GenericContainer(1);
//        Integer a = genericContainer.getA(); // compile error

        GenericContainer<Integer> genericContainer = new GenericContainer<>(1);
        Integer a = genericContainer.getA();

        GenericContainer<A> aGenericContainer = new GenericContainer<>(new B());
//        B b = (B) aGenericContainer.getA();
//        b.methodB();

        Number[] numberArray = {1, 2.0, 3.5};
        ArrayContainer<Number> numberArrayContainer = new ArrayContainer<>(numberArray);
        System.out.println(numberArrayContainer.sum());

        ArrayContainer<Integer> integerArrayContainer = new ArrayContainer<>(new  Integer[]{1,2,3});

        System.out.println(numberArrayContainer.sum());

        boolean i = numberArrayContainer.isEquals(integerArrayContainer);
//        boolean n = integerArrayContainer.isEquals(numberArrayContainer); // Integer <- T <- Number , so Number not working
        System.out.println(i);



    }
}
