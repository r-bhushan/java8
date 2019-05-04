package com.drclb.stream.ternimal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinOperation {
    public static void main(String[] args) {
        List<Integer> dollarValues = Arrays.asList(100,200, 5000, 10, 90, 80, 1, -2);
        new MinOperation().process(dollarValues);
    }

    public MinOperation process(List<Integer> dollarValues){
        Optional<Integer> minDollarValue =  dollarValues.stream().min((first, second) -> first -second);
        minDollarValue.ifPresent(value -> System.out.println("Minimun Dollar value is "+ value));
        return this;
    }
}
