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

package com.drclb.stream;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
This class demonstrate most, if not all intermediate operations from {@link java.util.stream.Stream} api
 {@link java.util.stream.Stream#filter(Predicate)}
 {@link java.util.stream.Stream#map(Function)}
 {@link java.util.stream.Stream#flatMap(Function)}
 {@link Stream#distinct()}
 {@link Stream#sorted()}
 {@link Stream#sorted(Comparator)}
 {@link java.util.stream.Stream#peek(Consumer)}
 {@link java.util.stream.Stream#limit(long)}
 {@link java.util.stream.Stream#skip(long)}

 Note: This class will demonstrate how its being done with previous version of java 8
 */
public class IntermediateOperationsWithJava7Comparison {
    private static final Logger log = LoggerFactory.getLogger("IntermediateOperationsWithJava7Comparison");
    public static void main(String[] args) {

    }

    public IntermediateOperationsWithJava7Comparison utilizeFilterOperator(){
        log.info("Demonstrating Filtering on dataStructure (java 8 vs 7.......");
        // Java 7
        List<Person> persons = PersonBuilder.getDummyPersonList();
        for (Person person : persons) {
            if("John".equalsIgnoreCase(person.getName())) {
                log.info(person.toString());
            }
        }
        // Java8
        persons.stream().filter(person -> "John".equalsIgnoreCase(person.getName()))
                .forEach(person -> log.info(person.toString()));
        return this;
    }


}
