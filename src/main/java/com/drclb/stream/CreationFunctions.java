package com.drclb.stream;

import com.drclb.common.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static com.drclb.common.PersonBuilder.getPersonsAsArray;

/**
 * List of methods with which can crate stream
 * {@link Stream#of(Object)}
 * {@link Stream#of(Object[])}
 * {@link Stream#concat(Stream, Stream)} - combine 2 streams together
 * {@link Stream#generate(Supplier)}
 * {@link Stream#iterate(Object, UnaryOperator)}
 * {@link Stream#builder()}
 */
public class CreationFunctions {
    private static final Logger _logger = LoggerFactory.getLogger("Stream CreationFunctions");

    public CreationFunctions createWithOF() {
        _logger.info("Creating Stream with OF method using String....");
        Stream.of("1", "2", "3").forEach(value -> _logger.info(value));

        _logger.info("Creating Stream with OF method using Array....");
        Stream.of(getPersonsAsArray()).forEach(person -> _logger.info(person.toString()));
        return this;
    }

    public CreationFunctions createByConcainating() {
        _logger.info("Creating Stream by combining 2 streams into one.....");
        Stream<String> stringStream1 = Stream.of("4", "5", "6");
        Stream<String> stringStream2 = Stream.of("7", "8", "9");
        Stream.concat(stringStream1, stringStream2).forEach(value -> _logger.info(value));
        return this;
    }

    public CreationFunctions addValueToExistingStreamUsingBuilder(Person person) {
        _logger.info("Creating Stream using builder function.....");
        Stream.Builder<Person> builder = Stream.builder();
        builder.add(new Person("Existing Person", "Ontario")).
                add(person).build()
                .forEach(p -> _logger.info(p.toString()));
        return this;
    }

    /**
     * Iterate requires 2 parameters (1) seed - where to start from (2) {@link UnaryOperator} of same
     * type as seed
     *
     * @return
     */
    public CreationFunctions createByIterate() {
        _logger.info("Creating Stream using iterate function........");
        Stream.iterate("2",  previousValue -> previousValue + 1)
                .limit(10)
                .forEach(value -> _logger.info(value));
        return this;
    }

    public static void main(String[] args) {
        new CreationFunctions()
                .createWithOF()
                .createByConcainating()
                .addValueToExistingStreamUsingBuilder(new Person("Ravi Bhushan", "Kitchner"))
                .createByIterate();
    }
}
