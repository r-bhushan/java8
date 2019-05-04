package com.drclb.stream.intermediate;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * This class changes the  person location to canada, which exists in approved application pool
 * leverages {@link Stream#map(Function)}
 */
public class MapOperation {
    public static void main(String[] args) {
        new MapOperation().transformBeforePrint();
    }
    public MapOperation transformBeforePrint(){
        Stream<Person> approvedImmigrationPersonPool = PersonBuilder.getDummyPersonList().stream();
        approvedImmigrationPersonPool.map(person -> person.setLoc("canada"))
                .forEach(person -> System.out.println("Peron details after Immigration process "  + person));
        return this;
    }
}
