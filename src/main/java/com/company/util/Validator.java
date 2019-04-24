package com.company.util;

import com.company.exception.EmailNotValidException;

import java.util.regex.Pattern;

public class Validator {

    public static final String EMAIL_REGEX = "(\\w{2,})@(\\w+\\.)([a-z]{2,4})";
    public static final String IP_REGEX = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";

    private Validator() {

    }

    public static boolean isEmailVaild(String email) {
        return Pattern.compile(EMAIL_REGEX).matcher(email).matches();
    }

    public static void validateEmail (String email) {
        if(!Pattern.compile(EMAIL_REGEX).matcher(email).matches()){
            throw new EmailNotValidException();
        }
    }

    public static void validateIp (String ip) {
        if(!Pattern.compile(IP_REGEX).matcher(ip).matches()){
            throw new EmailNotValidException();
        }
    }
}
