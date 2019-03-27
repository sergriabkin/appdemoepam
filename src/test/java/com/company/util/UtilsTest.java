package com.company.util;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

import static com.company.util.Utils.add;
import static com.company.util.Utils.function;
import static org.junit.Assert.assertEquals;

public class UtilsTest {


//    @Rule
//    public final Timeout timeout = new Timeout(1000, TimeUnit.MILLISECONDS);

    @Rule
    public ExpectedException thrownException = ExpectedException.none();


    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }

    @Before
    public void before(){
        System.out.println("before"); // useful to create new normal object or connection here
    }


        @Test
    public void shouldReturnZero(){
        int actual = function(-10);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Ignore
    @Test
    public void shouldReturnOne() {
        int actual = function(0);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFive() {
        int actual = function(1);
        int expected = 5;
        assertEquals(expected, actual);
    }

        @Ignore
        @Test
    public void shouldReturnTen(){
        int actual = function(10);
        int expected = 10;
        assertEquals(expected, actual);
    }
//    @Test(expected = RuntimeException.class)
    @Test
    public void shouldThrowException() {
        thrownException.expect(RuntimeException.class);
        thrownException.expectMessage("Hi");
        function(10);
//        try {
//            function(10);
//        } catch (RuntimeException e) {
//            assertEquals("Hi", e.getMessage());
//            throw e;
//        }


    }

    @Test
//            (timeout = 1030)
    public void shouldReturnSum(){
        int actual = add(1, 2);
        int expected = 3;

        assertEquals(expected, actual);



    }


}