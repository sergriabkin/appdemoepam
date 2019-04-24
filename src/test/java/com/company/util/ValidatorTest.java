package com.company.util;

import com.company.exception.EmailNotValidException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void ipValid() {
        Validator.validateIp("192.33.44.66");
    }

    @Test(expected = EmailNotValidException.class)
    public void ipNotValid() {
        Validator.validateIp("192.33.44.rr");
    }

    @Test
    public void emailValid() {
        Validator.validateEmail("darre23sd@ff.com");
    }

    @Test(expected = EmailNotValidException.class)
    public void emailNotValid() {
        Validator.validateEmail("darre23sdff.com");
    }


}