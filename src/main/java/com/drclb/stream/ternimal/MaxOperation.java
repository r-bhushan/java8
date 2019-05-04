package com.drclb.stream.ternimal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxOperation {
    public static void main(String[] args) {
        List<Integer> dollarValues = Arrays.asList(100,200, 5000, 10, 90, 80, 1, -2);
        new MaxOperation().process(dollarValues);
    }

    public MaxOperation process(List<Integer> dollarValues){
        Optional<Integer> maxDollarValue =  dollarValues.stream().max((first, second) -> first -second);
        maxDollarValue.ifPresent(value -> System.out.println("Maximum Dollar value is "+ value));
        return this;
    }
}
