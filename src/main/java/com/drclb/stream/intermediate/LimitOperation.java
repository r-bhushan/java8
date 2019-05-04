package com.drclb.stream.intermediate;

import java.util.Arrays;
import java.util.List;

public class LimitOperation {
    public static void main(String[] args) {
        List<Integer> immigrationApplicationIdss = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        new LimitOperation().processLimitedApplication(immigrationApplicationIdss, 2);
    }

    public LimitOperation processLimitedApplication(List<Integer> applicationIDBatch, int limit) {
        applicationIDBatch.stream()
                .limit(limit)
                .forEach(applicationId ->
                        System.out.println("Processing Immigration application having id[" + applicationId + "]"));
        return this;
    }
}
