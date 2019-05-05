package com.drclb.stream.ternimal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

/**
 * Class formed a single result from a sequence of elements.
 * leverage {@link java.util.stream.Stream#reduce(BinaryOperator)},
 * {@link BinaryOperator} accepts arguments of type T and returns result of same type
 *
 * Use case:  class to process a list of integers and reduce the total
 */
public class ReduceOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);
        new ReduceOperation().process(numbers);
    }
    public ReduceOperation process(List<Integer> numbers){
        Optional<Integer> total = numbers.stream()
                .reduce((existingSum, currentNumber) -> existingSum+ currentNumber);
        System.out.println("Total Number -> "+total.get());

        return this;
    }
}
