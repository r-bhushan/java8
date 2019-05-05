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

package com.drclb.stream.intermediate;

import com.drclb.common.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Class to combine multiple lists of person, coming from different sources of application modules
 * into single list of Person Objects.
 * {@link java.util.stream.Stream#flatMap(Function)}, accepts a function interface, which accepts any object
 * of Type {@link java.util.stream.Stream} and returns extracts sub type (i.e Person, in our use case)
 * from it to format a single.
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
