package com.hobsons.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test scenarios for Helper class
 *
 * @author Sehrish Naeem
 */

public class HelperTest {

    private static boolean AssertResult(int[] input) {
        return Helper.isEmpty(input);
    }

    @Test
    public void whenInputIsNull_thenReturnTrue() {
        Assertions.assertTrue(AssertResult(null));
    }

    @Test
    public void whenInputIsEmpty_thenReturnTrue() {
        Assertions.assertTrue(AssertResult(new int[]{}));
    }

    @Test
    public void whenInputIsValid_thenReturnFalse() {
        Assertions.assertFalse(AssertResult(new int[]{1, 2, 3}));
    }
}
