package com.drclb.lambda.fnctionalInterface;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

/**
 * Represents a function that accepts one argument and produces a result.
 */
public class FunctionExample {
    private static final Logger _logger = LoggerFactory.getLogger("FunctionExample");

    public static void main(String[] args) {

        Function<Person, Boolean> personExistsValidationFunction = person -> {
            _logger.info("Person Validation function gets triggered.....");
            return person.getName().equals("John1");
        };

        _logger.info("Person eligible for persistence ? - "+
                personExistsValidationFunction.apply(PersonBuilder.getSinglePerson()));
    }

}
