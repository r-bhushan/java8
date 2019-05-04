package com.drclb.stream.ternimal;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.stream.Stream;

public class NoneMatchOperation {
    public static void main(String[] args) {
        Stream<Person> immigrationApplicationStream = PersonBuilder.getDummyPersonList().stream();
        new NoneMatchOperation().process(immigrationApplicationStream, "Brazil");
    }

    public NoneMatchOperation process(Stream<Person> applicationStream, String countryLoc){
        boolean result = applicationStream
                .noneMatch(application -> application.getLoc().equalsIgnoreCase(countryLoc));
        System.out.println("Are all applications not from country [" + countryLoc + "] ? - " + result);

        return this;
    }
}
