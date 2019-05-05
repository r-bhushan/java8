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
