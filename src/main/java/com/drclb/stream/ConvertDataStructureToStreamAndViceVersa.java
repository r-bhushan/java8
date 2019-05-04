package com.drclb.stream;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertDataStructureToStreamAndViceVersa {
    private static final Logger log = LoggerFactory.getLogger("ConvertDataStructureToStreamAndViceVersa");

    public ConvertDataStructureToStreamAndViceVersa convertListToStream() {
        log.info("Converting List of Persons to Stream and outputting.....");
        List<Person> persons = PersonBuilder.getDummyPersonList();
        persons.stream().forEach(person -> log.info(person.toString()));
        return this;
    }

    public ConvertDataStructureToStreamAndViceVersa convertStreamToList(){
        log.info("Converting Stream of Random numbers to List of Doubles and outputting.....");
        List<Double> randomNumbers= Stream.generate(Math::random).limit(5)
                .collect(Collectors.toList());
        randomNumbers.forEach(number -> log.info(number.toString()));
        return this;
    }

    public static void main(String[] args) {
        new ConvertDataStructureToStreamAndViceVersa()
                .convertListToStream()
                .convertStreamToList();
    }

}
