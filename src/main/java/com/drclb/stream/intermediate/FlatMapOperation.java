package com.drclb.stream.intermediate;

import com.drclb.common.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FlatMap
 */
public class FlatMapOperation {
    private static final Logger log = LoggerFactory.getLogger("FlatMapOperation ");

    public static void main(String[] args) {
        List<String> firstApplicationBatch1 = Arrays.asList("John", "SAM");
        List<String> firstApplicationBatch2 = Arrays.asList("Tom", "Nancy");
        List<String> firstApplicationBatch3 = Arrays.asList("Eri", "Robert");

        // adding list of application batches in another list to create list of list
        List<List<String>> listOfApplicationBatches = new ArrayList<>();
        listOfApplicationBatches.add(firstApplicationBatch1);
        listOfApplicationBatches.add(firstApplicationBatch2);
        listOfApplicationBatches.add(firstApplicationBatch3);

        // executing application flatting process
        new FlatMapOperation().flattering(listOfApplicationBatches);
    }

    public FlatMapOperation flattering(List<List<String>> personNameListOfList) {
        log.info("Displaying data before flattening process initiated....");
        personNameListOfList.forEach(personList -> log.info(personList.toString()));

        log.info("Displaying data after flattering process.....");
        personNameListOfList.stream().flatMap( peron -> peron.stream())
                .forEach(finalObj -> log.info(finalObj));
        return this;
    }
}
