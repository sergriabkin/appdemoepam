package com.company.math.lesson7.example1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 3);
        Car.Motor motor = car.new Motor(3);
    }
}
