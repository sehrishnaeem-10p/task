package com.hobsons.task;

public class Helper {

    private Helper() {
    }

    public static boolean isEmpty(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }
}
