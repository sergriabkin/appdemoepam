package com.company.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.company.util.Utils.function;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UtilsParametrizedTest {

    private int argument;
    private int result;

    public UtilsParametrizedTest(int argument, int result) {
        this.argument = argument;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{-1, 0}, {1, 5}});   // argument:-1  result:0
    }

    @Test
    public void testAdd() {
        assertEquals(result, function(argument));
    }

}