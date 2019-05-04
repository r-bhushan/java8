package com.drclb.lambda.example;

import com.drclb.common.Person;

import java.time.LocalDateTime;

/**
 * This class demonstrate lambdas for a Functional interface having method {@link Print#currentTime()},
 * requiring zero arguments
 */
public class NoArgumentLambdaExample {
    public static void main(String[] args) {
        Print print = () -> System.out.println(LocalDateTime.now().toString());
        print.currentTime();
    }
    private interface Print {
        void currentTime();
    }
}
