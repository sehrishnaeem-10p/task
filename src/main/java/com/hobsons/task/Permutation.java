package com.hobsons.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Evaluate all unique permutations of input integer array.
 *
 * @author Sehrish Naeem
 */

public class Permutation {

    private ArrayList<List<Integer>> permutations = new ArrayList<>();

    /**
     * @param input as int[]
     * @return an arraylist of integer list
     */
    public ArrayList<List<Integer>> permuteUnique(int[] input) {
        permutations.add(new ArrayList<Integer>());

        if (Helper.isEmpty(input)) {
            return permutations;
        }

        for (int value : input) {
            //track unique permutations
            Set<ArrayList<Integer>> set = new HashSet<>();
            for (List<Integer> l : permutations) {
                for (int j = 0; j < l.size() + 1; j++) {
                    l.add(j, value);
                    ArrayList<Integer> item = new ArrayList<>(l);
                    l.remove(j);
                    set.add(item);
                }
            }
            permutations = new ArrayList<>(set);
        }
        return permutations;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (List<Integer> permutation : permutations) {
            for (Integer integer : permutation) {
                result.append(integer);
            }
        }
        return result.toString();
    }
}
