package com.drclb.lambda.fnctionalInterface;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate is a functional interface, takes one argument of type T and return a boolean value
 */
public class PredicateExample {
    private static final Logger _logger = LoggerFactory.getLogger("PredicateExample");
    public static void main(String[] args) {
        _logger.info("Evaluating Predicate on list.....");
        //test1
        Predicate<List<Person>> personExistPredicate = value -> value.contains("john");
        new PredicateExample().evaluatePersonPredicate(personExistPredicate, "john");
        //test 2
        Predicate<List<Person>> personExistPredicate2 = value -> value.contains("dumy user");
        new PredicateExample().evaluatePersonPredicate(personExistPredicate2, "dumy user");
    }

    public PredicateExample evaluatePersonPredicate(Predicate<List<Person>> predicate, String personFindPredicate){

        List<Person> persons = PersonBuilder.getDummyPersonList();
        _logger.info("Existing Persons "+ persons);
        if(predicate.test(persons))
            _logger.info("Evaluation was successful and able to find the Person ["+personFindPredicate+"].....");
        else
            _logger.info("Evaluation was un-successful and not able to find the fruit ["+personFindPredicate+"].....");
        return this;
    }
}
