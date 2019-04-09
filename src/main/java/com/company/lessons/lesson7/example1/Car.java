package com.company.lessons.lesson7.example1;

public class Car {
    private String name;
    private Motor motor;

    public Car(String name, int volume) {
        this.name = name;
        this.motor = new Motor(volume);
    }

    public static void print(){
        System.out.println("static method");
    }

    public void print(String name){
        System.out.println("non static method");
    }

    public class Motor {
        private int volume;
        private String name;

        public Motor(int volume) {
            this.volume = volume;
        }
        public void method(){
            print();
//            print("Hello");
        }

        protected void method1(){

        }
//        public static void method1(){ // not ok it non-static
//
//        }

    }
}
