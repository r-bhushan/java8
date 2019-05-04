package com.drclb.lambda.functionalInterface;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

/**
 * This class demonstrate {@link Function} interface, which has a method {@link Function#apply(Object)}
 * which accepts an argument of Type T and can return a different type.
 *
 * Example Use case: In this class we want to trigger a validation process on person object i.e
 * if provided person name is "John1"
 * and the said validation process must return the validation event result in boolean
 *
 */
public class FunctionExample {
    private static final Logger log = LoggerFactory.getLogger("FunctionExample");

    public static void main(String[] args) {

        Function<Person, Boolean> personExistsValidationFunction = person -> {
            log.info("Person Validation function gets triggered.....");
            return person.getName().equals("John1");
        };

        log.info("Person eligible for persistence ? - "+
                personExistsValidationFunction.apply(PersonBuilder.getSinglePerson()));
    }

}
