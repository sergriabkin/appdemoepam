package com.company.lessons.lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegular {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("a+y");
        Matcher m1 = p1.matcher("aaay");
        boolean b = m1.matches();
        System.out.println(b);
        ///
        System.out.println("///");
        ///

        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";

        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher("serg123@gmail.com");

        System.out.println(m2.matches());
    }
}
