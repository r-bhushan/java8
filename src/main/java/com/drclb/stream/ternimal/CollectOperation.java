package com.drclb.stream.ternimal;

import com.drclb.common.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectOperation {
    public static void main(String[] args) {
        Stream.Builder<Person> personBuilder = Stream.builder();
        Stream<Person> personStream = personBuilder.add(new Person("Robert", "Canada"))
                .add(new Person("Nancy", "Canada"))
                .add(new Person("Helena", "USA"))
                .add(new Person("Mike", "Ireland"))
                .add(new Person("prince", "USA"))
                .add(new Person("Vlad", "Russia")).build();
        new CollectOperation().process(personStream);


    }

    public CollectOperation process(Stream<Person> personStream) {
        Set<String> personMap = personStream
                .collect(
                        Collectors.mapping((Person person) -> person.getLoc(), //passing a function to process the object before collecting
                        Collectors.toSet()));

        System.out.println(personMap);

        return this;
    }
}
