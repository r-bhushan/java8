package com.drclb.lambda.functionalInterface;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.UnaryOperator;

/**
 * {@link java.util.function.UnaryOperator} is a Functional interface that extends
 * {@link java.util.function.Function}. It accepts one argument of type T and returns the same type
 *
 * USECASE: This class process the Ireland immigration application
 */
public class UnaryOperatorExample {
private static final Logger log = LoggerFactory.getLogger("UnaryOperatorExample");
    public static void main(String[] args) {
        UnaryOperator<Person> immigrationUnaryOperator = person1 -> person1.setLoc("Ireland");
        Person person = PersonBuilder.getSinglePerson();
        new UnaryOperatorExample().processImmigrationApplication(person,immigrationUnaryOperator);
    }

    public UnaryOperatorExample processImmigrationApplication(Person person, UnaryOperator<Person> operator){
        log.info("Processing Immigration Application.....");
        log.info("Current details of Person ["+ person+"]");
        Person personObjAfterImmigration= operator.apply(person);
        log.info("Details after person got immigrated [" + person+"]");
        return this;
    }



}
