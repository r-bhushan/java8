package com.drclb.stream.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * class to process limited number of persons exist in the immigration pool.
 * By leveraging {@link java.util.stream.Stream#limit(long)} method which accepts a long/number value
 * to restrict the immigration application count
 */
public class LimitOperation {
    public static void main(String[] args) {
        List<Integer> immigrationApplicationIds = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        new LimitOperation().processLimitedApplication(immigrationApplicationIds, 2);
    }

    public LimitOperation processLimitedApplication(List<Integer> applicationIDBatch, int limit) {
        applicationIDBatch.stream()
                .limit(limit)
                .forEach(applicationId ->
                        System.out.println("Processing Immigration application having id[" + applicationId + "]"));
        return this;
    }
}
