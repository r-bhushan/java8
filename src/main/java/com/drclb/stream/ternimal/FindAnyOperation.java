package com.drclb.stream.ternimal;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyOperation {

    public static void main(String[] args) {
        Stream<Person> immigrationApplicationStream = PersonBuilder.getDummyPersonList().stream();
            new FindAnyOperation().processAnyApplication(immigrationApplicationStream);
    }

    public FindAnyOperation processAnyApplication(Stream<Person> applicationStream){

        Optional<Person> anyApplication = applicationStream.parallel().findAny();
        anyApplication.ifPresent(person ->
                System.out.println("Processing any application found first "  + person));
        return this;
    }
}
