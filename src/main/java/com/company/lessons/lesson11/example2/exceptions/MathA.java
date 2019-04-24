package com.company.lessons.lesson11.example2.exceptions;

public class MathA {
    public static void main(String[] args) {
        try {
            validator(1);
        } catch (AException | BException e) {
            e.printStackTrace();
        } catch (Exception ign){

        }

    }

    public static void validator(int a) throws Exception {
        if (a == 0) throw new BException();
        if (a == 1) throw new AException();
        if (a == 2) throw new Exception();
    }
}
