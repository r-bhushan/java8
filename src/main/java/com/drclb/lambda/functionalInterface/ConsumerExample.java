package com.drclb.lambda.functionalInterface;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Consumer;

/**
 * This class demonstrate usage of Consumer functional interface, whose method {@link Consumer#accept(Object)}
 * accepts an argument of Type T but return nothing
 * <p>
 * Also, this has a default method {@link Consumer#andThen(Consumer)}, which accepts an argument of type
 * Consumer, to build a chain of operations, before calling {@link Consumer#accept(Object)}
 * <p>
 * Example Use case: in this class, has a list of persons which wil go through 2 operations in chain.
 * First - need to process by print command
 * Second - After print command, need to persist
 */
public class ConsumerExample {
    private static final Logger log = LoggerFactory.getLogger("ConsumerExample");

    public static void main(String[] args) {
        Consumer<Person> personToPrint = person -> log.info("Triggering Printing Command for person[" + person + "]");
        Consumer<Person> personToPersistInDatabase = person -> log.info("Triggering persisting Command for person[" + person + "]");

        new ConsumerExample().processPersonWithConsumer(personToPrint, personToPersistInDatabase);

    }


    public ConsumerExample processPersonWithConsumer(Consumer<Person> personPrintConsumer,
                                                     Consumer<Person> personPersistConsumer) {
        Person person = PersonBuilder.getSinglePerson();

        personPrintConsumer
                .andThen(personPersistConsumer)
                .accept(person);

        return this;
    }
}
