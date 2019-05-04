package com.drclb.stream.ternimal;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstOperation {

    public static void main(String[] args) {
        Stream<Person> immigrationApplicationStream = PersonBuilder.getDummyPersonList().stream();
        new FindFirstOperation().processFirstApplicationInPool(immigrationApplicationStream);

    }

    public FindFirstOperation processFirstApplicationInPool(Stream<Person> applicationStream) {
        Optional<Person> firstApplication = applicationStream.parallel().findFirst();
        firstApplication.ifPresent(person ->
                System.out.println(" First application is from person[" + person + "]"));
        return this;
    }
}
