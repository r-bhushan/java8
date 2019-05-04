package com.drclb.stream.intermediate;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.stream.Stream;

/**
 * USECASE: Process immigration application and approve canada as new location of candidates
 */
public class MapOperation {
    public static void main(String[] args) {
        new MapOperation().transformBeforePrint();
    }
    public MapOperation transformBeforePrint(){
        Stream<Person> personStream = PersonBuilder.getDummyPersonList().stream();
        personStream.map(person -> person.setLoc("canada"))
                .forEach(person -> System.out.println("Peron details after Immigration process "  + person));
        return this;
    }
}
