package com.drclb.stream.intermediate;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.List;
import java.util.function.Predicate;

/**
 * class to do filtering on the list of person objects and to print all who is from canada
 * {@link java.util.stream.Stream#filter(Predicate)} methods accepts a predicate function, to do filtering
 */
public class FilterOperation {
    public static void main(String[] args) {
        new FilterOperation().filterPersonByLocation("canada");
    }

    public FilterOperation filterPersonByLocation(String locToMatch){
        List<Person>  persons = PersonBuilder.getDummyPersonList();
        persons.stream().
                filter(person -> person.getLoc().equals(locToMatch))
                .forEach(person -> System.out.println("Found match based on location: " + person));
        return this;
    }
}
