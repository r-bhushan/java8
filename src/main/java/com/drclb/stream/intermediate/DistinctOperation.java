package com.drclb.stream.intermediate;

import java.util.Arrays;
import java.util.List;

public class DistinctOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,1,5,9,6); // Total 12 number with duplication
        System.out.println("Count before distinct operation -" + numbers.size());
        new DistinctOperation().findUniqueNumbers(numbers);
    }

    public DistinctOperation findUniqueNumbers(List<Integer> numbers){
        System.out.println("Count of Numbers in list after distinct operation -" +
                numbers.stream().distinct().count());
        return this;
    }
}
