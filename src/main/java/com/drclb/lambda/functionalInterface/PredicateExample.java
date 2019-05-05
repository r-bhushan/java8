
package com.drclb.lambda.functionalInterface;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Predicate;

/**
 * This class demonstrate the {@link Predicate} interface. This interface use to test/validate a condition.
 * This interface has a method {@link Predicate#test(Object)} , which accepts one argument to evaluate under
 * a condition
 *
 * It Differs from {@link java.util.function.Function} interface in sense that it always return boolean,
 * which is not the case with {@link java.util.function.Function}
 *
 * Example Use Case: In this class, we have a list of person objects and want to know if a specific  person
 * name is in list
 */
public class PredicateExample {
    private static final Logger log = LoggerFactory.getLogger("PredicateExample");
    public static void main(String[] args) {
        log.info("Evaluating Predicate on list.....");
        //test1
        Predicate<List<Person>> personExistPredicate = value -> value.contains("john");
        new PredicateExample().evaluatePersonPredicate(personExistPredicate, "john");
        //test 2
        Predicate<List<Person>> personExistPredicate2 = value -> value.contains("dumy user");
        new PredicateExample().evaluatePersonPredicate(personExistPredicate2, "dumy user");
    }

    public PredicateExample evaluatePersonPredicate(Predicate<List<Person>> predicate, String personFindPredicate){

        List<Person> persons = PersonBuilder.getDummyPersonList();
        log.info("Existing Persons "+ persons);
        if(predicate.test(persons))
            log.info("Evaluation was successful and able to find the Person ["+personFindPredicate+"].....");
        else
            log.info("Evaluation was un-successful and not able to find the person ["+personFindPredicate+"].....");
        return this;
    }
}
