/*
 * This program illustrate the java 8 features for training purpose
 *     Copyright (c) 2019. Ravi Bhushan
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

import java.util.function.UnaryOperator;

/**
 * This cass demonstrate {@link UnaryOperator} interface. It accepts one argument of type T
 * and returns the same type.
 *
 * Example Use case: This class process an Ireland immigration application a given person
 * A report needs to get generated to log Person details, before and after the processing
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

        log.info("Details after person got immigrated [" + personObjAfterImmigration+"]");
        return this;
    }



}
