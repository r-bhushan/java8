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
    private static final Logger _logger = LoggerFactory.getLogger("IntermediateOperationsWithJava7Comparison");
    public static void main(String[] args) {

    }

    public IntermediateOperationsWithJava7Comparison utilizeFilterOperator(){
        _logger.info("Demonstrating Filtering on dataStructure (java 8 vs 7.......");
        // Java 7
        List<Person> persons = PersonBuilder.getDummyPersonList();
        for (Person person : persons) {
            if("John".equalsIgnoreCase(person.getName())) {
                _logger.info(person.toString());
            }
        }
        // Java8
        persons.stream().filter(person -> "John".equalsIgnoreCase(person.getName()))
                .forEach(person -> _logger.info(person.toString()));
        return this;
    }
}
