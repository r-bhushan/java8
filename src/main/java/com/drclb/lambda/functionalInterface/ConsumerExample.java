package com.drclb.lambda.functionalInterface;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Consumer;

/**
 * {@link java.util.function.Consumer} represents an Operation consuming one argument
 * but returns nothing
 */
public class ConsumerExample {
    private static final Logger log = LoggerFactory.getLogger("ConsumerExample");

    public static void main(String[] args) {
        Consumer<Person> personToPrint = person -> log.info("Triggering Printing Command for person["+person+"]");
        Consumer<Person> personToPersistInDatabase = person -> log.info("Triggering persisting Command for person["+person+"]");
        new ConsumerExample().processPersonWithConsumer(personToPrint,personToPersistInDatabase);

    }


    public ConsumerExample processPersonWithConsumer(Consumer<Person> personPrintConsumer,
                                                     Consumer<Person> personPersistConsumer) {
        List<Person> persons = PersonBuilder.getDummyPersonList();
        Person personObjToOperate = persons.get(0);

        personPrintConsumer
                .andThen(personPersistConsumer)
                .accept(personObjToOperate);

        return this;
    }
}