package com.company.math.lesson5.example3;

public class MainRunner {
    public static void main(String[] args) {
        Repository aRepository = new ARepository();
        Repository bRepository = new BRepository();

        Service service = new Service(aRepository);
        service.print("");
    }
}
