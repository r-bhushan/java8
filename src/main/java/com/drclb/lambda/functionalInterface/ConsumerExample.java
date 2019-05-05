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
