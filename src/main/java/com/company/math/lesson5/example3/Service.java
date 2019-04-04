package com.company.math.lesson5.example3;

public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }
    public void print(String str){
        System.out.println("ARepository");
    }
}
