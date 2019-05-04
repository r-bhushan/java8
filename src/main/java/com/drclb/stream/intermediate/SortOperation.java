package com.drclb.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 5, 9, 6);
        System.out.println("Number before sorting....");
        System.out.println(numbers + System.lineSeparator());
        new SortOperation().process(numbers);

    }

    public SortOperation process(List<Integer> number) {
        System.out.println("Number before sorting....");
        System.out.println(number.stream().sorted().collect(Collectors.toList()));
        return this;
    }
}
