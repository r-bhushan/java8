package com.drclb.stream.ternimal;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.List;
import java.util.stream.Stream;

public class ToArrayOperation {
    public static void main(String[] args) {
        Stream<Person> personStream = Stream.of(PersonBuilder.getSinglePerson());
        new ToArrayOperation().process(personStream);
    }

    public ToArrayOperation process(Stream<Person> personStream){
        System.out.println(personStream);

        Person[] personArray = personStream.toArray(Person[]::new);
        System.out.println(personArray);
        return this;
    }
}
