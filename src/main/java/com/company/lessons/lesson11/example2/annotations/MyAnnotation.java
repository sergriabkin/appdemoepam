package com.company.lessons.lesson11.example2.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface MyAnnotation {
//    String a(); // its a field!

    String value();

    MyEnum type() default MyEnum.MY_A;

    int number() default 1;


    enum MyEnum {
        MY_A, MY_B
    }
}