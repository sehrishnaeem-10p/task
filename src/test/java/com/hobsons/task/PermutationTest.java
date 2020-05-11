package com.hobsons.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Test scenarios for Permutation class
 *
 * @author Sehrish Naeem
 */

public class PermutationTest {

    public static ArrayList<List<Integer>> noResultList = new ArrayList<List<Integer>>();

    private static boolean AssertResult(ArrayList<List<Integer>> expectedResult, int[] numbers) {
        ArrayList<List<Integer>> actualResult = new Permutation().permuteUnique(numbers);
        return deepCheck(expectedResult, actualResult);
    }

    private static boolean deepCheck(ArrayList<List<Integer>> expected, ArrayList<List<Integer>> actual) {
        if (expected.size() != actual.size()) {
            return false;
        }
        for (List item : actual) {
            if (!expected.contains(item)) {
                return false;
            }
        }
        return true;
    }

    @BeforeTestClass
    public void setup() {
        noResultList.add(new ArrayList<Integer>());
    }

    @Test
    public void whenNullInput_thenReturnEmptyResult() {
        Assertions.assertFalse(AssertResult(noResultList, null));
    }

    @Test
    public void whenNoInput_thenReturnEmptyResult() {
        int[] numbers = new int[]{};
        Assertions.assertFalse(AssertResult(noResultList, numbers));
    }

    @Test
    public void whenSingleNumber_thenReturnResult() {
        int[] numbers = new int[]{1};

        ArrayList<Integer> oneRecord = new ArrayList<Integer>(Collections.singletonList(1));
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        resultList.add(oneRecord);

        Assertions.assertFalse(AssertResult(noResultList, numbers));
    }

    @Test
    public void whenThreeDistinctNumbers_thenReturnResult() {
        int[] numbers = new int[]{1, 2, 3};

        //Possible unique permutations
        ArrayList<List<Integer>> resultList = new ArrayList<List<Integer>>();
        resultList.add(Arrays.asList(1, 2, 3));
        resultList.add(Arrays.asList(2, 1, 3));
        resultList.add(Arrays.asList(2, 3, 1));
        resultList.add(Arrays.asList(1, 3, 2));
        resultList.add(Arrays.asList(3, 1, 2));
        resultList.add(Arrays.asList(3, 2, 1));

        Assertions.assertTrue(AssertResult(resultList, numbers));
    }

    @Test
    public void whenFourNumbersWithDuplicate_thenReturnResult() {
        int[] numbers = new int[]{1, 2, 3, 3};

        //Possible unique permutations
        ArrayList<List<Integer>> resultList = new ArrayList<List<Integer>>();
        resultList.add(Arrays.asList(1, 2, 3, 3));
        resultList.add(Arrays.asList(2, 1, 3, 3));
        resultList.add(Arrays.asList(2, 3, 1, 3));
        resultList.add(Arrays.asList(2, 3, 3, 1));
        resultList.add(Arrays.asList(1, 3, 2, 3));
        resultList.add(Arrays.asList(3, 1, 2, 3));
        resultList.add(Arrays.asList(3, 2, 1, 3));
        resultList.add(Arrays.asList(3, 2, 3, 1));
        resultList.add(Arrays.asList(1, 3, 3, 2));
        resultList.add(Arrays.asList(3, 1, 3, 2));
        resultList.add(Arrays.asList(3, 3, 1, 2));
        resultList.add(Arrays.asList(3, 3, 2, 1));

        Assertions.assertTrue(AssertResult(resultList, numbers));
    }

    @Test
    public void whenFiveNumbersWithDuplicate_thenReturnResult() {
        int[] numbers = new int[]{1, 2, 3, 3, 3};

        //Possible unique permutations
        ArrayList<List<Integer>> resultList = new ArrayList<List<Integer>>();
        resultList.add(Arrays.asList(1, 2, 3, 3, 3));
        resultList.add(Arrays.asList(1, 3, 2, 3, 3));
        resultList.add(Arrays.asList(1, 3, 3, 2, 3));
        resultList.add(Arrays.asList(1, 3, 3, 3, 2));
        resultList.add(Arrays.asList(2, 1, 3, 3, 3));
        resultList.add(Arrays.asList(2, 3, 1, 3, 3));
        resultList.add(Arrays.asList(2, 3, 3, 1, 3));
        resultList.add(Arrays.asList(2, 3, 3, 3, 1));
        resultList.add(Arrays.asList(3, 2, 1, 3, 3));
        resultList.add(Arrays.asList(3, 2, 3, 1, 3));
        resultList.add(Arrays.asList(3, 2, 3, 3, 1));
        resultList.add(Arrays.asList(3, 1, 2, 3, 3));
        resultList.add(Arrays.asList(3, 1, 3, 2, 3));
        resultList.add(Arrays.asList(3, 1, 3, 3, 2));
        resultList.add(Arrays.asList(3, 3, 1, 2, 3));
        resultList.add(Arrays.asList(3, 3, 1, 3, 2));
        resultList.add(Arrays.asList(3, 3, 2, 1, 3));
        resultList.add(Arrays.asList(3, 3, 2, 3, 1));
        resultList.add(Arrays.asList(3, 3, 3, 2, 1));
        resultList.add(Arrays.asList(3, 3, 3, 1, 2));

        Assertions.assertTrue(AssertResult(resultList, numbers));
    }
}
