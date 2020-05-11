package com.hobsons.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TaskApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskApplication.class);

    public static void main(String[] args) {

        try {
            int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
            String result = new Permutation().permuteUnique(numbers).toString();
            System.out.println("Permutation result: " + result);

        } catch (Exception ex) {
            LOGGER.error("Error occurred due to: ", ex);
        }
    }
}
