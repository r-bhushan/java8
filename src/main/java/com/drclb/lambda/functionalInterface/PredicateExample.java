
/*
 * This program illustrate the java 8 features for training purpose
 *     Copyright (c) 2019. Ravi Bhushan (ravi-bhushan@hotmail.com)
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
